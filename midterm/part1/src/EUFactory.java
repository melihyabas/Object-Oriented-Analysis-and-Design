/**
 * Europe factory class. Returns its own components
 */
public class EUFactory implements AbstractFactory{

	public CPURAM attachCpuRam()
	{
		return new EUCPURAM();
	}
	public Display attachDisplay()
	{
		return new EUDisplay();
	}
	public Battery attachBattery()
	{
		return new EUBattery();
	}
	public Storage attachStorage()
	{
		return new EUStorage();
	}
	public Camera attachCamera()
	{
		return new EUCamera();
	}
	public Case enclosePhone()
	{
		return new EUCase();
	}
	
}