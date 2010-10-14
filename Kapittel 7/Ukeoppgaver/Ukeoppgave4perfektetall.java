import javax.swing.*;
//Programmet klarer kun å skrive ut riktig verdi for de fem første
//ekte tallene
public class Ukeoppgave4perfektetall
{
	public static void main(String [] args)
	{
		int[] primtall = {2, 3, 5, 7, 13, 17, 19, 31, 61,
						  89, 107, 127, 521, 607, 1279};
		
		double[] perfekt = new double[16];
		
		String output = "";
		
		for(int i=0;i<primtall.length;i++)
		{
			perfekt[i+1]=(Math.pow(2, primtall[i]-1))*((Math.pow(2,primtall[i])-1));
		}
		
		int max = Integer.parseInt(JOptionPane.showInputDialog(null, "max"));
		
		for(int j=1;j<perfekt.length;j++)
		{
			if(perfekt[j]<=max)
				output += (int) perfekt[j] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, output);
	}
}