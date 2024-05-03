
package pe.edu.upn.eurekaapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upn.eurekaapp.db.AccesoDB;
import pe.edu.upn.eurekaapp.dto.CuentaDto;

public class CuentaService {

	public List<CuentaDto> listaCuentas(){
		// Variables
		List<CuentaDto> lista = new ArrayList<>();
		Connection cn = null;
		PreparedStatement pstm;
		ResultSet rs;
		String sql;
		// Proceso
		try {
			// Conexion 
			cn = AccesoDB.getConnection();
			// La consulta
			sql = "select cu.chr_cuencodigo cuenta, ";
			sql += "chr_monecodigo moneda, ";
			sql += "concat(cl.vch_clienombre, ', ',cl.vch_cliepaterno, ";
			sql += "' ',cl.vch_cliematerno) cliente, ";
			sql += "cu.dec_cuensaldo saldo, cu.vch_cuenestado estado ";
			sql += "from cuenta cu join cliente cl ";
			sql += "on cu.chr_cliecodigo = cl.chr_cliecodigo";
			// Preparar el objeto
			pstm = cn.prepareStatement(sql);
			// Ejecutar la consulta
			rs = pstm.executeQuery();
			// Procesar la consulta
			while(rs.next()){
				CuentaDto dto = new CuentaDto();
				dto.setCuenta(rs.getString("cuenta"));
				dto.setMoneda(rs.getString("moneda"));
				dto.setCliente(rs.getString("cliente"));
				dto.setSaldo(rs.getDouble("saldo"));
				dto.setEstado(rs.getString("estado"));
				lista.add(dto);
			}
			// Finalizar
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException("Error en el proceso, intentelo despues.");
		} finally{
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		// Reporte
		return lista;
	}
	
	
	public void deposito(String cuenta, double importe, String empleado){
		// Variables
		Connection cn = null;
		PreparedStatement pstm;
		ResultSet rs;
		String sql;
		int contador;
		int filas;
		double saldo;
		// Proceso
		try {
			// Iniciar Tx
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(false);
			// Validar importe
			if(importe<=0){
				throw new SQLException("El importe debe ser positivo.");
			}
			// Validar cuenta
			sql = "select dec_cuensaldo, int_cuencontmov ";
			sql += "from cuenta where chr_cuencodigo=?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, cuenta);
			rs = pstm.executeQuery();
			if( !rs.next() ){
				throw new SQLException("Cuenta no existe.");
			}
			saldo = rs.getDouble("dec_cuensaldo");
			contador = rs.getInt("int_cuencontmov");
			rs.close();
			pstm.close();
			// Actualizar datos de la cuenta
			contador++;
			saldo += importe;
			sql = "update cuenta set dec_cuensaldo = ?, ";
			sql += "int_cuencontmov = ? where chr_cuencodigo = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setDouble(1, saldo);
			pstm.setInt(2, contador);
			pstm.setString(3, cuenta);
			filas = pstm.executeUpdate();
			pstm.close();
			if(filas != 1){
				throw new RuntimeException("Error en el proceso.");
			}
			// Registrar el movimiento
			sql = "insert into movimiento(chr_cuencodigo,int_movinumero,";
			sql += "dtt_movifecha,chr_emplcodigo,chr_tipocodigo,";
			sql += "dec_moviimporte) values(?,?,GETDATE(),?,'003',?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, cuenta);
			pstm.setInt(2, contador);
			pstm.setString(3, empleado);
			pstm.setDouble(4, importe);
			pstm.executeUpdate();
			pstm.close();
			// Fin de la Tx
			cn.commit();
		} catch (SQLException e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException("Se ha producido un error.");
		} finally{
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
	}
}
