package ordenar.mazo;

public class Palo {
	private Carta cartas[];
private String palo;
	public Palo() {
		cartas = new Carta[52];
		for (int i = 0; i < cartas.length; i++) {
			if(i<13)
				palo = "\u2662";
			else if(i<26)
				palo = "\u2660";
			else if(i<39)
				palo = "\u2661";
			else if(i<52)
				palo = "\u2663";
			cartas[i] = new Carta(i + 1, palo);
		}

	}

	public void desordenar() {
		System.out.println("\n\nDesordenando:");

		for (int x = 0; x < cartas.length ; x++) {
			int desorden = (int) (1 + (Math.random() * 12));
			Carta contenedor = cartas[x];
			cartas[x] = cartas[desorden];
			cartas[desorden] = contenedor;
		}
	}

	public void ordenar() {
		System.out.println("\n\nOrdenando:");

		for (int repetir = 0; repetir < cartas.length; repetir++) {
			for (int c = 0; c < (cartas.length-1); c++) {
				if (cartas[c].getValor() > cartas[c + 1].getValor()) {
					Carta cambio = cartas[c];
					cartas[c] = cartas[c + 1];
					cartas[c + 1] = cambio;
				}
			}
		}
		

	}

	public void mostrar() {

		for (int i = 0; i < cartas.length; i++) {
			cartas[i].mostrar();
			if(i==12||i==25||i==38||i==51)
				System.out.println();
		}
	}
}
