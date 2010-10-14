public class HeartRates
{
	private String firstname;
	private String lastname;
	private int bornyear;
	private int age;
	private double absoluteheartrate;
	private double maxheartrate;
	private double minheartrate;
	private double height;
	private double weight;

	
	public HeartRates( String fn, String ln, int by, int a, double ahr, double maxhr, double minhr, double h, double w)
	{
		firstname = fn;
		lastname = ln;
		bornyear = by;
		age = a;
		absoluteheartrate = ahr;
		maxheartrate = maxhr;
		minheartrate = minhr;
		height = h;
		weight = w;
	
	}
	
	public void setFirstname(String first)
	{
		firstname = first;
	}
	
	public String getFirstname()
	{
		return firstname;
	}
	
	public void setLastname(String last)
	{
		lastname = last;
	}
	
	public String getLastname()
	{
		return lastname;
	}
	
	public void setBornyear(int year)
	{
		bornyear = year;
	}
	
	public int getBornyear()
	{
		return bornyear;
	}
	
	public void setAge(int alder)
	{
		age = 2010-bornyear;
	}
	
	public int getAge()
	{
		return 2010-bornyear;
	}
	
	
	public void setAbsoluteheartrate(double frekvens)
	{
		absoluteheartrate = frekvens;
	}
	
	public int getAbsoluteheartrate()
	{
		return 220-getAge();
	}
	
	public void setMaxheartrate(double maxfrekvens)
	{
		maxheartrate = maxfrekvens;
	}
	
	public double getMaxheartrate()
	{
		return 0.85*getAbsoluteheartrate();
	}
	
	public void setMinheartrate(double minfrekvens)
	{
		minheartrate = minfrekvens;
	}
	
	public double getMinheartrate()
	{
		return 0.5*getAbsoluteheartrate();
	}
	
	public void setHeight(double høyde)
	{
		height = høyde;
	}
	
	public double getHeight()
	{
		return height;
	}

	public void setWeight(double vekt)
	{
		weight = vekt;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	
	public double bmi()
	{
		return weight/(height*height);
	}
}