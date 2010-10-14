import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Koppgave8
{
	public static void main(String [] args)
	{
		int i = 0;
		int antall = 0;
		double sum = 0;
		
		DecimalFormat fo = new DecimalFormat("0.00");
		
		while( i >= 0)
		{
			i = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn et tall her"));
			
			if( 10 < i && i < 50)
			{
				antall++;
				sum += i;
			}			
		}
		double antalldouble = (double) antall;
		double gjennomsnitt = sum/antalldouble;
		
		if(sum == 0)
			JOptionPane.showMessageDialog(null, "Summen av tallene du skrev inn er lik 0");
		if(sum > 0)
			JOptionPane.showMessageDialog(null, "Du skrev inn " + antall + " tall mellom 10 og 50\n"
												+ "med totalsum " + sum + " og gjennomsnitt " + fo.format(gjennomsnitt));
	}
}