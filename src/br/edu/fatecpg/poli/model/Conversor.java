package br.edu.fatecpg.poli.model;

public class Conversor {
	
		public int converter(int C){
		return (int) ((C * 1.8) + 32); 
		}

		public double converter(double km){
		return km * 0.621371;
		}

		public String converter(String texto){
		return texto.toUpperCase();
		}
}
