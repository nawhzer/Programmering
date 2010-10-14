import javax.swing.JOptionPane;

public class Klipperhastighet
{
	public static void main( String[] args)
	{
		int plenlengde = Integer.parseInt(JOptionPane.showInputDialog( null, "Skriv inn plenens lengde her"));
		int plenbredde = Integer.parseInt(JOptionPane.showInputDialog( null, "Skriv inn plenens bredde her"));
		int huslengde = Integer.parseInt(JOptionPane.showInputDialog( null, "Skriv  inn husets lengde her"));
		int husbredde = Integer.parseInt(JOptionPane.showInputDialog( null, "Skriv inn husets bredde her"));
		
		int plenareal = plenbredde * plenlengde;
		int husareal = huslengde * husbredde;
		
		if (plenareal>husareal)
			JOptionPane.showMessageDialog( null, "Plenareal kan ikke være større enn husareal!", "Feil", JOptionPane.WARNING_MESSAGE);
			
		
		
		
		double klippehastighet = 0.4;
		double klippetid = plenareal/klippehastighet;
		int klippehastighetint = (int) klippetid;
		
		
		int klippetimer = klippehastighetint/3600;
		int klippetimerest = klippehastighetint%3600;
		int klippeminutter = klippetimerest/60;
		int klippeminuttrest = klippehastighetint%60;
		
		JOptionPane.showMessageDialog( null, "Det vil ta ca " + klippetimer + " timer, " + klippeminutter + " minutter og " + klippeminuttrest + " sekunder");
		
			
	}
}