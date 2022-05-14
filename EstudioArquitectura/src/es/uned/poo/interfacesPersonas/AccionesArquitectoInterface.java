package es.uned.poo.interfacesPersonas;

import java.util.List;

import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.personas.Cliente;

public interface AccionesArquitectoInterface {
	
	public void verDatosClientesAsignados(Arquitecto arquitecto, List<Cliente> listaClientes);
	public void mostrarMenuArquitecto(Arquitecto arquitecto, List<Cliente> listaClientes);
	public void registroActualizacionProyectosYCertificados(Arquitecto arquitecto, List<Cliente> listaClientes) ;

}
