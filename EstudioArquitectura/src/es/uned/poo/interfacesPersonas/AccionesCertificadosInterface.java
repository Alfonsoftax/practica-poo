package es.uned.poo.interfacesPersonas;

import java.util.List;

import es.uned.poo.certificados.EficienciaEnergetica;
import es.uned.poo.certificados.Habitabilidad;
import es.uned.poo.certificados.InformesPericiales;
import es.uned.poo.certificados.InspeccionTecnica;
import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.personas.Cliente;

public interface AccionesCertificadosInterface {

	public InformesPericiales solicitarInformePericial(List<Aparejador> listaAparejadores, List<Arquitecto> listaArquitectos,
			List<Contable> listaContables, Cliente cliente);
	public Habitabilidad solicitarCertificadoHabitabilidad(List<Aparejador> listaAparejadores, List<Arquitecto> listaArquitectos,
			List<Contable> listaContables, Cliente cliente);
	public InspeccionTecnica solicitarInspeccionTecnica(List<Aparejador> listaAparejadores, List<Arquitecto> listaArquitectos,
			List<Contable> listaContables, Cliente cliente);
	public EficienciaEnergetica solicitarInformeEficienciaEnergetica(List<Aparejador> listaAparejadores, List<Arquitecto> listaArquitectos,
			List<Contable> listaContables, Cliente cliente);


}
