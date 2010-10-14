import javax.swing.*;

public class Datotest
{
	public static void main(String [] args)
	{
		String fnr = JOptionPane.showInputDialog(null, "skriv inn et fødselsnummer (11 siffer)");
		if(Dato.lovligPersonnummer(fnr))
			JOptionPane.showMessageDialog(null, "gyldig personnummer");
		else if(Dato.lovligPersonnummer(fnr)==false)
			JOptionPane.showMessageDialog(null, "Ugyldig personnummer", null,  JOptionPane.WARNING_MESSAGE);
	}
}