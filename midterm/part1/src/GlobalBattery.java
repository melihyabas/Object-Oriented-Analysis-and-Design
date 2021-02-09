/**
 * Global battery class. Sets its own properties
 */
public class GlobalBattery extends Battery{

	public GlobalBattery()
	{
		SetType("Lithium-Cobalt");
	}

	public GlobalBattery(String s)
	{
		SetType("Lithium-Cobalt");
		SetAmper(s);		
	}

}
