package es.uned.poo.acciones;

import java.util.List;
import java.util.Scanner;

import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.general.Certificados;
import es.uned.poo.general.Proyectos;
import es.uned.poo.interfacesPersonas.AccionesArquitectoInterface;
import es.uned.poo.personas.Cliente;
import es.uned.poo.util.Utils;

public class AccionesArquitecto implements AccionesArquitectoInterface{

	@Override
	public void verDatosClientesAsignados(Arquitecto arquitecto, List<Cliente> listaClientes) {		
		for(Cliente clientes: listaClientes) {
			if(clientes.getListaProyectos() != null) {
				for(Proyectos proyectos : clientes.getListaProyectos()) {
					if(arquitecto.getNombre().equalsIgnoreCase(proyectos.getArquitecto().getNombre())) {
						System.out.println("El arquitecto " + arquitecto.toString() + " tiene asociado los siguientes proyectos");
						System.out.println(proyectos.toString());
					}
				}
				for(Certificados certificados : clientes.getListaCertificados()) {
					if(arquitecto.getNombre().equalsIgnoreCase(certificados.getArquitecto().getNombre())) {
						System.out.println("El arquitecto " + arquitecto.toString() + " tiene asociado los siguientes certificados");
						System.out.println(certificados.toString());
					}
				}
			}
		}		
	}

	@Override
	public void mostrarMenuArquitecto(Arquitecto arquitecto, List<Cliente> listaClientes) {
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
		
	    while(!salir) {
			System.out.println("1. Ver datos de clientes asignados");
	        System.out.println("2. Registro y actualización de proyectos arquitectónicos y certificados.");
	        System.out.println("3. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	this.verDatosClientesAsignados(arquitecto, listaClientes);
	        } else if(opcion == 2) {
	        	this.registroActualizacionProyectosYCertificados(arquitecto, listaClientes);
	        }  else if(opcion == 3) {
	        	salir = true;
	        }	        	     	   
	    }		
	}

	public void registroActualizacionProyectosYCertificados(Arquitecto arquitecto, List<Cliente> listaClientes) {
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
	    
		System.out.println("Registro y actualización de proyectos y certificados");
				
	    while(!salir) {
			System.out.println("1. Actualizar proyectos");
	        System.out.println("2. Actualizar certificados certificados.");
	        System.out.println("3. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	this.actualizarProyectos(arquitecto, listaClientes);
	        } else if(opcion == 2) {
	        	this.actualizarCertificados(arquitecto, listaClientes);
	        }  else if(opcion == 3) {
	        	salir = true;
	        }	        	     	   
	    }
	}
	
	private void actualizarProyectos(Arquitecto arquitecto, List<Cliente> listaClientes) {
		Scanner sn = new Scanner(System.in);
	    String nombre;
	    boolean salir = false;
	    int opcion;
	    
		this.mostrarProyectosAsociados(arquitecto, listaClientes);
        System.out.println("Escribe el nombre de una de las opciones");
        nombre = sn.next();
        
		for(Cliente clientes: listaClientes) {
			for(Proyectos proyectos : clientes.getListaProyectos()) {
				if(arquitecto.getNombre().equalsIgnoreCase(proyectos.getArquitecto().getNombre())) {
					if(nombre.equalsIgnoreCase(proyectos.getNombre())) {
					    while(!salir) {
					        System.out.println("¿Qué valor quieres actualizar?");
					        System.out.println("1- Nombre");
					        System.out.println("2- Coste");
					        System.out.println("3. Salir");

					        System.out.println("Escribe una de las opciones");
					        opcion = sn.nextInt();
					        if(opcion == 1) {
					        	proyectos = Utils.actualizarNombreP(proyectos);
					        } else if(opcion == 2) {
					        	proyectos = Utils.actualizarDuracionP(proyectos);
					        }  else if(opcion == 3) {
					        	salir = true;
					        }	        	     	   
					    }				        				        
					}
				}
			}			
		}                           		
	}
	
	private void actualizarCertificados(Arquitecto arquitecto, List<Cliente> listaClientes) {
		
		Scanner sn = new Scanner(System.in);
	    String nombre;
	    boolean salir = false;
	    int opcion;
	    
		this.mostrarCertificadosAsociados(arquitecto, listaClientes);
        System.out.println("Escribe el nombre de una de las opciones");
        nombre = sn.next();
        
		for(Cliente clientes: listaClientes) {
			for(Certificados certificados : clientes.getListaCertificados()) {
				if(arquitecto.getNombre().equalsIgnoreCase(certificados.getArquitecto().getNombre())) {
					if(arquitecto.getNombre().equalsIgnoreCase(certificados.getArquitecto().getNombre())) {
					    while(!salir) {
					        System.out.println("¿Qué valor quieres actualizar?");
					        System.out.println("1- Fecha entrega");
					        System.out.println("2- Fecha solicitud");
					        System.out.println("3. Salir");

					        System.out.println("Escribe una de las opciones");
					        opcion = sn.nextInt();
					        if(opcion == 1) {
					        	certificados = Utils.actualizarFechaEntrega(certificados);
					        } else if(opcion == 2) {
					        	certificados = Utils.actualizarFechaSolicitud(certificados);
					        }  else if(opcion == 3) {
					        	salir = true;
					        }	        	     	   
					    }				        				        
					}
				}
			}			
		}
		
	}

	
	
	
	private void mostrarCertificadosAsociados(Arquitecto arquitecto, List<Cliente> listaClientes) {
		for(Cliente clientes: listaClientes) {
			if(clientes.getListaProyectos() != null) {
				for(Certificados certificados : clientes.getListaCertificados()) {
					if(arquitecto.getNombre().equalsIgnoreCase(certificados.getArquitecto().getNombre())) {
						System.out.println("El arquitecto " + arquitecto.toString() + " tiene asociado los siguientes certificados");
						System.out.println(certificados.toString());
					}
				}
			}
		}
	}
	

	private void mostrarProyectosAsociados(Arquitecto arquitecto, List<Cliente> listaClientes) {
		for(Cliente clientes: listaClientes) {
			if(clientes.getListaProyectos() != null) {
				for(Proyectos proyectos : clientes.getListaProyectos()) {
					if(arquitecto.getNombre().equalsIgnoreCase(proyectos.getArquitecto().getNombre())) {
						System.out.println("El arquitecto " + arquitecto.toString() + " tiene asociado los siguientes proyectos");
						System.out.println(proyectos.toString());
					}
				}
			}
		}
	}

}
