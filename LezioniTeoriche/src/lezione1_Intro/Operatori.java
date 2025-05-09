package lezione1_Intro;

public class Operatori {

	public static void main(String[] args) {
		
		// operatori matematici +-*/
		// % resto della divisione
		
		int resto = 12 % 6;
		System.out.println("Il resto vale: " + resto);
		
		int resto2 = 12 % 5;
		System.out.println("Il resto vale: " + resto2);
		
		// operatori di confronto o relazionali - ritornano sempre un boolean
		// == uguale a 
		// != non uguale a
		// > maggiore 
		// < minore
		// >= maggiore o uguale
		// <= minore o uguale
		
		int i1 = 5;
		int i2 = 6;
		
		boolean c1 = (i1 == i2); 
		boolean c2 = (i1 != i2); 
		boolean c3 = (i1 > i2); 
		boolean c4 = (i1 < i2);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		// operatori di assegnamento
		// = assegnamento
		// += assegnamento con somma
		// -= assegnamento con sottrazione
		// *= assegnamento con moltiplicazione
		// /= assegnamento con divisione
		
		int num1 = 10;
		int num2 = 5;
		num1 += num2;
		 
		System.out.println(num1);
		System.out.println(num2);
		
		num2 *= 4;
		System.out.println(num2);
		
		num2 /= 5;
		System.out.println(num2);
		
		num2 -= 2;
		System.out.println(num2);
		
		// operatori di incremento (++) e decremento (--)
		int a = 3;
		int b;
		
		System.out.println("a vale " + a);
		a++;
		System.out.println("Dopo ++ la a vale: " + a);
		
		b = a++;
		System.out.println("b vale " + b);
		
		b = ++a;
		System.out.println("b vale " + b);
		
		
		
		
		
	}
}
