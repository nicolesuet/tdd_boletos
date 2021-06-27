package boleto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoletoTeste {

	@Test
	public void testBoletoTemDataValorECodigo() throws ParseException {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy"); 
		Date data = formatador.parse("26/06/2021");
		
		Boleto b = new Boleto("123456789", data, 1000.00);
		
		Assertions.assertEquals("123456789", b.getCodigo());
		Assertions.assertEquals(1000.00, b.getValorPago());
		Assertions.assertEquals(data, b.getData());
	}
	
}
