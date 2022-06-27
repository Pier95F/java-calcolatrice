package jana60.calcolatrice;

public class CalcoliHelper {
	
/* Creare una classe di helper CalcoliHelper. Come visto a lezione, strutturare la classe in modo che non possa essere istanziata (cioè non posso creare oggetti di tipo CalcoliHelper con la parola chiave new) e che presenti i seguenti metodi static:
	- Somma di due numeri interi
	- Differenza tra due numeri interi
	- Moltiplicazione di due numeri interi
	- Valore assoluto di un numero intero
	- Minimo tra due numeri interi
	- Massimo tra due numeri interi */
	
	private CalcoliHelper() {
		
	}

	// Definisco i metodi:
	
	// 1- Somma di due numeri interi
	public static int somma (int x, int y) {
		return x+y;
	}
	
	// 2 - Differenza tra due numeri interi
	public static int differenza (int x, int y) {
		if (x> y) {
			return x-y;
		} else {
			return y-x;
		}
	}
	
	// 3 - Moltiplicazione di due numeri interi
	public static int moltiplicazione (int x, int y) {
		return x*y;
	}
	
	// 4 - Valore assoluto di un numero intero
	public static int valoreAssoluto (int x) {
		if (x>=0) {
			return x;
		} else {
			return x*-1;
		}
	}
	
	// 5 - Minimo tra due numeri interi
	public static int numeroMinimo (int x, int y) {
		if (x<y) {
			return x;
		} else {
			return y;
		}
	}
	
	// 6 - Massimo tra due numeri interi
	public static int numeroMassimo (int x, int y) {
		if (x>y) {
			return x;
		} else {
			return y;
		}
	}
	
}
