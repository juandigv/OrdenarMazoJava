package ordenar.mazo;

public class Carta {
	private int valor;
    private String simbolo;
    private String palo;
	public Carta(int valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}
	public int getValor() {
		return valor;
	}

	private String valor2simbolo() {
		switch (valor) {
		case 1: case 14:case 27:case 40:
			simbolo = "A";
			break;
		case 2: case 15:case 28:case 41:
			simbolo = "2";
			break;
		case 3: case 16:case 29:case 42:
			simbolo = "3";
			break;
		case 4: case 17:case 30:case 43:
			simbolo = "4";
			break;
		case 5: case 18:case 31:case 44:
			simbolo = "5";
			break;
		case 6: case 19:case 32:case 45:
			simbolo = "6";
			break;
		case 7: case 20:case 33:case 46:
			simbolo = "7";
			break;
		case 8: case 21:case 34:case 47:
			simbolo = "8";
			break;
		case 9: case 22:case 35:case 48:
			simbolo = "9";
			break;
		case 10: case 23:case 36:case 49:
			simbolo = "10";
			break;
		case 11:case 24: case 37: case 50:
			simbolo = "J";
			break;
		case 12:case 25:case 38:case 51:
			simbolo = "Q";
			break;
		case 13:case 26: case 39: case 52:
			simbolo = "K";
			break;
		
		}
		return simbolo;
	}

	public int simbolo2valor() {
		
		return valor;
	}

	public void mostrar() {
		
		System.out.print(palo + valor2simbolo()+", ");
	//System.out.print(simbolo2valor()+" , ");
	}
}