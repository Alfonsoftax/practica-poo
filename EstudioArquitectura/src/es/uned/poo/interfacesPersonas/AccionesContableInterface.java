/**
 * 
 */
package es.uned.poo.interfacesPersonas;

import es.uned.poo.empleados.Contable;

/**
 * @author Alfonso
 *
 */
public interface AccionesContableInterface {
	
	public void verDatosClientesAsignados();
	public Integer establecerCostesProyecto(Contable contable);
	public void actualizarCostesCertificados();
	public void mostrarMenuContable(Contable contable);

	
}
