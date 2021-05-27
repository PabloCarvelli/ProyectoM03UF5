package pack01;

public class Aeronave {
	private String fabricante = "Boeing";
	private String modelo = "737-400";
	private int pilotosParaOperacion = 2;
	private int pesoMaximoTotal = 62820;
	private int pesoOperacionPasaje;
	private int autonomia = 5241;
	private double combustible;

	static Asiento a1 = new Asiento(1, 'a', true, false);
	static Asiento a2 = new Asiento(1, 'b', false, true);

	static Asiento a3 = new Asiento(1, 'e', true, false);
	static Asiento a4 = new Asiento(1, 'f', false, true);

	static Asiento a5 = new Asiento(2, 'a', true, false);
	static Asiento a6 = new Asiento(2, 'b', false, true);

	static Asiento a7 = new Asiento(2, 'e', true, false);
	static Asiento a8 = new Asiento(2, 'f', false, true);

	static Asiento a9 = new Asiento(3, 'a', true, false);
	static Asiento a10 = new Asiento(3, 'b', false, true);

	static Asiento a11 = new Asiento(3, 'e', true, false);
	static Asiento a12 = new Asiento(3, 'f', false, true);

	static Asiento a13 = new Asiento(4, 'a', true, false);
	static Asiento a14 = new Asiento(4, 'b', false, true);

	static Asiento a15 = new Asiento(4, 'e', true, false);
	static Asiento a16 = new Asiento(4, 'f', false, true);


	static Asiento a17 = new Asiento(5, 'a', true, false);
	static Asiento a18 = new Asiento(5, 'b', false, false);
	static Asiento a19 = new Asiento(5, 'c', false, true);

	static Asiento a20 = new Asiento(5, 'd', false, true);
	static Asiento a21 = new Asiento(5, 'e', false, false);
	static Asiento a22 = new Asiento(5, 'f', true, false);

	static Asiento a23 = new Asiento(6, 'a', true, false);
	static Asiento a24 = new Asiento(6, 'b', false, false);
	static Asiento a25 = new Asiento(6, 'c', false, true);

	static Asiento a26 = new Asiento(6, 'd', false, true);
	static Asiento a27 = new Asiento(6, 'e', false, false);
	static Asiento a28 = new Asiento(6, 'f', true, false);

	static Asiento a29 = new Asiento(7, 'a', true, false);
	static Asiento a30 = new Asiento(7, 'b', false, false);
	static Asiento a31 = new Asiento(7, 'c', false, true);

	static Asiento a32 = new Asiento(7, 'd', false, true);
	static Asiento a33 = new Asiento(7, 'e', false, false);
	static Asiento a34 = new Asiento(7, 'f', true, false);

	static Asiento a35 = new Asiento(8, 'a', true, false);
	static Asiento a36 = new Asiento(8, 'b', false, false);
	static Asiento a37 = new Asiento(8, 'c', false, true);

	static Asiento a38 = new Asiento(8, 'd', false, true);
	static 	Asiento a39 = new Asiento(8, 'e', false, false);
	static Asiento a40 = new Asiento(8, 'f', true, false);

	static Asiento a41 = new Asiento(9, 'a', true, false);
	static Asiento a42 = new Asiento(9, 'b', false, false);
	static Asiento a43 = new Asiento(9, 'c', false, true);

	static Asiento a44 = new Asiento(9, 'd', false, true);
	static Asiento a45 = new Asiento(9, 'e', false, false);
	static Asiento a46 = new Asiento(9, 'f', true, false);

	static Asiento a47 = new Asiento(10, 'a', true, false);
	static Asiento a48 = new Asiento(10, 'b', false, false);
	static Asiento a49 = new Asiento(10, 'c', false, true);

	static Asiento a50 = new Asiento(10, 'd', false, true);
	static Asiento a51 = new Asiento(10, 'e', false, false);
	static Asiento a52 = new Asiento(10, 'f', true, false);

	static Asiento a53 = new Asiento(11, 'a', true, false);
	static Asiento a54 = new Asiento(11, 'b', false, false);
	static Asiento a55 = new Asiento(11, 'c', false, true);

	static Asiento a56 = new Asiento(11, 'd', false, true);
	static Asiento a57 = new Asiento(11, 'e', false, false);
	static Asiento a58 = new Asiento(11, 'f', true, false);

	static Asiento a59 = new Asiento(12, 'a', true, false);
	static Asiento a60 = new Asiento(12, 'b', false, false);
	static Asiento a61 = new Asiento(12, 'c', false, true);

	static Asiento a62 = new Asiento(12, 'd', false, true);
	static Asiento a63 = new Asiento(12, 'e', false, false);
	static Asiento a64 = new Asiento(12, 'f', true, false);

	static Asiento a65 = new Asiento(13, 'a', true, false);
	static Asiento a66 = new Asiento(13, 'b', false, false);
	static Asiento a67 = new Asiento(13, 'c', false, true);

