// Lars S. Grini, S173275

// Importerer klassen JOptionpane
import javax.swing.JOptionPane;

// Tar imot data til og skriver ut data fra Kursboktest4-klassen
public class Kursboktest4
{
	public static void main( String[] args)
	{
		// Oppretter en  ny kursbok med forhndsbestemte verdier
		Kursbok4 bok1 = new Kursbok4("Java", 10, "Eva");
		
		bok1.visTittel();
		
		String navn = JOptionPane.showInputDialog( null, "Skriv inn kursnavn:", 
														 "NYE KURSDATA", JOptionPane.INFORMATION_MESSAGE );
														
		int poeng = Integer.parseInt(JOptionPane.showInputDialog( null, "Antall studiepoeng for kurset:",
																		"NYE KURSDATA", JOptionPane.INFORMATION_MESSAGE));
																		
		String lærer = JOptionPane.showInputDialog( null, "Faglærer for kurset", 
														  "NYE KURSDATA", JOptionPane.INFORMATION_MESSAGE);
		
		bok1.setKursnavn(navn);
		bok1.setStudiepoeng(poeng);
		bok1.setFaglærer(lærer);
		 
		
		bok1.visTittel();	
		
	} // Slutt på main-metoden
} // Slutt på Kursboktest4-klassen