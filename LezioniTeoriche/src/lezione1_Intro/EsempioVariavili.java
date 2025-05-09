package lezione1_Intro;

public class EsempioVariavili {
	
	public static void main(String[] args) {
		
//	Spese sostenute
		double speseGenerali;
		double speseAuto;
		double speseViaggi;
		
//	Assegno un valore
		speseGenerali = 2500.6;
		speseAuto = 500;
		speseViaggi = 3642.8;
		
		double totale = speseGenerali + speseAuto + speseViaggi;
		double mediaTrimestre = totale / 4;
		
		System.out.println("----Spese----");
		System.out.println("Spese Generali: " + speseGenerali);
		System.out.println("Spese Auto: " + speseAuto);
		System.out.println("Spese Viaggi: " + speseViaggi);
		System.out.println("Spese Totali: " + totale + "€");
		System.out.println("Ogni trimestre hai speso in media: : " + mediaTrimestre + "€");
		System.out.println("-------------");
		
		double totaleAnnoPrecedente = 4520.2;
		
		// confronto i due totali
		boolean confronto = totaleAnnoPrecedente > totale;
		
		System.out.println("Il totale dell'anno precedente é maggiore di quest'anno: " + confronto);
		
	}
}
