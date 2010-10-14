import javax.swing.*;

public class Arrayer
{
	public static void main(String[] args)
	{
		String[] alternativer = {"ja", "nei", "wtf?", "flere kanpper"};
		int svar = JOptionPane.showOptionDialog(null, "LOL?", "OMG", 
											JOptionPane.YES_NO_OPTION, 
											JOptionPane.QUESTION_MESSAGE, null, 
											alternativer, alternativer[1]);
		
	}
}