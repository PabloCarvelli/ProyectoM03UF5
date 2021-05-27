package pack01;

import javax.print.Doc;
import java.time.*;

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

}
