package Revisao;

public class For {    
    public static void main (String[] args){

        // Contando quantos números pares tem de 1 a 10
        String pares = "";
        for (int i = 1;i <= 10; i++){
            if (i % 2 == 0){
                pares += i;
            }
        }

        // A soma dos números pares de 1 a 10
        int somaPares = 0;
        for (int n = 1; n <= 10; n++) {
            if (n % 2 == 0){
                somaPares += n;
            }
        }

        // A soma de números ímpares de 1 a 10
        int somaImpar = 0;
        for (int x = 1; x <= 10; x++) {
            if (x % 2 != 0){
                somaImpar += x;
            }
        }

        // Contando quantos números ímpares tem de 1 a 10
        String impar = "";
        for (int j = 1; j <= 10; j++){
            if(j % 2 != 0){
                impar += j;
            }
        }
        
        System.out.println("Os números pares são: " + pares + "\n");
        System.out.println("OS números ímpares são: " + impar + "\n");
        System.out.println("A soma dos números pares são: " + somaPares + "\n");
        System.out.println("A soma dos números ímpares são: " + somaImpar + "\n");
    }
}
