import java.util.*;
/****
 *
 * Yellow State of the light
 */
public class Yellow implements State, Observer{

    private int timeout_X;
    Observable observable;
    Light light;

    public Yellow(Light l, Observable obs)
    {
    	timeout_X = 3;
    	light = l;
    	observable = obs;
    	obs.addObserver(this);
    }
    public void red()
    {
 		if(light.currentTime == timeout_X)
        {
            System.out.println("\nSwitcing red...\n");
            light.state = light.red;
            light.currentTime = 0;
        } 
    }
    public void green()
    {

    }
    public void yellow()
    {

    }

	public String toString()
	{
		return "Yellow State";
	}

    public void update(Observable obs, Object obj)
    {

    }
} 
