package pack01;

public class Piloto extends Persona {
	Licencia licencia;
	double pesoEquipaje;
	
	public Piloto(double peso, Documento documento, Licencia licencia, double pesoEquipaje) {
		super(peso, documento);
		this.licencia = licencia;
		this.pesoEquipaje = pesoEquipaje;
	}

	public Licencia getLicencia(){
		return licencia;
	}

	public double getPesoEquipaje(){
		return pesoEquipaje;
	}

	@Override
	public String toString(){
		return documento.toString() + licencia.toString() + "\nPeso del piloto: " + peso + "\nPeso del equipaje: " + pesoEquipaje;
	}

}
