package es.uned.poo.general;

import java.time.LocalDate;
import java.util.List;

import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.personas.Cliente;

public class Proyectos {
	
	LocalDate fechaSolicitud;
	LocalDate fechaEntrega;
	Integer duracionPrevista;
	Integer presupuesto;
	LocalDate fechaInicioContratado;
	Integer duracion;
	Cliente cliente;
	Arquitecto arquitecto;
	String direccion;
	Contable contable;
	Integer costeProyecto;
	Aparejador aparejador;
	String tipo;
	List<Certificados> certificados;
	String nombre;


	public Proyectos(LocalDate fechaSolicitud, LocalDate fechaEntrega, Integer duracionPrevista, Integer presupuesto,
			LocalDate fechaInicioContratado, Integer duracion, Cliente cliente, Arquitecto arquitecto, String direccion,
			Contable contable, Integer costeProyecto, Aparejador aparejador, String tipo, List<Certificados> certificados, String nombre) {
		super();
		this.fechaSolicitud = fechaSolicitud;
		this.fechaEntrega = fechaEntrega;
		this.duracionPrevista = duracionPrevista;
		this.presupuesto = presupuesto;
		this.fechaInicioContratado = fechaInicioContratado;
		this.duracion = duracion;
		this.cliente = cliente;
		this.arquitecto = arquitecto;
		this.direccion = direccion;
		this.contable = contable;
		this.aparejador = aparejador;
		this.costeProyecto = costeProyecto;
		this.tipo = tipo;
		this.certificados = certificados;
		this.nombre = nombre;
	}	
	
	public Proyectos(LocalDate fechaSolicitud, LocalDate fechaEntrega, Integer duracionPrevista, Integer presupuesto,
			LocalDate fechaInicioContratado, Integer duracion, Cliente cliente, Arquitecto arquitecto, String direccion,
			Contable contable, Integer costeProyecto, Aparejador aparejador, String tipo, String nombre) {
		super();
		this.fechaSolicitud = fechaSolicitud;
		this.fechaEntrega = fechaEntrega;
		this.duracionPrevista = duracionPrevista;
		this.presupuesto = presupuesto;
		this.fechaInicioContratado = fechaInicioContratado;
		this.duracion = duracion;
		this.cliente = cliente;
		this.arquitecto = arquitecto;
		this.direccion = direccion;
		this.contable = contable;
		this.aparejador = aparejador;
		this.costeProyecto = costeProyecto;
		this.tipo = tipo;
		this.nombre = nombre;
	}
	
	public Proyectos() {
		super();
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
	 * @return the duracionPrevista
	 */
	public Integer getDuracionPrevista() {
		return duracionPrevista;
	}

	/**
	 * @param duracionPrevista the duracionPrevista to set
	 */
	public void setDuracionPrevista(Integer duracionPrevista) {
		this.duracionPrevista = duracionPrevista;
	}

	/**
	 * @return the presupuesto
	 */
	public Integer getPresupuesto() {
		return presupuesto;
	}

	/**
	 * @param presupuesto the presupuesto to set
	 */
	public void setPresupuesto(Integer presupuesto) {
		this.presupuesto = presupuesto;
	}

	/**
	 * @return the fechaInicioContratado
	 */
	public LocalDate getFechaInicioContratado() {
		return fechaInicioContratado;
	}

	/**
	 * @param fechaInicioContratado the fechaInicioContratado to set
	 */
	public void setFechaInicioContratado(LocalDate fechaInicioContratado) {
		this.fechaInicioContratado = fechaInicioContratado;
	}

	/**
	 * @return the duracion
	 */
	public Integer getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * @return the costeProyecto
	 */
	public Integer getCosteProyecto() {
		return costeProyecto;
	}

	/**
	 * @param costeProyecto the costeProyecto to set
	 */
	public void setCosteProyecto(Integer costeProyecto) {
		this.costeProyecto = costeProyecto;
	}

	/**
	 * @return the certificados
	 */
	public  List<Certificados> getCertificados() {
		return certificados;
	}

	/**
	 * @param certificados the certificados to set
	 */
	public void setCertificados(List<Certificados> certificados) {
		this.certificados = certificados;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Proyectos [fechaSolicitud=" + fechaSolicitud + ", fechaEntrega=" + fechaEntrega + ", duracionPrevista="
				+ duracionPrevista + ", presupuesto=" + presupuesto + ", fechaInicioContratado=" + fechaInicioContratado
				+ ", duracion=" + duracion + ", cliente=" + cliente.getNombre() + ", arquitecto=" + arquitecto.getNombre() + ", direccion="
				+ direccion + ", contable=" + contable.getNombre() + ", costeProyecto=" + costeProyecto + ", aparejador="
				+ aparejador.getNombre() + ", tipo=" + tipo + ", certificados=" + certificados.get(0) + ", nombre=" + nombre + "]";
	}

	
}
