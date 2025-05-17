package br.edu.fatecpg.poli.model;
import java.util.Random;
 
public class Boleto extends IPagamento{
	private double valor;
	
	public double getValor() {
		return valor;
	}
 
	public void setValor(double valor) {
		this.valor = valor;
	}
 
	public Boleto(double v) {
		super(v);
	}
 
	private Random rd = new Random();
	
	@Override
	public String processar() {
		Long boleto = rd.nextLong(100000000000000000l, 999999999999999999l);
		return "Pagamento em Boleto: " + boleto + " No valor de: " + this.getValor();
	}
}