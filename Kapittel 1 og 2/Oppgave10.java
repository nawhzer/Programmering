import javax.swing.JOptionPane;

public class Oppgave10
{
	public static void main( String[] args)
	{
	int m = 5;
	int n = -7;
	
	JOptionPane.showMessageDialog( null, (m < n) + 
									"\n" + (n>=m) + 
									"\n" + (n<=m) + 
									"\n" + (n>m) + 
									"\n" + (m!=n) + 
									"\n" + (m==n));
	
	}

}