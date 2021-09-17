package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Contato objeto = new Contato("André", "72347283", "laseuw@ajshd", 93);

        System.out.println(objeto.nome);
        System.out.println(objeto.telefone);
        System.out.println(objeto.email);
        System.out.println(objeto.idade);


    }
}
