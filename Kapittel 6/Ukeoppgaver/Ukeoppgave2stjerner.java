import javax.swing.*;
import java.awt.*;

public class Ukeoppgave2stjerner
{
	public static void main(String[] args)
	{
		JTextArea ta = new JTextArea();
		ta.setFont( new Font( "Monospaced", Font.PLAIN, 20 ) );
		
		ta.setText("");
		int a = 11;
		int b = 0;
		
		for( int i = 1; i <= 10; i++)
		{
			a--;
			b++;
			
			for(int j = 1; j <= b; j++)
				ta.append("*");
			
			for(int k = 1; k <= a; k++)
				ta.append(" ");
			
			for(int l = 1; l <= a; l++)
				ta.append("*");
			
			for(int m = 1; m <= b; m++)
				ta.append(" ");
				
			for(int n = 1; n <= b; n++)
				ta.append(" ");
				
			for(int o = 1; o <= a; o++)
				ta.append("*");
			
			for(int p = 1; p <= a; p++)
				ta.append(" ");
			
			for(int q = 1; q <= b; q++)
				ta.append("*");
			
			ta.append("\n");
		}
		JOptionPane.showMessageDialog(null, ta);		
	}
}