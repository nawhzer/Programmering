// Lars S. Grini, S173275

// Importerer klassen JOptionPane
import javax.swing.JOptionPane;

// Tar i mot data til og skriver ut data fra Kvittering-klassen
public class Kvitteringtest
{
	public static void main( String[] args )
	{
		
		
		String kode = JOptionPane.showInputDialog( null, "Skriv inn varekode her", 
													"HiO Java-shop", JOptionPane.INFORMATION_MESSAGE);
													
		String navn = JOptionPane.showInputDialog( null, "Skriv inn varens navn her", 
													"HiO Java-shop", JOptionPane.INFORMATION_MESSAGE);
													
		int antall = Integer.parseInt(JOptionPane.showInputDialog( null, "Skriv inn antall varer her", 
													"HiO Java-shop", JOptionPane.INFORMATION_MESSAGE));
			
		double pris = Double.parseDouble(JOptionPane.showInputDialog( null, "Skriv inn varepris:", 
													" HiO Java-shop", JOptionPane.INFORMATION_MESSAGE));
													
		// Oppretter et nytt kvittering-objekt
		Kvittering kvitt1 = new Kvittering ( kode, navn, antall, pris);
		 
		
		// Skriver ut kvitteringen på skjermen
		JOptionPane.showMessageDialog( null,"Varekode: " + kode +
											"\nVarenavn: " + navn + 
											"\nAntall: " + kvitt1.getAntallvarer() +
											"\nPris pr enhet: " + kvitt1.getVarepris() +
											"\nTotalpris = "  + kvitt1.beregnTotalpris(), 
											"KVITTERING", JOptionPane.INFORMATION_MESSAGE);
											
	} // Slutt på main-metoden
} // Slutt på Kvitteringtest-klassen