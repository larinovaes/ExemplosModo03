package Exemplo2AulaMetados;

public class Main {
    public static void main(String[] args) {
        ContaCorrente dados = new ContaCorrente("Larissa Silva  Novais", "06509706693", 5123, 0, 73254);
        dados.mostrarDados();
        dados.depositar(100);
        dados.mostrarDados();
        dados.sacar(50);
        dados.mostrarDados();
    }
}
