package br.edu.fatecpg.poli.view;
import br.edu.fatecpg.poli.model.*;
public class MainCalculadora {
	public static void main(String[] args) {
		Calculadora calculo = new Calculadora();

		System.out.println("Soma de 2 inteiros: " + calculo.somar(2,2));
		System.out.println("Soma de 3 inteiros: " + calculo.somar(2,2,2));
		System.out.println("Soma de 2 inteiros: " + calculo.somar(2.5,2.5));
	}
}
