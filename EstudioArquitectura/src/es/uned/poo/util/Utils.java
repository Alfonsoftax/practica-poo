package es.uned.poo.util;

import java.time.LocalDate;
import java.util.Scanner;

import es.uned.poo.general.Certificados;
import es.uned.poo.general.Proyectos;

public class Utils {

	
	public static Proyectos actualizarNombreP(Proyectos proyectos) {
		System.out.println("Seleccione un nuevo nombre");
		String nuevoNombre;
		Scanner sn = new Scanner(System.in);
		
		nuevoNombre = sn.next();
		
		proyectos.setNombre(nuevoNombre);
		System.out.println("El nombre del proyecto ha cambiado por: " + proyectos.getNombre());

		return proyectos;
	}
	
	public static Proyectos actualizarDuracionP(Proyectos proyectos) {
		System.out.println("Seleccione una nueva duración");
		Integer nuevaDuracion;
		Scanner sn = new Scanner(System.in);
		
		nuevaDuracion = sn.nextInt();
		
		proyectos.setDuracion(nuevaDuracion);
		System.out.println("La duración del proyecto ha cambiado por: " + proyectos.getDuracion());

		return proyectos;
	}
	
	public static Certificados actualizarFechaSolicitud(Certificados certificados) {
		
		
		System.out.println("Seleccione una nueva fecha");
		LocalDate nuevaFecha;
		Scanner sn = new Scanner(System.in);
		
		nuevaFecha = LocalDate.of(22, 12, 23);
		
		certificados.setFechaSolicitud(nuevaFecha);;
		System.out.println("La fecha solicitud del proyecto ha cambiado por: " + certificados.getFechaEntrega());

		return certificados;
	}
	
	public static Certificados actualizarFechaEntrega(Certificados certificados) {
		
		System.out.println("Seleccione una nueva fecha de entrega");
		LocalDate nuevaFecha;
		Scanner sn = new Scanner(System.in);
		
		nuevaFecha = LocalDate.now();
		
		certificados.setFechaEntrega(nuevaFecha);
		System.out.println("La fecha entrega del proyecto ha cambiado por: " + certificados.getFechaEntrega());

		return certificados;
	}
}
