package br.edu.fatecpg.poli.model;

public class Produto {
	public String nome;
	public double preco;
	public int qtde;

	//CONSTRUTOR
	public  Produto(String nome){
	this.nome = nome;
	}
	public Produto(String nome, double preco){
	this.nome = nome;
	this.preco = preco;
	}
	public Produto(String nome, double preco, int qtdeEstoque){
	this.nome = nome;
	this.preco = preco;
	this.qtde = qtdeEstoque;
	}
	
	//METODO
	public void exibir(){
	System.out.println("Nome do Produto: " + nome);
	System.out.println("Preço: " + preco);
	System.out.println("Quantidade no Estoque: " + qtde);
	}

}
