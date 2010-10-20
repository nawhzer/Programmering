//Lars S. Grini s173275
import javax.swing.*;
import java.text.DecimalFormat;

public class Statistikk
{
  private String måned;
  private int år;
  private int[] minTemp;
  private int[] maxTemp;
  private int[] nedbør;

  public Statistikk(String mnd, int å, int[] min, int[] max, int[] ned)
  {
    //Initialiserer datafeltene >
	måned = mnd;
	år = å;
	minTemp = min;
	maxTemp = max;
	nedbør = ned;
  }

  public int regndager()
  {
	int a = 0;
    //Teller opp antall dager som har hatt nedbør på 5 mm eller mer
    //og returnerer antallet.
	for(int i=0;i<nedbør.length;i++)
	{
		if(nedbør[i]>=5)
			a++;
	}
	return a;
  }


/*Finner og returnerer gjennomsnittlig maksimumstemperatur for dager
      med mindre enn 5 mm nedbør.
      Returnerer -100.0 i tilfelle det er ingen slike dager. */
  public double maksTempSnitt()
  {
	int a = 0;
	int b = 0;
	double snitt=0.0;
    
	for(int i=0;i<maxTemp.length;i++)
	{
		if(nedbør[i]<5)
		{
			a+=maxTemp[i];
			b++;
		}
		snitt=(double)a/(double)b;
			
	}
	if(snitt==0.0)
		snitt=-100.0;

	return snitt;
  }

  public int maksTempVariasjon()
  {
	int a=0;
    /*Finner og returnerer den største temperaturvariasjonen som har forekommet
      i løpet av et døgn (i løpet av måneden).*/
	for(int i=0;i<maxTemp.length;i++)
	{
		if((maxTemp[i]-minTemp[i])>a)
			a=(maxTemp[i]-minTemp[i]);
	}
	return a;
	
  }

  /* Metoden maksTempVariasjonsDager() er ikke obligatorisk for å få godkjent innleveringen.
  public String maksTempVariasjonsDager()
  {
    < Finner og returnerer en tekst med den eller de datoer  som har en
      temperaturvariasjon lik den maksimale, og informasjon om hvor mange
      dager det gjelder. >
  }*/
 
  public void værStatistikk(JTextArea output)
  {
    //Skriver i tekstområdet output og formaterer de dataene som klassens metoder returnerer.
	output.setText("Værdata\n\n");
	DecimalFormat fo = new DecimalFormat("0.0");
	output.append("Måned: " + måned +
				  "\nAntall dager i " + måned + ": " + maxTemp.length + 
				  "\nAntall dager med mer enn 5mm nedbør: " + regndager()+
				  "\nGjennomstnittlig makstemperatur: " + fo.format(maksTempSnitt()) + "\u2103" +
				  "\nStørste temperaturvarisjon i løpet av et døgn: " + maksTempVariasjon() + "\u2103");
	
  }

} // end of class Statistikk
