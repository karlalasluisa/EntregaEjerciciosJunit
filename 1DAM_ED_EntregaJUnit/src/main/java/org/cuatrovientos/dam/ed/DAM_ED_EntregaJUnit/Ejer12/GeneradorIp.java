package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer12;

import java.util.Random;

public class GeneradorIp {
	/**
	 * devuelve un número entre min y max
	 * @param min
	 * @param max
	 * @return
	 */
	public int generarNumero(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	/**
	 * devuelve una dirección ip, utilizando el método anterior
	 * @return
	 */
	public String generarIp() {
		return generarNumero(1, 254) + "." + generarNumero(0, 254) + "." + generarNumero(0, 254) + "."
				+ generarNumero(1, 254);
	}
}
