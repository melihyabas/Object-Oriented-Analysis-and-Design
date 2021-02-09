import java.util.*;
/***
*
*This is a context class of the state pattern.
*
*/
public class Light{

	public int currentTime = 0;
	public State state;
	public HiTech hitech;

	public State red;
	public State green;
	public State yellow;

	public Light()
	{
		hitech = new HiTech();

		red = new Red(this, hitech);
		green = new Green(this, hitech);
		yellow = new Yellow(this, hitech);
		state = red;

        hitech.addObserver((Observer) green);
        hitech.addObserver((Observer) red);
        hitech.addObserver((Observer) yellow);
	}

	public void redState()
	{	
		state.red();
	}

	public void yellowState()
	{
		state.yellow();
	}

	public void greenState()
	{
		state.green();
	}

    public void showSituation()
    {
        
        state.red();
        state.yellow();
        state.green();
        
		currentTime++;        
        
        System.out.println(currentTime + "s -"  + state);     
    }

	public void ChangeTraffic(boolean flag)
	{
		hitech.changeDetected(flag);
	}



}
