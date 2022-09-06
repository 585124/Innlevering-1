package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave2 {
	
	/*
	 * Programmet leser inn en poengscore mellom 0 og 100.
	 * Koden leser tallet vi skriver inn og tildeler poengscoren til en bestemt karakter.
	 * 
	 */

	public static void main(String[] args) {

		
		//Karakterer
		String a = "Karakter: A";
		String b = "Karakter: B";
		String c = "Karakter: C";
		String d = "Karakter: D";
		String e = "Karakter: E";
		String f = "Karakter: F";
		//Feilmelding om verdien er over 100 eller under 0
		String feilMelding = "Verdien er ikke lovlig";
		
		
		
		String skrivPoeng = showInputDialog("Skriv inn antall poeng: ");
		int poeng = parseInt(skrivPoeng);
		
		if (poeng <= 100 && poeng >= 90) {
			showMessageDialog(null, a);
		
		}else if (poeng <= 89 && poeng >= 80) {
			showMessageDialog(null, b);
		
		}else if (poeng <= 79 && poeng >= 60) {
			showMessageDialog(null, c);
		
		}else if (poeng <= 59 && poeng >= 50) {
			showMessageDialog(null, d);
		
		}else if (poeng <= 49 && poeng >= 40) {
			showMessageDialog(null, e);
		
		}else if (poeng <= 39 && poeng >= 0) {
			showMessageDialog(null, f);
		
		}else {
			showMessageDialog(null, feilMelding);
		}
		
	}

}
