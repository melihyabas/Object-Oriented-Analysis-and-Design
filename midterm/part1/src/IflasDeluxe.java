/**
 * A phone model that has some properties
 */
public class IflasDeluxe extends Phone{
    

    AbstractFactory factory;

    public IflasDeluxe(AbstractFactory factory) 
    {
        this.factory = factory;
    }

    /**
     * Creates a phone model using specific properties
     */
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
    	display.SetInches("5.3 inches");
    }
    public void batteryOfPhone()
    {
		battery.SetAmper("20h, 2800mAh");
    }
    public void cpuramOfPhone()
    {
		cpuram.SetCapacity("2.2GHz, 6GB");
    }
    public void storageOfPhone()
    {
		storage.SetSupport("MicroSD support, 32GB");
    }
    public void cameraOfPhone()
    {
		camera.SetPixel("12Mp front, 5Mp rear");
    }
    public void caseOfPhone()
    {
		thecase.SetStrength("149x73x7.7 mm waterproof, aluminum");    	
    }
	
}
