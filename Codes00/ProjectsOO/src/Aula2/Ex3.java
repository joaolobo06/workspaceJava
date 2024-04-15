package Aula2;

import javax.swing.JOptionPane;

public class Ex3 {
    public static void main (String [] args) {

        // Declarando váriaveis
        String Enta, Entb, Entc;

        //Fazendo a leitura dos dados
        Enta = JOptionPane.showInputDialog("Digite o valor de a: ");
        Entb = JOptionPane.showInputDialog("Digite o valor de b: ");
        Entc = JOptionPane.showInputDialog("Digite o valor de c: ");

        //Casting do tipo string para float
        float a = Float.parseFloat(Enta);
        float b = Float.parseFloat(Entb);
        float c = Float.parseFloat(Entc);

        //Calculo da expressao
        boolean expressao = a*a == (b*b+c*c);

        //Exibindo o resultado da expressao
        if (expressao){
            JOptionPane.showMessageDialog(null, "A expressao retorna true.");
        }
        else{
            JOptionPane.showMessageDialog(null, "A expressao retorna false.");
        }
    }
}
