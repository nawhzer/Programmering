import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class SirkelTest
{
	public static void main(String[] args)
	{
		
		DecimalFormat fo = new DecimalFormat("0.00");
		
		double radius = 
			Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv radius"));
	
		Sirkel test = new Sirkel(radius);
		
		
		JOptionPane.showMessageDialog(null, "Sirkelens radius er: " + fo.format(test.getRadius()) + 
											"\nSirkelens diameter :" + fo.format(test.diameter(radius)) +
											"\nSirkelens omkrets: " + fo.format(test.omkrets(radius)) + 
											"\nSirkelens areal: " + fo.format(test.areal(radius)) );
		
	}
}