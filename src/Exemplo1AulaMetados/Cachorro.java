package Exemplo1AulaMetados;

public class Cachorro {
    String raca;
    String porte;
    double peso;
    double tamanho;

    public Cachorro(String raca, String porte, double peso, double tamanho) {
        this.raca = raca;
        this.porte = porte;
        this.peso = peso;
        this.tamanho = tamanho;
    }
    public void mostrarDados(){
        System.out.println("Raça: " +raca);
        System.out.println("Porte: " +porte);
        System.out.println("Peso: " +peso + "Kg");
        System.out.println("Tamanho: " +tamanho + "cm");
    }
}

