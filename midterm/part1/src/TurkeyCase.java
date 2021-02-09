/**
 * Global case class. Sets its own properties
 */
public class TurkeyCase extends Case{

	public TurkeyCase()
	{
		SetType("Waterproof up to 2m");
	}

	public TurkeyCase(String s)
	{
		SetType("Waterproof up to 2m");
		SetStrength(s);		
	}

}
