/**
 * Europe display class. Sets its own properties
 */
public class EUDisplay extends Display{

	public EUDisplay()
	{
		SetType("24 bit");
	}

	public EUDisplay(String s)
	{
		SetType("24 bit");
		SetInches(s);		
	}

}