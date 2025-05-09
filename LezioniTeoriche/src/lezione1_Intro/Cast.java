package lezione1_Intro;

public class Cast {

	public static void main(String[] args) {
		
//	Cast da int a byte
		int i1 = 10, i2 = 129, i3 = 256;
		
		byte b1 = (byte)i1;
		byte b2 = (byte)i2;
		byte b3 = (byte)i3;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
// Esempio operazioni aritmetiche
		int numero1 = 25;
		int numero2 = 12;
		
		int somma = numero1 + numero2;
		int molt = numero1 * numero2;
		int diff = numero1 - numero2;
		double div = (double)numero1 / (double)numero2;
	}
}
