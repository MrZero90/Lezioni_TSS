package conto;

import java.util.Scanner;

public class Tester {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean chiudiApp = false;
		
		System.out.println("Benvenuto in BestBank");
		System.out.println("1. Nuovo conto");
		System.out.println("2. Già titolare di un conto");
		System.out.println("3. Arrivederci");
		String scelta = s.nextLine();
		
		switch (scelta) {
		case "1":
			apriNuovoConto();
		default:

		}
		

		
	}
	
	
	public static void apriNuovoConto() {
		ContoCorrente conto = new ContoCorrente();
		System.out.println(conto.toString());
		
		System.out.println("Prego, inserire il nome del titolare del conto");
		conto.titolare = s.nextLine();
		System.out.println(conto.toString());
		do {
			System.out.println("Per attivare il suo conto abbiamo bisogno di un primo versamento di almeno €50, quanto vuole versare?");
			conto.versamento(s.nextDouble());
			System.out.println("Il tuo nuovo saldo è: " + conto.saldo);
		}while(conto.saldo <= 50);
		System.out.println(conto.toString());
	}
	
}
