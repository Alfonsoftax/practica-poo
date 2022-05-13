package es.uned.poo.acciones;

import java.util.List;
import java.util.Scanner;

import es.uned.poo.empleados.Administrador;
import es.uned.poo.empleados.Aparejador;
import es.uned.poo.empleados.Arquitecto;
import es.uned.poo.empleados.Contable;
import es.uned.poo.interfacesPersonas.AccionesAdministradorInterface;
import es.uned.poo.interfacesPersonas.AccionesGenerales;
import es.uned.poo.personas.Cliente;

public class AccionesAdministrador implements AccionesAdministradorInterface, AccionesGenerales{

	final String nombre="";
	final String dni="";
	final String apellidos="";

	@Override
	public void asignarEmpleado() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verClientePorArquitecto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verClientePorAparejador() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verViviendasFinObras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verViviendasUltimoHabitabilidad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verViviendasPorProyectosYCertificados() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verPlanificacionYEjecuciondeObras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verMenuAdministradores(List<Administrador> listaAdministradores) {
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
		
	    while(!salir) {
			System.out.println("1. Dar alta administrador");
	        System.out.println("2. Dar baja Administrador");
	        System.out.println("3. Modificar Administrador");
	        System.out.println("4. Ver Administradores");
	        System.out.println("5. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	this.altaAdministrador(dni, nombre, apellidos, listaAdministradores);
	        } else if(opcion == 2) {
	        	this.bajaAdministrador(dni ,listaAdministradores);
	        } else if(opcion == 3) {
	        	this.modificaAdministrador(dni, nombre, apellidos, listaAdministradores);
	        } else if(opcion == 4) {
	        	this.verAdministradorRegistrados(listaAdministradores);
	        }  else if(opcion == 5) {
	        	salir = true;
	        }	        	        
	    }
		
	}



