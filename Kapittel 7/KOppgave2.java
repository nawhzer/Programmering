import javax.swing.*;


public class KOppgave2
{
	public static void main(String[]args)

	{	JTextArea textområde = new JTextArea();
		String [] antall = new String[10];

		int x;

	 	for(int i = 0; i <antall.length; i ++)
	 	{
			String stars = " ";
			x = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tall"));


			if(x>=1 && x<=50)
			{
				for(int j=0;j<x;j++)

				{
					stars+="*";
				}

				stars+="\n";

			}

			else
			{

				stars+="\n";

			}


			antall[i] = stars;
		}

		JOptionPane.showMessageDialog(null, antall[0]+
											antall[1]+
											antall[2]+
											antall[3]+
											antall[4]+
											antall[5]+
											antall[6]+
											antall[7]+
											antall[8]+
											antall[9]);








	}


}