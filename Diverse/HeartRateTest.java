import javax.swing.*;
import java.text.DecimalFormat;

public class HeartRateTest
{
	public static void main(String[] args)
	{
		DecimalFormat heart = new DecimalFormat("0");
		DecimalFormat bmi = new DecimalFormat("0.00");
		
		JTextArea body = new JTextArea();
		body.setText("Examination info\n");
		
		String fornavn = JOptionPane.showInputDialog(null, "Skriv inn ditt fornavn");
		String etternavn = JOptionPane.showInputDialog(null, "Skriv inn ditt etternavn");
		int bornYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv inn ditt fødselsår her"));
		double vekt = Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv inn høyde i antall meter her. Bruk komma som skilletegn"));
		double høyde = Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv inn vekt i kg her"));
		
		HeartRates data = new HeartRates(fornavn, etternavn, bornYear,0,0,0,0,vekt,høyde);
		
		String utskrift = "Your name is\t\t" + data.getFirstname() + " " + data.getLastname()
											+ "\nYour age is (+/-):\t" + data.getAge()
											+ "\nMax frequency:\t" + heart.format(data.getAbsoluteheartrate())
											+ "\nTypical frequency:\t" + heart.format(data.getMinheartrate()) + " - " + heart.format(data.getMaxheartrate())
											+ "\nYour heigt is:\t\t" + bmi.format(data.getHeight()) + " m" 
											+ "\nYour weiht is:\t\t" + heart.format(data.getWeight()) + " kg" 
											+ "\nAnd your BMI is:\t" + bmi.format(data.bmi());
		body.append(utskrift);
		
		JOptionPane.showMessageDialog(null, body);
		
	}
}