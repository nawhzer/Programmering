import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.NumberFormat;

public class Potens
{
	public static void main( String[] args)
	{
		JTextArea to = new JTextArea();
		
		NumberFormat kroneformat = NumberFormat.getCurrencyInstance();
		
		to.setText("Tall\tAndrepotens\tTredjepotens\n");
		
		for( int i = 1; i<11; i++)
		{
			to.append( i + "\t" + i*i + "\t" + i*i*i);
			to.append( "\n");
		}
		
		
		
		JOptionPane.showMessageDialog(null, to);
	}
}