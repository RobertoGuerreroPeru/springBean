/**
 * 
 */
package pe.rguerrero;

import pe.rguerrero.exception.AventuraFailedException;

/**
 * @author Roberto Guerrero
 *
 */
public class CaballeroGuerrero implements Caballero {
	

	private String nombre;
	private Aventura aventura;
	
	public Object aventura() throws AventuraFailedException {
		
		// TODO Auto-generated method stub
		return aventura.aventurase();
	}

	
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAventura(Aventura aventura) {
		this.aventura = aventura;
	}
	
	

}
