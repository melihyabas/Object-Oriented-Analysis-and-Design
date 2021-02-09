/**
 * Global display class. Sets its own properties
 */
public class TurkeyDisplay extends Display{

	public TurkeyDisplay()
	{
		SetType("32 bit");
	}

	public TurkeyDisplay(String s)
	{
		SetType("32 bit");
		SetInches(s);		
	}

}