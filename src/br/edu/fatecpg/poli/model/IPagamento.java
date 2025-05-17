package br.edu.fatecpg.poli.model;
 
public abstract class IPagamento {
	private double valor;
	
	public double getValor() {
		return valor;
	}
 
	public IPagamento(double v) {
		this.valor = v;
	}
	
	public String processar() {
		return null;
	}
}
 
 