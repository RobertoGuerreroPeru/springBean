/**
 * 
 */
package pe.rguerrero;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Roberto Guerrero
 *
 */
public class SaludoAPP {
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("saludo.xml"));
		SaludoService saludo = (SaludoService)beanFactory.getBean("saludo");
		saludo.saludar();
	}

}
