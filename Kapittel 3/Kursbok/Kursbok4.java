import javax.swing.JOptionPane;

public class Kursbok4
{
	private String kursnavn;
	
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
	
	
	
	private int studiepoeng;
	
	public void setStudiepoeng ( int poeng )
	{
		studiepoeng =  poeng;
	}
	
	public int getStudiepoeng()
	{
		return studiepoeng;
	}
	
	
	private String faglærer;
	
	
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
		JOptionPane.showMessageDialog( null, "Kursbok for " + kursnavn + "Studiepoeng for faget " + studiepoeng + "Faglærer for faget: " + faglærer);
	}
}