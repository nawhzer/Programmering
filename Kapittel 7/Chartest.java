import javax.swing.*;

public class Chartest
{
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("YEEEEEES");
		
		char[] vokaler = {'a', 'e', 'i', 'o', 'u', 'y', 'æ', 'æ', 'å'};
		
		int antall = 0;
		
		String output = " vokaler i innlest tekst\n ";
		
		for(int i = 0; i<input.length(); i++)
		{
			for(int j = 0; j<vokaler.length; j++)
			{
				if(input.charAt(i)==vokaler[j])
				{
					antall++;
					output+= input.charAt(i) + " ";
					
					if(antall%5 == 0)
						output+="\n";
				}
			}
		}
		JOptionPane.showMessageDialog(null, antall + output);
	}
}