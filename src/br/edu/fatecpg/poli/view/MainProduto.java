package br.edu.fatecpg.poli.view;
import br.edu.fatecpg.poli.model.Produto;

public class MainProduto {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Livro");
		Produto p2 = new Produto("Suco", 14.10);
		Produto p3 = new Produto("Mouse", 30.50, 5);

		p1.exibir();
		p2.exibir();
		p3.exibir();

		}
}
