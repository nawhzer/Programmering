//Lars S. Grini s173275
import javax.swing.*;

public class Meteorologi
{
  public static void main(String[] arg)
  {
    //Leser inn månedens navn og år, samt antall dager i måneden.
	String månednavn = JOptionPane.showInputDialog(null, "Skriv inn månedens navn");
	int år = lesTall("Skriv inn årstall");
	int antDager = lesTall("Antall dager i måneden");
	if(antDager>31)
		antDager=31;
	if(antDager<1)
		antDager=1;

    //Deklarerer og oppretter 3 heltallsarrayer
     
	int[] minTemp=new int[antDager];
	int[] maksTemp=new int[antDager];
	int[] nedbør=new int[antDager];

    /*Grenser for makstemp, mintemp og nedbør er 
	er høyeste registrerte temperatur på jorden,
	laveste temperatur registrert på jorden
	og høyeste registrerte nedbørsmengde 
	i løpet av 24 timer. Hentet fra wikipedia.*/
	for(int i = 0;i<antDager;i++)
	{
		do
		{
			maksTemp[i] = lesTall("Høyeste temperatur for den " + (i+1) + ". dagen i \u2103");
		}while(maksTemp[i]<-90 || maksTemp[i]>58);
		
		do
		{
			minTemp[i] = lesTall("Minste temperatur for den " + (i+1) + ". dagen i \u2103");
		}while((minTemp[i]<-90 || minTemp[i]>58) || minTemp[i]>maksTemp[i]);
		
		do
		{
			nedbør[i] = lesTall("Nedbør for den " + (i+1) + ". dagen i mm");
		}while(nedbør[i]<0 || nedbør[i]>1825);
		
	}

    //Opprett et Statistikk-objekt.
	Statistikk s = new Statistikk(månednavn, år, minTemp, maksTemp, nedbør);

    //Opprett et tekstområde av typen JTextArea
	JTextArea ta = new JTextArea();

    //Fyller tekstområdet med den teksten som returneres av værStatistikk-metoden
    //i Statistikk-klassen. 
	s.værStatistikk(ta);	

    //Viser tekstområdet i et dialogvindu.
	JOptionPane.showMessageDialog(null, ta);

  }

  //Hjelpemetode for innlesing av heltall
  public static int lesTall( String s )
  {
    //Leser og returnerer et tall fra brukeren.
    //Variabelen s skal brukes som ledetekst.
	String tekst = JOptionPane.showInputDialog(s);
	return Integer.parseInt(tekst);
  }

} // end of class Meteorologi