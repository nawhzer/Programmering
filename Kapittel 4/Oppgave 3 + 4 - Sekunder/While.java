import javax.swing.*;

public class While
{
	public static void main( String[] args)
	{	
		int tid = 0;
	  	while ( tid >= 0 )
	  	{
			tid = Integer.parseInt(JOptionPane.showInputDialog( null, "Skriv inn tid i antall sekunder her. Avslutt ved å skrive et nagativt tall"));
			
			String utskrift;
			utskrift = tid + " sekunder tilsvarer ";
			if ( tid < 0)
				JOptionPane.showMessageDialog( null, "Programmet avsluttes");
				
			else
			{	
				int timer = tid/3600;
				if (tid>=3600)
					utskrift = utskrift + timer + " timer ";
			
				int minutter = (tid%3600)/60;
				if (tid>=60)
					utskrift = utskrift + minutter + " minutter og ";
				
				int sekunder = tid%60;
				utskrift = utskrift + sekunder + " sekunder";
				
		    	JOptionPane.showMessageDialog( null, utskrift);
			}
		}
	}
}