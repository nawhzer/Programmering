import javax.swing.*;
import java.awt.*;

public class Oppgave2tall
{
	public static void main(String[] args)
	{
		
		JTextArea ta = new JTextArea();
		ta.setFont( new Font( "Monospaced", Font.PLAIN, 15 ) );
		ta.setText("Antall tall konvertert til stjernermuawhawhawhawhawh!\n\n");
		
		int [] tall = new int[10];
		
		String tallstring="";
		
		for(int i = 0; i<tall.length; i++)
		{
			tall[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn tall!!!!"));
			
			for( int j = 0; j<tall[i]; j++)
			{
				if(tall[i]>=1 && tall[i]<=50)
					tallstring += "*";
				else
					tallstring += " ";
			}
			tallstring += "\n";
		}
		
		ta.append(tallstring);
					
		JOptionPane.showMessageDialog(null, ta);
	}
}