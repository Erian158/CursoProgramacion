/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada1.erians;

import javax.swing.JOptionPane;

/**
 *
 * @author Eryan
 */
public class PracticaEvaluada1ErianS {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here

		String leer = JOptionPane.showInputDialog("Ingrese su salario: ");
		int SalarioIndividual = Integer.parseInt(leer);

		double SalarioSEM = SalarioIndividual * 0.0925;
		double SalarioIVM = SalarioIndividual * 0.0508;

		double DeduccionesCCSS = SalarioSEM + SalarioIVM;

		double SalarioDeduciones = (SalarioIndividual - DeduccionesCCSS) * 0.025;

		JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de " + DeduccionesCCSS + " por concepto de SEM y IVM.");
		JOptionPane.showMessageDialog(null, "Para la asociacion la de la empresa se le signa un valor de: " + SalarioDeduciones);

	}

}
