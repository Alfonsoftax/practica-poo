package es.uned.poo.acciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import es.uned.poo.certificados.EficienciaEnergetica;
import es.uned.poo.certificados.Habitabilidad;
import es.uned.poo.certificados.InformesPericiales;
import es.uned.poo.certificados.InspeccionTecnica;
import es.uned.poo.empleados.Administrador;
import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Certificados;
import es.uned.poo.general.Proyectos;
import es.uned.poo.interfacesPersonas.AccionesCertificadosInterface;
import es.uned.poo.interfacesPersonas.AccionesClienteInterface;
import es.uned.poo.interfacesPersonas.AccionesContableInterface;
import es.uned.poo.personas.Cliente;
import es.uned.poo.proyectos.NoResidenciales;
import es.uned.poo.proyectos.Rehabilitacion;
import es.uned.poo.proyectos.Residenciales;
import es.uned.poo.proyectosAcciones.AccionesNoResidenciales;
import es.uned.poo.proyectosAcciones.AccionesRehabilitacion;
import es.uned.poo.proyectosAcciones.AccionesResidenciales;

public class AccionesCliente implements AccionesClienteInterface, AccionesCertificadosInterface{


	AccionesResidenciales accionesResidenciales = new AccionesResidenciales();
	AccionesNoResidenciales accionesNoResidenciales = new AccionesNoResidenciales();
	AccionesRehabilitacion accionesRehabilitacion = new AccionesRehabilitacion();
	AccionesContableInterface accionesContable;

	
	@Override
	public List<Proyectos> solicitarProyectoArquitectonico(Cliente cliente,
			List<Aparejador> listaAparejadores,List<Arquitecto> listaArquitectos, 
			List<Contable> listaContables) {
		
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
	    Residenciales proyectosResidenciales = null;
	    NoResidenciales proyectosNoResidenciales = null;
	    Rehabilitacion proyectosRehabilitacion = null;
	    List<Proyectos> listaProyectos = new ArrayList<Proyectos>();
	    while(!salir) {
			System.out.println("1. Solicitar Proyecto Residencial");
	        System.out.println("2. Solicitar Proyecto no residencial");
	        System.out.println("3. Solicitar Proyecto de rehabilitacion");
	        System.out.println("4. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	proyectosResidenciales = this.solicitarProyectoResidencial(proyectosResidenciales, cliente, listaAparejadores, listaArquitectos, listaContables);
	        	if(proyectosResidenciales != null) {
	        		listaProyectos.add(proyectosResidenciales);
	        	}
	        } else if(opcion == 2) {
	        	proyectosNoResidenciales = this.solicitarProyectoNoResidencial(proyectosNoResidenciales, cliente, listaAparejadores, listaArquitectos, listaContables);
	        	listaProyectos.add(proyectosNoResidenciales);
	        } else if(opcion == 3) {
	        	proyectosRehabilitacion = this.solicitarProyectoRehabilitacion(proyectosRehabilitacion, cliente, listaAparejadores, listaArquitectos, listaContables);
	        	listaProyectos.add(proyectosRehabilitacion);
	        } else if(opcion == 4) {
	        	salir = true;
	        }	        	        
	    }
		
		return listaProyectos;
	}

