package br.com.calculoimc.pessoa;

public class Pessoa {

    protected String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void exibirIMC(){
        System.out.println("Imc do " + nome + " que não pratica esporte:");
    }
    public double CalculoIMC(){
    double imc;
    imc = peso / Math.pow(altura, 2);
    return imc;
    }
}
