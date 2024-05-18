package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13;

public class Producto {
	private String nombre;
	private float precio;
	private int cantidad;

	/**
	 * Constructor Producto
	 * @param nombre
	 * @param precio
	 * @param cantidad
	 */
	public Producto(String nombre, float precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	/**
	 * Devuelve el precio total de un producto por su cantidad
	 * @return
	 */
	public float precioTotal() {
		return this.precio * cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\nPrecio: " + precio + "\nCantidad: " + cantidad;
	}

}
