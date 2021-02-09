/**
 * Global factory class. Returns its own components
 */
public class GlobalFactory implements AbstractFactory{

	public CPURAM attachCpuRam()
	{
		return new GlobalCPURAM();
	}
	public Display attachDisplay()
	{
		return new GlobalDisplay();
	}
	public Battery attachBattery()
	{
		return new GlobalBattery();
	}
	public Storage attachStorage()
	{
		return new GlobalStorage();
	}
	public Camera attachCamera()
	{
		return new GlobalCamera();
	}
	public Case enclosePhone()
	{
		return new GlobalCase();
	}
	
}