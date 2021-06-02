package pack01;

import javax.print.Doc;
import java.time.*;
import java.util.ArrayList;

public class Menu {

    public static Documento entradaDocumento(){
        String nombre;
        String apellido01;
        String apellido02;
        int dni;
        boolean respuesta = true;

        System.out.println("Menu de introduccion de un documento: ");
        System.out.println("Introduzca el nombre: ");
        nombre = EntradasConsola.entradaString();
        System.out.println("Introduzca el primer apellido: ");
        apellido01 = EntradasConsola.entradaString();
        System.out.println("Introduzca el segundo apellido: ");
        apellido02 = EntradasConsola.entradaString();
        System.out.println("Introduzca el numero del DNI (solo el numero, sin la letra): ");
        dni = EntradasConsola.entradaoEnteroPositivo();

        Documento documento = new Documento(nombre, apellido01, apellido02, dni);

        do{
            System.out.println("Nombre : " + documento.getNombre());
            System.out.println("Primer apellido: " + documento.getApellido1());
            System.out.println("Segundo apellido: " + documento.getApellido2());
            System.out.println("DNI: " + documento.getDni() + documento.getLetra());

            System.out.println("Son estos dato correctos?");
            respuesta = EntradasConsola.entradaBoolean();

            if(!respuesta){
                int opt;
                System.out.println("Que dato desea corregir?: ");
                System.out.println("1. Nombre : " + documento.getNombre());
                System.out.println("2. Primer apellido: " + documento.getApellido1());
                System.out.println("3. Segundo apellido: " + documento.getApellido2());
                System.out.println("4. DNI: " + documento.getDni() + documento.getLetra());
                System.out.println("Introduzca el numero de su opcion: ");

                switch (EntradasConsola.entradaOpcion(4)){
                    case 1:
                        System.out.println("Introduzca el nombre: ");
                        documento.setNombre(EntradasConsola.entradaString());
                        break;
                    case 2:
                        System.out.println("Introduzca el primer apellido: ");
                        documento.setApellido1(EntradasConsola.entradaString());
                        break;
                    case 3:
                        System.out.println("Introduzca el segundo apellido: ");
                        documento.setApellido2(EntradasConsola.entradaString());
                        break;
                    case 4:
                        System.out.println("Introduzca el DNI:");
                        documento.setDni(EntradasConsola.entradaoEnteroPositivo());
                        break;
                    default:
                        System.out.println("Opcion incorrecta!");
                        respuesta = false;
                        break;
                }
            }

        }while(!respuesta);

        return documento;
    }

    public static Pasaje entradaPasaje(Aeronave aeronave){
        Asiento asiento = null;

        for(int i = 0; i < 166; i++){
            if(aeronave.asientos[i].getOcupado()){
                asiento = null;
                continue;
            }else{
                asiento = aeronave.asientos[i];
                aeronave.asientos[i].setOcupado(true);
                break;
            }
        }

        if(asiento == null){
            System.out.println("No hay asientos disponibles.");
        }else{
            System.out.println(asiento.toString());
        }

        return new Pasaje(asiento);
    }

    public static Pasajero entradaPasajero(Aeronave aeronave){
        double peso;
        double pesoequipaje;
        boolean respuesta;

        Documento documento = entradaDocumento();

        Pasaje pasaje = entradaPasaje(aeronave);

        System.out.println("Introduzca el peso del pasajero: ");
        peso = EntradasConsola.entradaFlotantePositivo();
        System.out.println("Introduzca el peso del equipaje: ");
        pesoequipaje = EntradasConsola.entradaFlotantePositivo();

        do{
            System.out.println("Peso pasajero: " + peso);
            System.out.println("Peso del equipaje: " + pesoequipaje);
            System.out.println("Son estos datos correctos?");
            respuesta = EntradasConsola.entradaBoolean();

            if(!respuesta){
                System.out.println("Cual de estos datos quiere modificar:");
                System.out.println("1. Peso pasajero: " + peso);
                System.out.println("2. Peso del equipaje: " + pesoequipaje);
                System.out.println("Introduzca el numero de su opcion:");

                switch (EntradasConsola.entradaOpcion(2)){
                    case 1:
                        System.out.println("Introduzca el peso del pasajero:");
                        peso = EntradasConsola.entradaFlotantePositivo();
                        break;
                    case 2:
                        System.out.println("Introduzca el peso de equipaje:");
                        pesoequipaje = EntradasConsola.entradaFlotantePositivo();
                    default:
                        System.out.println("Opcion incorrecta!");
                }
            }
        }while (!respuesta);

        return new Pasajero(peso, documento, pasaje, pesoequipaje);
    }

