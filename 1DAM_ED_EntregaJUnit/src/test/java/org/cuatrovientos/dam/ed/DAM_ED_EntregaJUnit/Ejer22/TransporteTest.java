/**
 * 
 */
package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class TransporteTest {

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
	 * añade un paquete al transporte y comprueba que el peso total resultante es el mismo 
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22.Transporte#pesoTotal()}.
	 */
	@Test
	void testPesoTotal() {
		Transporte camioneta = new Camioneta();
		Paquete paquete = new Paquete("Pamplona", 100.0f);
		camioneta.incluirPaquete(paquete);
		assertEquals(100.0f, camioneta.pesoTotal());

	}

	/**
	 * comprueba que la distancia recorrida está entre 70 y 100. 
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22.Transporte#recorrerDistancia()}.
	 */
	@Test
	void testRecorrerDistancia() {
		Transporte camioneta = new Camioneta();
		int distancia = camioneta.recorrerDistancia();
		assertTrue(distancia >= 70 && distancia <= 100);

	}

}
