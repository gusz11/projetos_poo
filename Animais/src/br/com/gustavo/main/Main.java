package br.com.gustavo.main;

import br.com.gustavo.animais.Ave;
import br.com.gustavo.animais.Mamifero;

public class Main {

	public static void main(String[] args) {
		
	Ave objAve1 = new Ave("Pinguin", 21.2, 100, "Plumagem", "Canto", false);
	objAve1.caracteristicasAve();
	objAve1.chocar();
	objAve1.comer();
	System.out.println(" ");
	Ave objAve2 = new Ave("Papagaio", 1.4, 20, "Pena", "Canto", true);
	objAve2.caracteristicasAve();
	objAve2.chocar();
	objAve2.dormir();
	System.out.println(" ");
	
	Mamifero objMamifero1 = new Mamifero("Gorila", 120.4, 200, "Pelo", "Rugir", 255);
	objMamifero1.caracteristicasMamifero();
	objMamifero1.amamentar();
	objMamifero1.comer();
	System.out.println(" ");
	Mamifero objMamifero2 = new Mamifero("Cachorro", 15.2, 80, "Pelo", "Late", 63);
	objMamifero2.caracteristicasMamifero();
	objMamifero2.amamentar();
	objMamifero2.dormir();
	System.out.println(" ");

	

	}

}
