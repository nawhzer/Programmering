import javax.swing.*;

public class Ukeoppgave2tall
{
	public static void main(String[] args)
	{
		JTextArea ta = new JTextArea();
		ta.setText("Her er tallene du skrev inn,,, i motsatt rekkefølge... mwahwhwahwhawhhaw!\n");
		int [] tall = new int[10];
		String tallstring="";
		
		for(int i = 0; i<=9; i++)
		{
			tall[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn tall!!!!"));
		}
			
		
		for(int j=9;j>=0;j--)
		{
			ta.append(tall[j] + "\n");
		}			
		JOptionPane.showMessageDialog(null, ta);
	}
}