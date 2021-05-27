package pack01;
import java.util.*;
import java.time.*;

public class Vuelo2 {
	private Aeronave avion;
	private Piloto comandante;
	private Piloto primerOficial;
	private Pasajero[] pasajeros;
	
	public Vuelo2() {
		this.avion = avion;
		this.comandante = comandante;
		this.primerOficial = primerOficial;
		this.pasajeros = pasajeros;
	}
	
	public Aeronave seleccionAeronave() {
		String ciudadPartida;
		String ciudadDestino;
		int distancia;
		int pasajerosTotales;
		String res;
		
		Scanner entrada = new Scanner(System.in);
		
		boolean respuesta;
		
		Aeronave b737_01;
		
		do { // reparar el do while
			
			System.out.println("Inicializacion para un nuevo vuelo: ");
			System.out.println("Indique la ciudad de partida:");
			ciudadPartida = entrada.nextLine();
			System.out.println("Introduzca la ciudad destino:");
			ciudadDestino = entrada.nextLine();
			
			System.out.println("Introduzca la distacncia de vuelo:");
			distancia = entrada.nextInt();
			System.out.flush();
			System.out.println("Introduzca el numero total de pasajeros");
			pasajerosTotales = entrada.nextInt();
			System.out.flush();
			
			System.out.println("Ciudad de partida: " + ciudadPartida + ".");
			System.out.println("Ciudad de destino: " + ciudadDestino + ".");
			System.out.println("Distancia de vuelo en millas nauticas: " + distancia + ".");
			System.out.println("Numero de pasajeros para este vuelo: " + pasajerosTotales + ".");
			
			System.out.println("Son correctos estos datos? <S/N>");
			
			System.out.flush();
			
			res = entrada.next();
			System.out.flush();
			
			System.out.println(res + " res");
			
			if(res.equals("S") || res.equals("s") || res.equals("Si") || res.equals("Y") || res.equals("y") || res.equals("Yes") || res.equals("yes")) {
				respuesta = false;
				System.out.println(respuesta + " / false");
			}else {
				respuesta = true;
				System.out.println(respuesta + " / true");
			}
			
		}while(respuesta);
		
		if(distancia < 5241) {
			if(pasajerosTotales < 167) {
				System.out.println("La nave seleccionada para este vuelo es el Boein 737-400.");
				System.out.println("Cuenta con una autonomia de 5.242 km de autonomia y un total maximo de 166 pasajeros.");
				System.out.println("Carga maxima de 26020 litros de combustible.");
				System.out.println("Maximo peso para la operacion de 62.820kg.\n");
				b737_01 = new Aeronave();
			}else {
				System.out.println("No hay aeronaves disponibles para mas de 166 pasajeros.");
				b737_01 = null;
			}
		}else {
			System.out.println("No hay aeronaves disponibles para esta distancia.");
			b737_01 = null;
		}
		
		entrada.close();
		
		return b737_01;
	}
	
