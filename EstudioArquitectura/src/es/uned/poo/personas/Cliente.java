package es.uned.poo.personas;

import java.util.List;

import es.uned.poo.general.Certificados;
import es.uned.poo.general.Personas;
import es.uned.poo.general.Proyectos;

public class Cliente extends Personas{

	List<Certificados> listaCertificados;

	List<Proyectos> listaProyectos;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	public Cliente(String nombre, String apellidos, String dni, List<Certificados> listaCertificados, List<Proyectos> listaProyectos) {
		super(nombre, apellidos, dni);
		this.listaCertificados = listaCertificados;
		this.listaProyectos = listaProyectos;
	}
	
	public Cliente(String nombre, String apellidos, String dni) {
		super(nombre, apellidos, dni);
	}

	/**
	 * @return the listaCertificados
	 */
	public List<Certificados> getListaCertificados() {
		return listaCertificados;
	}
	/**
	 * @param listaCertificados the listaCertificados to set
	 */
	public void setListaCertificados(List<Certificados> listaCertificados) {
		this.listaCertificados = listaCertificados;
	}
	/**
	 * @return the listaProyectos
	 */
	public List<Proyectos> getListaProyectos() {
		return listaProyectos;
	}
	/**
	 * @param listaProyectos the listaProyectos to set
	 */
	public void setListaProyectos(List<Proyectos> listaProyectos) {
		this.listaProyectos = listaProyectos;
	}

}
