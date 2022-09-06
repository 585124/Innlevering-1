package no.hvl.dat100;

import static java.lang.Long.parseLong;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave3 {

	public static void main(String[] args) {
		/*
		 * Lag et program som leser inn et heltall n>0
		 * og beregner verdien n! og skriver ut verdien til n!
		 * ut på skjermen, der n! = 1*2*3*4....*
		 */
		
		
		//Skriver ut og henter innlest tall, for eksempel 5!
		String tall = showInputDialog("Skriv inn tall: ");
		long tallUt = parseLong(tall);
		//Skriver ut verdien til for eksempel 5!
		showMessageDialog(null, factorial(tallUt));
		

	}
	
	public static long factorial(long n) {
		//Dersom innlest verdi bare er 1, så returnerer vi 1
		if (n == 1) {
			return 1;
		/*
		 * Dersom programmet leser inn en annen verdi så vil den 
		 * regne ut. Eksempel 5! utføres ved at vi ganger 5 med neste 
		 * faktor som blir 4 osv...	
		 */
		}else {
			return  n * factorial(n - 1);	
		}
		
	}

}
 