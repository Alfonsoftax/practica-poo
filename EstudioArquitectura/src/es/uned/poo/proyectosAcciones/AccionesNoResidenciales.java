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
import es.uned.poo.interfacesPersonas.AccionesContableInterface;
import es.uned.poo.personas.Cliente;
import es.uned.poo.proyectos.NoResidenciales;

public class AccionesNoResidenciales {

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
	Integer superficieTerreno; 
	Integer superficieEdificio; 
	String finalidad;
	String tipo;

	
	Acciones acciones;
	AccionesContable accionesContable;
	
	public NoResidenciales grabarProyectoNoResidencial(NoResidenciales proyectosNoResidenciales, Cliente cliente,
			List<Aparejador> listaAparejadores,List<Arquitecto> listaArquitectos, 
			List<Contable> listaContables, String tipo) {
		
		Scanner sn = new Scanner(System.in);
		acciones = new Acciones();
		
		accionesContable = new AccionesContable();
		
        LocalDate todaysDate = LocalDate.now();
        fechaSolicitud = todaysDate;
        System.out.println("Fecha Solicitud: " + fechaSolicitud);
        Aparejador aparejador;
        Arquitecto arquitecto;
        Contable contable;
        String nombre;
        
        System.out.println("¿Nombre del proyecto?: ");
        nombre = sn.next();
        
    	LocalDate fechaEntregaDate = LocalDate.of(1,1,1);
    	fechaEntrega = fechaEntregaDate;
        System.out.println("Fecha Entrega: " + fechaEntrega);
        
        System.out.println("¿Duración prevista?: ");
        duracionPrevista = sn.nextInt();

        System.out.println("¿Presupuesto?: ");
        presupuesto = sn.nextInt();
        
        LocalDate fechaInicioContratadoDate = LocalDate.of(1,1,1);
        fechaInicioContratado = fechaInicioContratadoDate;
        System.out.println("Fecha Inicio Contratado: " + fechaInicioContratado);
        
        System.out.println("¿Duracion?: ");
        duracion = sn.nextInt();
        
        System.out.println("¿Arquitecto?: ");   
        if(!listaArquitectos.isEmpty()) {
    	arquitecto = this.acciones.obtenerArquitecto(listaArquitectos);
		System.out.println("El arquitecto es: "+ arquitecto.getDni()+ " | " + arquitecto.getNombre() + " | " + arquitecto.getApellidos());
        } else {
        	arquitecto = null;
        	System.out.println("La lista de arquitectos está vacía, debe asignarse un arquitecto al proyecto");
        	System.out.println("");
        }
    	System.out.println("¿Dirección?: ");   	
    	direccion = sn.next();
    	
        System.out.println("¿Contable?: ");     
        
        if(!listaContables.isEmpty()) {
	    	contable  = this.acciones.obtenerContable(listaContables);
	    	costeProyecto = this.accionesContable.establecerCostesProyecto(contable);
			System.out.println("El contable es: "+ contable.getDni()+ " | " + contable.getNombre() + " | " + contable.getApellidos());
        } else {
        	contable = null;
        	System.out.println("La lista de contables está vacía, debe asignarse un contable al proyecto");
        	System.out.println("");
        }
        System.out.println("¿Aparejador?: ");
        if(!listaAparejadores.isEmpty()) {
	    	aparejador  = this.acciones.obtenerAparejador(listaAparejadores);
			System.out.println("El aparejador es: "+ aparejador.getDni()+ " | " + aparejador.getNombre() + " | " + aparejador.getApellidos());
        } else {
        	aparejador = null;
        	System.out.println("La lista de aparejadores está vacía, debe asignarse un aparejador al proyecto");
        	System.out.println("");
        }
        
        System.out.println("¿Superficie terreno?: ");
        superficieTerreno = sn.nextInt(); 
        
        System.out.println("¿Superficie Edificio?: ");
        superficieEdificio = sn.nextInt();   

        System.out.println("¿Finalidad?: ");
        finalidad = sn.next(); 
    	
        proyectosNoResidenciales = new NoResidenciales(fechaSolicitud,fechaEntrega,duracionPrevista,presupuesto,fechaInicioContratado,duracion,cliente,arquitecto, 
        		direccion,contable,costeProyecto,aparejador,superficieTerreno,superficieEdificio,finalidad,tipo,nombre);	
        
        if(cliente != null && aparejador != null && arquitecto != null && contable != null) {
        	return proyectosNoResidenciales;	
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
