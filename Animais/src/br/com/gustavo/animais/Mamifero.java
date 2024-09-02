package br.com.gustavo.animais;

public class Mamifero extends Animal {
	
	private int tempoGestacao;
	
	public Mamifero(String especie, double peso, int altura, String penugem, String vocal, int tempoGestacao) {
		super(especie, peso, altura, penugem, vocal);
		this.tempoGestacao = tempoGestacao;
	}

	public void amamentar() {
		
		System.out.println(especie+ " amamentando.");
		
	}
	
	public void caracteristicasMamifero() {
		
		System.out.println("Mamifero");
		System.out.println("Especie: " + especie);
		System.out.println("Peso: " + peso + "kg");
		System.out.println("Altura: " + altura + "cm");
		System.out.println("Penugem: " + penugem);
		System.out.println("Vocal: " + vocal);
		System.out.println("Tempo de Gestacao: " + tempoGestacao + " Dias.");

		
	}

}
