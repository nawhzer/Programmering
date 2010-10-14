import javax.swing.JOptionPane;

public class Porto
{
	
	public static void main( String[] args)
	{
	 
		double vekt = 0.0;
		double porto = 0.0;
	
		while (vekt>=0) 
		{
			vekt = Double.parseDouble(JOptionPane.showInputDialog( null, "Skriv inn brevets vekt i gram"));
	
			if ( vekt < 0)
				JOptionPane.showMessageDialog( null, "Programmet avsluttes");
	
			else if ( vekt <= 20 )
    		{
				porto = 8.50;
				JOptionPane.showMessageDialog( null, "Porto: " + porto);
			}
		
   			else if ( vekt <= 50 )
    		{
				porto = 13.00;
				JOptionPane.showMessageDialog( null, "Porto: " + porto);
			}
 		
  			else if ( vekt <= 100 )
    		{
				porto = 16.00;
				JOptionPane.showMessageDialog( null, "Porto: " + porto);
			}
		
 			else if ( vekt <= 350 )
   			{
				porto = 26.00;
				JOptionPane.showMessageDialog( null, "Porto: " + porto);
			}
		
  			else if ( vekt <= 1000 )
    		{
				porto = 63.00;
				JOptionPane.showMessageDialog( null, "Porto: " + porto);
			}
		
  			else if ( vekt <= 2000 )
    		{
				porto = 140.00;
				JOptionPane.showMessageDialog( null, "Porto: " + porto);
			}
		
			else if ( vekt > 2000)
				JOptionPane.showMessageDialog( null, "Beklager, brevet er for tungt", "TOO GOT DAMN HEAVY q><p ", JOptionPane.WARNING_MESSAGE);
	
		}
	}
}