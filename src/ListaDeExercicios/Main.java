package ListaDeExercicios;

public class Main {


    public static void main(String[] args) {
        Bola bolinha = new Bola("Redonda", "Vermelha", "Nike Merlin", "Rapida");
        Carro carrinho = new Carro("SUV", "Branco", "Nissan", 4,2.0);
        ContaCorrente conta = new ContaCorrente("15235-7", "Larissa","0");
        Pessoa humano = new Pessoa("Larissa",22 ,1.58 ,55);

        System.out.println("-- BOLA ---");
        System.out.println("Circunferência: "  + bolinha.circunferencia);
        System.out.println("Cor: " + bolinha.cor);
        System.out.println("Marca: " + bolinha.marca);
        System.out.println("Velocidade: " + bolinha.velocidade);

        System.out.println("--- CARRO ---");
        System.out.println("Marca: " + carrinho.marca);
        System.out.println("Cor: " + carrinho.cor);
        System.out.println("Quantidade de portas: " + carrinho.quantidadeDePortas);
        System.out.println("Modelo: " + carrinho.modelo);
        System.out.println("Potência: " + carrinho.potencia);

        System.out.println("-- CONTA-CORRENTE --");
        System.out.println("Numero da conta: " + conta.numeroDaConta);
        System.out.println("Nome do correntista: " + conta.nomeDoCorrentista);
        System.out.println("Saldo : " + conta.saldo + "R$");

        System.out.println("-- Pessoa --");
        System.out.println("Nome: " + humano.nome);
        System.out.println("Idade: " + humano.idade);
        System.out.println("Peso: " + humano.peso + "kg");
        System.out.println("Altura: " + humano.altura + "cm");



    }
}
