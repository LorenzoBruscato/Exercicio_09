package exercicio_09;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Exercicio_09 {

    public static void main(String[] args) {
        String pesoStr = JOptionPane.showInputDialog("Digite seu peso (Kg):");
        int peso = Integer.parseInt(pesoStr);

        String alturaStr = JOptionPane.showInputDialog("Digite sua altura (em metros):");
        double altura = Double.parseDouble(alturaStr);

        double imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc));
    }
}
