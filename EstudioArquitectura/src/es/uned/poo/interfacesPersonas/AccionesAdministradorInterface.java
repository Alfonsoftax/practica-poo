package es.uned.poo.interfacesPersonas;

import java.util.List;

import es.uned.poo.empleados.Administrador;
import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.personas.Cliente;

public interface AccionesAdministradorInterface {


	public void asignarEmpleado();
	public void verClientePorArquitecto();
	public void verClientePorAparejador();
	public void verViviendasFinObras();
	public void verViviendasUltimoHabitabilidad();
	public void verViviendasPorProyectosYCertificados();
	public void verPlanificacionYEjecuciondeObras();
	
	//métodos para administradores
	public void altaAdministrador(String nombre, String apellidos, String dni, List<Administrador> listaAdministradores);
	public void bajaAdministrador(String dni, List<Administrador> listaAdministradores);
	public void modificaAdministrador(String nombre, String apellidos, String dni, List<Administrador> listaAdministradores);
	public void verAdministradorRegistrados(List<Administrador> listaAdministradores);
	public void verMenuAdministradores(List<Administrador> listaAdministradores);

	// Métodos para arquitectos
	public void altaArquitecto(String nombre, String apellidos, String dni,List<Arquitecto> listaArquitectos);
	public void verArquitectosRegistrados(List<Arquitecto> listaArquitectos);
	public void bajaArquitecto(String dni,List<Arquitecto> listaArquitectos);
	public void modificaArquitecto(String nombre, String apellidos, String dni,List<Arquitecto> listaArquitectos);
	public void verMenuArquitectos(List<Arquitecto> listaArquitectos);

	// métodos para aparejadores
	public void altaAparejador(String nombre, String apellidos, String dni,List<Aparejador> listaAparejador);
	public void verAparejadoresRegistrados(List<Aparejador> listaAparejador);
	public void bajaAparejador(String dni,List<Aparejador> listaAparejador);
	public void modificaAparejador(String nombre, String apellidos, String dni,List<Aparejador> listaAparejador);	
	public void verMenuAparejadores(List<Aparejador> listaAparejador);

	// métodos para contables
	public void altaContable(String nombre, String apellidos, String dni,List<Contable> listaContable);
	public void verContablesRegistrados(List<Contable> listaContable);
	public void bajaContable(String dni,List<Contable> listaContable);
	public void modificaContable(String nombre, String apellidos, String dni,List<Contable> listaContable);	
	public void verMenuContables(List<Contable> listaContable);

	// métodos para contables
	public void verMenuClientes(List<Cliente> listaClientes);

}
