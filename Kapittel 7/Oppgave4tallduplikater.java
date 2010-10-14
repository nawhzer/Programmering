import javax.swing.*;

public class Oppgave4tallduplikater
{
	private int[] tallData = new int [20];
	private boolean tru;
	private int tall;
	
	public Oppgave4tallduplikater(boolean tr, int t)
	{
		tru = tr;
		tall= t;
	}
	
	public boolean finnes(int tall)
	{
		if(tallData[0] == tall)
				tru = false;
		else if(tallData[1] == tall)
				tru = false;
		else if(tallData[2] == tall)
				tru = false;
		else if(tallData[3] == tall)
				tru = false;
		else if(tallData[4] == tall)
				tru = false;
		else if(tallData[5] == tall)
				tru = false;
		else if(tallData[6] == tall)
				tru = false;
		else if(tallData[7] == tall)
				tru = false;
		else if(tallData[8] == tall)
				tru = false;
		else if(tallData[9] == tall)
				tru = false;
		else if(tallData[10] == tall)
				tru = false;
		else if(tallData[11] == tall)
				tru = false;
		else if(tallData[12] == tall)
				tru = false;
		else if(tallData[13] == tall)
				tru = false;
		else if(tallData[14] == tall)
				tru = false;
		else if(tallData[15] == tall)
				tru = false;
		else if(tallData[16] == tall)
				tru = false;
		else if(tallData[17] == tall)
				tru = false;
		else if(tallData[18] == tall)
				tru = false;
		else if(tallData[19] == tall)
				tru = false;
		else
			tru = true;

			return tru;
	}
	
	public void visInnlesteTall()
	{
		JTextArea utskrift = new JTextArea();
		utskrift.setText( "Frekvenser for trekning av " + tallData.length +
		               	  " slumptall fra intervallet 20 til 100\n" );
		    
		for ( int i = 0; i < tallData.length; i++ )
	    {
			if ( i % 5 == 0 )
		    {
		    	utskrift.append( "\n" );
			}
				tallData[i] += tall;
		      	utskrift.append(tallData[i] + "\t" );
		}
		JOptionPane.showMessageDialog(null, utskrift);
	}
	
	public void lesInnTall()
	{
		for(int i=0; i<tallData.length; i++)
		{
			
			int tall = Integer.parseInt(JOptionPane.showInputDialog(null, "Skrive inn tall her"));
			if(tall>=20 && tall<=100)
			{
				if(finnes(tall))
					tallData[i] = tall;
				else
					JOptionPane.showMessageDialog(null, "Dette tallet hadde skrevet inn fra før. Prøv igjen", 
														"Stupid motherfucker", JOptionPane.WARNING_MESSAGE);
			}
			else
				JOptionPane.showMessageDialog(null, "Dette tallet var desverre ikke 20 - 100. Prøv igjen", 
													"Stupid motherfucker!", JOptionPane.WARNING_MESSAGE);
			
		}
	}
}	
