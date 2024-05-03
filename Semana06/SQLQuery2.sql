

select * from cuenta where chr_cuencodigo='00100001';
select * from movimiento where chr_cuencodigo='00100001';
go

select dec_cuensaldo, int_cuencontmov 
from cuenta where chr_cuencodigo='00100001';
go

update cuenta set dec_cuensaldo = ?, 
int_cuencontmov = ? 
where chr_cuencodigo = ?
go

select * from TipoMovimiento;
go

insert into movimiento(chr_cuencodigo,int_movinumero,
dtt_movifecha,chr_emplcodigo,chr_tipocodigo,dec_moviimporte)
values(?,?,GETDATE(),?,'003',?)