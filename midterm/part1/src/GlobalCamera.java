/**
 * Global camera class. Sets its own properties
 */
public class GlobalCamera extends Camera{

	public GlobalCamera()
	{
		SetType("Opt. x2 Zoom");
	}

	public GlobalCamera(String s)
	{
		SetType("Opt. x2 Zoom");
		SetPixel(s);		
	}

}