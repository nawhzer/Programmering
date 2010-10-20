import javax.swing.*;
import java.awt.*;

public class Ukeoppgave1
{
	public static void main(String [] args)
	{
		JTextArea ta = new JTextArea();
		ta.setFont( new Font( "Monospaced", Font.PLAIN, 20 ) );
		ta.setText( "Stjerner\n\n" );
		
		String b;
		int c;
		
		for(int i=0;i<10; i++)
		{
			b = JOptionPane.showInputDialog("Skriv inn tall");
			c = Integer.parseInt(b);
			if(c>=1 && c<=50)
			{
				for(int j = 0; j<c;j++)
					ta.append("*");
				ta.append("\n");
			}
			else
				ta.append("\n");
			
		}
		JOptionPane.showMessageDialog(null, ta);
	}
}