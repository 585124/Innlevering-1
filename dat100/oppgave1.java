package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.String.*;

public class oppgave1 {

	public static void main(String[] args) {

		/*
		 * Lag et program som leser inn bruttoinntekt,
		 * beregner og skriver ut trinnskatten.
		 * **********INNLEVERIUNG*******************
		 * 
		 */
		
		//Variabler for oppgitte lønnsgrenser til trinnskatten
		int trinn1 = 164101;
		int trinn2 = 230951;
		int trinn3 = 580651;
		int trinn4 = 934051;
		//Velger å lage variabel her så eg ikke trenger å skrive noe i showInputDialog
		String forsteMelding = "Skriv inn bruttoinntekt";
		//Henter ut verdien som brukeren skriver inn
		String melding = showInputDialog(forsteMelding);
		double hentInntekt = parseInt(melding);
		//Kode for satsen som ganges med inntekten som brukeren skriver inn
		double sats1 = (0.93 * hentInntekt) / 100; 
		double sats2 = (2.41 * hentInntekt) / 100;
		double sats3 = (11.52 * hentInntekt) / 100;
		double sats4 = (14.52 * hentInntekt) / 100;
		
		
		if (hentInntekt < trinn1) {
			showMessageDialog(null, "Ingen trinnskatt");
		}else if (hentInntekt > trinn1 && hentInntekt < trinn2) {
			showMessageDialog(null, "Trinnskatt 1 \n Du må betale: " + sats1);
									
		}else if (hentInntekt > trinn2 && hentInntekt < trinn3) {
			showMessageDialog(null, "Trinnskatt 2 \n Du må betale: " + sats2);
		
		}else if (hentInntekt > trinn3 && hentInntekt < trinn4) {
			showMessageDialog(null, "Trinnskatt 3 \n Du må betale: " + sats3);
		
		}else if (hentInntekt > trinn4) {
			showMessageDialog(null, "Trinnskatt 4 \n Du må betale: " + sats3);
		}
		System.out.println("Programm avsluttet");
		
}

}
