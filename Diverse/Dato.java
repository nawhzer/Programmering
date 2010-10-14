public class Dato
{
	public static boolean lovligPersonnummer( String fnr)
	{
		if(lovligDato(fnr))
		{
			int p1 = Integer.parseInt(fnr.substring(0,1));
			int p2 = Integer.parseInt(fnr.substring(1,2));
			int p3 = Integer.parseInt(fnr.substring(2,3));
			int p4 = Integer.parseInt(fnr.substring(3,4));
			int p5 = Integer.parseInt(fnr.substring(4,5));
			int p6 = Integer.parseInt(fnr.substring(5,6));
			int p7 = Integer.parseInt(fnr.substring(6,7));
			int p8 = Integer.parseInt(fnr.substring(7,8));
			int p9 = Integer.parseInt(fnr.substring(8,9));
			int p10 = Integer.parseInt(fnr.substring(9,10));
			int p11 = Integer.parseInt(fnr.substring(10,11));
		
			if(((3*p1 + 7*p2 + 6*p3 + 1*p4 + 8*p5 + 
				9*p6 + 4*p7 + 5*p8 + 2*p9 + 1*p10)%11) == 0)
				return true;
			if(((5*p1 + 4*p2 + 3*p3 + 2*p4 + 7*p5 +
				6*p6 + 5*p7 + 4*p8 + 3*p9 + 2*p10 + 1*p11)%11) == 0)
				return true;
			if(fnr.length()==11)
				return true;
		}
		return false;
	}
	
	public static boolean lovligDato( String dato)
	{
		int dag = Integer.parseInt(dato.substring(0,2));
		int måned = Integer.parseInt(dato.substring(2,4));
		String år = dato.substring(4,6);
		int årstall = Integer.parseInt(år);
		if(årstall>4)
			år=19+år;
		else
			år=20+år;
			
		årstall=Integer.parseInt(år);
		
		if(((årstall%4==0 && årstall%100!=0) || årstall%400==0) && (måned==2) && (dag>29))
			return false;
		
		if(!((årstall%4==0 && årstall%100!=0) || årstall%400==0) && (måned==2) && (dag>28))
			return false;
			
		if(måned < 0 || måned >12)
			return false;
		
			
		switch(måned)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:if(måned>31)
						return false;
			case 2:if(måned>28)
						return false;
			case 4:
			case 6:
			case 9:
			case 11:if(måned>30)
						return false;
		}
		
		return true;
		
	}
}