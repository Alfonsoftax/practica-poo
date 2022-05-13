package es.uned.poo.proyectos;

import java.time.LocalDate;

import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Proyectos;
import es.uned.poo.personas.Cliente;

public class Rehabilitacion extends Proyectos{

	Integer superficieAReformar;

	public Rehabilitacion(LocalDate fechaSolicitud, LocalDate fechaEntrega, Integer duracionPrevista,
			Integer presupuesto, LocalDate fechaInicioContratado, Integer duracion, Cliente cliente,
			Arquitecto arquitecto, String direccion, Contable contable, Integer costeProyecto, Aparejador aparejador,
			String tipo,Integer superficieAReformar, String nombre) {
		super(fechaSolicitud, fechaEntrega, duracionPrevista, presupuesto, fechaInicioContratado, duracion, cliente, arquitecto,
				direccion, contable, costeProyecto, aparejador, tipo, nombre);

		this.superficieAReformar = superficieAReformar;
	}

	/**
	 * @return the superficieAReformar
	 */
	public Integer getSuperficieAReformar() {
		return superficieAReformar;
	}

	/**
	 * @param superficieAReformar the superficieAReformar to set
	 */
	public void setSuperficieAReformar(Integer superficieAReformar) {
		this.superficieAReformar = superficieAReformar;
	}	
}
