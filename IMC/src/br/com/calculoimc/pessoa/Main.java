package br.com.calculoimc.pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa objPessoa = new Pessoa("Joao", 1.90, 88.0);
        objPessoa.exibirIMC();
        System.out.println(objPessoa.CalculoIMC());

        Pessoa objAtleta = new Atleta("Gustavo", 1.70, 73, "Musculacao");
        objAtleta.exibirIMC();
        System.out.println(objAtleta.CalculoIMC());
    }
}