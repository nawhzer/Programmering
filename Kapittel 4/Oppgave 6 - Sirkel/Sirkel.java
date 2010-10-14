import javax.swing.*;

public class Sirkel
{
	public static void main( String[] args)
	{
		double radius = 0.0;
		
		while (radius >=0)
		{
			radius = Double.parseDouble(JOptionPane.showInputDialog( null, "Skriv inn sirkelens radius her"));
			
			if(radius<0)
				JOptionPane.showMessageDialog( null, "Programmet avsluttes");
			else
			{
				double areal = radius*radius*3.14;
				double omkrets = 2*3.14*radius;
				JOptionPane.showMessageDialog( null, "Sirkelens areal er " + areal +"\nSirkelens omkrets er " + omkrets);
			}
			
		}
	} // Slutt på main-metoden
} // Slutt på Sirkel-klassen