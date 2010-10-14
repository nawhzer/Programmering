
import javax.swing.JOptionPane;

public class Kontotest
{
	public static void main(String[] args)
	{
		// Opprette en konto

		Konto k = new Konto( "Henrik", 5404567081L, 1000000 );

		k.setSperret( true );

		JOptionPane.showMessageDialog(null, k.kontoUtskrift());

		k.setSperret( false);

		String tekst = k.uttak(100000);

		JOptionPane.showMessageDialog(null, tekst);

		tekst = k.innskudd(600000);

		JOptionPane.showMessageDialog(null, tekst);

		tekst = k.uttak(1500000);

		JOptionPane.showMessageDialog(null, tekst);



	}
}