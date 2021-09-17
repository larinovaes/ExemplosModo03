package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Contato objeto_contato = new Contato();

        objeto_contato.nome = "Larissa";
        objeto_contato.email = "Larissa@laridds";
        objeto_contato.idade = 22;
        objeto_contato.telefone = "1512-4536";

        System.out.println(objeto_contato.nome);
        System.out.println(objeto_contato.email);
        System.out.println(objeto_contato.idade);
        System.out.println(objeto_contato.telefone);
    }
}
