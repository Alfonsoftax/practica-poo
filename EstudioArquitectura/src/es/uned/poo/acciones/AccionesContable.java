package es.uned.poo.acciones;

import java.util.List;
import java.util.Scanner;

import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Certificados;
import es.uned.poo.general.Proyectos;
import es.uned.poo.interfacesPersonas.AccionesContableInterface;
import es.uned.poo.personas.Cliente;


public class AccionesContable implements AccionesContableInterface{

	@Override
	public void verDatosClientesAsignados(Contable contable, List<Cliente> listaClientes) {
		for(Cliente clientes: listaClientes) {
			if(clientes.getListaProyectos() != null) {
				for(Proyectos proyectos : clientes.getListaProyectos()) {
					if(contable.getNombre().equalsIgnoreCase(proyectos.getArquitecto().getNombre())) {
						System.out.println("El contable " + contable.toString() + " tiene asociado los siguientes proyectos");
						System.out.println(proyectos.toString());
					}
				}
				for(Certificados certificados : clientes.getListaCertificados()) {
					if(contable.getNombre().equalsIgnoreCase(certificados.getArquitecto().getNombre())) {
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

	private void actualizacionProyectosYCertificados(Contable contable, List<Cliente> listaClientes) {
		
		System.out.println("Actualización proyectos y certificados");
		
		
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
	public void actualizarCostesCertificados() {
		// TODO Auto-generated method stub
		
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


}
