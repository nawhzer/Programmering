import javax.swing.JOptionPane;

public class Oppgave6
{
	public static void main( String[] args )
	{
		String fornavn;
		fornavn = JOptionPane.showInputDialog( "Hei, hva er ditt fornavn?" );

		String etternavn;
		etternavn = JOptionPane.showInputDialog( "og ditt etternavn?" );
		
		String fødselsårString = JOptionPane.showInputDialog( "Hei " + fornavn + " " + etternavn +" Hvilket år er du født?");
		int fødselsår = Integer.parseInt(fødselsårString);
		
		int år = 2010;
		
		JOptionPane.showMessageDialog( null, fornavn + ", i år fyller du " + (år-fødselsår) );
		
		
	}
}