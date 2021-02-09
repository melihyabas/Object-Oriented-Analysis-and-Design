import java.util.*;

/**
 * Subject of the observers
 */
public class HiTech extends Observable
{

	private boolean flag;

    /***
     * When traffic change. This method controls the camera
     * @param flag if flag true, there is too much traffic
     */
    public void changeDetected(boolean flag)
    {
        
        this.flag = flag;
        
        setChanged();
        
        notifyObservers();
    }

    public boolean getFlag()
    {
    	return flag;
    }
    

}