import javax.swing.*;

public class Oppgave5alfabet
{
  public static void main( String[] args )
  {
	JTextArea ta = new JTextArea();
	ta.setText("Antall store og små bokstaver av hvert jævla slag!\n");
	
    String input = JOptionPane.showInputDialog("Programmet teller og skriver "+
          "ut dumbfuck i tekststrengen du skriver." );

    char[] bokstaver = { 'A', 'B', 'C', 'D', 'E', 'F', 'G'
						,'H', 'I', 'J', 'K', 'L', 'M', 'N'
						,'O', 'P', 'Q', 'R', 'S', 'T', 'U'
						, 'V', 'W', 'X', 'Y', 'Z','Æ', 'Ø', 
						'Å','a', 'b', 'c', 'd', 'e', 'f', 
						'g', 'h', 'i', 'j', 'k', 'l', 'm', 
						'n', 'o', 'p', 'q', 'r', 's', 't',
						'u', 'v', 'w', 'x', 'y', 'z', 'æ',
						'ø', 'å' };
	
	int[] antallBokstaver = new int[58];

    String output = "Dumbfuck i innlest tekst:\n";			
															
    for ( int i = 0; i < input.length(); i++ )				
    {														
      char tegn = input.charAt( i );						
															
      for ( int j = 0; j < bokstaver.length; j++ )		
      {
			if(tegn==bokstaver[j])
			{
				antallBokstaver[j]++;
			}
	  }
    }

	for(int o = 0; o<=57; o++)
	{
		if(antallBokstaver[o]>0)
			{
				ta.append(bokstaver[o] + ": " + antallBokstaver[o] + "\t" );
				if(o%10==0)
					ta.append("\n");
			}
	}
	
    JOptionPane.showMessageDialog( null, ta);
  }
}