	static Asiento a68 = new Asiento(13, 'd', false, true);
	static Asiento a69 = new Asiento(13, 'e', false, false);
	static Asiento a70 = new Asiento(13, 'f', true, false);

	static Asiento a71 = new Asiento(14, 'a', true, false);
	static Asiento a72 = new Asiento(14, 'b', false, false);
	static Asiento a73 = new Asiento(14, 'c', false, true);

	static Asiento a74 = new Asiento(14, 'd', false, true);
	static Asiento a75 = new Asiento(14, 'e', false, false);
	static Asiento a76 = new Asiento(14, 'f', true, false);

	static Asiento a77 = new Asiento(15, 'a', true, false);
	static Asiento a78 = new Asiento(15, 'b', false, false);
	static Asiento a79 = new Asiento(15, 'c', false, true);

	static Asiento a80 = new Asiento(15, 'd', false, true);
	static Asiento a81 = new Asiento(15, 'e', false, false);
	static Asiento a82 = new Asiento(15, 'f', true, false);

	static Asiento a83 = new Asiento(16, 'a', true, false);
	static Asiento a84 = new Asiento(16, 'b', false, false);
	static Asiento a85 = new Asiento(16, 'c', false, true);

	static Asiento a86 = new Asiento(16, 'd', false, true);
	static Asiento a87 = new Asiento(16, 'e', false, false);
	static Asiento a88 = new Asiento(16, 'f', true, false);

	static Asiento a89 = new Asiento(17, 'a', true, false);
	static Asiento a90 = new Asiento(17, 'b', false, false);
	static Asiento a91 = new Asiento(17, 'c', false, true);

	static Asiento a92 = new Asiento(17, 'd', false, true);
	static Asiento a93 = new Asiento(17, 'e', false, false);
	static Asiento a94 = new Asiento(17, 'f', true, false);

	static Asiento a95 = new Asiento(18, 'a', true, false);
	static Asiento a96 = new Asiento(18, 'b', false, false);
	static Asiento a97 = new Asiento(18, 'c', false, true);

	static Asiento a98 = new Asiento(18, 'd', false, true);
	static Asiento a99 = new Asiento(18, 'e', false, false);
	static Asiento a100 = new Asiento(18, 'f', true, false);

	static Asiento a101 = new Asiento(19, 'a', true, false);
	static Asiento a102 = new Asiento(19, 'b', false, false);
	static Asiento a103 = new Asiento(19, 'c', false, true);

	static Asiento a104 = new Asiento(19, 'd', false, true);
	static Asiento a105 = new Asiento(19, 'e', false, false);
	static Asiento a106 = new Asiento(19, 'f', true, false);

	static Asiento a107 = new Asiento(20, 'a', true, false);
	static Asiento a108 = new Asiento(20, 'b', false, false);
	static Asiento a109 = new Asiento(20, 'c', false, true);

	static Asiento a110 = new Asiento(20, 'd', false, true);
	static Asiento a111 = new Asiento(20, 'e', false, false);
	static Asiento a112 = new Asiento(20, 'f', true, false);

	static Asiento a113 = new Asiento(21, 'a', true, false);
	static Asiento a114 = new Asiento(21, 'b', false, false);
	static Asiento a115 = new Asiento(21, 'c', false, true);

	static Asiento a116 = new Asiento(21, 'd', false, true);
	static Asiento a117 = new Asiento(21, 'e', false, false);
	static Asiento a118 = new Asiento(21, 'f', true, false);

	static Asiento a119 = new Asiento(22, 'a', true, false);
	static Asiento a120 = new Asiento(22, 'b', false, false);
	static Asiento a121 = new Asiento(22, 'c', false, true);

	static Asiento a122 = new Asiento(22, 'd', false, true);
	static Asiento a123 = new Asiento(22, 'e', false, false);
	static Asiento a124 = new Asiento(22, 'f', true, false);

	static Asiento a125 = new Asiento(23, 'a', true, false);
	static Asiento a126 = new Asiento(23, 'b', false, false);
	static Asiento a127 = new Asiento(23, 'c', false, true);

	static Asiento a128 = new Asiento(23, 'd', false, true);
	static Asiento a129 = new Asiento(23, 'e', false, false);
	static Asiento a130 = new Asiento(23, 'f', true, false);

	static Asiento a131 = new Asiento(24, 'a', true, false);
	static Asiento a132 = new Asiento(24, 'b', false, false);
	static Asiento a133 = new Asiento(24, 'c', false, true);

	static Asiento a134 = new Asiento(24, 'd', false, true);
	static Asiento a135 = new Asiento(24, 'e', false, false);
	static Asiento a136 = new Asiento(24, 'f', true, false);

	static Asiento a137 = new Asiento(25, 'a', true, false);
	static Asiento a138 = new Asiento(25, 'b', false, false);
	static Asiento a139 = new Asiento(25, 'c', false, true);

