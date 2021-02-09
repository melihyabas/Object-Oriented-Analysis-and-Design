/**
 * Global display class. Sets its own properties
 */
public class GlobalDisplay extends Display{

	public GlobalDisplay()
	{
		SetType("24 bit");
	}

	public GlobalDisplay(String s)
	{
		SetType("24 bit");
		SetInches(s);		
	}

}