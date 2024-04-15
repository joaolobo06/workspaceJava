package Aula2;

import java.util.Scanner;

public class Ex2 {
    public static void main (String [] args) {

        // Declaração de variáveis
        int a, b;

        // Entrada de números pelo scanner
        Scanner sc = new Scanner(System.in);

        // Pedindo os dados ao usuário
        System.out.println("Digite o valor de a: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de b: ");
        b = sc.nextInt();
        
        // Declarando váriaveis das operações 
        int soma = a + b;
        int subtracao = a - b;
        int produto = a * b;
        int quociente = a / b;
        int resto_divisao = a % b;

        System.out.println("O valor da soma e: " + soma);
        System.out.println("O valor da subtracao e: " + subtracao);
        System.out.println("O valor do produto e: " + produto);
        System.out.println("O valor do quociente e: " + quociente);
        System.out.println("O valor do resto da divisao e: " + resto_divisao);
    }

}
