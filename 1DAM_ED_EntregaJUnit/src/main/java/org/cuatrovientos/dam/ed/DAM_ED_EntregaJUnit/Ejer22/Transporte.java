/**
 * 
 */
package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;

public interface Transporte {
	/**
	 * Añade un paquete en el envío
	 * 
	 * @param paquete
	 */
	public void incluirPaquete(Paquete paquete);

	/**
	 * Devuelve el peso total de los paquetes transportados
	 * 
	 * @return pesoTotal
	 */
	public float pesoTotal();

	/**
	 * @return distanciaRecorrida
	 */
	public int recorrerDistancia();
}
