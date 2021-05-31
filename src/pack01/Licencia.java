package pack01;

import java.time.*;

public class Licencia {
	private String numeroLicencia;
	private LocalDate fechaVencimiento;
	private Documento documentoLic;
	
	public Licencia(String numeroLicencia, LocalDate fechaVencimiento, Documento documentoLic) {
		this.numeroLicencia = numeroLicencia;
		this.fechaVencimiento = fechaVencimiento;
		this.documentoLic = documentoLic;
	}

	public String getNumeroLicencia(){
		return numeroLicencia;
	}
	public void setNumeroLicencia(String numeroLicencia){
		this.numeroLicencia = numeroLicencia;
	}

	public LocalDate getFechaVencimiento(){
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento){
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public String toString(){
		return "\nNumero de licencia: " + numeroLicencia + "\nFecha de vencimiento: " + fechaVencimiento.toString();
	}

}
