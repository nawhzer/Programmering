import javax.swing.JOptionPane;

public class Sum
{
	public static void main( String[] args)
	{
		int sum = 0;
		for( int i=0; i<=100; i+=1)
		{	
			sum += i;
		}
		JOptionPane.showMessageDialog( null, sum);
	}
}