package ListaDeExercicios;

public class Carro {
    String modelo;
    String cor;
    String marca;
    double potencia;
    int quantidadeDePortas;

    public Carro(String modelo, String cor, String marca, int quantidadeDePortas, double potencia) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.quantidadeDePortas = quantidadeDePortas;
        this.cor = cor;
        this.marca = marca;
    }
}
