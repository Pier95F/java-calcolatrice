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
	
	/* BONUS 1: per ogni metodo scrivetene una versione che esegue le stesse operazioni ma su parametri double. */
	
	// Definisco l'overload dei singoli metodi
	public static double somma (double x, double y) {
		return x+y;
	}
	
	public static double differenza (double x, double y) {
		if (x>y) {
			return x-y;
		} else {
			return y-x;
		}
	}
	
	public static double moltiplicazione (double x, double y) {
		return x*y;
	}
	
	public static double valoreAssoluto (double x) {
		if (x>=0) {
			return x;
		} else {
			return x*-1;
		}
	}
	
	public static double numeroMinimo (double x, double y) {
		if (x<y) {
			return x;
		} else {
			return y;
		}
	}
	
	public static double numeroMassimo (double x, double y) {
		if (x>y) {
			return x;
		} else {
			return y;
		}
		}
	
	/* BONUS2: aggiungete il metodo per l’elevamento a potenza che prende come parametri due numeri interi (base ed esponente) e ritorna la base elevata all’esponente. */
	
	public static double potenza(int base, int esponente) {
		double potenza = 1;
		if (base == 0 && esponente == 0) {
			return 1;

		} else if (esponente < 0) {
			for (int i = 1; i <= -esponente; i++) {
				potenza = potenza * base;
			}
			double risultato = 0;
			risultato = 1 / potenza;
			return risultato;
			
		} else {
			for (int i = 1; i <= esponente; i++) {
				potenza = potenza * base;
			}
			return potenza;
		}
		
	}
	}

