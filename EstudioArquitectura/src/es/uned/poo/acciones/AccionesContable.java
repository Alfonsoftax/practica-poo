package es.uned.poo.acciones;

import java.util.Scanner;

import es.uned.poo.empleados.Contable;
import es.uned.poo.interfacesPersonas.AccionesContableInterface;


public class AccionesContable implements AccionesContableInterface{

	@Override
	public void verDatosClientesAsignados() {
		
		
	}

	@Override
	public void mostrarMenuContable(Contable contable) {
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
	        	this.actualizacionProyectosYCertificados();
	        }  else if(opcion == 3) {
	        	salir = true;
	        }	        	        
	    }		
	}

	private void actualizacionProyectosYCertificados() {
		// TODO Auto-generated method stub
		
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
