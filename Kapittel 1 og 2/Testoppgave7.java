import javax.swing.JOptionPane;

public class Testoppgave7
{
	public static void main( String[] args)
	{
		
		String skrivinnsekunder = JOptionPane.showInputDialog("Skriv inn antall sekunder her");
		int sekunder = Integer.parseInt(skrivinnsekunder);
		
		int timer = sekunder/3600;
		int timeRest = sekunder%3600;
		int minutter = timeRest/60;
		int minuttRest = timeRest%60;
		
		JOptionPane.showMessageDialog( null, timer + " " + minutter + " " + minuttRest);
	
	}


}