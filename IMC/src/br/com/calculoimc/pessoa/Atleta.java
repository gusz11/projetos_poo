package br.com.calculoimc.pessoa;

public class Atleta extends Pessoa{

    private String esportePraticado;

    public Atleta(String nome, double altura, double peso, String esportePraticado) {
        super(nome, altura, peso);
        this.esportePraticado = esportePraticado;
    }

    public void exibirIMC(){
        System.out.println("Imc do " + nome + " que pratica " + esportePraticado + ":");
    }
    @Override
    public double CalculoIMC() {
        double imcBase = super.CalculoIMC();
        double imcAtleta = imcBase * 0.95;
        return imcAtleta;
    }


}
