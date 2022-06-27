package jana60.calcolatrice;

public class CalcoliTest {

	public static void main(String[] args) {
		
		// Testo i metodi della classe CalcoliHelper
		
		System.out.println("Somma: " + CalcoliHelper.somma(7, 25));
		System.out.println("Differenza: " + CalcoliHelper.differenza(7, 25));
		System.out.println("Moltiplicazione: " + CalcoliHelper.moltiplicazione(7, 25));
		System.out.println("Valore assoluto: " + CalcoliHelper.valoreAssoluto(-7));
		System.out.println("Numero minimo: " + CalcoliHelper.numeroMinimo(7, 25));
		System.out.println("Numero massimo: " + CalcoliHelper.numeroMassimo(7, 25));
		
		// Testo i metodi sovrascritti dall'overload
		
		System.out.println("Somma: " + CalcoliHelper.somma(7.45, 25.32));
		System.out.println("Differenza: " + CalcoliHelper.differenza(7.45, 25.32));
		System.out.println("Moltiplicazione: " + CalcoliHelper.moltiplicazione(7.45, 3.35));
		System.out.println("Valore assoluto: " + CalcoliHelper.valoreAssoluto(-7.45));
		System.out.println("Numero minimo: " + CalcoliHelper.numeroMinimo(7.45, 25.32));
		System.out.println("Numero massimo: " + CalcoliHelper.numeroMassimo(7.45, 25.32));
		
		
		// Testo il metodo per l'elevamento a potenza 
		
		System.out.println("Elevamento a potenza: " + CalcoliHelper.potenza(3, -3));
		System.out.println("Elevamento a potenza: " + CalcoliHelper.potenza(3, 4));
		System.out.println("Elevamento a potenza: " + CalcoliHelper.potenza(3, 0));
		System.out.println("Elevamento a potenza: " + CalcoliHelper.potenza(3, 1));
		
	}

}
