/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciointegrador;

import javax.swing.JOptionPane;

/**
 *
 * @author Eryan
 */
public class EjercicioIntegrador {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos diferentes que va a facturar: "));
		Productos productos[] = new Productos[cantidad];
		//JOptionPane.showMessageDialog(null, imprimeDatosEstudiantes(Productos[cantidad]));
		
	}

	public void ingresoProductos(Productos[] vector) {
		for (int i = 0; i < vector.length; i++) {
			String nombre = JOptionPane.showInputDialog("Digite el nombre del producto:");
			int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del producto:"));
			int cant = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos:"));
			double precioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio base del producto:"));
			int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite el tipo de producto: 1=Alimento/2=Bebida/3=Higiene/4=Limpieza "));
			double precioB = calculoPrecioBruto(tipo, precioBase);
			double ganancia = ((precioB-precioBase)*cant);

			
			vector[i] = new Productos(nombre, cedula, cant, precioBase, tipo, precioB, ganancia);

		}

		
		
	}
	public static void imprimeDatosEstudiantes(Productos[] vector ){
        StringBuilder resultado=new StringBuilder();
        for (int i = 0; i < vector.length; i++) {
            resultado.append(vector[i]);
            resultado.append("\n");
        }
        
        JOptionPane.showMessageDialog(null, resultado );
    }
    
	
	public double calculoPrecioBruto(int tipo, double precioBase){
		double precioBruto;
		switch (tipo) {
			case 1:
				precioBruto=precioBase*20 + precioBase;

				break;
			case 2:
				precioBruto=precioBase*30 + precioBase;
				break;
			case 3:
				precioBruto=precioBase*25 + precioBase;
				break;
			case 4:
				precioBruto=precioBase*19 + precioBase;
				break;
			default:
				throw new AssertionError();
		}
		return precioBruto;
	}
	
	
	
	

}
