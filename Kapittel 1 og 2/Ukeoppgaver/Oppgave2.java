import javax.swing.JOptionPane;

public class Oppgave2
{
	public static void main( String[] args )
	{
		double førstetall = Double.parseDouble(JOptionPane.showInputDialog( null, "skriv inn første desimaltall her") );
		double andretall = Double.parseDouble(JOptionPane.showInputDialog( null, "skriv inn andre desimaltall her") );
		
		double sum = førstetall + andretall;
		double produkt = førstetall * andretall;
		double diff = førstetall - andretall;
		double div = førstetall / andretall;
		
		JOptionPane.showMessageDialog( null, førstetall + " + " + andretall + " = " + sum + "\n" 
											+ førstetall + " * " + andretall + " = " + produkt + "\n"
											+ førstetall + " - " + andretall + " = " + diff + "\n"
											+ førstetall + " / " + andretall + " = " + div );
		
		
	
	}

}