package Aula2;

import java.util.Scanner;

public class Ex1 {

    public static void main (String [] args) {
        String nome;
        Scanner entrada_nome = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        nome = entrada_nome.next();

        System.out.println("Ola " + nome + " Seja bem vindo!");

    }
}
