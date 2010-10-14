import javax.swing.JOptionPane;

public class Velkommen
{
	public static void main( String[] args )
	{
		JOptionPane.showMessageDialog( null, "Hello\n"
											+"World" );
		String fornavn;
		fornavn = JOptionPane.showInputDialog( "Hei, hva er ditt fornavn?" );

		String etternavn;
		etternavn = JOptionPane.showInputDialog( "og ditt etternavn?" );

		String utskrift;
		utskrift = "Hei " + fornavn + " " + etternavn;

		JOptionPane.showMessageDialog( null, utskrift );
		JOptionPane.showMessageDialog( null, "Dette er en enkel kalkulator" );

		String førsteSifferstreng;
		String andreSifferstreng;


		double førstetall;
		double andretall;
		double sum;

		førsteSifferstreng = JOptionPane.showInputDialog( null, "skriv inn første tall" );
		andreSifferstreng = JOptionPane.showInputDialog( null, "skriv det andre tallet her" );

		førstetall = Double.parseDouble( førsteSifferstreng );
		andretall = Double.parseDouble( andreSifferstreng );


		sum = førstetall + andretall;

		JOptionPane.showMessageDialog( null, "Summen av " + førsteSifferstreng + " + " + andreSifferstreng + " = " + sum,
			"Resultater", JOptionPane.PLAIN_MESSAGE );


		String radiusString;

		double radius;
		double areal;

		JOptionPane.showMessageDialog( null, "Nå skal vi finne arealet av en sirkel", "Sirkelareal", JOptionPane.PLAIN_MESSAGE );
		radiusString = JOptionPane.showInputDialog( null, "Skriv inn sirkelens radius her", "Sirkelareal", JOptionPane.PLAIN_MESSAGE );

		radius = Double.parseDouble( radiusString );

		areal = radius * radius * 3.14;

		JOptionPane.showMessageDialog( null, "Sirkelens areal er " + areal, "Sirkelareal", JOptionPane.PLAIN_MESSAGE );
		JOptionPane.showMessageDialog( null, "Til nå har vi fastslått at\n"
												+ "du heter " + fornavn + " " + etternavn + "\n"
												+ "at du vet at summen av " + førsteSifferstreng + " + " + andreSifferstreng + " = " + sum + "\n"
												+ "og at arealet av en sirkel med radius " + radiusString + " er lik " + areal );


	}

}