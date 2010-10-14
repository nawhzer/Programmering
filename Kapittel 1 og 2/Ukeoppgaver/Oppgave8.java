import javax.swing.JOptionPane;
public class Oppgave8
{
	public static void main( String[] args)
	{
		
		String pengestring = (JOptionPane.showInputDialog( null, "Du betaler en vare med en 100-lapp\n"
																				+ " Hva er prisen på varen?")); //Her skriver brukeren inn prisen på varen
		
		double pengertilbake = Double.parseDouble(pengestring);	//Her gjør vi om dataene brukeren skrev om til et heltall
		
		double pengerdouble = 100-pengertilbake;						/*Her finner vi ut hvor mye brukere skal ha tilbake, gitt at han betaler med 
																en 100-lapp*/
		int pengerdoubleint = (int) pengerdouble;
	
		if (pengertilbake>100)
			JOptionPane.showMessageDialog( null, "DU DIN SNIK.. Dette haddde du ikke råd til...", " Blakk..? ", JOptionPane.ERROR_MESSAGE);
			//Her vil brukeren få feilmelding hvis h*n prøver å kjøpe en vare som er dyrere enn 100,-
			
		if (pengertilbake<=100)
			{
		int penger = (int) pengerdouble;
			
		
		int femtikroner = penger/50;
		
		int tjuekroner = penger%50;
		int antalltjuekroner = tjuekroner/20;
		
		int tikroner = tjuekroner%20;
		int antalltikroner = tikroner/10;
		
		int femkroner = tikroner%10;
		int antallfemkroner = femkroner/5;
		
		int kronestykker = femkroner%5;
		int antallkronestykker = kronestykker/1;
			
		
		
		double kronestykkerdouble = pengerdouble-pengerdoubleint;
		double antallfemtiøre = kronestykkerdouble/0.5;
		

		JOptionPane.showMessageDialog( null, "Her har du \n"
		 							+ femtikroner + " 50-lapp\n" + 
									antalltjuekroner + " 20-krone(r) \n" + 
									antalltikroner + " 10-krone(r)\n" +
									antallfemkroner + " 5-kroner(r)\n" +
									antallkronestykker + " kronestykker\n" + 
									antallfemtiøre + " femtiøringer");
					
			}					
									
		
	}

}