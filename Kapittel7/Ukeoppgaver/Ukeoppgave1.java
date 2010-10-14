import javax.swing.*;
public class Ukeoppgave1
{
	public static String[] måneder = {"januar", "februar", "mars", "april", "mai", "juni",
	 					"juli", "august", "september", "oktober", "november", "desember"};
	
	public static int[] mnd1 = {1, 3, 5, 7, 8, 10, 12};
	public static int[] mnd2 = {4, 6, 9, 11};
	public static int[] mnd3 = {2};
	public static int antDager = 0;
	
	public static boolean skuddår(int årstall)
	{
		if(årstall%4==0 && årstall%100>0)
			return true;
		else if (årstall%400==0)
			return true;
		else
			return false;
	}
	
	public static int månedsdager(int måned, int år)
	{
		for(int i=0; i<mnd1.length;i++)
		{
			if(måned == mnd1[i])
				antDager=31;
		}
		
		for(int i=0; i<mnd2.length;i++)
		{
			if(måned == mnd2[i])
				antDager=30;
		}
		
		if(måned == mnd3[0])
		{
			if(skuddår(år))      
				antDager=29;
			else
				antDager=28;
		}
		
		return antDager;
	}
	
	public static boolean okDato(int dag, int mnd, int år)
	{
		boolean okDato;
		if(mnd>12 || mnd<1)
			okDato = false;
		if(dag<1 || dag>månedsdager(mnd, år))
			okDato = false;
		else
			okDato = true;
		return okDato;
	}
	
	public static String månedsnavn( int mnd)
	{
		if((mnd)<1 || (mnd)>12)
			return "Ukjent måned";
		else
			return måneder[mnd-1];
	}
	

}

