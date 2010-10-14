import javax.swing.*;
import java.util.Random;
public class Tallreg2
{
	//< Deklarasjon av heltallsarray og andre nødvendige  konstanter. >
	private static int[] array;//disse skal vel være private tror jeg, ettersom vi bruker konstruktør
	public static int tall;//den her trenger du ikke her, eller veit da faen jeg, jeg gjorde det i trekkTallene hvertfall

	private boolean tf;// bruker heller en variabel, som vi returnerer i finnes
	Random generator = new Random();

	public Tallreg2()

  	{
    	array = new int[20];
    	tf = true;

	}

  	public boolean finnes( int tall )
  	{
    	//< Returnerer true eller false avhengig av om tall finnes i
      	//	arrayen eller ikke. >
		array[0]=20;
		for(int i = 0; i<array.length;i++)
		{
			if(array[i]==tall)// bytta plass
				tf = true;
			else
				tf = false;
		}

		return tf;
  	}

  	public void trekkTallene()
  	{
    	/*< Trekker tilfeldige tall fra intervallet bestemt av
      	tallgrensene, og lagrer dem i arrayen, under forutsetning
      	av at de ikke er lagret i arrayen fra før.
      	Hvis det trekkes et tall som finnes i arrayen allerede, skal
      	det foretas ny trekning INNTIL et ubrukt tall trekkes >*/

	do
	{
		for(int j = 0 ; j<array.length; j++)
		{

			tall = 20 + generator.nextInt(80);
			if(finnes(tall)==false)
				array[j]=tall;
		}
	}while(tf); // så lenge tallet ikke finnes fra før

  	}



  	public int minsteTall(int minst)
  	{
    	//< Returnerer minste verdi i arrayen >
		minst=array[0];
		for(int k = 0; k<array.length; k++)
		{
			if(array[k]<minst)
				minst=array[k];
		}
		return minst;
  	}

  	public int størsteTall(int størst)
  	{
    	//< Returnerer største verdi i arrayen >
		størst=array[0];
		for(int l = 0; l<array.length; l++)
		{
			if(array[l]>størst)
				størst=array[l];
		}
		return størst;
  	}

  	public String visTallene()
  	{
    	//< Returnerer en tekst som inneholder tallene i arrayen,
      	//høyst 5 tall per linje, i tillegg til største og minste tall. >
		String output="";
		for(int m = 0; m<array.length; m++)
		{
			if(m%5==0)
				output+="\n";
			output+= array[m] + "\t";

		}

		output+="\n det minste tallet var " + minsteTall(tall);
		output+="\n og det største var " + størsteTall(tall);
		return output;
	}


}