package br.edu.fatecpg.poli.view;
import br.edu.fatecpg.poli.model.*;

public class MainPagamento {
 
	public static void main(String[] args) {
		Boleto boleto = new Boleto(500);
		String retorno = boleto.processar();
		System.out.println(retorno);
		
		Credito cr = new Credito(200);
		
		String r = cr.processar("Ale","3030",24);
		System.out.println(r);
		
		r = cr.processar();
		System.out.println(r);
	}
 
}