import javax.swing.JOptionPane;


public class Maxtest
{
	public static void main(String[] args)
	{
		int min = lesHeltall("Skriv inn et tall:"); // leser det første

		for(int i = 1; i < 3; i++)                 // leser 9 tall til
		{
		  int tall = lesHeltall("Skriv inn et tall:");
		  if(tall < min)
		  	min = tall;
		}

		JOptionPane.showMessageDialog(null, " Det minste tallet er " + min);
	}

	 public static int lesHeltall(String s)
	  {
	  	 String t = JOptionPane.showInputDialog(s);
	  	 return Integer.parseInt(t);
	  }

}

