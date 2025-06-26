/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

/**
 *
 * @author Eryan
 */
public class Agente {

	//creacion de atributos
	private String nombreAgente;
	private int cedulaAgente;
	private int codigoAgente;
	private String sucursalAgente;
	private String vehiculoAgente;

	//creacion de setters y getters de los atributos correspondientes
	public String getNombreAgente() {
		return nombreAgente;
	}

	public void setNombreAgente(String nombreAgente) {
		this.nombreAgente = nombreAgente;
	}

	public int getCedulaAgente() {
		return cedulaAgente;
	}

	public void setCedulaAgente(int cedulaAgente) {
		this.cedulaAgente = cedulaAgente;
	}

	public int getCodigoAgente() {
		return codigoAgente;
	}

	public void setCodigoAgente(int codigoAgente) {
		this.codigoAgente = codigoAgente;
	}

	public String getSucursalAgente() {
		return sucursalAgente;
	}

	public void setSucursalAgente(String sucursalAgente) {
		this.sucursalAgente = sucursalAgente;
	}

	public String getVehiculoAgente() {
		return vehiculoAgente;
	}

	public void setVehiculoAgente(String vehiculoAgente) {
		this.vehiculoAgente = vehiculoAgente;
	}

}
