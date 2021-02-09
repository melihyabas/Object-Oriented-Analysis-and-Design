/**
 * Europe camera class. Sets its own properties
 */
public class EUCamera extends Camera{

	public EUCamera()
	{
		SetType("Opt. x3 Zoom");
	}

	public EUCamera(String s)
	{
		SetType("Opt. x3 Zoom");
		SetPixel(s);		
	}

}