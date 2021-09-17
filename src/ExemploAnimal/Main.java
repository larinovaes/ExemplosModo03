package ExemploAnimal;

public class Main {
    public static void main(String[] args) {
        Baleia Freewilly = new Baleia(80,  "mar",500);
        Cachorro doguinho = new Cachorro("Doguinho", 50, "Vira-lata", 5.2);
        Gato vitim = new Gato("Vitim",  30,  "vira-lata", "branca", 3);

        System.out.println("Baleia: ");
        System.out.println("Habitat: " + Freewilly.habitat);
        System.out.println("Peso: " + Freewilly.peso + "kg");
        System.out.println("Tamanho: " + Freewilly.tamanho + "cm");

        System.out.println("Cachorro: ");
        System.out.println("Nome: " + doguinho.nome);
        System.out.println("Peso: " + doguinho.peso + "kg");
        System.out.println("Tamanho: " + doguinho.tamanho + "cm");
        System.out.println("Raça: " + doguinho.raca);

        System.out.println("Gato: ");
        System.out.println("Nome: " + vitim.nome);
        System.out.println("Pelagem: " + vitim.pelagem);
        System.out.println("Raça: " + vitim.raca);
        System.out.println("Tamanho: " + vitim.tamanho + "cm");
        System.out.println("Peso: " + vitim.peso + "kg");
    }
}
