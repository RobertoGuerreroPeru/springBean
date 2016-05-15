/**
 * 
 */
package pe.rguerrero;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.rguerrero.exception.AventuraFailedException;

/**
 * @author Roberto Guerrero
 *
 */
public class AventuraAPP {

	/**
	 * @param args
	 * @throws AventuraFailedException 
	 */
	public static void main(String[] args) throws AventuraFailedException {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AplicationContext.xml");
		Caballero caballero = (Caballero)applicationContext.getBean("caballero");
		caballero.aventura();
		
		
		
		
		
	}

}
