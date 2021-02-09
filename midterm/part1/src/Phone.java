/**
 * Keeps phone properties and methods for them
 */
public abstract class Phone{

    Display display;
    Battery battery;
    CPURAM cpuram;
    Storage storage;
    Camera camera;
    Case thecase;

    public abstract void makeModel();

    public abstract void displayOfPhone();
    public abstract void batteryOfPhone();
    public abstract void cpuramOfPhone();
    public abstract void storageOfPhone();
    public abstract void cameraOfPhone();
    public abstract void caseOfPhone();


}
