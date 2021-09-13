import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Crie um programa para gerenciar uma lista de produtos
 * de um estabelecimento, cada produto tem um nome e um preço. No final do programa,
 * o usuário deve decidir se irá adicionar mais de um produto, exibir todos os produtos
 * cadastrados ou excluir um produto pelo nome.
 */

public class primeiroExemploModulo3 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, Double> produtos = new HashMap<String, Double>();

        boolean repeticao = true;

        System.out.println("Vamos iniciar nossa lista de produtos comprados.");

        while (repeticao){
            System.out.println("Por favor digite o nome do seu produto");
            String nome = leitor.nextLine();
            System.out.println("Por favor informe o preço do produto selecionado");
            Double preco = leitor.nextDouble();


        }

    }
}
