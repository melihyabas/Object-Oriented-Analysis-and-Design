/**
 * A phone model that has some properties
 */
public class MaximumEffort extends Phone{

    AbstractFactory factory;

    public MaximumEffort(AbstractFactory factory) 
    {
        this.factory = factory;
    }

    public void makeModel()
    {
        display = factory.attachDisplay();
        battery = factory.attachBattery();
        cpuram = factory.attachCpuRam();
        storage = factory.attachStorage();
        camera = factory.attachCamera();
        thecase = factory.enclosePhone();
    }
    
    public void displayOfPhone()
    {
    	display.SetInches("5.5 inches");
    }
    public void batteryOfPhone()
    {
		battery.SetAmper("27h, 3600mAh");
    }
    public void cpuramOfPhone()
    {
		cpuram.SetCapacity("2.8GHz, 8GB");
    }
    public void storageOfPhone()
    {
		storage.SetSupport("MicroSD support, 64GB");
    }
    public void cameraOfPhone()
    {
		camera.SetPixel("12Mp front, 8Mp rear");
    }
    public void caseOfPhone()
    {
		thecase.SetStrength("151x73x7.7 mm, dustproof waterproof, aluminum");    	
    }
	
}
