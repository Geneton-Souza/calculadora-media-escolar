package testejava1;

import javax.swing.JOptionPane;

public class calculaMediaEscolar {

	public static void main(String[] args) {
		String nota1 = JOptionPane.showInputDialog("Informe sua primeira nota de 0 a 10" );
		String nota2 = JOptionPane.showInputDialog("Informe sua sengunda nota de 0 a 10" );
		String nota3 = JOptionPane.showInputDialog("Informe sua terceira nota de 0 a 10" );
		
		Double dnota1 = Double.parseDouble(nota1);
		Double dnota2 = Double.parseDouble(nota2);
		Double dnota3 = Double.parseDouble(nota3);
		
		
		Double media = (dnota1 + dnota2 + dnota3)/3;
		
		if (media >=7 ) { 
			JOptionPane.showMessageDialog(null, "Aluno aprovado: " + media );
		}
		
		else if (media >= 5) {
			JOptionPane.showMessageDialog(null, "Aluno em recuperação: " + media);
		}
		
		else { 
			JOptionPane.showMessageDialog(null, "Aluno reprovado: " + media);
		}
	}}
