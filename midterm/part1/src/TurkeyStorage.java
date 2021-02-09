/**
 * Turkey storage class. Sets its own properties
 */
public class TurkeyStorage extends Storage{

	public TurkeyStorage()
	{
		SetType("Max 128 GB");
	}

	public TurkeyStorage(String s)
	{
		SetType("Max 128 GB");
		SetSupport(s);		
	}

}