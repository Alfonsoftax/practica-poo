package es.uned.poo.certificados;

import java.time.LocalDate;
import java.util.Date;

import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Certificados;
import es.uned.poo.personas.Cliente;

public class InformesPericiales extends Certificados{

	Arquitecto arquitecto;
	LocalDate fechaEmision;

	/**
	 * @param fechaSolicitud
	 * @param fechaEntrega
	 * @param cliente
	 * @param arquitecto
	 * @param contable
	 * @param arquitecto2
	 * @param fechaEmision
	 */
	public InformesPericiales(LocalDate fechaSolicitud, LocalDate fechaEntrega, Cliente cliente, Arquitecto arquitecto,
			Contable contable, Arquitecto arquitecto2, LocalDate fechaEmision,Integer costeCertificado) {
		super(fechaSolicitud, fechaEntrega, cliente, arquitecto, contable, costeCertificado );
		arquitecto = arquitecto2;
		this.fechaEmision = fechaEmision;
	}

	/**
	 * @return the arquitecto
	 */
	public Arquitecto getArquitecto() {
		return arquitecto;
	}

	/**
	 * @param arquitecto the arquitecto to set
	 */
	public void setArquitecto(Arquitecto arquitecto) {
		this.arquitecto = arquitecto;
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
	

}