	@Override
	public Residenciales solicitarProyectoResidencial(Residenciales proyectosResidenciales, Cliente cliente,
			List<Aparejador> listaAparejadores,List<Arquitecto> listaArquitectos, 
			List<Contable> listaContables) {
		
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
		
	    while(!salir) {
			System.out.println("1. Proyecto residencial: edificios");
	        System.out.println("2. Proyecto residencial: unifamiliar");
	        System.out.println("3. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        String edificios = "Edificios";
	        String unifamiliar = "Unifamiliar";

	        if(opcion == 1) {
	        	proyectosResidenciales = this.accionesResidenciales.grabarProyectoResidencial(proyectosResidenciales, cliente, listaAparejadores, listaArquitectos, listaContables, edificios);
	        } else if(opcion == 2) {
	        	this.accionesResidenciales.grabarProyectoResidencial(proyectosResidenciales, cliente, listaAparejadores, listaArquitectos, listaContables, unifamiliar);
	        } else if(opcion == 3) {
	        	salir = true;
	        }	        	        
	    }
	    return proyectosResidenciales;
		
	}

	@Override
	public NoResidenciales solicitarProyectoNoResidencial(NoResidenciales proyectosNoResidenciales, Cliente cliente,List<Aparejador> listaAparejadores,
			List<Arquitecto> listaArquitectos, List<Contable> listaContables) {
		
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
		
	    while(!salir) {
			System.out.println("1. Proyecto no residencial: Naves industriales");
	        System.out.println("2. Proyecto no residencial: museos");
	        System.out.println("3. Proyecto no residencial: otra construcción no residencial");
	        System.out.println("4. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        String naves = "Naves industriales";
	        String museos = "Museos";
	        String otros = "Otra construcción no residencial";

	        if(opcion == 1) {
	        	proyectosNoResidenciales = this.accionesNoResidenciales.grabarProyectoNoResidencial(proyectosNoResidenciales, cliente, listaAparejadores, listaArquitectos, listaContables, naves);
	        } else if(opcion == 2) {
	        	proyectosNoResidenciales = this.accionesNoResidenciales.grabarProyectoNoResidencial(proyectosNoResidenciales, cliente, listaAparejadores, listaArquitectos, listaContables, museos);
	        } else if(opcion == 2) {
	        	proyectosNoResidenciales = this.accionesNoResidenciales.grabarProyectoNoResidencial(proyectosNoResidenciales, cliente, listaAparejadores, listaArquitectos, listaContables, otros);
	        } else if(opcion == 4) {
	        	salir = true;
	        }	        	        
	    }
	    return proyectosNoResidenciales;
		
		
	}
	
	@Override
	public void altaCliente(String nombre, String apellidos, String dni,List<Cliente> listaClientes) {
		Scanner sn = new Scanner(System.in);
        System.out.println("Escribe el dni");
		dni = sn.next();
		System.out.println("Escribe el nombre");
		nombre = sn.next();
		System.out.println("Escribe los apellidos");
		apellidos = sn.next();
		Cliente adm = new Cliente(nombre,apellidos,dni);		
		listaClientes.add(adm);
	}

	@Override
	public Rehabilitacion solicitarProyectoRehabilitacion(Rehabilitacion proyectosRehabilitacion,
			Cliente cliente, List<Aparejador> listaAparejadores,
			List<Arquitecto> listaArquitectos, List<Contable> listaContables) {
		
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
		
	    while(!salir) {
			System.out.println("1. Proyecto residencial: Rehabilitación");
	        System.out.println("2. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        String rehabilitacion = "Rehabilitación";

	        if(opcion == 1) {
	        	proyectosRehabilitacion = this.accionesRehabilitacion.grabarProyectoRehabilitacion(proyectosRehabilitacion, cliente, listaAparejadores, listaArquitectos, listaContables, rehabilitacion);
	        } else if(opcion == 2) {
	        	salir = true;
	        }	        	        
	    }
	    return proyectosRehabilitacion;
	}

	@Override
	public List<Certificados> solicitarCertificado(List<Aparejador> listaAparejadores, List<Arquitecto> listaArquitectos, 
			List<Contable> listaContables, Cliente cliente, Proyectos proyecto) {
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 

	    
	    List<Certificados> cer = new ArrayList<>();	    
 	    while(!salir) {
			System.out.println("1. Solicitar Certificado de habitabilidad");
	        System.out.println("2. Solicitar Certificado de eficiencia energética");
	        System.out.println("3. Solicitar Certificado de Inspección técnica");
	        System.out.println("4. Solicitar informe pericial");
	        System.out.println("5. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	    	    Habitabilidad hab = this.solicitarCertificadoHabitabilidad(listaAparejadores, listaArquitectos, listaContables, cliente);
	    	    cer.add(hab);
	        } else if(opcion == 2) {
	        	EficienciaEnergetica ee =  this.solicitarInformeEficienciaEnergetica(listaAparejadores, listaArquitectos, listaContables, cliente);
	        	cer.add(ee);
	        } else if(opcion == 3) {
	        	InspeccionTecnica it =  this.solicitarInspeccionTecnica(listaAparejadores, listaArquitectos, listaContables, cliente);
	        	cer.add(it);
	        }  else if(opcion == 4) {
	        	InformesPericiales ip = this.solicitarInformePericial(listaAparejadores, listaArquitectos, listaContables, cliente);
	        	cer.add(ip);
	        } else if(opcion == 5) {
	        	salir = true;
	        }	 
	 	    proyecto.setCertificados(cer);
	    }
		return cer;	
	}

	@Override
	public InformesPericiales solicitarInformePericial(List<Aparejador> listaAparejadores, List<Arquitecto> listaArquitectos, List<Contable> listaContables, Cliente cliente) {
		
		Acciones acciones = new Acciones();		
		Scanner sn = new Scanner(System.in);
		Aparejador aparejador;
		LocalDate fechaEmisionCertificado;
		LocalDate fechaSolicitud;
		LocalDate fechaEntrega;
		Arquitecto arquitecto;
		Contable contable;
		Integer costeCertificado;
		InformesPericiales certInformesPericiales;

		fechaSolicitud = LocalDate.of(1, 1, 1);
		System.out.println("La fecha de solicitud es del: " + fechaSolicitud);

		fechaEntrega = LocalDate.of(1, 1, 2);
		System.out.println("La fecha de entrega es del: " + fechaEntrega);

        System.out.println("¿Arquitecto?: ");   
        Arquitecto arquitectoprueba = new Arquitecto("1","1","1");
        listaArquitectos.add(arquitectoprueba);
        if(!listaArquitectos.isEmpty()) {
    	arquitecto = acciones.obtenerArquitecto(listaArquitectos);
		System.out.println("El arquitecto es: "+ arquitecto.getDni()+ " | " + arquitecto.getNombre() + " | " + arquitecto.getApellidos());
        } else {
        	arquitecto = null;
        	System.out.println("La lista de arquitectos está vacía, debe asignarse un arquitecto al proyecto");
        	System.out.println("");
        }
    	
        System.out.println("¿Contable?: ");     
        Contable contableprueba = new Contable("1","1","1");
        listaContables.add(contableprueba);
        if(!listaContables.isEmpty()) {
        	accionesContable = new AccionesContable();
        	contable  = acciones.obtenerContable(listaContables);
	    	costeCertificado = accionesContable.establecerCostesCertificado(contable);
			System.out.println("El contable es: "+ contable.getDni()+ " | " + contable.getNombre() + " | " + contable.getApellidos());
        } else {
    		costeCertificado = null;
        	contable = null;
        	System.out.println("La lista de contables está vacía, debe asignarse un contable al proyecto");
        	System.out.println("");
        }
        System.out.println("¿Aparejador?: ");
        Aparejador aparejadorprueba = new Aparejador("1","1","1");
        listaAparejadores.add(aparejadorprueba);
        if(!listaAparejadores.isEmpty()) {
	    	aparejador  = acciones.obtenerAparejador(listaAparejadores);
			System.out.println("El aparejador es: "+ aparejador.getDni()+ " | " + aparejador.getNombre() + " | " + aparejador.getApellidos());
        } else {
        	aparejador = null;
        	System.out.println("La lista de aparejadores está vacía, debe asignarse un aparejador al proyecto");
        	System.out.println("");
        }

		fechaEmisionCertificado = LocalDate.of(1, 1, 4);
		System.out.println("La fecha de emisión del certificado es del: " + fechaEmisionCertificado);

		certInformesPericiales = new InformesPericiales(fechaSolicitud, fechaEntrega, cliente, arquitecto, contable, arquitecto, fechaEmisionCertificado, costeCertificado);

		return certInformesPericiales;
	}

	@Override
	public Habitabilidad solicitarCertificadoHabitabilidad(List<Aparejador> listaAparejadores, List<Arquitecto> listaArquitectos, List<Contable> listaContables, Cliente cliente) {	
		Acciones acciones = new Acciones();
	
		Scanner sn = new Scanner(System.in);
		Aparejador aparejador;
		LocalDate fechaVisita;
		LocalDate fechaEmisionCertificado;
		LocalDate fechaSolicitud;
		LocalDate fechaEntrega;
		Arquitecto arquitecto;
		Contable contable;
		Integer costeCertificado;
		

		fechaSolicitud = LocalDate.of(1, 1, 1);
		System.out.println("La fecha de solicitud es del: " + fechaSolicitud);

		fechaEntrega = LocalDate.of(1, 1, 2);
		System.out.println("La fecha de entrega es del: " + fechaEntrega);

        System.out.println("¿Arquitecto?: ");   
        Arquitecto arquitectoprueba = new Arquitecto("1","1","1");
        listaArquitectos.add(arquitectoprueba);
        if(!listaArquitectos.isEmpty()) {
    	arquitecto = acciones.obtenerArquitecto(listaArquitectos);
		System.out.println("El arquitecto es: "+ arquitecto.getDni()+ " | " + arquitecto.getNombre() + " | " + arquitecto.getApellidos());
        } else {
        	arquitecto = null;
        	System.out.println("La lista de arquitectos está vacía, debe asignarse un arquitecto al proyecto");
        	System.out.println("");
        }
    	
        System.out.println("¿Contable?: ");     
        Contable contableprueba = new Contable("1","1","1");
        listaContables.add(contableprueba);
        if(!listaContables.isEmpty()) {
        	accionesContable = new AccionesContable();
        	contable  = acciones.obtenerContable(listaContables);
	    	costeCertificado = accionesContable.establecerCostesCertificado(contable);
			System.out.println("El contable es: "+ contable.getDni()+ " | " + contable.getNombre() + " | " + contable.getApellidos());
        } else {
    		costeCertificado = null;
        	contable = null;
        	System.out.println("La lista de contables está vacía, debe asignarse un contable al proyecto");
        	System.out.println("");
        }
        System.out.println("¿Aparejador?: ");
        Aparejador aparejadorprueba = new Aparejador("1","1","1");
        listaAparejadores.add(aparejadorprueba);
        if(!listaAparejadores.isEmpty()) {
	    	aparejador  = acciones.obtenerAparejador(listaAparejadores);
			System.out.println("El aparejador es: "+ aparejador.getDni()+ " | " + aparejador.getNombre() + " | " + aparejador.getApellidos());
        } else {
        	aparejador = null;
        	System.out.println("La lista de aparejadores está vacía, debe asignarse un aparejador al proyecto");
        	System.out.println("");
        }
        
		fechaVisita = LocalDate.of(1, 1, 3);
		System.out.println("La fecha de visita es del: " + fechaVisita);

		fechaEmisionCertificado = LocalDate.of(1, 1, 4);
		System.out.println("La fecha de emisión del certificado es del: " + fechaEmisionCertificado);

		Habitabilidad certHabitabilidad = new Habitabilidad(fechaSolicitud, fechaEntrega, cliente, arquitecto, 
				contable, aparejador, fechaVisita, fechaEmisionCertificado, costeCertificado);

		return certHabitabilidad;
	}

	@Override
	public InspeccionTecnica solicitarInspeccionTecnica(List<Aparejador> listaAparejadores, List<Arquitecto> listaArquitectos,
			List<Contable> listaContables, Cliente cliente) {
		Acciones acciones = new Acciones();		
		Scanner sn = new Scanner(System.in);
		LocalDate fechaSolicitud; 
		LocalDate fechaEntrega; 
		LocalDate fechaEmision; 
		Arquitecto arquitecto;
		Contable contable;
		Aparejador aparejador;
		Integer costeCertificado;
		String categoria;
		
		fechaSolicitud = LocalDate.of(1, 1, 1);
		System.out.println("La fecha de solicitud es del: " + fechaSolicitud);

		fechaEntrega = LocalDate.of(1, 1, 2);
		System.out.println("La fecha de entrega es del: " + fechaEntrega);
		
        System.out.println("¿Arquitecto?: ");   
        Arquitecto arquitectoprueba = new Arquitecto("1","1","1");
        listaArquitectos.add(arquitectoprueba);
        if(!listaArquitectos.isEmpty()) {
    	arquitecto = acciones.obtenerArquitecto(listaArquitectos);
		System.out.println("El arquitecto es: "+ arquitecto.getDni()+ " | " + arquitecto.getNombre() + " | " + arquitecto.getApellidos());
        } else {
        	arquitecto = null;
        	System.out.println("La lista de arquitectos está vacía, debe asignarse un arquitecto al proyecto");
        	System.out.println("");
        }
        
        System.out.println("¿Contable?: ");     
        Contable contableprueba = new Contable("1","1","1");
        listaContables.add(contableprueba);
        if(!listaContables.isEmpty()) {
        	accionesContable = new AccionesContable();
        	contable  = acciones.obtenerContable(listaContables);
	    	costeCertificado = accionesContable.establecerCostesCertificado(contable);
			System.out.println("El contable es: "+ contable.getDni()+ " | " + contable.getNombre() + " | " + contable.getApellidos());
        } else {
    		costeCertificado = null;
        	contable = null;
        	System.out.println("La lista de contables está vacía, debe asignarse un contable al proyecto");
        	System.out.println("");
        }
        
		System.out.println("¿Cuál es la categoría?");
		categoria = sn.next();
		
		fechaEmision = LocalDate.of(1, 1, 2);
		System.out.println("La fecha de emisión es del: " + fechaEntrega);
        
        System.out.println("¿Aparejador?: ");
        Aparejador aparejadorprueba = new Aparejador("1","1","1");
        listaAparejadores.add(aparejadorprueba);
        if(!listaAparejadores.isEmpty()) {
	    	aparejador  = acciones.obtenerAparejador(listaAparejadores);
			System.out.println("El aparejador es: "+ aparejador.getDni()+ " | " + aparejador.getNombre() + " | " + aparejador.getApellidos());
        } else {
        	aparejador = null;
        	System.out.println("La lista de aparejadores está vacía, debe asignarse un aparejador al proyecto");
        	System.out.println("");
        }
        
        InspeccionTecnica certInspeccionTecnica = new InspeccionTecnica(fechaSolicitud, fechaEntrega, cliente, arquitecto, contable, categoria, fechaEmision, aparejador, costeCertificado);
		return certInspeccionTecnica;	
	}

	@Override
	public EficienciaEnergetica solicitarInformeEficienciaEnergetica(List<Aparejador> listaAparejadores, List<Arquitecto> listaArquitectos,
			List<Contable> listaContables, Cliente cliente) {
		
		Acciones acciones = new Acciones();		
		Scanner sn = new Scanner(System.in);
		LocalDate fechaSolicitud; 
		LocalDate fechaEntrega; 
		Arquitecto arquitecto;
		Contable contable;
		Integer costeCertificado;
		
		fechaSolicitud = LocalDate.of(1, 1, 1);
		System.out.println("La fecha de solicitud es del: " + fechaSolicitud);

		fechaEntrega = LocalDate.of(1, 1, 2);
		System.out.println("La fecha de entrega es del: " + fechaEntrega);
		
        System.out.println("¿Arquitecto?: ");   
        Arquitecto arquitectoprueba = new Arquitecto("1","1","1");
        listaArquitectos.add(arquitectoprueba);
        if(!listaArquitectos.isEmpty()) {
    	arquitecto = acciones.obtenerArquitecto(listaArquitectos);
		System.out.println("El arquitecto es: "+ arquitecto.getDni()+ " | " + arquitecto.getNombre() + " | " + arquitecto.getApellidos());
        } else {
        	arquitecto = null;
        	System.out.println("La lista de arquitectos está vacía, debe asignarse un arquitecto al proyecto");
        	System.out.println("");
        }
        
        System.out.println("¿Contable?: ");     
        Contable contableprueba = new Contable("1","1","1");
        listaContables.add(contableprueba);
        if(!listaContables.isEmpty()) {
        	accionesContable = new AccionesContable();
        	contable  = acciones.obtenerContable(listaContables);
	    	costeCertificado = accionesContable.establecerCostesCertificado(contable);
			System.out.println("El contable es: "+ contable.getDni()+ " | " + contable.getNombre() + " | " + contable.getApellidos());
        } else {
    		costeCertificado = null;
        	contable = null;
        	System.out.println("La lista de contables está vacía, debe asignarse un contable al proyecto");
        	System.out.println("");
        }
                
		EficienciaEnergetica certEficienciaEnergetica = new EficienciaEnergetica(fechaSolicitud, fechaEntrega, cliente, arquitecto, contable, costeCertificado);
		return certEficienciaEnergetica;		
	}

	@Override
	public Proyectos seleccioneProyecto(List<Proyectos> listaProyectos) {
		
		Proyectos proyectos = null;
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
	    String nombreProyecto; 
	    if(listaProyectos == null) {
		    listaProyectos = new ArrayList<>();
	    }
	    	System.out.println("Seleccione una opción sobre la que quieras realizar una opción");
	    	
			System.out.println("1. Seleccione el proyecto en el que quieras solicitar un certificado");
	        System.out.println("2. Salir");
	        
	        System.out.println("Escribe una de las opciones");
	        
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	if(!listaProyectos.isEmpty()) {
			        for(Proyectos proyecto : listaProyectos) {
				        System.out.println(proyecto.getNombre());	
			        }
	        	
		        System.out.println("2. Seleccione el nombre del proyecto que quieras asociar al certificado: ");
		        nombreProyecto = sn.next();
		        for(Proyectos proyecto : listaProyectos) {
		        	if(nombreProyecto.equalsIgnoreCase(proyecto.getNombre())) {
		        		proyectos = new Proyectos();
		        		proyectos = proyecto;
		        		break;
		        	}
		        }
	        }
	     }	        
		return proyectos;
	}

}
