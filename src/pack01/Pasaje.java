package pack01;

public class Pasaje {
	private static String numeroPasaje = "IB0";
	private static int num;
	Asiento asiento;
	
	public Pasaje(Asiento asiento) {
		this.num = num + 1;
		this.numeroPasaje = this.numeroPasaje + num;
		this.asiento = asiento;
	}
	
	public String getNumeroPasaje() {
		return numeroPasaje;
	}
	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}

}
