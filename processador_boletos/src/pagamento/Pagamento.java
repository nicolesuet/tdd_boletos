package pagamento;

import java.util.Date;

public class Pagamento {
	
	double valorPago;
	String tipo;
	Date data;

	public Pagamento(double valorPago, String tipo, Date data) {
		this.valorPago = valorPago;
		this.tipo = tipo;
		this.data = data;
	}

	@Override
	public String toString() {
		return "Pagamento [valorPago=" + valorPago + ", tipo=" + tipo + ", data=" + data + "]";
	}

}
