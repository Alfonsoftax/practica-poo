package es.uned.poo.certificados;

import java.time.LocalDate;
import java.util.Date;

import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Certificados;
import es.uned.poo.personas.Cliente;

public class EficienciaEnergetica extends Certificados{

	public EficienciaEnergetica(LocalDate fechaSolicitud, LocalDate fechaEntrega, Cliente cliente, Arquitecto arquitecto,
			Contable contable, Integer costeCertificado) {
		super(fechaSolicitud, fechaEntrega, cliente, arquitecto, contable, costeCertificado);
		// TODO Auto-generated constructor stub
	}

}
