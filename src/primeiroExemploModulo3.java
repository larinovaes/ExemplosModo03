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
        int menu = 0;


        while (repeticao) {

            System.out.println("--- BEM VINDO AO SUPERMERCADO NOVAIS ---");
            System.out.println("Para adicionar produtos no carrinho digite 1 ");
            System.out.println("Para exebir lista de produtos adicionados digite 2");
            System.out.println("Para excluir produtos da lista digite 3");
            menu = leitor.nextInt();
            leitor.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Por favor digite o nome do seu produto");
                    String nomeDoProduto = leitor.nextLine();
                    System.out.println("Por favor informe o preço do produto selecionado");
                    Double preco = leitor.nextDouble();
                    System.out.println("Produto adicionado ao carrinho!");
                    produtos.put(nomeDoProduto, preco);
                    break;

                case 2:
                    for (String listaDeProdutos : produtos.keySet()) {
                        System.out.println("Todos os produtos selecionados: ");
                        System.out.println("Produto: " + listaDeProdutos + "\nPreço: " + produtos.get(listaDeProdutos));
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do produto que deseja remover da lista");
                    String excluirProduto = leitor.nextLine();
                    produtos.remove(excluirProduto);
                    System.out.println("Produto removido.");
                    break;
            }
        }
    }
}
