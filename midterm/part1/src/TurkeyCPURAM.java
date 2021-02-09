/**
 * Global cpu and ram class. Sets its own properties
 */
public class TurkeyCPURAM extends CPURAM{

	public TurkeyCPURAM()
	{
		SetType("8 cores");
	}

	public TurkeyCPURAM(String s)
	{
		SetType("8 cores");
		SetCapacity(s);		
	}

}