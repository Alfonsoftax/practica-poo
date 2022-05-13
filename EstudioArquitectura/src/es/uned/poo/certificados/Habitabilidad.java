package es.uned.poo.certificados;

import java.time.LocalDate;
import java.util.Date;

import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Certificados;
import es.uned.poo.personas.Cliente;

public class Habitabilidad extends Certificados{

	Aparejador aparejador;
	LocalDate fechaVisita;
	LocalDate fechaEmisionCertificado;

	/**
	 * @param fechaSolicitud
	 * @param fechaEntrega
	 * @param cliente
	 * @param arquitecto
	 * @param contable
	 * @param aparejador
	 * @param fechaVisita
	 * @param fechaEmisionCertificado
	 */
	public Habitabilidad(LocalDate fechaSolicitud, LocalDate fechaEntrega, Cliente cliente, Arquitecto arquitecto,
			Contable contable, Aparejador aparejador, LocalDate fechaVisita, LocalDate fechaEmisionCertificado, Integer costeCertificado) {
		super(fechaSolicitud, fechaEntrega, cliente, arquitecto, contable, costeCertificado);
		this.aparejador = aparejador;
		this.fechaVisita = fechaVisita;
		this.fechaEmisionCertificado = fechaEmisionCertificado;
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

	/**
	 * @return the fechaVisita
	 */
	public LocalDate getFechaVisita() {
		return fechaVisita;
	}

	/**
	 * @param fechaVisita the fechaVisita to set
	 */
	public void setFechaVisita(LocalDate fechaVisita) {
		this.fechaVisita = fechaVisita;
	}

	/**
	 * @return the fechaEmisionCertificado
	 */
	public LocalDate getFechaEmisionCertificado() {
		return fechaEmisionCertificado;
	}

	/**
	 * @param fechaEmisionCertificado the fechaEmisionCertificado to set
	 */
	public void setFechaEmisionCertificado(LocalDate fechaEmisionCertificado) {
		this.fechaEmisionCertificado = fechaEmisionCertificado;
	}

	
}
