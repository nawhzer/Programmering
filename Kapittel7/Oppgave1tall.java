import javax.swing.*;

public class Oppgave1tall
{
	public static void main(String[] args)
	{
		int [] tall = new int[10];
		String tallstring="";
		
		for(int i = 0; i<=9; i++)
		{
			tall[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn tall!!!!"));
		}
			
			
					
		JOptionPane.showMessageDialog(null, 
										tall[9] + "\n" +
										tall[8] + "\n" +
										tall[7] + "\n" +
										tall[6] + "\n" +
										tall[5] + "\n" +
										tall[4] + "\n" +
										tall[3] + "\n" +
										tall[2] + "\n" +
										tall[1] + "\n" +
										tall[0]);
	}
}