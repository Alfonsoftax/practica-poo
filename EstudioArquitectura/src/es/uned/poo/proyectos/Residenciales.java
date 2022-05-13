package es.uned.poo.proyectos;

import java.time.LocalDate;

import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Proyectos;
import es.uned.poo.personas.Cliente;

public class Residenciales extends Proyectos{


	Integer superficie;
	Integer superficieTerreno;
	Integer plantas;
	Integer numeroHabitaciones;
	Integer numeroBa�os;

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
	 * @param superficie
	 * @param superficieTerreno
	 * @param plantas
	 * @param numeroHabitaciones
	 * @param numeroBa�os
	 */
	public Residenciales(LocalDate fechaSolicitud, LocalDate fechaEntrega, Integer duracionPrevista, Integer presupuesto,
			LocalDate fechaInicioContratado, Integer duracion, Cliente cliente, Arquitecto arquitecto, String direccion,
			Contable contable, Aparejador aparejador, Integer superficie, Integer superficieTerreno, Integer plantas,
			Integer numeroHabitaciones, Integer numeroBa�os, String tipo, Integer costeProyecto, String nombre) {
		super(fechaSolicitud, fechaEntrega, duracionPrevista, presupuesto, fechaInicioContratado, duracion, cliente,
				arquitecto, direccion, contable, costeProyecto, aparejador, tipo, nombre);
		this.superficie = superficie;
		this.superficieTerreno = superficieTerreno;
		this.plantas = plantas;
		this.numeroHabitaciones = numeroHabitaciones;
		this.numeroBa�os = numeroBa�os;
	}

	/**
	 * @return the superficie
	 */
	public Integer getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(Integer superficie) {
		this.superficie = superficie;
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
	 * @return the plantas
	 */
	public Integer getPlantas() {
		return plantas;
	}

	/**
	 * @param plantas the plantas to set
	 */
	public void setPlantas(Integer plantas) {
		this.plantas = plantas;
	}

	/**
	 * @return the numeroHabitaciones
	 */
	public Integer getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	/**
	 * @param numeroHabitaciones the numeroHabitaciones to set
	 */
	public void setNumeroHabitaciones(Integer numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	/**
	 * @return the numeroBa�os
	 */
	public Integer getNumeroBa�os() {
		return numeroBa�os;
	}

	/**
	 * @param numeroBa�os the numeroBa�os to set
	 */
	public void setNumeroBa�os(Integer numeroBa�os) {
		this.numeroBa�os = numeroBa�os;
	}

	
	


}
