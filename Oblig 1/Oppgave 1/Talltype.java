// Lars S. Grini, S173275

// Importerer klassen JOptionPane
import javax.swing.JOptionPane;

/* Avgjør om tallet fra brukeren er partall eller oddetall og avgjør deretter om disse tallene er 
delelig på forhåndsbestemte tall samt. viser evt. rest om  de ikke er delelig med disse tallene*/
public class Talltype
{
	public static void main ( String[] args )
	{
		// Leser inn et tall fra brukeren
		String tallstring = JOptionPane.showInputDialog( null, "Skriv inn et heltall");
	
		// Tekststringen til et heltall
		int tall = Integer.parseInt(tallstring);
		
		// Avgjør om tallet som ble skrevet inn er partall eller oddetall
		int tallrest = tall%2;
	
		if (tallrest > 0)
			{
				int oddetall = tall/7;
				
				// Avgjør om tallet som brukeren skrev inn returnerer rest ved divisjon med tallet 7
				int oddetallrest = tall%7;
			
				if (oddetallrest == 0)
					JOptionPane.showMessageDialog( null, tall + " er et oddetall som er delelig med 7. Kvotient lik " + oddetall);
			
				if (oddetallrest > 0)
					JOptionPane.showMessageDialog( null, tall + " er et oddetall som ikke er delelig med 7. Kvotient lik " + oddetall + " , rest lik " + oddetallrest);
			}
	
		if (tallrest == 0)
			{
				int partall = tall/6;
				
				// Avgjør om tallet som brukeren skrev inn returnerer rest ved divisjon med tallet 6
				int partallrest = tall%6;
			
				if (partallrest == 0)
					JOptionPane.showMessageDialog( null, tall + " er et partall som er delelig med 6. Kvotient lik " + partall);
				
				if (partallrest > 0)
					JOptionPane.showMessageDialog( null, tall + " er et partall som ikke er delelig med 6. Kvotient lik " + partall + " , rest lik " + partallrest);
			}
	} // Slutt på main-metoden
} // Slutt på klassen Oppgave1