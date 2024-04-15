package Revisao;

public class While {

    public static void main (String[] args){
        int n = 1;
        int soma = 0;
        while (n <= 10) {
            soma += n;
            n++;
        }
        System.out.println("A soma dos números de 1 a 10 é: " + soma);
    }

}