    public static Licencia entradaLicencia(){
        String numeroLicencia;
        LocalDate fechaVencimiento;
        Documento documento = entradaDocumento();
        boolean respuesta;

        System.out.println("Introduzca el numero de licencia:");
        numeroLicencia = EntradasConsola.entradaString();
        System.out.println("Introduzca la fecha de vencimiento:");
        fechaVencimiento = EntradasConsola.entradaFecha();

        Licencia licencia = new Licencia(numeroLicencia, fechaVencimiento, documento);

        do{
            System.out.println("Numero de licencia: " + licencia.getNumeroLicencia());
            System.out.println("Fecha de vencimiento: " + licencia.getFechaVencimiento());
            System.out.println("Son estos datos correctos?");
            respuesta = EntradasConsola.entradaBoolean();

            if(!respuesta){
                System.out.println("Cual de estos datos desea modificar?");
                System.out.println("1. Numero de licencia: " + licencia.getNumeroLicencia());
                System.out.println("2. Fecha de vencimiento: " + licencia.getFechaVencimiento());
                System.out.println("Introduzca el numero de su opcion:");

                switch (EntradasConsola.entradaOpcion(2)){
                    case 1:
                        System.out.println("Introduzca el numero de licencia :");
                        licencia.setNumeroLicencia(EntradasConsola.entradaString());
                        break;
                    case 2:
                        System.out.println("Introduzca la fecha de vencimiento: ");
                        licencia.setFechaVencimiento(EntradasConsola.entradaFecha());
                        break;
                    default:
                        System.out.println("Opcion incorrecta!");
                }
            }
        }while(!respuesta);
        return licencia;
    }

    public static Licencia entradaLicencia(Documento documento){
        String numeroLicencia;
        LocalDate fechaVencimiento;
        boolean respuesta;

        System.out.println("Introduzca el numero de licencia:");
        numeroLicencia = EntradasConsola.entradaString();
        System.out.println("Introduzca la fecha de vencimiento:");
        fechaVencimiento = EntradasConsola.entradaFecha();

        Licencia licencia = new Licencia(numeroLicencia, fechaVencimiento, documento);

        do{
            System.out.println("Numero de licencia: " + licencia.getNumeroLicencia());
            System.out.println("Fecha de vencimiento: " + licencia.getFechaVencimiento());
            System.out.println("Son estos datos correctos?");
            respuesta = EntradasConsola.entradaBoolean();

            if(!respuesta){
                System.out.println("Cual de estos datos desea modificar?");
                System.out.println("1. Numero de licencia: " + licencia.getNumeroLicencia());
                System.out.println("2. Fecha de vencimiento: " + licencia.getFechaVencimiento());
                System.out.println("Introduzca el numero de su opcion:");

                switch (EntradasConsola.entradaOpcion(2)){
                    case 1:
                        System.out.println("Introduzca el numero de licencia :");
                        licencia.setNumeroLicencia(EntradasConsola.entradaString());
                        break;
                    case 2:
                        System.out.println("Introduzca la fecha de vencimiento: ");
                        licencia.setFechaVencimiento(EntradasConsola.entradaFecha());
                        break;
                    default:
                        System.out.println("Opcion incorrecta!");
                }
            }
        }while(!respuesta);
        return licencia;
    }

    public static Piloto entradaPiloto(){
        double peso;
        double pesoEquipaje;
        Documento documento = entradaDocumento();
        Licencia licencia = entradaLicencia(documento);
        boolean respuesta;

        System.out.println("Introduzca el peso del piloto: ");
        peso = EntradasConsola.entradaFlotantePositivo();
        System.out.println("Introduzca el peso del equipaje: ");
        pesoEquipaje = EntradasConsola.entradaFlotantePositivo();

        do{
            System.out.println("Peso del piloto: " + peso);
            System.out.println("Peso del equipaje: " + pesoEquipaje);
            System.out.println("Son estos datos correctos?");
            respuesta = EntradasConsola.entradaBoolean();

            if(!respuesta){
                System.out.println("Cual de estos datos quiere modificar:");
                System.out.println("1. Peso del piloto: " + peso);
                System.out.println("2. Peso del equipaje: " + pesoEquipaje);
                System.out.println("Introduzca el numero de su opcion:");

                switch (EntradasConsola.entradaOpcion(2)){
                    case 1:
                        System.out.println("Introduzca el peso del piloto:");
                        peso = EntradasConsola.entradaFlotantePositivo();
                        break;
                    case 2:
                        System.out.println("Introduzca el peso de equipaje:");
                        pesoEquipaje = EntradasConsola.entradaFlotantePositivo();
                        break;
                    default:
                        System.out.println("Entrada incorrecta!");
                }
            }
        }while (!respuesta);

        return new Piloto(peso, documento, licencia, pesoEquipaje);
    }

