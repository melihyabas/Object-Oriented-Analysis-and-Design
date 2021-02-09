/**
 * Europe storage class. Sets its own properties
 */
public class EUStorage extends Storage{

	public EUStorage()
	{
		SetType("Max 64 GB");
	}

	public EUStorage(String s)
	{
		SetType("Max 64 GB");
		SetSupport(s);		
	}

}