package br.com.prova2;

public class Main {
    public static void main(String[] args) {

    Contas minhaConta = new Contas(1234,"matheus", 1000);
    	minhaConta.deposita(500);
    	System.out.println("Saldo da conta com deposito: " + minhaConta.getSaldo() );
    	minhaConta.saca(100);
    	System.out.println("Saldo Atual da conta: " + minhaConta.getSaldo() );

}
    }

