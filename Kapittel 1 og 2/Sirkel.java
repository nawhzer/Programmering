import javax.swing.*;
import java.text.DecimalFormat;

public class Sirkel
{
	public static void main( String[] args)
	{
		
		DecimalFormat fo = new DecimalFormat("###,###.##");
		double radius = Double.parseDouble(JOptionPane.showInputDialog( null, "Skriv inn sirkelens radius her"));
		double areal = radius*radius*3.14;
		
		JOptionPane.showMessageDialog( null, "Sirkelens areal er " + fo.format(areal));
		
	} // Slutt på main-metoden
} // Slutt på Sirkel-klassen