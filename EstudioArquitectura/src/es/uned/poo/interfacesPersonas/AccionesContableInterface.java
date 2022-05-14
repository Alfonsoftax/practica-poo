/**
 * 
 */
package es.uned.poo.interfacesPersonas;

import java.util.List;

import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.personas.Cliente;

/**
 * @author Alfonso
 *
 */
public interface AccionesContableInterface {
	
	public void verDatosClientesAsignados(Contable contable, List<Cliente> listaClientes);
	public Integer establecerCostesProyecto(Contable contable);
	public Integer actualizarCostesCertificados();
	public Integer actualizarCostesProyectos();
	public void mostrarMenuContable(Contable contable, List<Cliente> listaClientes);
	public Integer establecerCostesCertificado(Contable contable);

	
}
