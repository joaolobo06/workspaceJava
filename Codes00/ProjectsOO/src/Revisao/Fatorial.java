package Revisao;

import java.util.Scanner;

public class Fatorial {
    public static void main (String[] args){

        int n;
        int fatorial = 1;
        int contador = 1;
        
        Scanner entrada_n = new Scanner(System.in);
        System.out.println("Digite o valor que você quer calcular o fatorial: ");
        n = entrada_n.nextInt();

        while(contador <= n){
            fatorial *= contador;
            contador ++;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);
        entrada_n.close();
    }

}
