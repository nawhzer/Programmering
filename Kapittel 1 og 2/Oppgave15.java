import javax.swing.JOptionPane;

public class Oppgave15

{
	public static void main( String[] args)
	{
		String førstesifferstring = JOptionPane.showInputDialog( null, "Skriv inn første tall her");
		String andresifferstring = JOptionPane.showInputDialog( null, "Skriv inn andre tall her");
		String tredjesifferstring = JOptionPane.showInputDialog( null, "Skriv inn tredje tall her");
		
		int a = Integer.parseInt(førstesifferstring);
		int b = Integer.parseInt(andresifferstring);
		int c = Integer.parseInt(tredjesifferstring);
		
		int minst;
		
		minst = a;
		
		if (b<minst)
			minst = b;
		if (c<minst)
			minst = c;
			
		JOptionPane.showMessageDialog( null, minst + " er det minste tallet");
	
	
	}
	


}