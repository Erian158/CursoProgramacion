/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador;

/**
 *
 * @author Eryan
 */
public class Super {
	private String nombre;
	private int codigo;
	private String nombreEmpleado;
	private int codigoEmpleado;
	
	
	
	
	
	//constructo
	public Super(String nombre, int codigo, String nombreEmpleado, int codigoEmpleado) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.nombreEmpleado = nombreEmpleado;
		this.codigoEmpleado = codigoEmpleado;
	}
	
	//setters y getters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	
	
	//toStr

	@Override
	public String toString() {
		return "Super{" + "nombre=" + nombre + ", codigo=" + codigo + ", nombreEmpleado=" + nombreEmpleado + ", codigoEmpleado=" + codigoEmpleado + '}';
	}
	
	
	
}
