import javax.swing.JOptionPane;

public class Storst
{
	public static void main( String[] args)
	{
		
		
		int max = 0;
		int nestStorst = 0;

		for( int i = 0; i <= 9; i++)
		{	
			int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall:"));
			
			if(tall>max)
			{
				nestStorst=max;
				max=tall;
			}
			
			else if(tall>nestStorst)
			{
				nestStorst=tall;
			}
			
			
				
		}
		
		JOptionPane.showMessageDialog(null, "Det største tallet er " + max + "\n Og det nest største er; " + nestStorst );
		
	}	
	
}