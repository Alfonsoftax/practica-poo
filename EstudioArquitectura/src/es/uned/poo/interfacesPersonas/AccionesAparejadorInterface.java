package es.uned.poo.interfacesPersonas;

import java.util.List;

import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.personas.Cliente;

public interface AccionesAparejadorInterface {

	public void verDatosClientesAsignados(Aparejador aparejador, List<Cliente> listaClientes);
	public void registroProyectosArquitectonicos();
	public void registroCertificados();
	public void verClientesPendienteCertificados();
	public void mostrarMenuAparejador(Aparejador arquitecto, List<Cliente> listaClientes);
}
