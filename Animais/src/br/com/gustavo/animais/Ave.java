package br.com.gustavo.animais;

public class Ave extends Animal {

	private boolean voar;
		
	public Ave(String especie, double peso, int altura, String penugem, String vocal, boolean voar) {
		super(especie, peso, altura, penugem, vocal);
		this.voar = voar;
	}

	public void chocar() {
		
		System.out.println(especie+ " chocando ovo.");

	}
	
	public void caracteristicasAve() {
		
		System.out.println("Ave");
		System.out.println("Especie: " + especie);
		System.out.println("Peso: " + peso + "kg");
		System.out.println("Altura: " + altura + "cm");
		System.out.println("Penugem: " + penugem);
		System.out.println("Vocal: " + vocal);
		System.out.println("Voa: " + voar);

	}
	
	
}
