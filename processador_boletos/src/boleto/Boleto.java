package boleto;

import java.util.Date;

public class Boleto {
	
	String codigo;
	Double valorPago;
	Date data;

	public Boleto(String codigo, Date data, double valorPago) {
		this.codigo = codigo;
		this.valorPago = valorPago;
		this.data = data;
	}

	public Object getCodigo() {
		return this.codigo;
	}

	public Double getValorPago() {
		return this.valorPago;
	}
	
	public Date getData() {
		return this.data;
	}

}
