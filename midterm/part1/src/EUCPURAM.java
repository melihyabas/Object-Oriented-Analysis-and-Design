/**
 * Europe cpu and class. Sets its own properties
 */
public class EUCPURAM extends CPURAM{

	public EUCPURAM()
	{
		SetType("4 cores");
	}

	public EUCPURAM(String s)
	{
		SetType("4 cores");
		SetCapacity(s);		
	}

}