import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class UkeOppg6Potenstabell
{
	public static int power(int x, int y)
	{
		int potens = 1;

		for( int i = 1; i <= y; i++)
			potens *= x;

			return potens;
	}


	public static void potenser(int startverdi, int makseksponent, int antall)
	{
		JTextArea tekstområde = new JTextArea();

		for ( int j = startverdi; j <= makseksponent;j++)
			tekstområde.append(j + ". potens\t");


		tekstområde.append("\n");

		for (int k = startverdi; k < startverdi + antall; k++)
		{
			for (int l = 1; l <= makseksponent; l++)
			{
				tekstområde.append(power(k,l) + "\t");
			}

			tekstområde.append("\n");
		}

		JOptionPane.showMessageDialog(null, tekstområde, "potenser", JOptionPane.INFORMATION_MESSAGE);
	}
}