	@Override
	public Arquitecto obtenerArquitecto(List<Arquitecto> listadoArquitectos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente obtenerCliente(List<Cliente> listadoClientes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contable obtenerContable(List<Contable> listadoContables) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aparejador obtenerAparejador(List<Aparejador> listadoAparejadores) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void verMenuArquitectos(List<Arquitecto> listaArquitectos) {

		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
		
	    while(!salir) {
			System.out.println("1. Dar alta arquitecto");
	        System.out.println("2. Dar baja arquitecto");
	        System.out.println("3. Modificar arquitecto");
	        System.out.println("4. Ver arquitectos");
	        System.out.println("5. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	this.altaArquitecto(nombre, apellidos, dni, listaArquitectos);
	        } else if(opcion == 2) {
	        	this.bajaArquitecto(dni ,listaArquitectos);
	        } else if(opcion == 3) {
	        	this.modificaArquitecto(dni, nombre, apellidos, listaArquitectos);
	        } else if(opcion == 4) {
	        	this.verArquitectosRegistrados(listaArquitectos);
	        }  else if(opcion == 5) {
	        	salir = true;
	        }	        	        
	    }
	}

	@Override
	public void altaAdministrador(String nombre, String apellidos, String dni, List<Administrador> listaAdministradores) {
		Scanner sn = new Scanner(System.in);
        System.out.println("Escribe el dni");
		dni = sn.next();
		System.out.println("Escribe el nombre");
		nombre = sn.next();
		System.out.println("Escribe los apellidos");
		apellidos = sn.next();
		Administrador adm = new Administrador(nombre,apellidos,dni);		
		listaAdministradores.add(adm);
		
	}
	
	@Override
	public void bajaAdministrador(String dni, List<Administrador> listaAdministradores) {
		Scanner sn = new Scanner(System.in);
		int contador = 0;
		if(!listaAdministradores.isEmpty()) {
	        System.out.println("Escribe el dni del usuario a eliminar");
			dni = sn.next();
			int numeroAdm = listaAdministradores.size();
			for(Administrador adm: listaAdministradores) {			
				if(adm.getDni().equalsIgnoreCase(dni)) {
					listaAdministradores.remove(contador);
					System.out.println("El Administrador con DNI " + dni + " se ha dado de baja.");
					System.out.println("");
					break;
				}
				contador++;
			}
			if(listaAdministradores.size() == numeroAdm) {
				System.out.println("No se ha eliminado ningún administrador con DNI: " + dni);
				System.out.println("");
			}
		} else {
			System.out.println("No existen administradores.");
			System.out.println("");
		}
	}
	

	@Override
	public void modificaAdministrador(String nombre, String apellidos, String dni, List<Administrador> listaAdministradores) {
		
		Scanner sn = new Scanner(System.in);
		int contador = 0;
		if(!listaAdministradores.isEmpty()) {
	        System.out.println("Escribe el dni del usuario a modificar");
	        System.out.println("");
			dni = sn.next();
			for(Administrador adm: listaAdministradores) {			
				if(adm.getDni().equalsIgnoreCase(dni)) {
					
					System.out.println("Escribe el dni");
					dni = sn.next();
					adm.setDni(dni);
					System.out.println("Escribe el nombre");
					nombre = sn.next();
					adm.setNombre(nombre);
					System.out.println("Escribe los apellidos");
					apellidos = sn.next();
					adm.setApellidos(apellidos);
					
					System.out.println("El Administrador con DNI " + dni + " se ha modificado por los nuevos valores: ");
					System.out.println("DNI nuevo: " + adm.getDni());
					System.out.println("Nombre nuevo: " + adm.getNombre());
					System.out.println("Apellidos nuevos: " + adm.getApellidos());
					System.out.println("");
					break;
				}
				contador++;
			}
		} else {
			System.out.println("No existen administradores.");
			System.out.println("");
		}
		
	}
	
	@Override
	public void verAdministradorRegistrados(List<Administrador> listaAdministradores) {
		int contador = 0;
		if(!listaAdministradores.isEmpty()) {
			for(Administrador adm: listaAdministradores) {
				contador++;
				System.out.println("El administrador nº "+ contador + " es: "+ adm.getDni()+ " | " + adm.getNombre() + " | " + adm.getApellidos() );
				System.out.println("");
			}
		} else {
			System.out.println("No existen administradores que visualizar");
			System.out.println("");
		}
		
	}
	
	@Override
	public void altaArquitecto(String nombre, String apellidos, String dni,List<Arquitecto> listaArquitectos) {
		Scanner sn = new Scanner(System.in);
        System.out.println("Escribe el dni");
		dni = sn.next();
		System.out.println("Escribe el nombre");
		nombre = sn.next();
		System.out.println("Escribe los apellidos");
		apellidos = sn.next();
		Arquitecto arq = new Arquitecto(nombre,apellidos,dni);		
		listaArquitectos.add(arq);
	}
	
	@Override
	public void verArquitectosRegistrados(List<Arquitecto> listaArquitectos) {
		int contador = 0;
		if(!listaArquitectos.isEmpty()) {
			for(Arquitecto arq: listaArquitectos) {
				contador++;
				System.out.println("El arquitecto nº "+ contador + " es: "+ arq.getDni()+ " | " + arq.getNombre() + " | " + arq.getApellidos());
				System.out.println("");
			}
		} else {
			System.out.println("No existen arquitectos que visualizar");
			System.out.println("");
		}
		
	}

	@Override
	public void bajaArquitecto(String dni, List<Arquitecto> listaArquitectos) {
		Scanner sn = new Scanner(System.in);
		int contador = 0;
		if(!listaArquitectos.isEmpty()) {
	        System.out.println("Escribe el dni del arquitecto a eliminar");
			dni = sn.next();
			int numeroArq = listaArquitectos.size();
			for(Arquitecto arq: listaArquitectos) {			
				if(arq.getDni().equalsIgnoreCase(dni)) {
					listaArquitectos.remove(contador);
					System.out.println("El Arquitecto con DNI " + dni + " se ha dado de baja.");
					System.out.println("");
					break;
				}
				contador++;
			}
			if(listaArquitectos.size() == numeroArq) {
				System.out.println("No se ha eliminado ningún arquitecto con DNI: " + dni);
				System.out.println("");
			}
		} else {
			System.out.println("No existen arquitectos.");
			System.out.println("");
		}
		
	}

	@Override
	public void modificaArquitecto(String nombre, String apellidos, String dni, List<Arquitecto> listaArquitectos) {

		Scanner sn = new Scanner(System.in);
		int contador = 0;
		if(!listaArquitectos.isEmpty()) {
	        System.out.println("Escribe el dni del arquitecto a modificar");
	        System.out.println("");
			dni = sn.next();
			for(Arquitecto arq: listaArquitectos) {			
				if(arq.getDni().equalsIgnoreCase(dni)) {
					
					System.out.println("Escribe el dni");
					dni = sn.next();
					arq.setDni(dni);
					System.out.println("Escribe el nombre");
					nombre = sn.next();
					arq.setNombre(nombre);
					System.out.println("Escribe los apellidos");
					apellidos = sn.next();
					arq.setApellidos(apellidos);
					
					System.out.println("El Arquitecto con DNI " + dni + " se ha modificado por los nuevos valores: ");
					System.out.println("DNI nuevo: " + arq.getDni());
					System.out.println("Nombre nuevo: " + arq.getNombre());
					System.out.println("Apellidos nuevos: " + arq.getApellidos());
					System.out.println("");
					break;
				}
				contador++;
			}
		} else {
			System.out.println("No existen arquitectos.");
			System.out.println("");
		}
		
	}
	



	@Override
	public void altaAparejador(String nombre, String apellidos, String dni, List<Aparejador> listaAparejador) {
		Scanner sn = new Scanner(System.in);
        System.out.println("Escribe el dni");
		dni = sn.next();
		System.out.println("Escribe el nombre");
		nombre = sn.next();
		System.out.println("Escribe los apellidos");
		apellidos = sn.next();
		Aparejador ap = new Aparejador(nombre,apellidos,dni);		
		listaAparejador.add(ap);		
	}



	@Override
	public void verAparejadoresRegistrados(List<Aparejador> listaAparejador) {
		int contador = 0;
		if(!listaAparejador.isEmpty()) {
			for(Aparejador ap: listaAparejador) {
				contador++;
				System.out.println("El aparejador nº "+ contador + " es: "+ ap.getDni()+ " | " + ap.getNombre() + " | " + ap.getApellidos());
				System.out.println("");
			}
		} else {
			System.out.println("No existen aparejadores que visualizar");
			System.out.println("");
		}		
	}



	@Override
	public void bajaAparejador(String dni, List<Aparejador> listaAparejador) {
		Scanner sn = new Scanner(System.in);
		int contador = 0;
		if(!listaAparejador.isEmpty()) {
	        System.out.println("Escribe el dni del aparejador a eliminar");
			dni = sn.next();
			int numeroAp = listaAparejador.size();
			for(Aparejador ap: listaAparejador) {			
				if(ap.getDni().equalsIgnoreCase(dni)) {
					listaAparejador.remove(contador);
					System.out.println("El Aparejador con DNI " + dni + " se ha dado de baja.");
					System.out.println("");
					break;
				}
				contador++;
			}
			if(listaAparejador.size() == numeroAp) {
				System.out.println("No se ha eliminado ningún aparejador con DNI: " + dni);
				System.out.println("");
			}
		} else {
			System.out.println("No existen aparejadores.");
			System.out.println("");
		}		
	}



	@Override
	public void modificaAparejador(String nombre, String apellidos, String dni, List<Aparejador> listaAparejador) {

		Scanner sn = new Scanner(System.in);
		int contador = 0;
		if(!listaAparejador.isEmpty()) {
	        System.out.println("Escribe el dni del aparejador a modificar");
	        System.out.println("");
			dni = sn.next();
			for(Aparejador ap: listaAparejador) {			
				if(ap.getDni().equalsIgnoreCase(dni)) {
					
					System.out.println("Escribe el dni");
					dni = sn.next();
					ap.setDni(dni);
					System.out.println("Escribe el nombre");
					nombre = sn.next();
					ap.setNombre(nombre);
					System.out.println("Escribe los apellidos");
					apellidos = sn.next();
					ap.setApellidos(apellidos);
					
					System.out.println("El Aparejador con DNI " + dni + " se ha modificado por los nuevos valores: ");
					System.out.println("DNI nuevo: " + ap.getDni());
					System.out.println("Nombre nuevo: " + ap.getNombre());
					System.out.println("Apellidos nuevos: " + ap.getApellidos());
					System.out.println("");
					break;
				}
				contador++;
			}
		} else {
			System.out.println("No existen aparejadores.");
			System.out.println("");
		}		
	}



	@Override
	public void altaContable(String nombre, String apellidos, String dni, List<Contable> listaContable) {
		Scanner sn = new Scanner(System.in);
        System.out.println("Escribe el dni");
		dni = sn.next();
		System.out.println("Escribe el nombre");
		nombre = sn.next();
		System.out.println("Escribe los apellidos");
		apellidos = sn.next();
		Contable cont = new Contable(nombre,apellidos,dni);		
		listaContable.add(cont);			
	}



	@Override
	public void verContablesRegistrados(List<Contable> listaContable) {

		int contador = 0;
		if(!listaContable.isEmpty()) {
			for(Contable cont: listaContable) {
				contador++;
				System.out.println("El contable nº "+ contador + " es: "+ cont.getDni()+ " | " + cont.getNombre() + " | " + cont.getApellidos());
				System.out.println("");
			}
		} else {
			System.out.println("No existen contables que visualizar");
			System.out.println("");
		}			
	}



	@Override
	public void bajaContable(String dni, List<Contable> listaContable) {
		Scanner sn = new Scanner(System.in);
		int contador = 0;
		if(!listaContable.isEmpty()) {
	        System.out.println("Escribe el dni del contable a eliminar");
			dni = sn.next();
			int numerocont = listaContable.size();
			for(Contable cont: listaContable) {			
				if(cont.getDni().equalsIgnoreCase(dni)) {
					listaContable.remove(contador);
					System.out.println("El contable con DNI " + dni + " se ha dado de baja.");
					System.out.println("");
					break;
				}
				contador++;
			}
			if(listaContable.size() == numerocont) {
				System.out.println("No se ha eliminado ningún contable con DNI: " + dni);
				System.out.println("");
			}
		} else {
			System.out.println("No existen contables.");
			System.out.println("");
		}			
	}



	@Override
	public void modificaContable(String nombre, String apellidos, String dni, List<Contable> listaContable) {
		Scanner sn = new Scanner(System.in);
		int contador = 0;
		if(!listaContable.isEmpty()) {
	        System.out.println("Escribe el dni del contable a modificar");
	        System.out.println("");
			dni = sn.next();
			for(Contable cont: listaContable) {			
				if(cont.getDni().equalsIgnoreCase(dni)) {
					
					System.out.println("Escribe el dni");
					dni = sn.next();
					cont.setDni(dni);
					System.out.println("Escribe el nombre");
					nombre = sn.next();
					cont.setNombre(nombre);
					System.out.println("Escribe los apellidos");
					apellidos = sn.next();
					cont.setApellidos(apellidos);
					
					System.out.println("El Contable con DNI " + dni + " se ha modificado por los nuevos valores: ");
					System.out.println("DNI nuevo: " + cont.getDni());
					System.out.println("Nombre nuevo: " + cont.getNombre());
					System.out.println("Apellidos nuevos: " + cont.getApellidos());
					System.out.println("");
					break;
				}
				contador++;
			}
		} else {
			System.out.println("No existen contables.");
			System.out.println("");
		}		
	}



	@Override
	public void verMenuAparejadores(List<Aparejador> listaAparejador) {

		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
		
	    while(!salir) {
			System.out.println("1. Dar alta Aparejador");
	        System.out.println("2. Dar baja aparejador");
	        System.out.println("3. Modificar aparejador");
	        System.out.println("4. Ver aparejadores");
	        System.out.println("5. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	this.altaAparejador(nombre, apellidos, dni, listaAparejador);
	        } else if(opcion == 2) {
	        	this.bajaAparejador(dni, listaAparejador);
	        } else if(opcion == 3) {
	        	this.modificaAparejador(nombre, apellidos, dni, listaAparejador);
	        } else if(opcion == 4) {
	        	this.verAparejadoresRegistrados(listaAparejador);
	        }  else if(opcion == 5) {
	        	salir = true;
	        }	        	        
	    }		
	}



	@Override
	public void verMenuContables(List<Contable> listaContable) {

		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
		
	    while(!salir) {
			System.out.println("1. Dar alta Contable");
	        System.out.println("2. Dar baja contable");
	        System.out.println("3. Modificar contable");
	        System.out.println("4. Ver contables");
	        System.out.println("5. Salir");

	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	        if(opcion == 1) {
	        	this.altaContable(nombre, apellidos, dni, listaContable);
	        } else if(opcion == 2) {
	        	this.bajaContable(dni, listaContable);
	        } else if(opcion == 3) {
	        	this.modificaContable(nombre, apellidos, dni, listaContable);
	        } else if(opcion == 4) {
	        	this.verContablesRegistrados(listaContable);
	        }  else if(opcion == 5) {
	        	salir = true;
	        }	        	        
	    }			
	}

	
	
	
}
