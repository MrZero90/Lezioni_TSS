package giochini;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Tombola {

	public static void main(String[] args) {
		estrazione();
		estrazione2();
		estrazione3();
	}
	
	public static void estrazione() {
		
		int[] numEstratti = new int[20];
		
		for (int i = 0; i < 20; i++) {
			Random numRan = new Random();
			numEstratti[i] = numRan.nextInt(1,91);

			for (int j = 0; j < i; j++) {
				if(numEstratti[j] == numEstratti[i]) {
					i--;
				}	
			}
		}
		System.out.println(Arrays.toString(numEstratti));
		
	}
	
	public static void estrazione2() {
		Random generator = new Random();
		
		int[] numEstratti = new int[20];
		
		for (int i = 0; i < numEstratti.length; i++) {
			int numEstratto;
			boolean estratto;
			
			do {
				numEstratto = generator.nextInt(1, 91);
				estratto = false;
				for (int j = 0; j < i; j++) {
					if (numEstratti[j] == numEstratto) {
						estratto = true;
						break;
					}
					
				}
			
			}while(estratto);
			
			numEstratti[i] = numEstratto;
		}
		
		System.out.println(Arrays.toString(numEstratti));
	}
	
	public static void estrazione3() {
		int dimensione = 20;
		
		int[] numEstratti = new int[dimensione];
		Random numRand = new Random();
		
		int contatore = 0;
		
		while(contatore < dimensione) {
			int numEstratto = numRand.nextInt(1, 91);
			
			boolean presente = false;
			
			for (int i = 0; i < contatore; i++) {
				if(numEstratti[i] == numEstratto) {
					presente = true;
					break;
				}
			}
			
			if (!presente) {
				numEstratti[contatore] = numEstratto;
				contatore++;
			}
		}
		System.out.println(Arrays.toString(numEstratti));
	}
}
