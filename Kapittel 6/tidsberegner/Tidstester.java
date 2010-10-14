import javax.swing.JOptionPane;

public class Tidstester
{
	public static void main(String[] args)
	{
		boolean flere = true;
		
		Tidsberegner klokke = new Tidsberegner();
		
		do
		{
			int timer = lesHeltall("Skriv inn antall timer");
			int minutter = lesHeltall("Skriv inn antall minutter");
			int sekunder = lesHeltall("Skriv inn sekunder");
			
			int sek = klokke.antSekunder(timer, minutter, sekunder);
			
			String utskrift = timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder = " + sek + " sekunder";
			
			JOptionPane.showMessageDialog(null, utskrift);
			
			int svar = 
				JOptionPane.showOptionDialog(null, "Vil du beregne flere verdier?", "Tid", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			
			flere = (svar == JOptionPane.YES_OPTION);
			
		}while( flere );
	}
	
	public static int lesHeltall(String s)
	{
		String t = JOptionPane.showInputDialog(s);
	 	return Integer.parseInt(t);
	}
	
}