import javax.swing.JOptionPane;

public class Koppgave7
{
	public static void main(String [] args)
	{
		int i = 0;
		int antall = 0;
		
		while( i >= 0)
		{
			i = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn et tall her"));
			if( 10 < i && i < 50)
				antall++;
				
		}
		
		JOptionPane.showMessageDialog(null, "Du skrev inn " + antall + " tall mellom 10 og 50");
	}
}