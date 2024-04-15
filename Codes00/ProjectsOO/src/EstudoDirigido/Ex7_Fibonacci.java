package EstudoDirigido;

public class Ex7_Fibonacci {
    public static void main(String[] args){

        // Iniciar um vetor para armazenar a sequência de Fibonacci
        int[] fibonacci = new int[10];

        // Definindo os dois primeiros números
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        // Impressao de i na posição 0 e 1 
        System.out.println(fibonacci[0]);
        System.out.println(fibonacci[1]);

        // Calculando os proximos numeros da sequência e armazenar eles
        for (int i = 2; i <= 10; i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.println(fibonacci[i]);
        }
    }

}
