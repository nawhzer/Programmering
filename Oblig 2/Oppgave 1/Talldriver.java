//Lars S. Grini s173275
import javax.swing.*;

public class Talldriver
{
	public static void main(String[] args)
	{
		JTextArea ta = new JTextArea();
		ta.setText("Oversikt\n");
		
		Tallregistrator tr = new Tallregistrator();
		tr.trekkTallene();
		ta.append(tr.visTallene());
		JOptionPane.showMessageDialog(null, ta);
	}
}