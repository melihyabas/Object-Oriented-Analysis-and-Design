/**
 * Global storage class. Sets its own properties
 */
public class GlobalStorage extends Storage{

	public GlobalStorage()
	{
		SetType("Max 32 GB");
	}

	public GlobalStorage(String s)
	{
		SetType("Max 32 GB");
		SetSupport(s);		
	}

}