/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador;

/**
 *
 * @author Eryan
 */
public class Productos {
	private String nombre;
	private int codigo;
	private int cantProductos;
	private double precioBase;
	private int tipoProducto;
	private double precioBruto;
	private double gananciaEsperada;
	
	
	//constructor

	public Productos(String nombre, int codigo, int cantProductos, double precioBase, int tipoProducto, double precioBruto, double gananciaEsperada) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.cantProductos = cantProductos;
		this.precioBase = precioBase;
		this.tipoProducto = tipoProducto;
		this.precioBruto = precioBruto;
		this.gananciaEsperada = gananciaEsperada;
	}
	
	
	//seters y getters

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

	public int getCantProductos() {
		return cantProductos;
	}

	public void setCantProductos(int cantProductos) {
		this.cantProductos = cantProductos;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(int tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public double getPrecioBruto() {
		return precioBruto;
	}

	public void setPrecioBruto(double precioBruto) {
		this.precioBruto = precioBruto;
	}

	public double getGananciaEsperada() {
		return gananciaEsperada;
	}

	public void setGananciaEsperada(double gananciaEsperada) {
		this.gananciaEsperada = gananciaEsperada;
	}
	
	
	
	
	
	
	
	//to str
	@Override
	public String toString() {
		return "Productos{" + "nombre=" + nombre + ", codigo=" + codigo + ", cantProductos=" + cantProductos + ", precioBase=" + precioBase + ", tipoProducto=" + tipoProducto + ", precioBruto=" + precioBruto + ", gananciaEsperada=" + gananciaEsperada + '}';
	}
	
}