	public Piloto asignacionComandante() {
		
		String nombre;
		String apellido1;
		String apellido2;
		int numeroDni;
		String numeroLicencia;
		int dia, mes, anio;
		LocalDate fechaVencimiento;
		double pesoEquipaje;
		
		System.out.flush();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el nombre: ");
		nombre = entrada.nextLine();
		System.out.println("Introduzca el primer apellido: ");
		apellido1 = entrada.nextLine();
		System.out.println("Introduzca el segundo apellido: ");
		apellido2 = entrada.nextLine();
		System.out.println("Introduzca el DNI: ");
		numeroDni = entrada.nextInt();
		//entrada.nextLine();
		System.out.flush();
		System.out.println("Introduzca el numero de licencia:"); // reparar la entrada de numero de licencia
		numeroLicencia = entrada.nextLine();
		System.out.println("Introduzca el a�o, mes y dia del vencimiento de su licencia:");
		System.out.println("A�o:");
		anio = entrada.nextInt();
		System.out.println("Mes:");
		mes = entrada.nextInt();
		System.out.println("Dia:");
		dia = entrada.nextInt();
		
		System.out.println("Introduzca ahora el peso del equipaje:");
		pesoEquipaje = entrada.nextDouble();
		
		Documento d = new Documento(nombre, apellido1, apellido2, numeroDni);
		
		fechaVencimiento = LocalDate.of(anio, mes, dia);
		
		Licencia l = new Licencia(numeroLicencia, fechaVencimiento, d);
		
		Piloto comandante = new Piloto(75.0, d, l, pesoEquipaje);
		
		entrada.close();
		
		return comandante;
	}
	
public Piloto asignacionPrimerOficial() {
		
		String nombre;
		String apellido1;
		String apellido2;
		int numeroDni;
		String numeroLicencia;
		int dia, mes, anio;
		LocalDate fechaVencimiento;
		double pesoEquipaje;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el nombre: ");
		nombre = entrada.nextLine();
		System.out.println("Introduzca el primer apellido: ");
		apellido1 = entrada.nextLine();
		System.out.println("Introduzca el segundo apellido: ");
		apellido2 = entrada.nextLine();
		System.out.println("Introduzca el DNI: ");
		numeroDni = entrada.nextInt();
		
		System.out.println("Introduzca el numero de licencia:");
		numeroLicencia = entrada.nextLine();
		System.out.println("Introduzca el a�o, mes y dia del vencimiento de su licencia:");
		System.out.println("A�o:");
		anio = entrada.nextInt();
		System.out.println("Mes:");
		mes = entrada.nextInt();
		System.out.println("Dia:");
		dia = entrada.nextInt();
		
		System.out.println("Introduzca ahora el peso del equipaje:");
		pesoEquipaje = entrada.nextDouble();
		
		Documento d = new Documento(nombre, apellido1, apellido2, numeroDni);
		
		fechaVencimiento = LocalDate.of(anio, mes, dia);
		
		Licencia l = new Licencia(numeroLicencia, fechaVencimiento, d);
		
		Piloto primerOficial = new Piloto(75.0, d, l, pesoEquipaje);
		
		return primerOficial;
	}
	
