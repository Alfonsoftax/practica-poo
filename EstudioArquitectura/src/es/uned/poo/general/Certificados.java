package es.uned.poo.general;

import java.time.LocalDate;
import java.util.Date;

import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.personas.Cliente;

public class Certificados {
	
	LocalDate fechaSolicitud;
	LocalDate fechaEntrega;
	Cliente cliente;
	Arquitecto arquitecto;
	Contable contable;
	Integer costeCertificado;
	

	//Histórico de vivienda Pensar cómo hacer
	/**
	 * @param fechaSolicitud
	 * @param fechaEntrega
	 * @param cliente
	 * @param arquitecto
	 * @param contable
	 */
	public Certificados(LocalDate fechaSolicitud, LocalDate fechaEntrega, Cliente cliente, Arquitecto arquitecto,
			Contable contable, Integer costeCertificado) {
		super();
		this.fechaSolicitud = fechaSolicitud;
		this.fechaEntrega = fechaEntrega;
		this.cliente = cliente;
		this.arquitecto = arquitecto;
		this.contable = contable;
		this.costeCertificado = costeCertificado;
	}
	/**
	 * @return the fechaSolicitud
	 */
	public LocalDate getFechaSolicitud() {
		return fechaSolicitud;
	}
	/**
	 * @param fechaSolicitud the fechaSolicitud to set
	 */
	public void setFechaSolicitud(LocalDate fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	/**
	 * @return the fechaEntrega
	 */
	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	/**
	 * @param fechaEntrega the fechaEntrega to set
	 */
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	 * @return the contable
	 */
	public Contable getContable() {
		return contable;
	}
	/**
	 * @param contable the contable to set
	 */
	public void setContable(Contable contable) {
		this.contable = contable;
	}
	
	/**
	 * @return the costeCertificado
	 */
	public Integer getCosteCertificado() {
		return costeCertificado;
	}
	/**
	 * @param costeCertificado the costeCertificado to set
	 */
	public void setCosteCertificado(Integer costeCertificado) {
		this.costeCertificado = costeCertificado;
	}
	
	
}
