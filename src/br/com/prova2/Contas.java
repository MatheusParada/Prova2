package br.com.prova2;

public class Contas {

    private String Cliente;
    private int agencia;
    private int numero;
    private double saldo;
    private String nome;
    private String telefone;

    public Contas(int i, String matheus, int numero) {
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Contas(String cliente, int agencia, int numero, double saldo, String nome, String telefone) {
        Cliente = cliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.nome = nome;
        this.telefone = telefone;

    }
    public boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;

        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }
}


