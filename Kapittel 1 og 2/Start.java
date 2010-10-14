import javax.swing.JOptionPane;

public class Start
{
	public static void main( String[] args )
	{
		String navn;
		navn = JOptionPane.showInputDialog( "Hva heter du?");
		String utskrift;
		utskrift = "Hei på deg " + navn;
		JOptionPane.showMessageDialog( null, utskrift );
	
	}
}