    public static void entradaDatosSalidaDestino(Vuelo vuelo){

        boolean respuesta;

        System.out.println("A continuacion se le pediran los datos de ciudades y aeropuertos de origen y destino.");
        System.out.println("Introduzca la ciudad de salida: ");
        vuelo.setCiudadSalida(EntradasConsola.entradaString());
        System.out.println("Introduzca el aeropuerto de origen: ");
        vuelo.setAeropuertoSalida(EntradasConsola.entradaString());
        System.out.println("Introduzca la ciudad de destino: ");
        vuelo.setCiudadDestino(EntradasConsola.entradaString());
        System.out.println("Introduzca el aeropuerto de destino: ");
        vuelo.setAeropuertoDestino(EntradasConsola.entradaString());
        System.out.println("Introduzca la distanacia de vuelo: ");
        vuelo.setDistancia(EntradasConsola.entradaoEnteroPositivo());

        do{
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println("1. Ciudad de origen: " + vuelo.getCiudadSalida());
            System.out.println("2. Aeropuerto de origen: " + vuelo.getAeropuertoSalida());
            System.out.println("3. Ciudad de destino: " + vuelo.getCiudadDestino());
            System.out.println("4. Aeropuerto de destino: " + vuelo.getAeropuertoDestino());
            System.out.println("5. Distancia de vuelo: " + vuelo.getDistancia());
            System.out.println("Son estos datos correctos?");
            respuesta = EntradasConsola.entradaBoolean();

            if(!respuesta){
                System.out.println("Cual de estos datos quiere modificar?");
                System.out.println("1. Ciudad de origen: " + vuelo.getCiudadSalida());
                System.out.println("2. Aeropuerto de origen: " + vuelo.getAeropuertoSalida());
                System.out.println("3. Ciudad de destino: " + vuelo.getCiudadDestino());
                System.out.println("4. Aeropuerto de destino: " + vuelo.getCiudadDestino());
                System.out.println("5. Distancia de vuelo: " + vuelo.getDistancia());
                System.out.println("Introduzca el numero de su opcion:");

                switch (EntradasConsola.entradaOpcion(5)){
                    case 1:
                        System.out.println("Introduzca la ciudad de origen: ");
                        vuelo.setCiudadSalida(EntradasConsola.entradaString());
                        break;
                    case 2:
                        System.out.println("Introduzca el aeropuerto de origen: ");
                        vuelo.setAeropuertoSalida(EntradasConsola.entradaString());
                        break;
                    case 3:
                        System.out.println("Introduzca la cidad de destino: ");
                        vuelo.setCiudadDestino(EntradasConsola.entradaString());
                        break;
                    case 4:
                        System.out.println("Introduzca el aeropuerto de destino: ");
                        vuelo.setAeropuertoDestino(EntradasConsola.entradaString());
                        break;
                    case 5:
                        System.out.println("Introduzca la distancia de vuelo: ");
                        vuelo.setDistancia(EntradasConsola.entradaoEnteroPositivo());
                        break;
                    default:
                        System.out.println("Opcion incorrecta!");
                        break;
                }
            }
        }while(!respuesta);
    }


    public static Aeronave seleccionAeronave(Vuelo vuelo){

        boolean respuesta;
        boolean aeronaveAdecuada;
        Aeronave aeronave;

        do{
            System.out.println("Selecione una aeronave: ");
            System.out.println("1. Boeing 737-400.");
            System.out.println("2. McDouglas MD-80.");
            System.out.println("3. Embraer E-190.");
            System.out.println("Introduzca el numero de su opcion: ");

            switch (EntradasConsola.entradaOpcion(3)){
                case 1:
                    aeronave = new Aeronave();
                    if(aeronave.getAutonomia() < vuelo.getDistancia()){
                        System.out.println("La aeronave seleccionada tiene las siguientes caracteristicas:");
                        System.out.println(aeronave.toString());
                        System.out.println("La distancia de vuelo es mayor a la autonomia de la aeronave!");
                        System.out.println("Seleccione otra aeronave para este vuelo.");
                        aeronave = null;
                        aeronaveAdecuada = false;
                        break;
                    }else{
                        System.out.println("La aeronave seleccionada tiene las siguientes caracteristicas: ");
                        System.out.println(aeronave.toString());
                        aeronaveAdecuada = true;
                        break;
                    }

                case 2:
                    System.out.println("McDouglas MD-80.");
                    System.out.println("Esta aeronave aun no esta disponible, disculpe las molestias.");
                    System.out.println("Seleccione otra aeronave para este vuelo.");
                    aeronave = null;
                    aeronaveAdecuada = false;
                    break;
                case 3:
                    System.out.println("Embraer E-190.");
                    System.out.println("Esta aeronave aun no esta disponible, disculpe las molestias.");
                    System.out.println("Seleccione otra aeronave para este vuelo.");
                    aeronave = null;
                    aeronaveAdecuada = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
                    aeronave = null;
                    aeronaveAdecuada = false;
                    break;
            }
        }while(!aeronaveAdecuada);

        return aeronave;
    }

