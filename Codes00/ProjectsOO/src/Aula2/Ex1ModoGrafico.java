package Aula2;

import javax.swing.JOptionPane;

public class Ex1ModoGrafico {
    public static void main (String [] args){
        String nome;
        // Solicitando o nome do usuário via interface gráfica
        nome = JOptionPane.showInputDialog("Digite seu nome: ");

        // Apresentando a mensagem em caixa de diálogo
        JOptionPane.showMessageDialog(null, "Olá " + nome + ", seja bem vindo!");
    }

}

