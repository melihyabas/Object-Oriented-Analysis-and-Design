/**
 * Europe case class. Sets its own properties
 */
public class EUCase extends Case{

	public EUCase()
	{
		SetType("Waterproof up to 1m");
	}

	public EUCase(String s)
	{
		SetType("Waterproof up to 1m");
		SetStrength(s);		
	}

}
