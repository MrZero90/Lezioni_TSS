package giochini;

import java.util.Scanner;

public class Menu {
	
	public static void multipli() {
		for (int i = 1; i <= 100; i++) {
			if (i%3 == 0 && i % 5 == 0 ) {
				System.out.println("BANGARANG");
			}else if (i % 3 == 0) {
				System.out.println("BOOM");
			}else if(i % 5 == 0) {
				System.out.println("ZOOM");
			}else{
			System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		char scelta = 0;
		
		do {
			System.out.println("----MENU---");
			System.out.println("1. Gioco1");
			System.out.println("2. Gioco2");
			System.out.println("3. Gioco3");
			System.out.println("q. Esci");
			System.out.println("-----------");
			
			scelta = s.next().toLowerCase().charAt(0);
			
			switch(scelta) {
			
			case 'a':
			case '1':
				System.out.println("Scelto gioco 1");
				// multipli
				// stampa i numeri da 1 a 100. Per tutti i multipli di 3 stampa BOOM. per tutti i multipli di 5 stampa ZOOM. per tutti i multipli di 3 e 5 stampa BANGARANG
				multipli();
				break;
			case 'b':
			case '2':
				System.out.println("Scelto gioco 2");
				// pattern
				// elabora un algoritmo per stampare il seguente pattern
				//
				// @
				// @@
				// @@@
				// @@@@
				// @@@@@
				break;
			case 'c':
			case '3':
				System.out.println("Scelto gioco 3");
				// tombola
				// ricrea il gioco della tombola. Da un set di 90 numeri estraine 20. Mi raccomando non posso estrarre 2 volte lo stesso numero.
				Tombola.estrazione2();	break;
			case 'q':
			case '0':
				System.out.println("Stai uscendo dal programma...");
				break;
			default:
				System.out.println("Non ho capito");
			}
			
		}while(scelta != 'q');
		
		System.out.println("Alla prossima!");
		
	}
	
}
