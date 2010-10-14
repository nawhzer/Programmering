import java.util.Random;
import javax.swing.*;

public class Arraybehandler2
{
	public int[] lagListe(int lengde, int grense)
	{
		int[] slumptall=int[lengde];
		Random generator=new Random();
		
		for (int i=0; i<slumptall.length; i++)
		{
			slumptall[i]=generator.nextInt(grense);
		}
		
		return int[] slumptall;
	}
	
	public int dobler(int k)
	{
		return k*2;
	}
	
	public int[] kopier( int[] tabell)
	{
		int [] kopi = new int[tabell.length];
		
		for(int i=0; i<kopi.length;i++)
		{
			kopi[i] = tabell[i];
		}
		
		return kopi;
	}
	
	public void reverser( int[] tabell)
	{
		int n = tabell.length-1;
		
		for(int i = 0; i<tabell.length/2; i++)
		{
			int elem = tabell[i];
			tabell[i] = tabell[n-1];
			tabell[n-1] = elem;
		}
	}
	
	public void print(JTextArea utskrift, String overskrift, int[] liste)
	{
		utskrift.append( overskrift + "\n");
		
		for(int i= 0; i<liste.length; i++)
		{
			utskrift.append(liste[i] + "\t");
			if((i+1%)% 10)
				utskrift.append("\n")
		}
	}
}