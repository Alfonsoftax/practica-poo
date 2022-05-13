package es.uned.poo.acciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.uned.poo.accionesInterface.GestionUsuarios;
import es.uned.poo.empleados.Administrador;
import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Certificados;
import es.uned.poo.general.Proyectos;
import es.uned.poo.interfacesPersonas.AccionesGenerales;
import es.uned.poo.personas.Cliente;

public class Acciones implements GestionUsuarios, AccionesGenerales{

	AccionesAdministrador accionesAdministrador = new AccionesAdministrador();
	AccionesCliente accionesCliente = new AccionesCliente();

	String nombre="";
	String dni="";
	String apellidos="";
	List<Administrador> listaAdministradores = new ArrayList<>();
	List<Cliente> listaCliente = new ArrayList<>();
	List<Arquitecto> listaArquitectos = new ArrayList<>();
	List<Aparejador> listaAparejadores = new ArrayList<>();
	List<Contable> listaContables = new ArrayList<>();


	@Override
	public void darAlta() {
		
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
	    while(!salir) {
			System.out.println("1. Administrador");
	        System.out.println("2. Arquitecto");
	        System.out.println("3. Aparejador");
	        System.out.println("4. Contable");
	        System.out.println("5. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	accionesAdministrador.verMenuAdministradores(listaAdministradores);
	        } else if(opcion == 2) {
	        	accionesAdministrador.verMenuArquitectos(listaArquitectos);
	        } else if(opcion == 3) {
	        	this.modificar();
	        } else if(opcion == 4) {
	        	this.modificar();
	        } else if(opcion == 5) {
	        	salir = true;
	        }	        	        
	    }
		
		
	}

	@Override
	public void darBaja() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarMenuGestionUsuarios(List<Administrador> listaAdministradores, List<Arquitecto> listaArquitectos, List<Aparejador> listaAparejadores, 
			List<Contable> listaContables, List<Cliente> listaClientes) {
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
	    if(!listaAdministradores.isEmpty()) {		
		    while(!salir) {
		    	System.out.println("Seleccione una opción sobre la que quieras realizar una opción");
		    	
				System.out.println("1. Administrador");
		        System.out.println("2. Arquitecto");
		        System.out.println("3. Aparejador");
		        System.out.println("4. Contable");
		        System.out.println("5. Ver listado de clientes");
		        System.out.println("6. Salir");
	
		        System.out.println("Escribe una de las opciones");
		        opcion = sn.nextInt();
		        if(opcion == 1) {
		        	accionesAdministrador.verMenuAdministradores(listaAdministradores);
		        } else if(opcion == 2) {
		        	accionesAdministrador.verMenuArquitectos(listaArquitectos);
		        } else if(opcion == 3) {
		        	accionesAdministrador.verMenuAparejadores(listaAparejadores);
		        } else if(opcion == 4) {
		        	accionesAdministrador.verMenuContables(listaContables);
		        } else if(opcion == 5) {
		        	accionesAdministrador.verMenuClientes(listaClientes);
		        } else if(opcion == 6) {
		        	salir = true;
		        }	        	        
		    }		
		} else {
			System.out.println("Debes dar de alta primero un administrador");
			accionesAdministrador.altaAdministrador(dni,nombre,apellidos,listaAdministradores);			
		}
	}

	@Override
	public void mostrarMenuClientes(Cliente cliente, List<Aparejador> listaAparejadores,List<Arquitecto> listaArquitectos, 
			List<Contable> listaContables, List<Certificados> listaCertificados, List<Proyectos> listaProyectos) {
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
	    Proyectos proyecto;
	    if(cliente != null) {		
		    while(!salir) {
		    	System.out.println("Seleccione una opción sobre la que quieras realizar una opción");
		    	
				System.out.println("1. Solicitar proyecto arquitectónico");
		        System.out.println("2. Solicitar certificado");
		        System.out.println("3. Salir");
		        
		        System.out.println("Escribe una de las opciones");
		        opcion = sn.nextInt();
		        if(opcion == 1) {
		        	listaProyectos = accionesCliente.solicitarProyectoArquitectonico(cliente, listaAparejadores, listaArquitectos, listaContables);
				    cliente.setListaProyectos(listaProyectos);
		        } else if(opcion == 2) {
		        	proyecto = this.accionesCliente.seleccioneProyecto(cliente.getListaProyectos());
		        	if(proyecto != null) {
		        		listaCertificados = accionesCliente.solicitarCertificado(listaAparejadores, listaArquitectos, listaContables, cliente, proyecto);
		    		    cliente.setListaCertificados(listaCertificados);
		        	} else {
				        System.out.println("No existen proyectos al que añadir un certificado");
		        	}
		        } else if(opcion == 3) {
		        	salir = true;
		        }		        
		    }	
		}
	}

	@Override
	public Arquitecto obtenerArquitecto(List<Arquitecto> listadoArquitectos) {
		Arquitecto arq = new Arquitecto();
		Scanner sn = new Scanner(System.in);
		System.out.println("¿Cuál es el DNI del arquitecto?");
		String dni = sn.next();
		if(!listadoArquitectos.isEmpty()) {
			for(Arquitecto arquitecto: listadoArquitectos) {
				if(arquitecto.getDni().equalsIgnoreCase(dni)) {
					arq = arquitecto;
					break;
				}
			}
		} else {
			System.out.println("No existen arquitectos, debe contactar con el administrador");
		}
		return arq;
	}

	@Override
	public Cliente obtenerCliente(List<Cliente> listadoClientes) {
		Cliente clienteActual = new Cliente();
		if(!listadoClientes.isEmpty()) {
			clienteActual = listadoClientes.get(0);
		}
		return clienteActual;
	}

	@Override
	public Contable obtenerContable(List<Contable> listadoContables) {
		Contable cont = new Contable();
		Scanner sn = new Scanner(System.in);
		System.out.println("¿Cuál es el DNI del contable?");
		String dni = sn.next();
		if(!listadoContables.isEmpty()) {
			for(Contable contable: listadoContables) {
				if(contable.getDni().equalsIgnoreCase(dni)) {
					cont = contable;
					break;
				}
			}
			
		} else {
			System.out.println("No existen contables, debe contactar con el administrador");
		}
		return cont;
	}

	@Override
	public Aparejador obtenerAparejador(List<Aparejador> listadoAparejadores) {
		Aparejador ap = new Aparejador();
		Scanner sn = new Scanner(System.in);
		System.out.println("¿Cuál es el DNI del aparejador?");
		String dni = sn.next();
		if(!listadoAparejadores.isEmpty()) {
			for(Aparejador aparejador: listadoAparejadores) {
				if(aparejador.getDni().equalsIgnoreCase(dni)) {
					ap = aparejador;
					break;
				}
			}
		} else {
			System.out.println("No existen contables, debe contactar con el administrador");
		}
		return ap;
	}
}
