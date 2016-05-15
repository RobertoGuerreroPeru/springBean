/**
 * 
 */
package pe.rguerrero;

import pe.rguerrero.exception.AventuraFailedException;

/**
 * @author Roberto Guerrero
 *
 */
public interface Caballero {
	
	public Object aventura() throws AventuraFailedException;
	public String getNombre();

}
