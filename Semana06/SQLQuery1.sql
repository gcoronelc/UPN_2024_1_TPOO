
select * from cuenta;
go

select cu.chr_cuencodigo cuenta, 
chr_monecodigo moneda, 
concat(cl.vch_clienombre, ', ',cl.vch_cliepaterno,
' ',cl.vch_cliematerno) cliente,
cu.dec_cuensaldo saldo, cu.vch_cuenestado estado
from cuenta cu join cliente cl 
on cu.chr_cliecodigo = cl.chr_cliecodigo;
go





