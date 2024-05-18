package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit.Ejer22;

/**
 * 
 */
public class Paquete {
	private String destino;
	private float peso;
	/**
	 * Constructor de paquete
	 * @param destino
	 * @param peso
	 */
	public Paquete(String destino, float peso) {
		this.destino = destino;
		this.peso = peso;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Paquete{" + "destino='" + destino + '\'' + ", peso=" + peso + '}';
	}
}