import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Random
{
	public static void main(String[] args)
	{
		JTextArea to = new JTextArea();
		to.setText("Her er noen forskjellige tall\n");
		int i = 0;
		
		for(int j = 0; j<=100; j++)
		{
			i = (int) (Math.random()*100);
			to.append(i + " ");
			
		}
		
		JOptionPane.showMessageDialog(null, to);
		
	}
}




if(tall>max)
	{
		firemax = max;
		tremax = max;
		nmax = max;
		max=tall;
	}

else if(tall>nmax)
	{
		nmax=tall;
	}

else if ( tall > tremax)
	{
		tremax = tall;
	}

else if (tall > firemax)
	{
		firemax = tall;
	}