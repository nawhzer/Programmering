import javax.swing.*;
public class Monthtest
{
	public static void main(String[] args)
	{
		int dag;
		int måned;
		int år;
		
		do
		{
			String input = JOptionPane.showInputDialog(null, "Skrivv inn dat på formen dd.mm.åååå her:");
		
			dag = Integer.parseInt(input.substring(0,2));
			måned = Integer.parseInt(input.substring(3,5));
			år = Integer.parseInt(input.substring(6));
		
			Ukeoppgave1.månedsdager(måned, år);
			
			if(Ukeoppgave1.okDato(dag, måned, år)==false)
				JOptionPane.showMessageDialog(null, "Ugyldig dag");
			
		}while(Ukeoppgave1.okDato(dag, måned, år)==false);
		
		if(Ukeoppgave1.okDato(dag, måned, år))
			JOptionPane.showMessageDialog(null, dag + ". " +
		 									Ukeoppgave1.månedsnavn(måned) + " " + år);
		
	}
}