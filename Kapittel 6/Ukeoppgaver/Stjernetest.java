import javax.swing.*;
import java.awt.*;

public class Stjernetest
{
	public static void main(String[] args)
	{
		JTextArea ta = new JTextArea();
		ta.setFont( new Font( "Monospaced", Font.PLAIN, 20 ) );
		ta.setText("");
		
		int a = 11;
		int b = 0;
		
		for(int i=1;i<=10;i++)
		{
			a--;
			b++;
			
			for(int j=1; j<=b;j++)
				ta.append("*");
			
			for(int k=1; k<=a; k++)
				ta.append("");
			
			ta.append("\n");
		}
		
		
		JOptionPane.showMessageDialog(null, ta);
	}
}