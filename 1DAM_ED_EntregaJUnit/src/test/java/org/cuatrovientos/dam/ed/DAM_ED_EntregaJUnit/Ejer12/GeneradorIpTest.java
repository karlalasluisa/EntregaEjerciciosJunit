package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneradorIpTest {
	/**
	 * debe confirmar que genera un número entre 0 y 254. Debes ejecutar el test
	 * 1000 veces
	 */
	@Test
	void testGenerarNumero() {
		GeneradorIp generador = new GeneradorIp();

		for (int i = 0; i < 1000; i++) {
			// Expected. En este caso el expected deberá ser un número entre 0 y 254
			// como la función generará un número aleatorio, es más sencillo hacer la
			// comprobación con un assert true solo comparando si el número (actual) se
			// encuentra en el rango
			// Actual
			int actual = generador.generarNumero(0, 254);
			// Assert
			assertTrue(actual >= 0 && actual <= 254);
		}
	}

	/**
	 * debes comprobar que no empieza ni termina con 0.
	 */
	void testGeneraIp() {
		GeneradorIp generador = new GeneradorIp();

		String ip = generador.generarIp();
		// Assert
		assertFalse(ip.startsWith("0.") || ip.endsWith(".0"));
	}
}
