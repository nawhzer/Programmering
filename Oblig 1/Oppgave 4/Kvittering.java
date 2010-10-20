// Lars S. Grini, S173275
import javax.swing.JOptionPane;

public class Kvittering
{
	
	private String varekode;
	private String varenavn;
	private int antallvarer;
	private double varepris;
	
	
	public Kvittering( String vk, String n, int a, double p )
	{
		varekode = vk;
		varenavn = n;
		setAntallvarer(a);
		setVarepris(p);
	}	
	
	public String getVarekode()
	{
		return varekode;
	}
	
	public String getVarenavn()
	{
		return varenavn;
	}
	
	public void setAntallvarer( int antall )
	{
		antallvarer = antall;
		if(antallvarer<0)
			antallvarer = 0;
	
	}
	
	public int getAntallvarer()
	{
		return antallvarer;
	}
	
	public void setVarepris( double pris )
	{
		varepris = pris;
		if(varepris<0)
			varepris = 0;

	}
	
	public double getVarepris()
	{
		return varepris;
	}
	
	public double beregnTotalpris()
	{
		return varepris*antallvarer;
	}
	

	
}