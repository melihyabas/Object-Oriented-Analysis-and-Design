import java.util.*;

/****
 *
 * Green State of the light
 */
public class Green implements State, Observer{

    private int timeout_X;
    Observable observable;
    Light light;
    boolean overwhelmed = false;

    public Green(Light l, Observable obs)
    {

    	timeout_X = 60;
    	light = l;
    	observable = obs;
    	obs.addObserver(this);
    }

	public void red()
	{

	}
	public void green()
	{

	}
    public void yellow()
	{
		if(light.currentTime == timeout_X)
		{
			System.out.println("\nSwitching yellow...\n");
			light.currentTime = 0;
			light.state = light.yellow;
		}	
	}
	public String toString()
	{
		return "Green State";
	}
   public void update(Observable obs, Object obj)
    {

    	HiTech ht = (HiTech)obs;

    	if(ht.getFlag())
    	{
    		timeout_X = 90;
    	}
    }

}
