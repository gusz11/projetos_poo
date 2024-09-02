package br.com.gustavo.animais;

public class Animal {

	protected String especie;
	protected double peso;
	protected int altura;
	protected String penugem;
	protected String vocal;
	
	public Animal(String especie, double peso, int altura, String penugem, String vocal) {
		super();
		this.especie = especie;
		this.peso = peso;
		this.altura = altura;
		this.penugem = penugem;
		this.vocal = vocal;
	}

	public void comer() {
		
		System.out.println(especie + " Comendo.");
		
	}
	
	public void dormir() {
		
		System.out.println(especie + " Dormindo.");
		
	}
	
	
	
}
