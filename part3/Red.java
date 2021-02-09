import java.util.*;
/****
 *
 * Red State of the light
 */
public class Red implements State, Observer{

    private int timeout_X;
    Observable observable;
    Light light;

    public Red(Light l, Observable obs)
    {

    	timeout_X = 15;
    	light = l;
    	observable = obs;
    	obs.addObserver(this);
    }

    public void red()
	{

    }
    public void green()
    {
       if(light.currentTime == timeout_X)
        {
            System.out.println("\nSwitcing green...\n");
            light.state = light.green;
            light.currentTime = 0;
        }    	
    }
    public void yellow()
    {

    }
	public String toString()
	{
		return "Red State";
	}
    public void update(Observable obs, Object obj)
    {

    }
}
