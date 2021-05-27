package pack01;

public class Persona {
	
	private double peso;
	private Documento documento;
	
	public Persona(double peso, Documento documento) {
		this.peso = peso;
		this.documento = documento;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return peso;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	public Documento getDocumento() {
		return documento;
	}

}
