package pack01;
import java.io.*;

public class EscrituraFichero {

    public static boolean escribir(Vuelo vuelo){
        FileWriter escritura;

        String nombreArchivo = vuelo.getAeropuertoSalida() + "-" + vuelo.getAeropuertoDestino() + "-" + vuelo.getFechaVuelo();

        try{
            escritura = new FileWriter(nombreArchivo + ".txt");

            escritura.write(vuelo.toString());

            return true;

        }catch(IOException e){
            System.out.println("Error al crear el archivo.");
            return false;
        }

    }
}
