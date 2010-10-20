// Lars S. Grini, S173275

// Importerer klassen JOptionPane
import javax.swing.JOptionPane;

/* Tar imot et tall(pris) fra brukeren og veksler samt skriver ut hvor mange mynter
 av hvert slag brukeren skal ha igjen gitt at h*n betalte med en 100-lapp*/
public class Veksleautomat
{
	public static void main( String[] args)
	{
		
		// Leser inn prisen på varen
		String pengestring = (JOptionPane.showInputDialog( null, "Du betaler en vare med en 100-lapp\n"
															+ " Hva er prisen på varen?")); 
		
		// Konverterer pengestring til et desimaltall
		double pengertilbake = Double.parseDouble(pengestring);	
		
		// Regner ut hvor mange kroner brukeren skal ha tilbake
		double pengerdouble = 100-pengertilbake;						
		
		// Konverterer fra desimall til heltall
		int pengerdoubleint = (int) pengerdouble;
	
		// Gir brukeren en feilmelding om h*n har skrevet for høyt beløp
		if (pengertilbake>100)
			JOptionPane.showMessageDialog( null, "DU DIN SNIK.. Dette haddde du ikke råd til...", " Blakk..? ", JOptionPane.ERROR_MESSAGE);
	
		// Gir brukeren melding om at prisen var like høy som den betalte summen	
		if (pengertilbake == 100)
			JOptionPane.showMessageDialog( null, "Ingen penger tilbake");
			
		// Gir brukeren en melding om at varen var gratis
		if (pengertilbake == 0)
			JOptionPane.showMessageDialog( null, "Dette var jo gratis, så du kan beholde 100-lappen din du:)");
			
		// Regner ut hvor mange mynter brukeren skal ha tilbake
		if ((pengertilbake<100) && (pengertilbake>0))
			{
				
				// Initialiserer en tom utskriftsstring og setter av plass i minnet til stringen utskrift
				String utskrift = "";
				
				// Konverterer fra desimalltall til heltall
				int penger = (int) pengerdouble;
				
				
				int femtikroner = penger/50;
				if (femtikroner>0)
					utskrift = utskrift + femtikroner + " 50-lapp";
		
		
				int tjuekroner = penger%50;
				int antalltjuekroner = tjuekroner/20;
				if (antalltjuekroner>0)
				{
					utskrift = utskrift + "\n" + antalltjuekroner + " 20-krone";
					
					if (antalltjuekroner>1)
						utskrift = utskrift + "r";
				}
					
				int tikroner = tjuekroner%20;
				int antalltikroner = tikroner/10;
				if (antalltikroner>0)
				{
					utskrift = utskrift + "\n" + antalltikroner + " 10-krone";
			
				}
		
				int femkroner = tikroner%10;
				int antallfemkroner = femkroner/5;
				if (antallfemkroner>0)
				{
					utskrift = utskrift + "\n" + antallfemkroner + " 5-krone";

				}
		
				int kronestykker = femkroner%5;
				int antallkronestykker = kronestykker/1;
				if (antallkronestykker>0)
				{
					utskrift = utskrift + "\n" + antallkronestykker + " 1-krone";
						
					if ( antallkronestykker>1)
						utskrift = utskrift + "r";
				}
			
				double kronestykkerdouble = pengerdouble-pengerdoubleint;
				double antallfemtiøre = kronestykkerdouble/0.5;
				if(antallfemtiøre>0)
				{
					int femtiøre = (int) antallfemtiøre;
					
					if (femtiøre>0)
						utskrift = utskrift + "\n" + femtiøre + " 50-øre";
				}
				
				// Viser hva brukeren får tilbake av mynter
				JOptionPane.showMessageDialog( null, utskrift);
			}								
		
	} // Slutt på main-metoden

} // Slutt på klassen Oppgave2