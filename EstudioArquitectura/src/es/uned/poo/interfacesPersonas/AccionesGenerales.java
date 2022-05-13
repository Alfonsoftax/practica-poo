package es.uned.poo.interfacesPersonas;

import java.util.List;

import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.personas.Cliente;

public interface AccionesGenerales {

	
	public Arquitecto obtenerArquitecto(List<Arquitecto> listadoArquitectos);
	public Cliente obtenerCliente(List<Cliente> listadoClientes);
	public Contable obtenerContable(List<Contable> listadoContables);
	public Aparejador obtenerAparejador(List<Aparejador> listadoAparejadores);

}
