import javax.swing.*;

//Foreløpig fra 1700 til 2299
public class Ukeoppgave5paaske
{
	public static void main(String[] args)
	{	
		int[] år1= new int[100];
		int år1700 = 1700;
		for(int i = 0; i<100; i++)
		{
			år1[i]=år1700+i;
		}
		
		int[] år2= new int[100];
		int år1800 = 1800;
		for(int i = 0; i<100; i++)
		{
			år2[i]=år1800+i;
		}
		
		int[] år3= new int[100];
		int år1900 = 1900;
		for(int i = 0; i<100; i++)
		{
			år3[i]=år1900+i;
		}
		
		int[] år4= new int[100];
		int år2000 = 2000;
		for(int i = 0; i<100; i++)
		{
			år4[i]=år2000+i;
		}
		
		int[] år5= new int[100];
		int år2100 = 2100;
		for(int i = 0; i<100; i++)
		{
			år5[i]=år2100+i;
		}
		
		int[] år6= new int[100];
		int år2200 = 2200;
		for(int i = 0; i<100; i++)
		{
			år6[i]=år2200+i;
		}
		
		int år;
		do
		{
			år = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn årstall (fra 1700-2299)", 
																 	"Påskeberegning", JOptionPane.PLAIN_MESSAGE));
			if(år<1700 || år>3000)
				JOptionPane.showMessageDialog(null, "Tallet du skrev inn var utenfor intervallet",
													"Påskeberegning", JOptionPane.ERROR_MESSAGE);
		}while(år<1700 || år>2299);
		
		int a, b, c, d, e, x, y, ps;
		String utskrift ="";
		for(int i=0;i<100;i++)//1
		{
			if(år==år1[i])
			{
				a=år%19;
				b=år%4;
				c=år%7;
				x=23;
				y=3;
				d=(19*a+x)%30;
				e=(2*b+4*c+6*d+y)%7;
				if((d+e+22)<=31)
				{
					ps=d+e+22;
					utskrift="Dette års påskesøndag faller på den " + ps+ ". mars " + år;
				}
				else if((d+e+22)>31)
				{
					ps=d+e-9;
					utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
					if((d==28 && e==6 && a>10) || (ps==25))
					{
						ps=18;
						utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
						
					}
					else if(ps==26)
					{
						ps=19;
						utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
					}
					
				}
			
			}
		}
		for(int i=0;i<100;i++) //2
		{
			if(år==år2[i])
			{
				a=år%19;
				b=år%4;
				c=år%7;
				x=23;
				y=4;
				d=(19*a+x)%30;
				e=(2*b+4*c+6*d+y)%7;
				if((d+e+22)<=31)
				{
					ps=d+e+22;
					utskrift="Dette års påskesøndag faller på den " + ps+ ". mars " + år;
				}
				else if((d+e+22)>31)
				{
					ps=d+e-9;
					utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
					if((d==28 && e==6 && a>10) || (ps==25))
					{
						ps=18;
						utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
						
					}
					else if(ps==26)
					{
						ps=19;
						utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
					}
					
				}
			
			}
		}
		for(int i=0;i<100;i++)//3
		{
			if(år==år3[i])
			{
				a=år%19;
				b=år%4;
				c=år%7;
				x=24;
				y=5;
				d=(19*a+x)%30;
				e=(2*b+4*c+6*d+y)%7;
				if((d+e+22)<=31)
				{
					ps=d+e+22;
					utskrift="Dette års påskesøndag faller på den " + ps+ ". mars " + år;
				}
				else if((d+e+22)>31)
				{
					ps=d+e-9;
					utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
					if((d==28 && e==6 && a>10) || (ps==25))
					{
						ps=18;
						utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
						
					}
					else if(ps==26)
					{
						ps=19;
						utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
					}
					
				}
		
			}
		}
		for(int i=0;i<100;i++)//4
		{
			if(år==år4[i])
			{
				a=år%19;
				b=år%4;
				c=år%7;
				x=24;
				y=5;
				d=(19*a+x)%30;
				e=(2*b+4*c+6*d+y)%7;
				if((d+e+22)<=31)
				{
					ps=d+e+22;
					utskrift="Dette års påskesøndag faller på den " + ps+ ". mars " + år;
				}
				else if((d+e+22)>31)
				{
					ps=d+e-9;
					utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
					if((d==28 && e==6 && a>10) || (ps==25))
					{
						ps=18;
						utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
						
					}
					else if(ps==26)
					{
						ps=19;
						utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
					}
					
				}
			
			}
		}
		for(int i=0;i<100;i++)//5
		{
			if(år==år5[i])
			{
				a=år%19;
				b=år%4;
				c=år%7;
				x=24;
				y=6;
				d=(19*a+x)%30;
				e=(2*b+4*c+6*d+y)%7;
				if((d+e+22)<=31)
				{
					ps=d+e+22;
					utskrift="Dette års påskesøndag faller på den " + ps+ ". mars " + år;
				}
				else if((d+e+22)>31)
				{
					ps=d+e-9;
					utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
					if((d==28 && e==6 && a>10) || (ps==25))
					{
						ps=18;
						utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
						
					}
					else if(ps==26)
					{
						ps=19;
						utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
					}
					
				}
				
			}
		}
		for(int i=0;i<100;i++)//6
		{
			if(år==år6[i])
			{
				a=år%19;
				b=år%4;
				c=år%7;
				x=25;
				y=0;
				d=(19*a+x)%30;
				e=(2*b+4*c+6*d+y)%7;
				if((d+e+22)<=31)
				{
					ps=d+e+22;
					utskrift="Dette års påskesøndag faller på den " + ps+ ". mars " + år;
				}
				else if((d+e+22)>31)
				{
					ps=d+e-9;
					utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
					if((d==28 && e==6 && a>10) || (ps==25))
					{
						ps=18;
						utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
						
					}
					else if(ps==26)
					{
						ps=19;
						utskrift="Dette års påskesøndag faller på den " + ps+ ". april " + år;
					}
					
				}
					
			}
		}
		
		JOptionPane.showMessageDialog(null, utskrift);		
	}
}