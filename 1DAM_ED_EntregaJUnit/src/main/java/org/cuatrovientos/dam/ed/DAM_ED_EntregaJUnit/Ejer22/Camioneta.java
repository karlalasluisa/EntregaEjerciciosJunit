/**
 * 
 */
package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;

import java.util.ArrayList;
import java.util.Random;

/**
 * Clase que representa una Camioneta y su comportamiento. Implementa la
 * interfaz Transporte.
 */
public class Camioneta implements Transporte {
	private ArrayList<Paquete> paquetes = new ArrayList<>();
	private Random numAleat = new Random();

	/**
	 * Añade un paquete a la lista de paquetes de la camioneta.
	 * 
	 * @param paquete El paquete a incluir en la camioneta.
	 */
	@Override
	public void incluirPaquete(Paquete paquete) {
		// TODO Auto-generated method stub
		paquetes.add(paquete);
	}

	/**
	 * Calcula el peso total de los paquetes en la camioneta.
	 * 
	 * @return El peso total de los paquetes.
	 */

	@Override
	public float pesoTotal() {
		float total = 0;
		for (Paquete paquete : paquetes) {
			total += paquete.getPeso();
		}
		return total;
	}

	/**
	 * Genera una distancia aleatoria que la camioneta puede recorrer.
	 * 
	 * @return Una distancia entre 70 y 100 kilómetros.
	 */
	@Override
	public int recorrerDistancia() {
		// TODO Auto-generated method stub
		return 70 + numAleat.nextInt(31);
	}

}
