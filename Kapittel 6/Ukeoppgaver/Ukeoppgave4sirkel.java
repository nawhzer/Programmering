import javax.swing.*;
import java.text.DecimalFormat;

public class Ukeoppgave4sirkel
{
	private double radius;
	
	public Ukeoppgave4sirkel(double r)
	{
		radius = r > 0 ? r : 0.0;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double diameter()
	{
		return 2*radius;
	}
	
	public double omkrets()
	{
		return 2*radius*Math.PI;
	}
	
	public double areal()
	{
		return radius*radius*Math.PI;
	}
	
	
	public String toString()
	{
		DecimalFormat fo = new DecimalFormat("0.00");
		String sirkeldata = "Radius: " + fo.format(getRadius()) + " Omkrets: " + fo.format(omkrets()) + " Areal: " + fo.format(areal());
		return sirkeldata;
	}
}