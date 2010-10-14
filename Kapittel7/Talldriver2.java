import javax.swing.*;

public class Talldriver2
{
	public static void main(String[] args)
	{
		JTextArea ta = new JTextArea();
		ta.setText("Oversikt\n");
		
		Tallreg2 tr = new Tallreg2();
		tr.trekkTallene();
		ta.append(tr.visTallene());
		JOptionPane.showMessageDialog(null, ta);
	}
}