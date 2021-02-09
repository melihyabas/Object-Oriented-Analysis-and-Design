public interface AbstractFactory{

	public CPURAM attachCpuRam();
	public Display attachDisplay();
	public Battery attachBattery();
	public Storage attachStorage();
	public Camera attachCamera();
	public Case enclosePhone();

}
