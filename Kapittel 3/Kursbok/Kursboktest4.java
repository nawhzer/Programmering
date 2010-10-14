import javax.swing.JOptionPane;

public class Kursboktest4
{
	public static void main( String[] args)
	{
		Kursbok4 bok1 = null, bok2 = null;
		
		String navn = JOptionPane.showInputDialog( null, "Skriv inn kursnavn:" );
		int poeng = Integer.parseInt(JOptionPane.showInputDialog( null, "Antall studiepoeng for kurset:"));
		String lærer = JOptionPane.showInputDialog( null, "Faglærer for kurset");
		
		bok1 = new Kursbok4( navn, poeng, lærer); 
		
		int svar = JOptionPane.showOptionDialog( null, "Vil du opprette en kursbok til?", 
												"Opprette flere kursbøker?", JOptionPane.YES_NO_OPTION, 
												JOptionPane.QUESTION_MESSAGE, null, null, null );
		
		if ( svar == JOptionPane.YES_OPTION )
		{
			navn = JOptionPane.showInputDialog( "Skriv inn kursnavn:");
			poeng = Integer.parseInt(JOptionPane.showInputDialog( null, "Antall studiepoeng for kurset:"));//TEST
			lærer = JOptionPane.showInputDialog( null, "Faglærer for kurset"); //TEST
			bok2 = new Kursbok4(navn, poeng, lærer);
		}
		
		String info = "Har opprettet kursbøker for følgende fag:\n";
		info = info + bok1.getKursnavn() + ": Antall studiepoeng: " + bok1.getStudiepoeng() + ", Faglærer: " + bok1.getFaglærer();
		if ( bok2 != null )
			info = info + "\n" + bok2.getKursnavn() + ": Antall studiepoeng:" + bok2.getStudiepoeng() + ", Faglærer:" + bok2.getFaglærer();
			
		JOptionPane.showMessageDialog( null, info, "Registrert kursnavn:", 
										JOptionPane.PLAIN_MESSAGE);
										
		
		
	}
}