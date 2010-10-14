
import javax.swing.JOptionPane;

public class Ukedag
{
	public static void main(String[] args)
	{
		String ukedag = JOptionPane.showInputDialog(null, "tast inn et tall:)");
		int dag = Integer.parseInt(ukedag);
		if(dag>0)
		{
			switch( dag )
			{
				case 1: ukedag = "Mandag";
						break;
				case 2: ukedag = "Tirsdag";
						break;
				case 3: ukedag = "Onsdag";
						break;
				case 4: ukedag = "Torsdag";
						break;
				case 5: ukedag = "Fredag";
						break;
				case 6: ukedag = "Lørdag";
						break;
				case 7: ukedag = "Søndag";
						break;
				default: ukedag = "Ukjent dag";
			}
			JOptionPane.showMessageDialog(null, "Dagen er " + ukedag);
		}
	}
}