	public Asiento obtencionAsientoLibreSeleccionado(int clase, boolean ventanilla, boolean pasillo) {
		
		Asiento a;
		
		if(clase != 1 || clase != 2) {
			System.out.println("Error al designar el tipo de clase.");
			a = null;
		}else {
			switch(clase) {
			
				case 1:
					
					if(ventanilla) {
						
						for(int i = 0; i < 17; i++) {
							if(avion.asientos[i].getVentanilla() == true && avion.asientos[i].getOcupado() == false) {
								a = avion.asientos[i];
								break;
							}
						}
						
						for(int i = 0; i < 17; i++) {
							if(avion.asientos[i].getOcupado() == false) {
								a = avion.asientos[i];
								break;
							}
						}
						
						System.out.println("No hay asientos disponibles en esta clase!");
						a = null;
						break;
						
					}else if(pasillo) {
						
						for(int i = 0; i < 17; i++) {
							if(avion.asientos[i].getPasillo() == true && avion.asientos[i].getOcupado() == false) {
								a = avion.asientos[i];
								break;
							}
						}
						
						for(int i = 0; i < 17; i++) {
							if(avion.asientos[i].getOcupado() == false) {
								a = avion.asientos[i];
								break;
							}
						}
						
						System.out.println("No hay asientos disponibles en esta clase!");
						a = null;
						break;
						
					}else {
						for(int i = 0; i < 17; i++) {
							if(avion.asientos[i].getVentanilla() == false && avion.asientos[i].getPasillo() == false && avion.asientos[i].getOcupado() == false) {
								a = avion.asientos[i];
							}
						}
						for(int i = 0; i < 17; i++) {
							if(avion.asientos[i].getOcupado() == false) {
								a = avion.asientos[i];
								break;
							}
						}
						System.out.println("No hay asientos disponibles en esta clase!");
						a = null;
						break;
					}
					
					
				case 2:
					
					if(ventanilla) {
						
						for(int i = 17; i < 166; i++) {
							if(avion.asientos[i].getVentanilla() == true && avion.asientos[i].getOcupado() == false) {
								a = avion.asientos[i];
								break;
							}
						}
						
						for(int i = 17; i < 166; i++) {
							if(avion.asientos[i].getOcupado() == false) {
								a = avion.asientos[i];
								break;
							}
						}
						
						System.out.println("No hay asientos disponibles en esta clase!");
						a = null;
						break;
						
					}else if(pasillo) {
						
						for(int i = 17; i < 166; i++) {
							if(avion.asientos[i].getPasillo() == true && avion.asientos[i].getOcupado() == false) {
								a = avion.asientos[i];
								break;
							}
						}
						
						for(int i = 17; i < 166; i++) {
							if(avion.asientos[i].getOcupado() == false) {
								a = avion.asientos[i];
								break;
							}
						}
						
						System.out.println("No hay asientos disponibles en esta clase!");
						a = null;
						break;
						
					}else {
						for(int i = 17; i < 166; i++) {
							if(avion.asientos[i].getVentanilla() == false && avion.asientos[i].getPasillo() == false && avion.asientos[i].getOcupado() == false) {
								a = avion.asientos[i];
								break;
							}
						}
						for(int i = 17; i < 166; i++) {
							if(avion.asientos[i].getOcupado() == false) {
								a = avion.asientos[i];
								break;
							}
						}
						System.out.println("No hay asientos disponibles en esta clase!");
						a = null;
						break;
					}
					
					default:
						for(int i = 0; i < 166; i++) {
							if(avion.asientos[i].getOcupado() == false) {
								a = avion.asientos[i];
								break;
							}
						}
						
						System.out.println("No hay asientos disponibles en el avion!");
						a = null;
						break;
		
			} // cierre switch.
			
		} // cierre else 
		
		return a;
		
	} // cierre metodo.
	
	
	public Asiento asignacionAsiento() {
		
		Scanner entrada = new Scanner(System.in);
		boolean ventanilla;
		boolean pasillo;
		int opc;
		int clase;
		
		System.out.println("Seleccione la clase:");
		do {
			System.out.println("Marque 1 para primera clase, 2 para clase turista:");
			clase = entrada.nextInt();
		}while(clase != 1 || clase != 2);
		
		System.out.println("Seleccion de Asiento:");
		System.out.println("Desea ventanilla o pasillo?:");
		do {
			System.out.println("Marque 1 para ventanilla, 2 para pasillo, 0 si no le importa:");
			opc = entrada.nextInt();
		}while(opc != 0 || opc != 1 || opc != 2);
		
		switch(opc) {
		
			case 0:
				ventanilla = false;
				pasillo = false;
				break;
				
			case 1:
				ventanilla = true;
				pasillo = false;
				break;
				
			case 2:
				ventanilla = false;
				pasillo = true;
				break;
				
			default:
				ventanilla = false;
				pasillo = false;
				break;
		}
		
		return obtencionAsientoLibreSeleccionado(clase, ventanilla, pasillo);
		
	}
	
	public Pasajero introduciendoPasajero() {
		
		String nombre;
		String apellido1;
		String apellido2;
		int numeroDni;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el nombre: ");
		nombre = entrada.nextLine();
		System.out.println("Introduzca el primer apellido: ");
		apellido1 = entrada.nextLine();
		System.out.println("Introduzca el segundo apellido: ");
		apellido2 = entrada.nextLine();
		System.out.println("Introduzca el DNI: ");
		numeroDni = entrada.nextInt();
		
		Documento d = new Documento(nombre, apellido1, apellido2, numeroDni);
		
		Asiento a = asignacionAsiento();
		
		Pasaje p = new Pasaje(a);
		
		Pasajero pasajero = new Pasajero(75.0, d, p, 24.0);
		
		return pasajero;
	}
	
	public void PasajeChek() {
		
	}

}
