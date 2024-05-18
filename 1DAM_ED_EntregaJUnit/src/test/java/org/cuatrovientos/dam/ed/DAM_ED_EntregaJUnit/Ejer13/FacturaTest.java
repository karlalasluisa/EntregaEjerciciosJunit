/**
 * 
 */
package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class FacturaTest {

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
	 * Comprobar que el total de la factura calculada es correcto 
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13.Factura#totalFactura()}.
	 */
	@Test
	void testTotalFactura() {

		Factura factura = new Factura();
		factura.meterProducto(new Producto("pan", 0.50f, 3));
		factura.meterProducto(new Producto("huevos", 2.10f, 2));

		// expected
		float expected = 5.7f;
		// actual
		float actual = factura.totalFactura();
		// assert
		assertEquals(expected, actual, "El total de la factura no coincide");
	}

	/**
	 * Comprobar que el total de la factura calculada con un IVA es correcto 
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer13.Factura#aplicarIva(float)}.
	 */
	@Test
	void testAplicarIva() {
		Factura factura = new Factura();
		factura.meterProducto(new Producto("pan", 0.50f, 3));
		factura.meterProducto(new Producto("huevos", 2.10f, 2));
		// expected
		float expected = 6.27f;// iva del 10%
		// actual
		float actual = factura.aplicarIva(10);
		// assert
		assertEquals(expected, actual, "No coincide el total con el iva");

	}

}
