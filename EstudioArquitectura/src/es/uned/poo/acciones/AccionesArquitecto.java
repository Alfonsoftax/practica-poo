package es.uned.poo.acciones;

import java.util.Scanner;

import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.interfacesPersonas.AccionesArquitectoInterface;

public class AccionesArquitecto implements AccionesArquitectoInterface{

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
	public void actualizacionProyectosArquitectonicos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizacionCertificados() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarMenuArquitecto(Arquitecto arquitecto) {
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
	        	this.verDatosClientesAsignados();
	        } else if(opcion == 2) {
	        	this.registroActualizacionProyectosYCertificados();
	        }  else if(opcion == 3) {
	        	salir = true;
	        }	        	        
	    }		
	}

	private void registroActualizacionProyectosYCertificados() {
		// TODO Auto-generated method stub
		
	}


}
