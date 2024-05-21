package atividade_6;
/*
6. Crie uma classe Java chamada **`ContaBancaria`** que represente uma conta bancária simples. A classe deve ter
os seguintes atributos privados:
        - **`saldo`**, do tipo **`double`**, representando o saldo atual da conta.
        - **`numeroConta`**, do tipo **`String`**, representando o número da conta bancária.

    A classe **`ContaBancaria`** deve ter os seguintes métodos públicos:
        - Um método chamado **`depositar(double valor)`** que recebe um valor como parâmetro e adiciona esse valor
ao saldo da conta.
        - Um método chamado **`sacar(double valor)`** que recebe um valor como parâmetro e subtrai esse valor do
saldo da conta, desde que haja saldo suficiente. Caso contrário, deve exibir uma mensagem de erro.
        - Um método chamado **`consultarSaldo()`** que retorna o saldo atual da conta
 */
public class ContaBancaria {
    private double saldo;
    private String numeroConta;

    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    public double consultarSaldo(){
        return saldo;
    }
}
