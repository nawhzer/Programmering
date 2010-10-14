

public class Konto
{
	//datafeltene - variabler
	private String kontoinnehaver; // null
	private long kontonr;
	private double saldo;
	private boolean sperret;

	//kontruktør - gi startverdier til datafeltene
	public Konto( String navn, long nr, double s )
	{
		kontoinnehaver = navn;
		kontonr = nr;
		saldo = s;
		sperret = false;
	}

	public void setKontoinnehaver( String navn )
	{
		kontoinnehaver = navn;
	}

	public String getKontoinnehaver()
    {
		return kontoinnehaver;
	}

	public void setSperret( boolean sp )
	{
		sperret = sp;
	}

	public boolean getSperret()
	{
		return sperret;
	}

	public double getSaldo()
	{
		return saldo;
	}

	public String innskudd( double sum )
	{
		if( sperret == false )
		{
			saldo = saldo + sum;
		    return "Ny saldo: " + saldo;
		}
		return "Kontoen er sperret!";
	}

	public String uttak( double sum )
	{
		if( sperret == true )
		  return "Kontoen er sperret!";

		// kontoen er ikke sperret

		if( sum <= saldo )  // er det dekning?
		{
			saldo = saldo - sum;
			return "Ny saldo: " + saldo;
		}
		return "Ikke dekning på kontoen!";
	}


	public String kontoUtskrift()
	{
		if( sperret )
		  return "Kontoen er sperret!";

		String utskrift =       "Kontoinnehaver: " + kontoinnehaver;
		utskrift = utskrift + "\nKontonummer: " + kontonr;
		utskrift = utskrift + "\nSaldo: " + saldo;

		return utskrift;
	}

}// end of class Konto









