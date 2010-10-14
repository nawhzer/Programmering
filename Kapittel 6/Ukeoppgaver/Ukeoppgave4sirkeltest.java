import javax.swing.*;

public class Ukeoppgave4sirkeltest
{
	public static void main(String[] args)
	{	
		double radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv inn sirkelens radius for christ's sake!!"));
		double radius2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv inn sirkelens radius for christ's sake!!"));
		
		Ukeoppgave4sirkel runding = new Ukeoppgave4sirkel(radius);
		Ukeoppgave4sirkel runding2 = new Ukeoppgave4sirkel(radius2);
		
		JOptionPane.showMessageDialog(null, runding/*.toString()*/ + "\n" + runding2)/*.toString()*/;
	}
}