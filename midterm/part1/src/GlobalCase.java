/**
 * Global case class. Sets its own properties
 */
public class GlobalCase extends Case{

	public GlobalCase()
	{
		SetType("Waterproof up to 50cm");
	}

	public GlobalCase(String s)
	{
		SetType("Waterproof up to 50cm");
		SetStrength(s);		
	}

}
