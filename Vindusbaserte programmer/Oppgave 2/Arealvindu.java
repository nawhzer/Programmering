import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Arealvindu extends JFrame implements ActionListener
{
	private JLabel llengde;
	private JLabel lbredde;
	private JLabel lareal;
	
	private JTextField lengde;
	private JTextField bredde;
	private JTextField areal;
	
	private JButton knapp;
	
	private DecimalFormat fo;
	
	private Areal a;
	
	public Arealvindu()
	{
		a = new Areal();
		
		llengde = new JLabel("Lengde");
		lbredde = new JLabel("Bredde");
		lareal = new JLabel("Areal");
		
		lengde = new JTextField(4);
		bredde = new JTextField(4);
		areal = new JTextField(10);
		areal.setEditable( false );
		
		fo = new DecimalFormat("0.00");
		
		knapp = new JButton("Beregn areal");
		knapp.addActionListener( this );
		
		setLayout( new FlowLayout());
		
		add(llengde);
		add(lengde);
		lengde.addActionListener( this );
		
		add(lbredde);
		add(bredde);
		bredde.addActionListener( this );
		
		add(knapp);
		
		add(lareal);
		add(areal);
	}
	
	public void actionPerformed( ActionEvent e)
	{
		if(e.getSource()==knapp || e.getSource()==lengde
			|| e.getSource()==bredde)
		{
			double l = Double.parseDouble(lengde.getText());
			double b = Double.parseDouble(bredde.getText());
			String utskrift = "" + a.A(l,b);
			
			areal.setText(utskrift);
		}
	
	}
}
