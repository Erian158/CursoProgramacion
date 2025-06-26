/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

/**
 *
 * @author Eryan
 */
public class Factura {

	//incializcion de atributos
	private int cantFacturas;
	private String nombreCliente;
	private int cedulaCliente;
	private int codigoFactura;
	private double montoFactura;
	private int mesFactura;
	private int cantElectricos;
	private int cantAutomotrices;
	private int cantConstruccion;
	private String nombreMes;

	//calculos
	private double puntosAgente;
	private double comisionesAgente;
	private double bonoAgente;
	
	
	
	public double Bonos() {
		double bonosAcumulados = 0;
		boolean bonoVeri = false;

		// Si la factura tiene 3 tipos de productos entonces se la de 10 de bono y 3 pts	
		if (cantAutomotrices > 0 && cantConstruccion > 0 && cantElectricos > 0) {
			bonosAcumulados = bonosAcumulados + montoFactura * 0.10;
			bonoVeri = true;
		}

		//dice que estos bonos solo se pueden aplicar si no ha tenido el de tener los tres tipos de autos.
		//entonces solo si no se ha recibido el bono, se haran los demas.
		if (bonoVeri == false) {
			//si tuvo mas o 3 electricos:
			if (cantElectricos >= 3) {
				bonosAcumulados = bonosAcumulados + montoFactura * 0.04;
			} else {
				bonosAcumulados = bonosAcumulados + montoFactura * 0.02;;
			}

			//si tiene 4 o mas automotrices:
			if (cantAutomotrices >= 4) {
				bonosAcumulados = bonosAcumulados + montoFactura * 0.04;;
			} else {
				bonosAcumulados = bonosAcumulados + montoFactura * 0.02;
			}

			if (cantConstruccion > 0) {
				bonosAcumulados = bonosAcumulados + montoFactura * 0.08;
			}
		}

		if (montoFactura > 50000) {
			bonosAcumulados = bonosAcumulados + montoFactura * 0.05;
		}

		return bonosAcumulados;
	}

	public int Puntos() {
		boolean bonoVeri = false;
		int puntosAcumulados = 0;

		// Si la factura tiene 3 tipos de productos entonces se la de 10 de bono y 3 pts	
		if (cantAutomotrices > 0 && cantConstruccion > 0 && cantElectricos > 0) {
			bonoVeri = true;
			puntosAcumulados = puntosAcumulados + 3;
		}

		//dice que estos bonos solo se pueden aplicar si no ha tenido el de tener los tres tipos de autos.
		//entonces solo si no se ha recibido el bono, se haran los demas.
		if (bonoVeri == false) {
			//si tuvo mas o 3 electricos:
			if (cantElectricos >= 3) {
				puntosAcumulados = puntosAcumulados + 1;
			} else {
				puntosAcumulados = puntosAcumulados + 1;
			}

			//si tiene 4 o mas automotrices:
			if (cantAutomotrices >= 4) {
				puntosAcumulados = puntosAcumulados + 1;
			} else {
				puntosAcumulados = puntosAcumulados + 1;
			}

			if (cantConstruccion > 0) {
				puntosAcumulados = puntosAcumulados + 2;
			}
		}

		if (montoFactura > 50000) {
			puntosAcumulados = puntosAcumulados + 1;
		}

		return puntosAcumulados;
	}
	
	
	
	public double getPuntosAgente() {
		return puntosAgente;
	}

	public void setPuntosAgente(double puntosAgente) {
		this.puntosAgente = puntosAgente;
	}

	public double getComisionesAgente() {
		return comisionesAgente;
	}

	public void setComisionesAgente(double comisionesAgente) {
		this.comisionesAgente = comisionesAgente;
	}

	public double getBonoAgente() {

		return bonoAgente;
	}

	public void setBonoAgente(double bonoAgente) {
		this.bonoAgente = bonoAgente;
	}

	//para saber cual mes fue ingresado
	public String getNombreMes() {

		switch (mesFactura) {
			case 1:
				nombreMes = "Enero";
				break;

			case 2:
				nombreMes = "Febrero";
				break;
			case 3:
				nombreMes = "Marzo";
				break;
			case 4:
				nombreMes = "Abril";
				break;
			case 5:
				nombreMes = "Mayo";
				break;
			case 6:
				nombreMes = "Junio";
				break;
			case 7:
				nombreMes = "Julio";
				break;
			case 8:
				nombreMes = "Agosto";
				break;
			case 9:
				nombreMes = "Septiembre";
				break;
			case 10:
				nombreMes = "Octubre";
				break;
			case 11:
				nombreMes = "Noviembre";
				break;
			case 12:
				nombreMes = "Diciembre";
				break;

			default:
				nombreMes = "Mes inválido";
		}

		return nombreMes;
	}

	public void setNombreMes(String nombreMes) {
		this.nombreMes = nombreMes;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(int cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public int getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(int codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

	public double getMontoFactura() {
		return montoFactura;
	}

	public void setMontoFactura(double montoFactura) {
		this.montoFactura = montoFactura;
	}

	public int getMesFactura() {
		return mesFactura;
	}

	public void setMesFactura(int mesFactura) {
		this.mesFactura = mesFactura;
	}

	public int getCantElectricos() {
		return cantElectricos;
	}

	public void setCantElectricos(int cantElectricos) {
		this.cantElectricos = cantElectricos;
	}

	public int getCantAutomotrices() {
		return cantAutomotrices;
	}

	public void setCantAutomotrices(int cantAutomotrices) {
		this.cantAutomotrices = cantAutomotrices;
	}

	public int getCantConstruccion() {
		return cantConstruccion;
	}

	public void setCantConstruccion(int cantConstruccion) {
		this.cantConstruccion = cantConstruccion;
	}

	public int getCantFacturas() {
		return cantFacturas;
	}

	public void setCantFacturas(int cantFacturas) {
		this.cantFacturas = cantFacturas;
	}

	

}
