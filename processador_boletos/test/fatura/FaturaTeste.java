package fatura;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FaturaTeste {
	

	@Test
	public void testBoletoTemNomeDoClienteEValorPagoEData() throws ParseException {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy"); 
		Date data = formatador.parse("26/06/2021");
		
		Fatura f = new Fatura("Maria da Silva", data, 1000.00);
		
		Assertions.assertEquals("Maria da Silva", f.getNomeCliente());
		Assertions.assertEquals(1000.00, f.getValor());
		Assertions.assertEquals(data, f.getData());
	}


}
