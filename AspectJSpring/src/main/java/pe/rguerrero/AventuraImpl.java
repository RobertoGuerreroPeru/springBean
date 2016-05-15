/**
 * 
 */
package pe.rguerrero;

import pe.rguerrero.exception.AventuraFailedException;

/**
 * @author Roberto Guerrero
 *
 */
public class AventuraImpl implements Aventura {

	/* (non-Javadoc)
	 * @see pe.rguerrero.Aventura#aventurase()
	 */
	public Object aventurase() throws AventuraFailedException {
		// TODO Auto-generated method stub
		return new AvanturaGeneral();
	}

}
