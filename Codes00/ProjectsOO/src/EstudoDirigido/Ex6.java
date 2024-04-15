package EstudoDirigido;

public class Ex6 {
    public static void main(String[] args){

        int n = 10;
        String resposta = "";

        while(n > 0) {
            int resto = n % 2;
            resposta = resto + resposta;
            n /= 2;  
        }
        System.out.println("O resultado é: " + resposta);
    }
}
