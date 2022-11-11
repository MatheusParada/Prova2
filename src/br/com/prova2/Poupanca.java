package br.com.prova2;

public class Poupanca extends Contas{

    private int saldo;

    public Poupanca(String cliente, int agencia, int numero, double saldo, String nome, String telefone) {
        super(cliente, agencia, numero, saldo, nome, telefone);
    }
}
