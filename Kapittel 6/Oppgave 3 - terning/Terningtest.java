import javax.swing.*;

public class Terningtest
{
  public static void main( String[] args )
  {
	JTextArea ta = new JTextArea();
	
    Terning terningen = new Terning();
    int antKast = 100;
	
	ta.setText("Terningkast!!!!!!!!!!\n");

    for ( int i = 1; i <= antKast; i++ )
    {
    	terningen.kast();
		int verdi = terningen.getVerdi();
		
		ta.append(verdi + " ");
		if ( ( i % 10 ) == 0 )
			ta.append("\n");
    }

    JOptionPane.showMessageDialog( null, ta);
  }
}
