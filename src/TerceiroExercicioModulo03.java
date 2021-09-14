import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Crie um programa para gerenciar o cardápio de um restaurante. Cada prato tem um nome e pode
 * conter diversos ingredientes. No final do programa, o usuário deve decidir se irá adicionar mais
 * de um prato, exibir todos os pratos cadastrados ou excluir um prato pelo nome.
 */

public class TerceiroExercicioModulo03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> cardapio = new HashMap<String, String>();

        boolean repeticao = true;
        int menu = 0;


        System.out.println("-- BEM VINDO AO NOSSO RESTAURANTE --");

        while (repeticao) {
            System.out.println("Digite 1 para incluir prato");
            System.out.println("Digite 2 para exibir pratos");
            System.out.println("Digite 3 para excluir prato");
            menu = leitor.nextInt();
            leitor.nextLine();

            if (menu == 1) {
                System.out.println("Digite nome do prato que deseja incluir no cadastro:");
                String pratoCadastrado = leitor.nextLine();
                System.out.println("Igredientes: ");
                String ingredientesUtilizados = leitor.nextLine();

                System.out.println("Prato adicionado ao cardapio");
                cardapio.put(pratoCadastrado, ingredientesUtilizados);
            } else if (menu == 2) {
                for (String listaDePratos : cardapio.keySet()) {
                    System.out.println("Todos os pratos do cardapio:\n\t" + listaDePratos);
                }
            }
        }
    }
}
