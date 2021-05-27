package pack01;

public class Pasajero extends Persona {
	private Pasaje pasaje;
	private double pesoEquipaje;
	
	public Pasajero(double peso, Documento documento, Pasaje pasaje, double pesoEquipaje) {
		super(peso, documento);
		this.pasaje = pasaje;
		this.pesoEquipaje = pesoEquipaje;
	}
	public Pasajero(double peso, Documento documento, double pesoEquipaje) {
		super(peso, documento);
		this.pesoEquipaje = pesoEquipaje;
	}
	
	public void setPasaje(Pasaje pasaje) {
		this.pasaje = pasaje;
	}
	public Pasaje getPasaje() {
		return pasaje;
	}
	public void setPesoEquipaje(double pesoEquipaje) {
		this.pesoEquipaje = pesoEquipaje;
	}
	public double getPesoEquipaje() {
		return pesoEquipaje;
	}

}
