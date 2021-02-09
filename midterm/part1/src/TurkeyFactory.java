/**
 * Turkey factory class. Returns its own components
 */
public class TurkeyFactory implements AbstractFactory{

	public CPURAM attachCpuRam()
	{
		return new TurkeyCPURAM();
	}
	public Display attachDisplay()
	{
		return new TurkeyDisplay();
	}
	public Battery attachBattery()
	{
		return new TurkeyBattery();
	}
	public Storage attachStorage()
	{
		return new TurkeyStorage();
	}
	public Camera attachCamera()
	{
		return new TurkeyCamera();
	}
	public Case enclosePhone()
	{
		return new TurkeyCase();
	}
	
}