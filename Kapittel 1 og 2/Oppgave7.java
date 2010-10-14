import javax.swing.JOptionPane;

public class Oppgave7
{
	public static void main( String[] args)
	{
		String sekunderString = JOptionPane.showInputDialog( null, "Skriv inn antall sekunder her", "Sekunder", JOptionPane.WARNING_MESSAGE);
		int skrivinnsekunder = Integer.parseInt(sekunderString);
		
		int timer = skrivinnsekunder/3600;		// Her gjør vi om sekunder til timer
		int timeRest = skrivinnsekunder%3600;	// Her finner vi antall timer som skal gjøres om til minutter
		int minutter = timeRest/60;				// 
		int minuttRest = timeRest%60;			// Her finner vi antall sekunder
	
		
		JOptionPane.showMessageDialog( null, sekunderString + " = " + timer + " timer, " + minutter + " minutter, " + minuttRest + " sekunder");
		
	}
	
}