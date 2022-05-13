package es.uned.poo.proyectos;

import java.time.LocalDate;

import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Proyectos;
import es.uned.poo.personas.Cliente;

public class NoResidenciales extends Proyectos{


	Integer superficieTerreno;
	Integer superficieEdificio;
	String finalidad;

	/**
	 * @param fechaSolicitud
	 * @param fechaEntrega
	 * @param duracionPrevista
	 * @param presupuesto
	 * @param fechaInicioContratado
	 * @param duracion
	 * @param cliente
	 * @param arquitecto
	 * @param direccion
	 * @param contable
	 * @param aparejador
	 * @param superficieTerreno
	 * @param superficieEdificio
	 * @param finalidad
	 */
	
	public NoResidenciales(LocalDate fechaSolicitud, LocalDate fechaEntrega, Integer duracionPrevista,
			Integer presupuesto, LocalDate fechaInicioContratado, Integer duracion, Cliente cliente,
			Arquitecto arquitecto, String direccion, Contable contable, Integer costeProyecto, Aparejador aparejador,
			Integer superficieTerreno, Integer superficieEdificio, String finalidad,
			String tipo, String nombre) {
		super(fechaSolicitud, fechaEntrega, duracionPrevista, presupuesto, fechaInicioContratado, duracion, cliente, arquitecto,
				direccion, contable, costeProyecto, aparejador, tipo, nombre);
		this.superficieTerreno = superficieTerreno;
		this.superficieEdificio = superficieEdificio;
		this.finalidad = finalidad;
	}

	/**
	 * @return the superficieTerreno
	 */
	public Integer getSuperficieTerreno() {
		return superficieTerreno;
	}

	/**
	 * @param superficieTerreno the superficieTerreno to set
	 */
	public void setSuperficieTerreno(Integer superficieTerreno) {
		this.superficieTerreno = superficieTerreno;
	}

	/**
	 * @return the superficieEdificio
	 */
	public Integer getSuperficieEdificio() {
		return superficieEdificio;
	}

	/**
	 * @param superficieEdificio the superficieEdificio to set
	 */
	public void setSuperficieEdificio(Integer superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}

	/**
	 * @return the finalidad
	 */
	public String getFinalidad() {
		return finalidad;
	}

	/**
	 * @param finalidad the finalidad to set
	 */
	public void setFinalidad(String finalidad) {
		this.finalidad = finalidad;
	}
	
}
