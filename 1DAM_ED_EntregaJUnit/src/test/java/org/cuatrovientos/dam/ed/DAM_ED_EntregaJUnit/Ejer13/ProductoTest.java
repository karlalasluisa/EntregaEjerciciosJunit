/**
 * 
 */
package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Crea una instancia de producto y comprueba que cada uno de sus atributos se
	 * ha iniciado correctamente, es decir, si hago Producto p = new
	 * Producto(“pan”,0.50f, 1); entonces p.getName() debe ser igual a “pan”. 
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13.Producto#Producto(java.lang.String, float, int)}.
	 */
	@Test
	void testProducto() {

		Producto p = new Producto("pan", 0.50f, 1);
		// Se puede guardar los expecteds y actuals en variables como lo hemos ido
		// haciendo en clase pero he preferido hacerlo directamente
		assertEquals("pan", p.getNombre(), "El nombre del producto no coincide");
		assertEquals(0.50f, p.getPrecio(), "El precio del producto no coincide");
		assertEquals(1, p.getCantidad(), "La cantidad del producto no coincide");
	}

	/**
	 * Comprueba que el total de su precio (precio x cantidad) es correcto
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13.Producto#precioTotal()}.
	 */
	@Test
	void testPrecioTotal() {

		Producto producto = new Producto("pan", 0.50f, 3);
		assertEquals(1.50f, producto.precioTotal(), "El precio total no coincide");
	}

}
