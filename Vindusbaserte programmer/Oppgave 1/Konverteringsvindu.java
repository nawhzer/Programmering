import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Konverteringsvindu extends JFrame implements ActionListener
{
	private JTextArea ta;
	private JTextField skrivefelt;
	private JLabel skrivefelttekst;
	private Konverterer konverterer;
	private DecimalFormat fo;
	private JButton knapp;
	private JButton rknapp;
	
	public Konverteringsvindu()
	{
		super("Fartskonverterer");
		ta = new JTextArea(10, 35);
		
		JScrollPane skrollefelt = new JScrollPane(ta);
		Container c = getContentPane();
		
		skrivefelt = new JTextField(4);
		skrivefelt.addActionListener( this );
		skrivefelttekst = new JLabel("Km/t som skal konverteres");
		
		knapp = new JButton("Convert");
		knapp.addActionListener( this );
		
		rknapp = new JButton("Reset");
		rknapp.addActionListener( this );
		
		c.setLayout( new FlowLayout());
		c.add(skrivefelttekst);
		c.add(skrivefelt);
		c.add(knapp);
		c.add(rknapp);
		c.add(skrollefelt);
		
		ta.setText("Konvertert fart\n");
		fo = new DecimalFormat("0.00");
		ta.setEditable( false );
		
	}
	
	public void actionPerformed( ActionEvent e )
	{
		if(e.getSource()==knapp || e.getSource()==skrivefelt)
		{
			String input = skrivefelt.getText();
			double a = Double.parseDouble(input);
			String utskrift = input + " Km/t = " + fo.format(Konverterer.Fart(a)) + " m/s";
			ta.append( utskrift + "\n");
		}
		
		else if(e.getSource()==rknapp)
		{
			ta.setText(" ");
		}
		
	
	}
}