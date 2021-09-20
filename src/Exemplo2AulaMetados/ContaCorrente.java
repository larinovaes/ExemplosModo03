package Exemplo2AulaMetados;

public class ContaCorrente {
    String nomeDoTitular;
    String cpf;
    int numeroDaConta;
    int agencia;
    double saldo = 0;

    public ContaCorrente(String nomeDoTitular, String cpf,int numeroDaConta, double saldo, int agencia) {
        this.nomeDoTitular = nomeDoTitular;
       this.numeroDaConta = numeroDaConta;
       this.agencia = agencia;
       this.cpf = cpf;
    }
    public void mostrarDados(){
        System.out.println("Nome do titular: " + nomeDoTitular);
        System.out.println("CPF: " +cpf);
        System.out.println("Agencia: " +agencia);
        System.out.println("Número da conta: " +numeroDaConta);
        System.out.println("Saldo: " + saldo);
    }
    public void depositar(double valorDoDeposito){
        saldo = saldo + valorDoDeposito;
    }
    public void sacar(double valorDoSaque){
        saldo = saldo - valorDoSaque;
    }
}
