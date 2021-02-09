/**
 * Europe battery class. Sets its own properties
 */
public class EUBattery extends Battery{

	public EUBattery()
	{
		SetType("Lithium-Ion");
	}

	public EUBattery(String s)
	{
		SetType("Lithium-Ion");
		SetAmper(s);		
	}

}
