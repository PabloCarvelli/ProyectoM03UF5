package pack01;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vuelo {

    private String ciudadSalida;
    private String ciudadDestino;
    private String aeropuertoSalida;
    private String aeropuertoDestino;
    private int distancia;
    private Aeronave aeronave;
    private Piloto comandante;
    private Piloto primerOficial;
    private LocalDate fechaVuelo;
    private ArrayList<Pasajero> pasajeros;

    public Vuelo(){
        pasajeros = new ArrayList<Pasajero>();
    }

    public void setCiudadSalida(String ciudadSalida){
        this.ciudadSalida = ciudadSalida;
    }
    public String getCiudadSalida(){
        return ciudadSalida;
    }

    public void setCiudadDestino(String ciudadDestino){
        this.ciudadDestino = ciudadDestino;
    }
    public String getCiudadDestino(){
        return ciudadDestino;
    }

    public void setAeropuertoSalida(String aeropuertoSalida){
        this.aeropuertoSalida = aeropuertoSalida;
    }
    public String getAeropuertoSalida(){
        return aeropuertoSalida;
    }

    public void setAeropuertoDestino(String aeropuertoDestino){
        this.aeropuertoDestino = aeropuertoDestino;
    }
    public String getAeropuertoDestino(){
        return aeropuertoDestino;
    }

    public void setDistancia(int distancia){
        this.distancia = distancia;
    }
    public int getDistancia(){
        return distancia;
    }

    public void setAeronave(Aeronave aeronave){
        this.aeronave = aeronave;
    }
    public Aeronave getAeronave(){
        return aeronave;
    }

    public void setComandante(Piloto comandante){
        this.comandante = comandante;
    }
    public Piloto getComandante(){
        return comandante;
    }

    public void setPrimerOficial(Piloto primerOficial){
        this.primerOficial = primerOficial;
    }
    public Piloto getPrimerOficial(){
        return primerOficial;
    }

    public void setFechaVuelo(LocalDate fechaVuelo){
        this.fechaVuelo = fechaVuelo;
    }
    public LocalDate getFechaVuelo(){
        return fechaVuelo;
    }

    public ArrayList<Pasajero> getPasajeros(){
        return pasajeros;
    }

    public void abordarPasajero(Pasajero pasajero){

        if(aeronave.getNumeroAsientosLibres() > 0){
            System.out.println("Entro2!");
            pasajeros.add(pasajero);
            System.out.println(pasajero.getPasaje().toString());
            System.out.println("De un total de " + aeronave.getNumeroTotalDeAsientos() + " asientos en la aeronave.");
            System.out.println("Quedan " + aeronave.getNumeroAsientosLibres() + " asientos disponibles.");
        }else {
            System.out.println("Todas las plazas en el avion se encuentran ocupadas.");
            System.out.println("Se ah agotado los asientos para este vuelo.");
        }

    }

    @Override
    public String toString(){
        return "\nCiudad de origen: " + ciudadSalida + "\nAeropuerto de origen: " + aeropuertoSalida + "\nCiudad de destino: " + ciudadDestino + "\nAeropuerto de destino: " + aeropuertoDestino + "\nDistancia de vuelo: " + distancia + "\n\nInformacion de la aeronave: " + aeronave.toString() + "\n\nInformacion del comandante: " + comandante.toString() + "\n\nInformacion del primer oficial: " + primerOficial.toString() + "\n\nFecha de salida: " + fechaVuelo.toString();
    }
}
