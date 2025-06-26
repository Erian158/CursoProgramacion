/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado1;

import javax.swing.JOptionPane;

/**
 *
 * @author Eryan
 */
public class CasoEvaluado1 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		//intancia de clase Agente y Factura
		double totalFactura=0;
		Agente agente = new Agente();
		Factura factura = new Factura();

		//ingreso de datos del agente
		JOptionPane.showMessageDialog(null, "Bienvenido al sistema de control de facuras. Porfavor ingrese la siguiente informacion sobre el agente de ventas...");
		agente.setNombreAgente(JOptionPane.showInputDialog("Ingrese su nombre: "));
		agente.setCedulaAgente(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cedula: ")));
		agente.setCodigoAgente(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su codigo: ")));
		agente.setSucursalAgente(JOptionPane.showInputDialog("Ingrese su sucursal: "));
		agente.setVehiculoAgente(JOptionPane.showInputDialog("¿Usted posee vehículo propio? Si/No: "));

		//ingreso de las facturas correspondientes, el bucle se repetira depende de la cantidad ingresada
		factura.setCantFacturas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de faturas que realizó en el mes:")));

		for (int i = 0; i < factura.getCantFacturas(); i++) {
			factura.setNombreCliente(JOptionPane.showInputDialog("Ingrese el nombre del cliente: "));
			factura.setCedulaCliente(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente: ")));
			factura.setCodigoFactura(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la factura: ")));
			factura.setMesFactura(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la factura ")));
			factura.setCantElectricos(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos electricos: ")));
			factura.setCantAutomotrices(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos automotrices:  ")));
			factura.setCantConstruccion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos de construccion: ")));
			factura.setMontoFactura(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura: ")));
			
			
			//en la variable correspondiente se va a guardar el return del metodo que calcula
			factura.setPuntosAgente(factura.Puntos());
			factura.setBonoAgente(factura.Bonos());
			
			//luego vamos a acumular lo correspondiente por cada vez que se haga el ciclo de la factura ingresada
			factura.setPuntosAgente(factura.getPuntosAgente()+factura.Puntos());
			factura.setBonoAgente(factura.getBonoAgente()+factura.Bonos());
			totalFactura= totalFactura+ factura.getMontoFactura();
			
		}//fin del for
		JOptionPane.showMessageDialog(null,"El agente: "+agente.getNombreAgente()+"  codigo: "+agente.getCodigoAgente()+"  en el mes de: "+factura.getNombreMes());
		JOptionPane.showMessageDialog(null, "Obtuvo un total de comisiones: "+factura.getBonoAgente());
		JOptionPane.showMessageDialog(null, "Puntos obtenidos: "+factura.getPuntosAgente());
		JOptionPane.showMessageDialog(null, "El agente vendedor "+agente.getVehiculoAgente()+" tiene carro");
		
	}

}
