package de.telekom.sea7;

import javax.swing.JOptionPane;

public class Zahlung {

	String Ueberweisungsdatum;
	String Zahlungsempfaenger;
	String IBAN;
	int BIC;
	double Betrag;
	int TAN;
	String Verwendungszweck;
	String Name_Zahler;
	String IBAN_Zahler;
	int BIC_Zahler;

	public String getUeberweisungsdatum() {
		return Ueberweisungsdatum;
	}

	public void setUeberweisungsdatum(String ueberweisungsdatum) {
		Ueberweisungsdatum = ueberweisungsdatum;
	}

	public String getZahlungsempfaenger() {
		return Zahlungsempfaenger;
	}

	public void setZahlungsempfaenger(String zahlungsempfaenger) {
		Zahlungsempfaenger = zahlungsempfaenger;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public double getBetrag() {
		return Betrag;
	}

	public void setBetrag(double betrag) {
		Betrag = betrag;
	}

	public int getTAN() {
		return TAN;
	}

	public void setTAN(int tAN) {
		TAN = tAN;
	}

	public String getVerwendungszweck() {
		return Verwendungszweck;
	}

	public void setVerwendungszweck(String verwendungszweck) {
		Verwendungszweck = verwendungszweck;
	}

	public String getName_Zahler() {
		return Name_Zahler;
	}

	public void setName_Zahler(String name_Zahler) {
		Name_Zahler = name_Zahler;
	}

	public String getIBAN_Zahler() {
		return IBAN_Zahler;
	}

	public void setIBAN_Zahler(String iBAN_Zahler) {
		IBAN_Zahler = iBAN_Zahler;
	}

	public int getBIC() {
		return BIC;
	}

	public void setBIC(int bIC) {
		BIC = bIC;
	}

	public int getBIC_Zahler() {
		return BIC_Zahler;
	}

	public void setBIC_Zahler(int bIC_Zahler) {
		BIC_Zahler = bIC_Zahler;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zahlung abfall = new Zahlung();
		abfall.setUeberweisungsdatum("12.02.2022");
		abfall.setZahlungsempfaenger("Stadtverwaltung");
		abfall.setIBAN("DE1111111111");
		abfall.setBIC_Zahler(1111111);
		abfall.setBetrag(110.12);
		abfall.setName_Zahler("Max Mustermann");
		abfall.setIBAN_Zahler("DE222222222");
		abfall.setVerwendungszweck("Abfallgebuehr");

		Zahlung grundsteuer = new Zahlung();
		grundsteuer.setUeberweisungsdatum("12.02.2022");
		grundsteuer.setZahlungsempfaenger("Stadtverwaltung");
		grundsteuer.setIBAN("DE1111111111");
		grundsteuer.setBIC_Zahler(1111111);
		grundsteuer.setBetrag(130.13);
		grundsteuer.setName_Zahler("Max Mustermann");
		grundsteuer.setIBAN_Zahler("DE222222222");
		grundsteuer.setVerwendungszweck("Grundsteuer");

		String eingabe = JOptionPane.showInputDialog("Welchen Betrag willst Du sehen ?");

		if (eingabe.contentEquals("Abfall"))
			System.out.println("Ueberweisungsdatum: " + abfall.getUeberweisungsdatum());
			System.out.println("Zahlungsempfaenger: " + abfall.getZahlungsempfaenger());
			System.out.println("IBAN: " + abfall.getIBAN());
			System.out.println("BIC: " + abfall.getBIC());
			System.out.println("Betrag: " + abfall.getBetrag());
		
		if (eingabe.contentEquals("Steuer"))
			System.out.println("Ueberweisungsdatum: " + grundsteuer.getUeberweisungsdatum());
			System.out.println("Zahlungsempfaenger: " + grundsteuer.getZahlungsempfaenger());
			System.out.println("IBAN: " + grundsteuer.getIBAN());
			System.out.println("BIC: " + grundsteuer.getBIC());
			System.out.println("Betrag: " + grundsteuer.getBetrag());
	

	}

}
