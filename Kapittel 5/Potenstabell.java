import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Potenstabell
{
  // Beregner potens
  public static int power(int grunntall, int eksponenent)
  {
		int x = 1;
    for(int i = 1; i <= eksponenent; i++)
    	  x *= grunntall;

    return x;
  }

  // Beregner potenser for tall og skriver ut potensene p� tabellform
  // i et tekstomr�de. Parametrene har f�lgende betydning:
  // startverdi: f�rste tall det beregnes potenser for.
  // makseksponenent: h�yeste eksponent i potensene som beregnes.
  // antall: antall forskjellige tall det beregnes potenser for.
  // For hvert tall fra og med startverdi og oppover beregnes f�rstepotens,
  // andrepotens, ..., til og med potens med eksponent lik makseksponent.

  public static void main(String[] args)
  {
		int startverdi = 1;
		int makseksponent = 5;
		int antall = 10;

    JTextArea uo = new JTextArea();


    //lager overskrift til tabellen
    for(int n = 1 ; n <= makseksponent; n++)
    {
			uo.append( n + ". potens\t");
	}

    uot.append("\n");

    for( int i = startverdi; i < startverdi + antall; i++)
    {
    	for(int j = 1; j <= makseksponent; j++)
    	{
    		uo.append(power(i,j) + "\t");
    	}

    	uo.append("\n");
    }

    JOptionPane.showMessageDialog(null, uo);
  }

}