package br.edu.fatecpg.poli.view;
import br.edu.fatecpg.poli.model.Conversor;

public class MainConversor {
	public static void main(String[] args) {
        Conversor conv = new Conversor();

        // TEMPERATURA
        double fahrenheit = conv.converter(25.0);
        System.out.println("25°C em Fahrenheit: "+ String.format("%.2f",+ fahrenheit));

        // DISTÂNCIA
        double milhas = conv.converter(10.0);
        System.out.println("10 km em milhas: " + milhas);

        //TEXTO
        String textoMaiusculo = conv.converter("boa aula!");
        System.out.println("Texto em maiúsculas: " + textoMaiusculo);
	}
}
