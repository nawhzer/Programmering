import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.Random;

public class Terningvindu extends JFrame implements ActionListener
{
	private JLabel label1;
	private JLabel label2;
	private JTextField tf;
	private JTextField tf2;
	private Terning t;
	
	public Terningvindu()
	{
		super("Vindu");
		t = new Terning();
		label1 = new JLabel("Antall");
		label2 = new JLabel("ere:");
		tf = new JTextField(1);
		tf2 = new JTextField(4);
		
		tf.addActionListener(this);
		
		setLayout( new FlowLayout());
		
		add(label1);
		add(tf);
		add(label2);
		add(tf2);
		
		tf2.setEditable(false);	
	}
	
	public int verdi()
	{
		String input = tf.getText();
		int a = Integer.parseInt(input);
		int [] b = new int[1];
		int kast = 6000;
		
		for ( int i = 1; i <= kast; i++ )
	    {
	      t.kast();
	      int verdi = t.getVerdi();
		  if(verdi==a)
			b[0]++;
	    }		
		return b[0];
	}
	
	public void actionPerformed( ActionEvent e)
	{
		int y = Integer.parseInt(tf.getText());
		if(y<1 || y>6)
			JOptionPane.showMessageDialog(null, "Hva slags terning var dette da?", "FEIL", 
											JOptionPane.WARNING_MESSAGE);
		else
			tf2.setText(""+verdi());
	}
}