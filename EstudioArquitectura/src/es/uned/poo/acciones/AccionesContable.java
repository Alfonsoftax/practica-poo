package es.uned.poo.acciones;

import java.util.List;
import java.util.Scanner;

import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Certificados;
import es.uned.poo.general.Proyectos;
import es.uned.poo.interfacesPersonas.AccionesContableInterface;
import es.uned.poo.personas.Cliente;
import es.uned.poo.util.Utils;


public class AccionesContable implements AccionesContableInterface{

	@Override
	public void verDatosClientesAsignados(Contable contable, List<Cliente> listaClientes) {
		for(Cliente clientes: listaClientes) {
			if(clientes.getListaProyectos() != null) {
				for(Proyectos proyectos : clientes.getListaProyectos()) {
					if(contable.getNombre().equalsIgnoreCase(proyectos.getContable().getNombre())) {
						System.out.println("El contable " + contable.toString() + " tiene asociado los siguientes proyectos");
						System.out.println(proyectos.toString());
					}
				}
				for(Certificados certificados : clientes.getListaCertificados()) {
					if(contable.getNombre().equalsIgnoreCase(certificados.getContable().getNombre())) {
						System.out.println("El contable " + contable.toString() + " tiene asociado los siguientes certificados");
						System.out.println(certificados.toString());
					}
				}
			}
		}		
	}

	@Override
	public void mostrarMenuContable(Contable contable, List<Cliente> listaClientes) {
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
	        	this.verDatosClientesAsignados(contable, listaClientes);
	        } else if(opcion == 2) {
	        	this.actualizacionProyectosYCertificados(contable, listaClientes);
	        }  else if(opcion == 3) {
	        	salir = true;
	        }	        	        
	    }		
	}


	public void actualizacionProyectosYCertificados(Contable contable, List<Cliente> listaClientes) {
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
	        	this.actualizarProyectos(contable, listaClientes);
	        } else if(opcion == 2) {
	        	this.actualizarCertificados(contable, listaClientes);
	        }  else if(opcion == 3) {
	        	salir = true;
	        }	        	     	   
	    }
	}

	@Override
	public Integer establecerCostesProyecto(Contable contable) {
		Scanner sn = new Scanner(System.in);
		Integer costeProyecto;
		System.out.println("¿Cuál es el precio que establece el contable" + contable.getNombre() + "?");
		costeProyecto = sn.nextInt();
		System.out.println("El contable: " + contable.getNombre() + " establece un precio de: ");
		return costeProyecto;
	}
	
	@Override
	public Integer actualizarCostesCertificados() {
		Scanner sn = new Scanner(System.in);
		Integer nuevoCoste = null;
		System.out.println("Establece un nuevo coste del certificado");
		nuevoCoste = sn.nextInt();
		
		System.out.println("El nuevo coste del certificado es: " + nuevoCoste);

		return nuevoCoste;
		
	}
	
	@Override
	public Integer actualizarCostesProyectos() {
		Scanner sn = new Scanner(System.in);
		Integer nuevoCoste = null;
		System.out.println("Establece un nuevo coste del proyecto");
		nuevoCoste = sn.nextInt();
		
		System.out.println("El nuevo coste del proyecto es: " + nuevoCoste);

		return nuevoCoste;
	}
	
	@Override
	public Integer establecerCostesCertificado(Contable contable) {
		Scanner sn = new Scanner(System.in);
		Integer costeCertificado;
		System.out.println("¿Cuál es el precio que establece el contable" + contable.getNombre() + "?");
		costeCertificado = sn.nextInt();
		System.out.println("El contable: " + contable.getNombre() + " establece un precio de: " + costeCertificado);
		return costeCertificado;		
	}
	
	
	private void actualizarProyectos(Contable contable, List<Cliente> listaClientes) {
		Scanner sn = new Scanner(System.in);
	    String nombre;
	    boolean salir = false;
	    int opcion;
		this.mostrarProyectosAsociados(contable, listaClientes);
        System.out.println("Escribe el nombre de una de las opciones");
        nombre = sn.next();
        
		for(Cliente clientes: listaClientes) {
			for(Proyectos proyectos : clientes.getListaProyectos()) {
				if(contable.getNombre().equalsIgnoreCase(proyectos.getContable().getNombre())) {
					if(nombre.equalsIgnoreCase(proyectos.getNombre())) {
					    while(!salir) {
					        System.out.println("¿Qué valor quieres actualizar?");
					        System.out.println("1- Nombre");
					        System.out.println("2- Coste proyecto");
					        System.out.println("3. Salir");

					        System.out.println("Escribe una de las opciones");
					        opcion = sn.nextInt();
					        if(opcion == 1) {
					        	proyectos = Utils.actualizarNombreP(proyectos);
					        } else if(opcion == 2) {
					    	    Integer nuevoCosteProyecto = this.actualizarCostesProyectos();
					    	    proyectos.setCosteProyecto(nuevoCosteProyecto);
					        }  else if(opcion == 3) {
					        	salir = true;
					        }	        	     	   
					    }				        				        
					}
				}
			}			
		}                           		
	}
	
	
	private void actualizarCertificados(Contable contable, List<Cliente> listaClientes) {
		
		Scanner sn = new Scanner(System.in);
	    String nombre;
	    boolean salir = false;
	    int opcion;
	    
		this.mostrarCertificadosAsociados(contable, listaClientes);
        System.out.println("Escribe el nombre de una de las opciones");
        nombre = sn.next();
        
		for(Cliente clientes: listaClientes) {
			for(Certificados certificados : clientes.getListaCertificados()) {
				if(contable.getNombre().equalsIgnoreCase(certificados.getContable().getNombre())) {
					if(contable.getNombre().equalsIgnoreCase(certificados.getContable().getNombre())) {
					    while(!salir) {
					        System.out.println("¿Qué valor quieres actualizar?");
					        System.out.println("1- Fecha entrega");
					        System.out.println("2- Coste certificado");
					        System.out.println("3. Salir");

					        System.out.println("Escribe una de las opciones");
					        opcion = sn.nextInt();
					        if(opcion == 1) {
					        	certificados = Utils.actualizarFechaEntrega(certificados);
					        } else if(opcion == 2) {
					    	    Integer nuevoCosteCer = this.actualizarCostesCertificados();
					    	    certificados.setCosteCertificado(nuevoCosteCer);					        
					    	}  else if(opcion == 3) {
					        	salir = true;
					        }	        	     	   
					    }				        				        
					}
				}
			}			
		}
		
	}
	
	
	private void mostrarCertificadosAsociados(Contable contable, List<Cliente> listaClientes) {
		for(Cliente clientes: listaClientes) {
			if(clientes.getListaProyectos() != null) {
				for(Certificados certificados : clientes.getListaCertificados()) {
					if(contable.getNombre().equalsIgnoreCase(certificados.getContable().getNombre())) {
						System.out.println("El contable " + contable.toString() + " tiene asociado los siguientes certificados");
						System.out.println(certificados.toString());
					}
				}
			}
		}
	}
	

	private void mostrarProyectosAsociados(Contable contable, List<Cliente> listaClientes) {
		for(Cliente clientes: listaClientes) {
			if(clientes.getListaProyectos() != null) {
				for(Proyectos proyectos : clientes.getListaProyectos()) {
					if(contable.getNombre().equalsIgnoreCase(proyectos.getContable().getNombre())) {
						System.out.println("El contable " + contable.toString() + " tiene asociado los siguientes proyectos");
						System.out.println(proyectos.toString());
					}
				}
			}
		}
	}


}
