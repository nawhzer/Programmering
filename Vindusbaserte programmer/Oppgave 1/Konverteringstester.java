import javax.swing.JFrame;

public class Konverteringstester
{
	public static void main(String[] args)
	{
		Konverteringsvindu vindu = new Konverteringsvindu();
		vindu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		vindu.setSize(500,300);
		vindu.setVisible( true );
		
	}
}