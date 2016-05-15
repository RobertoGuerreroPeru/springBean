/**
 * 
 */
package pe.rguerrero;

/**
 * @author Roberto Guerrero
 *
 */
public class SaludoServiceImpl implements SaludoService {
	
	String saludo;
	
	public SaludoServiceImpl(String saludo) {
		this.saludo = saludo;
	}
	

	
	public void saludar() {
		this.saludo = "Hola a todos!!!";
		System.out.println("saludos: "+saludo);
	}

}
