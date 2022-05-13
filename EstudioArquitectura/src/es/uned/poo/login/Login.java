package es.uned.poo.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.uned.poo.acciones.Acciones;
import es.uned.poo.acciones.AccionesAdministrador;
import es.uned.poo.acciones.AccionesAparejador;
import es.uned.poo.acciones.AccionesArquitecto;
import es.uned.poo.acciones.AccionesCliente;
import es.uned.poo.acciones.AccionesContable;
import es.uned.poo.empleados.Administrador;
import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Certificados;
import es.uned.poo.general.Proyectos;
import es.uned.poo.personas.Cliente;

public class Login {

	List<Administrador> listaAdministradores = new ArrayList<>();
	List<Cliente> listaClientes = new ArrayList<>();
	List<Aparejador> listaAparejadores = new ArrayList<>();
	List<Arquitecto> listaArquitectos = new ArrayList<>();
	List<Contable> listaContables = new ArrayList<>();
	
	Acciones acciones = new Acciones();
	AccionesAdministrador accionesAdministrador = new AccionesAdministrador();
	AccionesCliente accionesCliente = new AccionesCliente();
	AccionesArquitecto accionesArquitecto = new AccionesArquitecto();
	AccionesAparejador accionesAparejador = new AccionesAparejador();
	AccionesContable accionesContable= new AccionesContable();

	String nombre="";
	String dni="";
	String apellidos="";
	
	public void opcionesLoginAdministrador(List<Administrador> listaAdministradores, List<Arquitecto> listaArquitectos, List<Aparejador> listaAparejadores, List<Contable> listaContables) {
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; //Guardaremos la opcion del usuario

		while(!salir) {
	    	System.out.println("Seleccione una opción sobre la que quieras realizar una opción");
	    	
			System.out.println("1. Entrar");
	        System.out.println("2. Registrarse");	     
	        System.out.println("5. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	this.loguearseAdministrador(dni, nombre, apellidos, listaAdministradores, listaArquitectos, listaAparejadores, listaContables);
	        } else if(opcion == 2) {
	        	accionesAdministrador.altaAdministrador(nombre, dni, apellidos, listaAdministradores);
	        } else if(opcion == 5) {
	        	salir = true;
	        }	        	        
	    }
	}
	
	public void loguearseAdministrador(String dni, String nombre, String apellidos, List<Administrador> listaAdministradores, List<Arquitecto> listaArquitectos, List<Aparejador> listaAparejadores, List<Contable> listaContables) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Indique el DNI: ");
		dni = sn.next();
		System.out.println("Indique el Nombre: ");
		nombre = sn.next();
		System.out.println("Indique el Apellido: ");
		apellidos = sn.next();