	static Asiento a140 = new Asiento(25, 'd', false, true);
	static Asiento a141 = new Asiento(25, 'e', false, false);
	static Asiento a142 = new Asiento(25, 'f', true, false);

	static Asiento a143 = new Asiento(26, 'a', true, false);
	static Asiento a144 = new Asiento(26, 'b', false, false);
	static Asiento a145 = new Asiento(26, 'c', false, true);

	static Asiento a146 = new Asiento(26, 'd', false, true);
	static Asiento a147 = new Asiento(26, 'e', false, false);
	static Asiento a148 = new Asiento(26, 'f', true, false);

	static Asiento a149 = new Asiento(27, 'a', true, false);
	static Asiento a150 = new Asiento(27, 'b', false, false);
	static Asiento a151 = new Asiento(27, 'c', false, true);

	static Asiento a152 = new Asiento(27, 'd', false, true);
	static Asiento a153 = new Asiento(27, 'e', false, false);
	static Asiento a154 = new Asiento(27, 'f', true, false);

	static Asiento a155 = new Asiento(28, 'a', true, false);
	static Asiento a156 = new Asiento(28, 'b', false, false);
	static Asiento a157 = new Asiento(28, 'c', false, true);

	static Asiento a158 = new Asiento(28, 'd', false, true);
	static Asiento a159 = new Asiento(28, 'e', false, false);
	static Asiento a160 = new Asiento(28, 'f', true, false);

	static Asiento a161 = new Asiento(29, 'a', true, false);
	static Asiento a162 = new Asiento(29, 'b', false, false);
	static Asiento a163 = new Asiento(29, 'c', false, true);
	
	static Asiento a164 = new Asiento(29, 'd', false, true);
	static Asiento a165 = new Asiento(29, 'e', false, false);
	static Asiento a166 = new Asiento(29, 'f', true, false);
	
	static Asiento[] asientos = {
			a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
			a11, a12, a13, a14, a15, a16, a17, a18, a19,
			a20, a21, a22, a23, a24, a25, a26, a27, a28, a29,
			a30, a31, a32, a33, a34, a35, a36, a37, a38, a39,
			a40, a41, a42, a43, a44, a45, a46, a47, a48, a49,
			a50, a51, a52, a53, a54, a55, a56, a57, a58, a59,
			a60, a61, a62, a63, a64, a65, a66, a67, a68, a69,
			a70, a71, a72, a73, a74, a75, a76, a77, a78, a79,
			a80, a81, a82, a83, a84, a85, a86, a87, a88, a89,
			a90, a91, a92, a93, a94, a95, a96, a97, a98, a99,
			a100, a101, a102, a103, a104, a105, a106, a107, a108, a109,
			a110, a111, a112, a113, a114, a115, a116, a117, a118, a119,
			a120, a121, a122, a123, a124, a125, a126, a127, a128, a129,
			a130, a131, a132, a133, a134, a135, a136, a137, a138, a139,
			a140, a141, a142, a143, a144, a145, a146, a147, a148, a149,
			a150, a151, a152, a153, a154, a155, a156, a157, a158, a159,
			a160, a161, a162, a163, a164, a165, a166
	};
	
	public Aeronave() {
		System.out.println("La aeronave se encuentra sin combustible.");
	}
	
	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public int getPilotosParaOperacion() {
		return pilotosParaOperacion;
	}
	
	public int getPesoOperacionPasaje() {
		return pesoOperacionPasaje;
	}

	public int getAutonomia() {
		return autonomia;
	}
	
	public void setCombustible(double combustible) {
		if(combustible > 26020) {
			System.out.println("El combustible que intenta colocar es superior al maximo admitido por el avion.");
			System.out.println("El combustible se cargara al maximo admitido. 26.020l.");
			this.combustible = combustible + combustible * 0.7;
			if(combustible > 26020) {
				System.out.println("El combustible total es superior a lo que almacena la nave.");
				System.out.println("El avion esta al maximo de combustible.");
				this.combustible = 26020;
			}
		}if(combustible < 0) {
			System.out.println("El combustible que intenta colocar es incorrecto por ser un numero negativo.");
			System.out.println("ADVERTENCIA la aeronave tendra 0 litros de combustible.");
			this.combustible = 0;
		}else {
			this.combustible = combustible * 0.7;
		}
	}
	
	public int getNumeroTotalDeAsientos() {
		return asientos.length;
	}
	
	public int getNumeroAsientosLibres() {
		int cont = 0;
		for(int i = 0; i < asientos.length; i++) {
			if(!asientos[i].getOcupado()) {
				cont += 1;
			}
		}
		return cont;
	}
	
	public int getNumeroAsientosOcupados() {
		int cont = 0;
		for(int i = 0; i < asientos.length; i++) {
			if(asientos[i].getOcupado()) {
				cont += 1;
			}
		}
		return cont;
	}

}
