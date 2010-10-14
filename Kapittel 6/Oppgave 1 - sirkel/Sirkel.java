
public class Sirkel
{
	private double radius;
	
	public Sirkel( double r)
	{
		radius = r;
		if(r<0)
			radius = 0.0;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double diameter( double radius)
	{
		return radius*2;
	}
	
	public double omkrets(double radius)
	{
		return radius*2*Math.PI;
	}
	
	public double areal( double radius)
	{
		return Math.PI*radius*radius;
	}
}