    public static void configuracionVuelo(Vuelo vuelo){

        // Entrada de los datos de las ciudades, aeropuertos de origen, destino y ditancia de vuelo.
        entradaDatosSalidaDestino(vuelo);
        // Seleccion de una aeronave adecuada para el vuelo segun la distancia de vuelo.
        vuelo.setAeronave(seleccionAeronave(vuelo));
        // Entrada de un comandante para el vuelo.
        System.out.println("Ahora se le pediran los datos referentes al comandante para este vuelo.");
        vuelo.setComandante(entradaPiloto());
        // Entrada de un primer oficial para el vuelo.
        System.out.println("Ahora se le pediran los datos referentes al primer oficial para este vuelo.");
        vuelo.setPrimerOficial(entradaPiloto());
        // Entrada de la fecha del vuelo.
        System.out.println("Introduzca la fecha en la que saldra el vuelo:");
        vuelo.setFechaVuelo(EntradasConsola.entradaFecha());

    }

    public static void ingresarPasajeroAbordo(Vuelo vuelo){

        boolean respuesta;
        // Entrada de pasajeros.
        do{
            System.out.println("Introduzca los datos del pasajero:");
            vuelo.abordarPasajero(entradaPasajero(vuelo.getAeronave()));
            System.out.println("Quiere ingresar un nuevo pasajero?");
            respuesta = EntradasConsola.entradaBoolean();
        }while(respuesta);
    }

    public static Vuelo menuGeneral(){
        Vuelo vuelo = new Vuelo();
        boolean respuesta;

        do{
            System.out.println("Bienvenido a la aplicacion de gestion de vuelos.");
            System.out.println("Desea iniciar un nuevo vuelo?");
            respuesta = EntradasConsola.entradaBoolean();
        }while(!respuesta);

        configuracionVuelo(vuelo);

        System.out.println("Vuelo configurado!");

        System.out.println(vuelo.toString());

        do{
            System.out.println("Desea ingresar un pasajero?");

            if(respuesta = EntradasConsola.entradaBoolean()){
                ingresarPasajeroAbordo(vuelo);
            }
            System.out.println("Han sido ingresados ya todos los pasajeros de este vuelo?");
            respuesta = EntradasConsola.entradaBoolean();

        }while (!respuesta);

        System.out.println("Peso total del pasaje y tripulacion mas su equipaje: " + vuelo.calculaTotalPayLoad());
        System.out.println("Peso maximo de carga de pago admitido por la aeronave: " + vuelo.getAeronave().getMaxPayLoad());

        if(vuelo.calculaTotalPayLoad() < vuelo.getAeronave().getMaxPayLoad()){
            vuelo.getAeronave().setPayLoad(vuelo.calculaTotalPayLoad());
        }else{
            System.out.println("El peso de carga de epago para este vuelo es superior a lo admitido como carga de pago por la aeronave!");
            System.out.println("Peso total del pasaje y tripulacion mas su equipaje: " + vuelo.calculaTotalPayLoad());
            System.out.println("Peso maximo de carga de pago admitido por la aeronave: " + vuelo.getAeronave().getMaxPayLoad());

        }

        System.out.println("Ahora se le pedira que coloque el combustible necesario para este vuelo.");

        do{
            System.out.println("Cuantos litros desea colocar?");
            vuelo.getAeronave().setCombustible(EntradasConsola.entradaDoublePositivo());

            System.out.println("Combustible actualmente en la aeronave: " + vuelo.getAeronave().getCombustible() + " Kg.");
            System.out.println("De un total de: " + vuelo.getAeronave().getMaximoCombustible() + " Kg.");
            System.out.println("Es correcto este nivel de combustible?");
            respuesta = EntradasConsola.entradaBoolean();
        }while(!respuesta);

        return vuelo;

    }

}
