package conto;

import java.util.Date;

public class ContoCorrente {

	// STATO
	
	public static int contatore = 1000;
	public int numConto = contatore;
	public double saldo;
	public String titolare; 
	public Date dataApertura;
	

	// COSTRUTTORE
	
	public ContoCorrente() {
		contatore++;
	}

	// COMPORTAMENTO

	@Override
	public String toString() {
		return "ContoCorrente [contatore=" + contatore + ", numConto=" + numConto + ", saldo=" + saldo + ", titolare="
				+ titolare + ", dataApertura=" + dataApertura + "]";
	}
	
	public void numeraConto() {
		numConto = contatore++;
	}
	
	public void versamento(double soldi) {
		saldo += soldi;
	}

	public void prelievo(double soldi) {
		saldo -= soldi;
	}
	
	public String stampaInfo() {
		return "Titolare: " + titolare + "\n Numero conto: " + numConto + "\n Saldo: " + saldo;
	}
	
	
	
	
}
