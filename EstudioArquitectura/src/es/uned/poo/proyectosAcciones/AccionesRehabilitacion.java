package es.uned.poo.proyectosAcciones;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import es.uned.poo.acciones.Acciones;
import es.uned.poo.acciones.AccionesContable;
import es.uned.poo.empleados.Administrador;
import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.personas.Cliente;
import es.uned.poo.proyectos.Rehabilitacion;

public class AccionesRehabilitacion {

	LocalDate fechaSolicitud;
	LocalDate fechaEntrega;
	Integer duracionPrevista;
	Integer presupuesto;
	LocalDate fechaInicioContratado;
	Integer duracion;
	Cliente cliente;
	Arquitecto arquitecto;
	String direccion;
	Contable contable;
	Integer costeProyecto;
	Aparejador aparejador;
	String tipo;
	Integer superficieAReformar;
	
	
	Acciones acciones;
	AccionesContable accionesContable;	

	public Rehabilitacion grabarProyectoRehabilitacion(Rehabilitacion proyectosRehabilitacion, Cliente cliente,
			List<Aparejador> listaAparejadores,List<Arquitecto> listaArquitectos, 
			List<Contable> listaContables, String tipo) {
		
		Scanner sn = new Scanner(System.in);
		acciones = new Acciones();
		
        LocalDate todaysDate = LocalDate.now();
        fechaSolicitud = todaysDate;
        System.out.println("Fecha Solicitud: " + fechaSolicitud);
        Aparejador aparejador;
        Arquitecto arquitecto;
        Contable contable;
        String nombre;
        
        System.out.println("?Nombre del proyecto?: ");
        nombre = sn.next();
        
    	LocalDate fechaEntregaDate = LocalDate.of(1,1,1);
    	fechaEntrega = fechaEntregaDate;
        System.out.println("Fecha Entrega: " + fechaEntrega);
        
        System.out.println("?Duraci?n prevista?: ");
        duracionPrevista = sn.nextInt();

        System.out.println("?Presupuesto?: ");
        presupuesto = sn.nextInt();
        
        LocalDate fechaInicioContratadoDate = LocalDate.of(1,1,1);
        fechaInicioContratado = fechaInicioContratadoDate;
        System.out.println("Fecha Inicio Contratado: " + fechaInicioContratado);
        
        System.out.println("?Duracion?: ");
        duracion = sn.nextInt();
        
        System.out.println("?Superficie a reformar?: ");
        presupuesto = sn.nextInt();
        
        System.out.println("?Arquitecto?: ");   
        if(!listaArquitectos.isEmpty()) {
    	arquitecto = this.acciones.obtenerArquitecto(listaArquitectos);
		System.out.println("El arquitecto es: "+ arquitecto.getDni()+ " | " + arquitecto.getNombre() + " | " + arquitecto.getApellidos());
        } else {
        	arquitecto = null;
        	System.out.println("La lista de arquitectos est? vac?a, debe asignarse un arquitecto al proyecto");
        	System.out.println("");
        }
    	System.out.println("?Direcci?n?: ");   	
    	direccion = sn.next();
    	
        System.out.println("?Contable?: ");     
        
        if(!listaContables.isEmpty()) {
        	accionesContable = new AccionesContable();
	    	contable  = this.acciones.obtenerContable(listaContables);
	    	costeProyecto = this.accionesContable.establecerCostesProyecto(contable);
	    	//costeProyecto;
			System.out.println("El contable es: "+ contable.getDni()+ " | " + contable.getNombre() + " | " + contable.getApellidos());
        } else {
        	contable = null;
        	System.out.println("La lista de contables est? vac?a, debe asignarse un contable al proyecto");
        	System.out.println("");
        }
        System.out.println("?Aparejador?: ");
        if(!listaAparejadores.isEmpty()) {
	    	aparejador  = this.acciones.obtenerAparejador(listaAparejadores);
			System.out.println("El aparejador es: "+ aparejador.getDni()+ " | " + aparejador.getNombre() + " | " + aparejador.getApellidos());
        } else {
        	aparejador = null;
        	System.out.println("La lista de aparejadores est? vac?a, debe asignarse un aparejador al proyecto");
        	System.out.println("");
        }

    	
        proyectosRehabilitacion = new Rehabilitacion(fechaSolicitud,fechaEntrega,duracionPrevista,presupuesto,fechaInicioContratado,duracion,cliente,arquitecto,direccion,contable,
        		costeProyecto,aparejador,tipo,superficieAReformar, nombre);	
        if(cliente != null && aparejador != null && arquitecto != null && contable != null) {
        	return proyectosRehabilitacion;
        } else {
        	System.out.println("Por favor, revise que el proyecto tiene: ");
        	System.out.println("Un cliente");
        	System.out.println("Un arquitecto");
        	System.out.println("Un contable");
        	System.out.println("Un aparejador");
        	System.out.println("");
        	return null;
        }
	}
}
