/**
 * Turkey battery class. Sets its own properties
 */
public class TurkeyBattery extends Battery{

	public TurkeyBattery()
	{
		SetType("Lithium-Boron");
	}

	public TurkeyBattery(String s)
	{
		SetType("Lithium-Boron");
		SetAmper(s);		
	}

}