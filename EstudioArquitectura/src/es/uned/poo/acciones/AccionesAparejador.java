package es.uned.poo.acciones;

import java.util.List;
import java.util.Scanner;

import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.general.Certificados;
import es.uned.poo.general.Proyectos;
import es.uned.poo.interfacesPersonas.AccionesAparejadorInterface;
import es.uned.poo.personas.Cliente;


public class AccionesAparejador implements AccionesAparejadorInterface{

	@Override
	public void verDatosClientesAsignados(Aparejador aparejador, List<Cliente> listaClientes) {
		for(Cliente clientes: listaClientes) {
			if(clientes.getListaProyectos() != null) {
				for(Proyectos proyectos : clientes.getListaProyectos()) {
					if(aparejador.getNombre().equalsIgnoreCase(proyectos.getArquitecto().getNombre())) {
						System.out.println("El aparejador " + aparejador.toString() + " tiene asociado los siguientes clientes");
						System.out.println(clientes.toString());
					}
				}
			}
		}
		
	}

	@Override
	public void mostrarMenuAparejador(Aparejador aparejador, List<Cliente> listaClientes) {
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
		
	    while(!salir) {
			System.out.println("1. Ver datos de clientes asignados");
	        System.out.println("2. Consultar proyectos arquitectónicos");
	        System.out.println("3. Visualización de listado de clientes en función de visitas pendientes para la emisión de certificados.");
	        System.out.println("4. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	this.verDatosClientesAsignados(aparejador, listaClientes);
	        } else if(opcion == 2) {
	        	this.consultarProyectosArquitectonicosAsignados(aparejador, listaClientes);
	        } else if(opcion == 3) {
	        	this.visitasPendientes(aparejador, listaClientes);
	        }   else if(opcion == 4) {
	        	salir = true;
	        }	        	        
	    }
		
	}

	private void visitasPendientes(Aparejador aparejador, List<Cliente> listaClientes) {
		for(Cliente clientes: listaClientes) {
			if(clientes.getListaProyectos() != null) {
				for(Certificados certificados : clientes.getListaCertificados()) {
					if(aparejador.getNombre().equalsIgnoreCase(certificados.getArquitecto().getNombre())) {
						System.out.println("El aparejador " + aparejador.toString() + " tiene las visitas pendiente a los siguientes certificados");
						System.out.println(certificados.toString());
					}
				}
			}
		}		
	}

	private void consultarProyectosArquitectonicosAsignados(Aparejador aparejador, List<Cliente> listaClientes) {
		for(Cliente clientes: listaClientes) {
			if(clientes.getListaProyectos() != null) {
				for(Proyectos proyectos : clientes.getListaProyectos()) {
					if(aparejador.getNombre().equalsIgnoreCase(proyectos.getArquitecto().getNombre())) {
						System.out.println("El aparejador " + aparejador.toString() + " tiene asociado los siguientes proyectos");
						System.out.println(proyectos.toString());
					}
				}
				for(Certificados certificados : clientes.getListaCertificados()) {
					if(aparejador.getNombre().equalsIgnoreCase(certificados.getArquitecto().getNombre())) {
						System.out.println("El aparejador " + aparejador.toString() + " tiene asociado los siguientes certificados");
						System.out.println(certificados.toString());
					}
				}
			}
		}		
	}

}
