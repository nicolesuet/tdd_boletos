package fatura;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import boleto.Boleto;

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
	
	@Test
	public void testaMarcarFaturaComoPagaComValorIgualAoDoPagamentoECriarPagamentos() {
	    ArrayList<Boleto> boletos = new ArrayList<Boleto>();
	    Boleto b1 = new Boleto("1234567891", new Date(), 500.00);
	    Boleto b2 = new Boleto("1234567892", new Date(), 400.00);
	    Boleto b3 = new Boleto("1234567893", new Date(), 600.00);
	    boletos.add(b1);
	    boletos.add(b2);
	    boletos.add(b3);
	    
	    Fatura f = new Fatura("Maria da Silva", new Date(), 1500.00);
	    
	    f.pagarFatura(boletos);
	    
	    Assertions.assertEquals(true, f.getEhPaga());
	    Assertions.assertEquals(boletos.size(), f.getPagamentos().size());
	    	    
	}


}
