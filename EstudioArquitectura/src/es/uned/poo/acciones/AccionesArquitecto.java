package es.uned.poo.acciones;

import java.util.List;
import java.util.Scanner;

import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.general.Certificados;
import es.uned.poo.general.Proyectos;
import es.uned.poo.interfacesPersonas.AccionesArquitectoInterface;
import es.uned.poo.personas.Cliente;

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
	public void registroProyectosArquitectonicos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registroCertificados() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizacionProyectosArquitectonicos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizacionCertificados() {
		// TODO Auto-generated method stub
		
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
	        	this.registroActualizacionProyectosYCertificados();
	        }  else if(opcion == 3) {
	        	salir = true;
	        }	        	        
	    }		
	}

	private void registroActualizacionProyectosYCertificados() {

		System.out.println("Registro y actualización de proyectos y certificados");
	}


}
