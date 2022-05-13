package es.uned.poo.certificados;

import java.time.LocalDate;
import java.util.Date;

import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Certificados;
import es.uned.poo.personas.Cliente;

public class InspeccionTecnica extends Certificados{

	//45 años tras fin de obra el administrador la ofrece
		String categoria; //A-G
		LocalDate fechaEmision;
		Aparejador aparejador;
	
	/**
	 * @param fechaSolicitud
	 * @param fechaEntrega
	 * @param cliente
	 * @param arquitecto
	 * @param contable
	 * @param categoria
	 * @param fechaEmision
	 * @param aparejador
	 */
	public InspeccionTecnica(LocalDate fechaSolicitud, LocalDate fechaEntrega, Cliente cliente, Arquitecto arquitecto,
			Contable contable, String categoria, LocalDate fechaEmision, Aparejador aparejador, Integer costeCertificado) {
		super(fechaSolicitud, fechaEntrega, cliente, arquitecto, contable, costeCertificado);
		this.categoria = categoria;
		this.fechaEmision = fechaEmision;
		this.aparejador = aparejador;
	}



	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the fechaEmision
	 */
	public LocalDate getFechaEmision() {
		return fechaEmision;
	}
	/**
	 * @param fechaEmision the fechaEmision to set
	 */
	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	/**
	 * @return the aparejador
	 */
	public Aparejador getAparejador() {
		return aparejador;
	}
	/**
	 * @param aparejador the aparejador to set
	 */
	public void setAparejador(Aparejador aparejador) {
		this.aparejador = aparejador;
	}
	
	
}
