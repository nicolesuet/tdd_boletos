package fatura;

import java.util.ArrayList;
import java.util.Date;

import boleto.Boleto;
import pagamento.Pagamento;

public class Fatura {

	String nomeCliente;
	Date data;
	double valor;
	boolean ehPaga = false;
	ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
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
	
	public boolean getEhPaga() {
		return this.ehPaga;
	}
	

	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}
	
	private double somaBoletos(ArrayList<Boleto> boletos) {
		double valorTotal = 0;
        for(int i = 0 ; i < boletos.size(); i++) {
        	valorTotal += boletos.get(i).getValorPago();
        } 
		return valorTotal;
	}

	public void pagarFatura(ArrayList<Boleto> boletos) {
		if(this.somaBoletos(boletos) == this.valor || this.somaBoletos(boletos) > this.valor) {
			this.ehPaga = true;
		}
		boletos.forEach(b -> {
			this.pagamentos.add(new Pagamento(b.getValorPago(), "BOLETO", b.getData()));
		});	

	}

}
