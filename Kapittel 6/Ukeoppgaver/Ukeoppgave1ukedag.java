import javax.swing.*;

public class Ukeoppgave1ukedag
{
	public static void main(String[] args)
	{
		int ukedag = lesHeltall("Skriv inn tall");
		String utskrift = "";
		
		if (ukedag > 0)
		{
			switch( ukedag )
			{
				case 1: utskrift = "Mandag";
							break;
				case 2: utskrift = "Tirsdag";
							break;
				case 3: utskrift = "Onsdag";
							break;
				case 4: utskrift = "Torsdag";
							break;
				case 5: utskrift = "Fredag";
							break;
				case 6: utskrift = "Lørdag";
							break;
				case 7: utskrift = "Søndag";
							break;
				default: utskrift = "Ukjent ukedag";
			}
			JOptionPane.showMessageDialog(null, utskrift);
		}
		
	}
	
	public static int lesHeltall(String s)
	{
		String t = JOptionPane.showInputDialog(s);
		return Integer.parseInt(t);
	}
}