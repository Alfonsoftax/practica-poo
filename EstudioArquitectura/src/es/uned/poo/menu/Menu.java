package es.uned.poo.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.uned.poo.acciones.Acciones;
import es.uned.poo.empleados.Administrador;
import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.general.Certificados;
import es.uned.poo.general.Proyectos;
import es.uned.poo.login.Login;
import es.uned.poo.personas.Cliente;

public class Menu {
	
	Acciones acciones = new Acciones();
	Login login = new Login();
	public void mostrarMenuPrincipal() {
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; //Guardaremos la opcion del usuario
		List<Administrador> listaAdministradores = new ArrayList<>();
		List<Cliente> listaClientes = new ArrayList<>();
		List<Arquitecto> listaArquitectos = new ArrayList<>();
		List<Aparejador> listaAparejadores = new ArrayList<>();
		List<Contable> listaContables = new ArrayList<>();
		List<Certificados> listaCertificados = new ArrayList<>();
		List<Proyectos> listaProyectos = new ArrayList<>();

		Cliente cliente = new Cliente("1", "1", "1");
		Cliente cliente2 = new Cliente("2", "2", "2");

		Arquitecto arquitecto = new Arquitecto("1", "1", "1");
		Aparejador aparejador = new Aparejador("1", "1", "1");
		Contable contable = new Contable("1", "1", "1");


		listaClientes.add(cliente);
		listaClientes.add(cliente2);
		listaArquitectos.add(arquitecto);
		listaAparejadores.add(aparejador);
		listaContables.add(contable);

	    
		
		while(!salir){
	         
	        System.out.println("1. Entrar como administrador");
	        System.out.println("2. Entrar como arquitecto");
	        System.out.println("3. Entrar como aparejador");
	        System.out.println("4. Entrar como contable");
	        System.out.println("5. Entrar como cliente");
	        System.out.println("6. Salir");
	        
	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	login.opcionesLoginAdministrador(listaAdministradores,listaArquitectos,listaAparejadores,listaContables, listaClientes);
	        } else if(opcion == 2) {
	        	login.opcionesLoginArquitecto(listaArquitectos);
	        } else if(opcion == 3) {
	        	login.opcionesLoginAparejador(listaAparejadores);
	        } else if(opcion == 4) {
	        	login.opcionesLoginContable(listaContables);
	        } else if(opcion == 5) {
	        	login.opcionesLoginCliente(listaClientes, listaArquitectos, listaAparejadores, listaContables, listaCertificados, listaProyectos);
	        }
	        
	        if(opcion == 6) {
	        	salir = true;
	        }
	         
	    }
	}
	

}
