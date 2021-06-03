package pack01;
import java.io.*;

public class EscrituraFichero {

    public static boolean escribir(Vuelo vuelo){
        FileWriter escritura;

        String nombreArchivo = vuelo.getAeropuertoSalida() + "-" + vuelo.getAeropuertoDestino() + "-" + vuelo.getFechaVuelo();

        String contenido = toPrint(vuelo);

        try{
            escritura = new FileWriter(nombreArchivo + ".txt");

            for(int i = 0; i < contenido.length(); i++){
                escritura.write(contenido.charAt(i));
            }

            escritura.close();

            return true;

        }catch(IOException e){
            System.out.println("Error al crear el archivo.");
            return false;
        }

    }

    public static String toPrint(Vuelo vuelo){
        String cadena;

        cadena = "\nDatos de localizacion: " + "\nCiudad de origen: " + vuelo.getCiudadSalida() + "\nAeropuerto de origen: "
                + vuelo.getAeropuertoSalida() + "\nCiudad de destino: " + vuelo.getCiudadDestino() + "\nAeropuerto de destino: "
                + vuelo.getAeropuertoDestino() + "\nDistancia de vuelo: " + vuelo.getDistancia() + "\nFecha de salida: " + vuelo.getFechaVuelo() +
                "\nDatos sobre la aeronave: " + "\nFabricante: " + vuelo.getAeronave().getFabricante() + "Modelo: " + vuelo.getAeronave().getModelo() +
                "\nPilotos necesarios para operar: " + vuelo.getAeronave().getPilotosParaOperacion() + "\nNumero de asientos para pasajeros: " +
                vuelo.getAeronave().getNumeroTotalDeAsientos() + "\nPeso maximo de la aeronave: " +
                vuelo.getAeronave().getPesoMaximoTotal() + "\nMaxima carga de pago: " + vuelo.getAeronave().getMaxPayLoad() +
                "\nCarga de pago actual: " + vuelo.getAeronave().getPayLoad() + "\nMaximo Combustible: " + vuelo.getAeronave().getMaximoCombustible() +
                "\nCombustible actual: " + vuelo.getAeronave().getCombustible() + "\nAutonomia maxima: " + vuelo.getAeronave().getAutonomia() +
                "\nInformacion sobre los pilotos: " + "\nComandante: " + vuelo.getComandante().getDocumento().getNombre() + " " +
                vuelo.getComandante().getDocumento().getApellido1() + " " + vuelo.getComandante().getDocumento().getApellido2() +
                "\nPeso corporal: " + vuelo.getComandante().getPeso() + "\nPeso del equipaje: " + vuelo.getComandante().getPesoEquipaje() +
                "\nDni: " + vuelo.getComandante().getDocumento().getDni() + vuelo.getComandante().getDocumento().getLetra() +
                "\nLicencia: " + "\nNumero de licencia: " + vuelo.getComandante().getLicencia().getNumeroLicencia() + "\nFecha de vencimiento: " +
                vuelo.getComandante().getLicencia().getFechaVencimiento() + "\nPrimer oficial: " + vuelo.getPrimerOficial().getDocumento().getNombre() +
                " " + vuelo.getPrimerOficial().getDocumento().getApellido1() + " " + vuelo.getPrimerOficial().getDocumento().getApellido2() +
                "\nDni: " + vuelo.getPrimerOficial().getDocumento().getDni() + vuelo.getPrimerOficial().getDocumento().getLetra() +
                "\nPeso corporal: " + vuelo.getPrimerOficial().getPeso() + "\nPeso del equipaje: " + vuelo.getPrimerOficial().getPesoEquipaje() +
                "\nLicencia: " + "\nNumero de licencia: " + vuelo.getPrimerOficial().getLicencia().getNumeroLicencia() +
                "\nFecha de vencimiento: " + vuelo.getPrimerOficial().getLicencia().getFechaVencimiento() + "\nInformacion sobre el pasaje: " +
                "\nNumero de pasajeros a bordo: " + vuelo.getAeronave().getNumeroAsientosOcupados() + "\nNumero de asientos libres: " +
                vuelo.getAeronave().getNumeroAsientosLibres();

        return cadena;
    }
}
