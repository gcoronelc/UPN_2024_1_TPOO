
package pe.edu.upn.eurekaapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upn.eurekaapp.db.AccesoDB;
import pe.edu.upn.eurekaapp.dto.CuentaDto;
import pe.edu.upn.eurekaapp.dto.EmpleadosDto;

public class LogonService {

	public EmpleadosDto validarUsuario(String usuario, String clave){
		// Variables
		EmpleadosDto bean = null;
		Connection cn = null;
		PreparedStatement pstm;
		ResultSet rs;
		String sql;
		// Proceso
		try {
			// Conexion 
			cn = AccesoDB.getConnection();
			// La consulta
			sql = "select chr_emplcodigo, vch_emplpaterno, vch_emplmaterno,";
			sql += "vch_emplnombre, vch_emplciudad, vch_empldireccion,";
			sql += "vch_emplusuario, '*****' vch_emplclave ";
			sql += "from empleado ";
			sql += "where vch_emplusuario=? and vch_emplclave=?";
			// Preparar el objeto
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, usuario);
			pstm.setString(2, clave);
			// Ejecutar la consulta
			rs = pstm.executeQuery();
			// Procesar la consulta
			if(rs.next()){
				bean = new EmpleadosDto();
				bean.setCodigo(rs.getString("chr_emplcodigo"));
				bean.setPaterno(rs.getString("vch_emplpaterno"));
				bean.setMaterno(rs.getString("vch_emplmaterno"));
				bean.setNombre(rs.getString("vch_emplnombre"));
				bean.setCiudad(rs.getString("vch_emplciudad"));
				bean.setDireccion(rs.getString("vch_empldireccion"));
				bean.setUsuario(rs.getString("vch_emplusuario"));
				bean.setClave(rs.getString("vch_emplclave"));
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
		return bean;
	}
	
	
}
