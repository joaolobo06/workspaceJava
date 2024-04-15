package Aula3;

import java.util.Scanner;
import java.lang.Math;

public class Ex1 {
    public static void main (String [] args) {

        // Criando o menu de opções para o switch case

        // Declarando a varivel de opcao que irá de 1 a 4
        int opcao;
        // Scanner de entrada para opção do menu
        Scanner entrada_opcao = new Scanner(System.in);
        // Print do menu de opções
        System.out.println("Menu\n" + "\n1 - Círculo\n" + "2 - Quadrado\n" + "3 - Retângulo\n" + "4 - Trapézio\n" + "0 - Sair\n" );
        opcao = entrada_opcao.nextInt();

        // Inicio do switch case onde cada opção ira realizar um calculo para seu polígono
        switch (opcao) {
            case 1: 
                // Print opção 1 selecionada
                System.out.println("\nVocê escolheu opção 1, Círculo");
                // Declarando a variavel raio
                int raio;
                // Print e declaração de scanner para raio
                System.out.println("Informe o raio do círculo: ");

                Scanner entrada_raio = new Scanner(System.in);
                raio = entrada_raio.nextInt();
                // Declaração de variáveis para os calculos de area e perímetro 
                double perimetro, area;
                // Demonstraçao de como utilizar o PI
                double pi = Math.PI;
                int raio_quadrado = raio*raio;
                perimetro = 2*pi*raio;
                area = pi*raio_quadrado;
                System.out.println("O perímetro do círculo é " + perimetro + " e a area é " + area);
                break;
            case 2:
                System.out.println("\nVocê escolheu opção 2, Quadrado");
            case 3:
                System.out.println("\nVocê escolheu opção 3, Retângulo");
            case 4:
                System.out.println("\nVocê escolheu opção 4, Trapézio");
            case 0:
                System.out.println("Saindo........");
                break;
        }
    }
    
}