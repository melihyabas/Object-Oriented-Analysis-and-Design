/**
 * A phone model that has some properties
 */
public class IIAmanIflas extends Phone{

    AbstractFactory factory;

    public IIAmanIflas(AbstractFactory factory) 
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
    	display.SetInches("4.5 inches");
    }
    public void batteryOfPhone()
    {
		battery.SetAmper("16h, 2000mAh");
    }
    public void cpuramOfPhone()
    {
		cpuram.SetCapacity("2.2GHz, 4GB");
    }
    public void storageOfPhone()
    {
		storage.SetSupport("MicroSD support, 16GB");
    }
    public void cameraOfPhone()
    {
		camera.SetPixel("8Mp front, 5Mp rear");
    }
    public void caseOfPhone()
    {
		thecase.SetStrength("143x69x7.3 mm waterproof, plastic");    	
    }
	
}
