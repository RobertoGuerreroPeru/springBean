/**
 * 
 */
package pe.rguerrero;

/**
 * @author Roberto Guerrero
 *
 */
public class ActividadesCaballero {
	public void prepararseParaPelear(Caballero caballero){
		System.out.println("Preparandose para la pelea "+caballero.getNombre() +
				" es un ganador....");
		
	}
	public void acabolaPelea(Caballero caballero){
		System.out.println("El caballero "+caballero.getNombre() + "gano la pelea");
	}

}
