import java.io.*; 
import java.util.*;

public class DFT extends TemplateTransform
{

	private double start;
	public DFT()
	{

	}

	/**
	 * Constructure for DFT
	 * @param inputFile file name
	 */
	public DFT(String inputFile)
	{
		this.inputFile = inputFile;
		method = "DFT";
	}

	/**
	 * Calculation method for DFT
	 */
	public void transform()
	{

        start = System.currentTimeMillis();

		int i, j,  N = numbers.size();
		double rl=0.0 , im=0.0, val;

		for ( i = 0; i < N; i++) 
		{
			for ( j = 0; j < N; j++) 
			{
				val = 2*(Math.PI)*i*j/N;
				
				rl += (numbers.get(j))*(Math.cos(val)); 
				im += -(numbers.get(j))*(Math.sin(val)); 

			}
			output.add(String.format("%.3f", rl)+String.format("\t%.3f i", im));

			rl=0.0;
			im=0.0;
		}

	}

	/**
	 * Calculates time of execution.
	 */
    public void hook()
    {
    	System.out.println("Do you want to know time of Execution? (Press Y)");

        Scanner sc = new Scanner(System.in); 
        
        char c = sc.next().charAt(0);

        if(c=='Y' || c=='y')
        {
    		System.out.println((System.currentTimeMillis()- start) + " millisecond" );
        }     	
    }

}