package pack01;

public class Documento {
	private String nombre;
	private String apellido01;
	private String apellido02;
	private int dni;
	private char letra;
	
	public Documento(String nombre, String apellido01, String apellido02, int dni) {
		this.nombre = nombre;
		this.apellido01 = apellido01;
		this.apellido02 = apellido02;
		this.dni = dni;
		this.letra = calculaLetra(this.dni);
	}
	
	private char calculaLetra(int dni) {
		char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		return letras[this.dni % 23];
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setApellido1(String apellido) {
		this.apellido01 = apellido;
	}
	public String getApellido1() {
		return apellido01;
	}
	public void setApellido2(String apellido) {
		this.apellido02 = apellido;
	}
	public String getApellido2() {
		return apellido02;
	}
	public void setDni(int dni) {
		this.dni = dni;
		calculaLetra(dni);
	}
	public int getDni() {
		return dni;
	}
	public char getLetra() {
		return letra;
	}
	
	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\nPrimer apellido: " + apellido01 + "\nSegundo apellido: " + apellido02 + "\nNumeroDNI: " + dni + "\nLetraDNI: " + letra;
	}
}
