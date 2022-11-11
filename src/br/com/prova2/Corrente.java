package br.com.prova2;

public class Corrente extends Contas {

    private Double tarifa;

    public Corrente(String cliente, int agencia, int numero, double saldo, String nome, String telefone) {
        super(cliente, agencia, numero, saldo, nome, telefone);
    }
}
