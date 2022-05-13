package es.uned.poo.acciones;

import java.util.Scanner;

import es.uned.poo.empleados.Aparejador;
import es.uned.poo.interfacesPersonas.AccionesAparejadorInterface;


public class AccionesAparejador implements AccionesAparejadorInterface{

	@Override
	public void verDatosClientesAsignados() {
		
		
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
	public void verClientesPendienteCertificados() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarMenuAparejador(Aparejador aparejador) {
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
	        	this.verDatosClientesAsignados();
	        } else if(opcion == 2) {
	        	this.consultarProyectosArquitectonicosAsignados();
	        } else if(opcion == 3) {
	        	this.visitasPendientes();
	        }   else if(opcion == 4) {
	        	salir = true;
	        }	        	        
	    }
		
	}

	private void visitasPendientes() {
		// TODO Auto-generated method stub
		
	}

	private void consultarProyectosArquitectonicosAsignados() {
		// TODO Auto-generated method stub
		
	}


}
