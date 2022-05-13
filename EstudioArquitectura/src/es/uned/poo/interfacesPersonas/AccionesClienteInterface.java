package es.uned.poo.interfacesPersonas;

import java.util.List;

import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Certificados;
import es.uned.poo.general.Proyectos;
import es.uned.poo.personas.Cliente;
import es.uned.poo.proyectos.NoResidenciales;
import es.uned.poo.proyectos.Rehabilitacion;
import es.uned.poo.proyectos.Residenciales;

public interface AccionesClienteInterface {

	public List<Proyectos> solicitarProyectoArquitectonico(Cliente cliente,
			List<Aparejador> listaAparejadores,List<Arquitecto> listaArquitectos, 
			List<Contable> listaContables);
	
	public List<Certificados> solicitarCertificado(List<Aparejador> listaAparejadores, List<Arquitecto> listaArquitectos, 
			List<Contable> listaContables, Cliente cliente, Proyectos proyecto);
	
	public Residenciales solicitarProyectoResidencial(Residenciales proyectosResidenciales, Cliente cliente,
			List<Aparejador> listaAparejadores,List<Arquitecto> listaArquitectos, 
			List<Contable> listaContables);
	
	public NoResidenciales solicitarProyectoNoResidencial(NoResidenciales proyectosNoResidenciales, Cliente cliente,
			List<Aparejador> listaAparejadores,List<Arquitecto> listaArquitectos, List<Contable> listaContables);
	
	public Rehabilitacion solicitarProyectoRehabilitacion(Rehabilitacion proyectosRehabilitacion, Cliente cliente,
			List<Aparejador> listaAparejadores,List<Arquitecto> listaArquitectos, List<Contable> listaContables);
	
	public void altaCliente(String nombre, String apellidos, String dni,List<Cliente> listaClientes);
	
	public Proyectos seleccioneProyecto(List<Proyectos> listaProyectos);

}
