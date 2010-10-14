import javax.swing.JOptionPane;

public class Oppgave14
{
	public static void main( String[] args)
	{
		String førstesifferstreng = JOptionPane.showInputDialog( null, "Skriv inn et tall for å undersøke om det er delelig med 3");
		String resultat;
	
		int tall = Integer.parseInt(førstesifferstreng);
	
		resultat = "";
	
		if ( tall % 3 > 0 )
			resultat = resultat + tall + " er ikke delelig med 3!!! Dette burde du vite...";
	
		// if ( tall % 3 == 0 ) 
		// Modifisert 09.09.10
		else
			resultat = resultat + "Gratulerer!! " + tall + " er delelig med 3!!! \n" + tall +"/3 = " + (tall/3);  
	
		JOptionPane.showMessageDialog( null, resultat);
	}

}