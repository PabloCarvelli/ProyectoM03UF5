package pack01;

public class Asiento {
	private int fila;
	private char letra;
	private boolean ventanilla;
	private boolean pasillo;
	private boolean ocupado;
	
	public Asiento(int fila, char letra, boolean ventanilla, boolean pasillo) {
		this.fila = fila;
		this.letra = letra;
		this.ventanilla = ventanilla;
		this.pasillo = pasillo;
		this.ocupado = false;
	}
	
	public Asiento() {}
	
	public void setNumero(int fila) {
		this.fila = fila;
	}
	public int getNumero() {
		return fila;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	public char getLetra() {
		return letra;
	}
	public void setVentanilla(boolean ventanilla) {
		this.ventanilla = ventanilla;
	}
	public boolean getVentanilla() {
		return ventanilla;
	}
	public void setPasillo(boolean pasillo) {
		this.pasillo = pasillo;
	}
	public boolean getPasillo() {
		return pasillo;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public boolean getOcupado() {
		return ocupado;
	}
	
	@Override
	public String toString() {
		return "Fila: " + fila + "." + "\n" + "Asiento: " + letra + "." + "\n" + "Ventanilla: " + ventanilla + "." + "\n" + "Pasillo: " + pasillo + "." + "\n" + "Ocupado: " + ocupado;
	}

}
