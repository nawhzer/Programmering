import javax.swing.JOptionPane;

public class Seksertest
{
  public static void main( String[] args )
  {
    Terning terningen = new Terning();
	int [] terning = new int[7];
    int antKast = 6000;
    int antSeksere = 0;  // har ikke fått noen sekser ennå!

    for ( int i = 1; i <= antKast; i++ )
    {
      terningen.kast();
      int verdi = terningen.getVerdi();
	  terning[verdi]++;
      
    }

    String utskrift = antKast + " terningkast:\n " +
        "\nAntall seksere:\t" +terning[6] + 
		"\nAntall femmere:\t" + terning[5] + 
		"\nAntall firere:\t" + terning[4] + 
		"\nAntall treere:\t" + terning[3] + 
		"\nAntall toere:\t" + terning[2] + 
		"\nAntall enere:\t" + terning[1];
    JOptionPane.showMessageDialog( null, utskrift, "Terningtest",
        JOptionPane.PLAIN_MESSAGE );
  }
}
