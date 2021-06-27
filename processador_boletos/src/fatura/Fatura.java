package fatura;

import java.util.Date;

public class Fatura {

	String nomeCliente;
	Date data;
	double valor;
	
	public Fatura(String nomeCliente, Date data, double valor) {
		this.nomeCliente = nomeCliente;
		this.data = data;
		this.valor = valor;
	}

	public String getNomeCliente() {
		return this.nomeCliente;
	}

	public Date getData() {
		return this.data;
	}

	public double getValor() {
		return this.valor;
	}

}
