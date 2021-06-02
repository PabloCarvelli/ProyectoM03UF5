package pack01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
    private Set<Pasajero> pasajeros;
    private double payLoad;

    public Vuelo(){
        pasajeros = new HashSet<Pasajero>();
    }

    public double calculaPayLoadPasajeros(){
        double payLoadPasajeros = 0.0;
        Pasajero p;

        Iterator<Pasajero> it = pasajeros.iterator();

        while(it.hasNext()){
            p = it.next();
            payLoadPasajeros += p.getPesoEquipaje() + p.getPeso();
        }
        return payLoadPasajeros;
    }

    public double calculaPayLoadPilotos(){
        double payLoadPilotos = 0.0;

        payLoadPilotos += comandante.getPeso() + comandante.getPesoEquipaje();
        payLoadPilotos += primerOficial.getPeso() + primerOficial.getPesoEquipaje();

        return payLoadPilotos;
    }

    public double calculaTotalPayLoad(){
        double payLoad = 0.0;
        payLoad = calculaPayLoadPilotos() + calculaPayLoadPasajeros();
        return payLoad;
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

    public Set<Pasajero> getPasajeros(){
        return pasajeros;
    }

    public void abordarPasajero(Pasajero pasajero){

        if(aeronave.getNumeroAsientosLibres() > 0){
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
