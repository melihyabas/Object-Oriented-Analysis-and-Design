/**
 * Global cpu and ram class. Sets its own properties
 */
public class GlobalCPURAM extends CPURAM{

	public GlobalCPURAM()
	{
		SetType("2 cores");
	}

	public GlobalCPURAM(String s)
	{
		SetType("2 cores");
		SetCapacity(s);		
	}

}