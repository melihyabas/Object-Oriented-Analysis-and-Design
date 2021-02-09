/**
 * Global camera class. Sets its own properties
 */
public class TurkeyCamera extends Camera{

	public TurkeyCamera()
	{
		SetType("Opt. x4 Zoom");
	}

	public TurkeyCamera(String s)
	{
		SetType("Opt. x4 Zoom");
		SetPixel(s);		
	}

}