package es.uned.poo.accionesInterface;

import java.util.List;

import es.uned.poo.empleados.Administrador;
import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Certificados;
import es.uned.poo.general.Proyectos;
import es.uned.poo.personas.Cliente;

public interface GestionUsuarios {

	
	public void mostrarMenuGestionUsuarios(List<Administrador> listaAdministradores, List<Arquitecto> listaArquitectos, List<Aparejador> listaAparejadores, 
			List<Contable> listaContables, List<Cliente> listaClientes);
	public void mostrarMenuClientes(Cliente cliente,
			List<Aparejador> listaAparejadores,List<Arquitecto> listaArquitectos, List<Contable> listaContables,List<Certificados> listaCertificados, List<Proyectos> listaProyectos);
	public void darAlta();
	public void darBaja();
	public void modificar();
}