		if(!listaAdministradores.isEmpty()) {
			for(Administrador adm: listaAdministradores) {
				if(adm.getDni().equalsIgnoreCase(dni)) {
					if(adm.getNombre().equalsIgnoreCase(nombre)) {
						if(adm.getApellidos().equalsIgnoreCase(apellidos)) {
							System.out.println("Bienvenido al sistema Administrador: " + adm.getNombre());
				        	acciones.mostrarMenuGestionUsuarios(listaAdministradores, listaArquitectos, listaAparejadores, listaContables);
						}
					}
				}
			}
		} else {
			System.out.println("No existen administradores que visualizar");
			System.out.println("");
		}				
	}
	
	public void opcionesLoginCliente(List<Cliente> listaClientes, List<Arquitecto> listaArquitectos, 
			List<Aparejador> listaAparejadores, List<Contable> listaContables, List<Certificados> listaCertificados, List<Proyectos> listaProyectos) {
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; //Guardaremos la opcion del usuario

		while(!salir) {
	    	System.out.println("Seleccione una opción sobre la que quieras realizar una opción");
	    	
			System.out.println("1. Entrar");
	        System.out.println("2. Registrarse");	     
	        System.out.println("3. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	this.loguearseCliente(dni, nombre, apellidos, listaClientes, listaArquitectos, listaAparejadores, listaContables, listaCertificados, listaProyectos);
	        } else if(opcion == 2) {
	        	accionesCliente.altaCliente(nombre, apellidos, dni, listaClientes);
	        } else if(opcion == 3) {
	        	salir = true;
	        }	        	        
	    }
	}
	
	public void loguearseCliente(String dni, String nombre, String apellidos, List<Cliente> listaClientes, 
			List<Arquitecto> listaArquitectos, List<Aparejador> listaAparejadores, List<Contable> listaContables, 
			List<Certificados> listaCertificados, List<Proyectos> listaProyectos) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Indique el DNI: ");
		dni = sn.next();
		System.out.println("Indique el Nombre: ");
		nombre = sn.next();
		System.out.println("Indique el Apellido: ");
		apellidos = sn.next();

		if(!listaClientes.isEmpty()) {
			for(Cliente cliente: listaClientes) {
				if(cliente.getDni().equalsIgnoreCase(dni)) {
					if(cliente.getNombre().equalsIgnoreCase(nombre)) {
						if(cliente.getApellidos().equalsIgnoreCase(apellidos)) {
							System.out.println("Bienvenido al sistema cliente: " + cliente.getNombre());
				        	acciones.mostrarMenuClientes(cliente, listaAparejadores, listaArquitectos, listaContables, listaCertificados, listaProyectos);
						}
					}
				}
			}
		} else {
			System.out.println("No existen clientes que visualizar");
			System.out.println("");
		}				
	}
	
	
	public void opcionesLoginAparejador(List<Aparejador> listaAparejador) {
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; //Guardaremos la opcion del usuario

		while(!salir) {
	    	System.out.println("Seleccione una opción sobre la que quieras realizar una opción");
	    	
			System.out.println("1. Entrar");
	        System.out.println("2. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	this.loguearseAparejador(dni, nombre, apellidos, listaAparejador);
	        } else if(opcion == 2) {
	        	salir = true;
	        }	        	        
	    }
	}
	
	
	
	public void loguearseAparejador(String dni, String nombre, String apellidos, List<Aparejador> listaAparejador) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Indique el DNI: ");
		dni = sn.next();
		System.out.println("Indique el Nombre: ");
		nombre = sn.next();
		System.out.println("Indique el Apellido: ");
		apellidos = sn.next();

		if(!listaAparejador.isEmpty()) {
			for(Aparejador ap: listaAparejador) {
				if(ap.getDni().equalsIgnoreCase(dni)) {
					if(ap.getNombre().equalsIgnoreCase(nombre)) {
						if(ap.getApellidos().equalsIgnoreCase(apellidos)) {
							System.out.println("Bienvenido al sistema Aparejador: " + ap.getNombre());
				        	accionesAparejador.mostrarMenuAparejador(ap);
						}
					}
				}
			}
		} else {
			System.out.println("No existen aparejadores que visualizar, por favor, consúltelo con un administrador");
			System.out.println("");
		}				
	}
	
	public void opcionesLoginArquitecto(List<Arquitecto> listaArquitectos) {
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; //Guardaremos la opcion del usuario

		while(!salir) {
	    	System.out.println("Seleccione una opción sobre la que quieras realizar una opción");
	    	
			System.out.println("1. Entrar");
	        System.out.println("2. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	this.loguearseArquitecto(dni, nombre, apellidos, listaArquitectos);
	        } else if(opcion == 2) {
	        	salir = true;
	        }	        	        
	    }
	}
	
	public void loguearseArquitecto(String dni, String nombre, String apellidos, List<Arquitecto> listaArquitecto) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Indique el DNI: ");
		dni = sn.next();
		System.out.println("Indique el Nombre: ");
		nombre = sn.next();
		System.out.println("Indique el Apellido: ");
		apellidos = sn.next();

		if(!listaArquitecto.isEmpty()) {
			for(Arquitecto arq: listaArquitecto) {
				if(arq.getDni().equalsIgnoreCase(dni)) {
					if(arq.getNombre().equalsIgnoreCase(nombre)) {
						if(arq.getApellidos().equalsIgnoreCase(apellidos)) {
							System.out.println("Bienvenido al sistema Arquitecto: " + arq.getNombre());
							accionesArquitecto.mostrarMenuArquitecto(arq);
						}
					}
				}
			}
		} else {
			System.out.println("No existen arquitectos que visualizar, por favor, consúltelo con un administrador");
			System.out.println("");
		}				
	}
	
	public void opcionesLoginContable(List<Contable> listaContables) {
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; //Guardaremos la opcion del usuario

		while(!salir) {
	    	System.out.println("Seleccione una opción sobre la que quieras realizar una opción");
	    	
			System.out.println("1. Entrar");
	        System.out.println("2. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	this.loguearseContable(dni, nombre, apellidos, listaContables);
	        } else if(opcion == 2) {
	        	salir = true;
	        }	        	        
	    }
	}
	
	
	public void loguearseContable(String dni, String nombre, String apellidos, List<Contable> listaContables) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Indique el DNI: ");
		dni = sn.next();
		System.out.println("Indique el Nombre: ");
		nombre = sn.next();
		System.out.println("Indique el Apellido: ");
		apellidos = sn.next();

		if(!listaContables.isEmpty()) {
			for(Contable contable: listaContables) {
				if(contable.getDni().equalsIgnoreCase(dni)) {
					if(contable.getNombre().equalsIgnoreCase(nombre)) {
						if(contable.getApellidos().equalsIgnoreCase(apellidos)) {
							System.out.println("Bienvenido al sistema Contable: " + contable.getNombre());
							accionesContable.mostrarMenuContable(contable);
						}
					}
				}
			}
		} else {
			System.out.println("No existen aparejadores que visualizar, por favor, consúltelo con un administrador");
			System.out.println("");
		}				
	}
}
