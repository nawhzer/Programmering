// Lars S. Grini, S173275

// Importerer klassen JOptionPane
import javax.swing.JOptionPane;

// Lager en modell av en kursbok
public class Kursbok4
{
	// datafeltene - variabler
	private String kursnavn;
	private int studiepoeng;
	private String faglærer;
	
	// Konstruktør - gir startverdier til datafeltene
	public Kursbok4( String n, int p, String l )
	{
		kursnavn = n;
		studiepoeng = p;
		faglærer = l;
	}
	
	public void setKursnavn( String navn )
	{
		kursnavn = navn;
	}
	
	public String getKursnavn()
	{
		return kursnavn;
	}
	
	
	public void setStudiepoeng ( int poeng )
	{
		studiepoeng =  poeng;
	}
	
	public int getStudiepoeng()
	{
		return studiepoeng;
	}
	
	
	public void setFaglærer( String lærer )
	{
		faglærer = lærer;
	}
	
	public String getFaglærer()
	{
		return faglærer;
	}
	
	public void visTittel()
	{
		JOptionPane.showMessageDialog( null, "Kursbok for : " + getKursnavn() + 
											 "\nStudiepoeng for faget: " + getStudiepoeng() + 
											 "\nFaglærer for faget: " + getFaglærer()
											 , "KURSDATA", JOptionPane.INFORMATION_MESSAGE);
	}
} // Slutt på Kursbok4-klassen