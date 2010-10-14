import javax.swing.JOptionPane;

public class Koppgave9
{
	public static void main( String[] args)
	{
		int sum = 0;
		int start = Integer.parseInt(JOptionPane.showInputDialog( null, "Skriv inn tall min")); 
		
		int stopp;
		do
		{
			stopp = Integer.parseInt(JOptionPane.showInputDialog( null, "Skriv inn tall max"));
		} while( stopp < start );
		
		for( int i = start; i<= stopp; i+=1)
		{
			sum += i;	
		}
		JOptionPane.showMessageDialog( null, sum);
	}
}