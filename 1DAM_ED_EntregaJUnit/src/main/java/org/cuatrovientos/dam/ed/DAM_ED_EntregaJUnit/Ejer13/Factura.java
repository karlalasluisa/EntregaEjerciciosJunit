package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13;

import java.util.Vector;

public class Factura {
	private Vector<Producto> productos = new Vector();

	/**
	 * Añade un producto pasado a la lista de productos
	 * @param prod
	 */
	public void meterProducto(Producto prod) {
		productos.add(prod);
	}

	/**
	 * Devuelve el total de la factura
	 * @return
	 */
	public float totalFactura() {
		float total = 0;
		for (Producto prod : productos) {
			total += prod.precioTotal();
		}
		return total;

	}

	/**
	 * Calcula la factura con el iva pedido
	 * @param iva
	 * @return
	 */
	public float aplicarIva(float iva) {
		float total = totalFactura();
		return total + (total * iva / 100);

	}
}
