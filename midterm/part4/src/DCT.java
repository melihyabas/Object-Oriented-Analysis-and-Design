import java.io.*; 
import java.util.*;

/**
 * DCT methot implementation
 */
public class DCT extends TemplateTransform {

	public DCT()
	{

	}
	/**
	 * Constructor for DCT
	 * @param inputFile file name
	 */
    public DCT(String inputFile)
    {
    	this.inputFile = inputFile;
		method = "DCT";
    }
	/**
	 * Calculation method for DCT
	 */
    public void transform()
    {
		int i, j,  N = numbers.size();
		double o=0.0 , val;

		for ( i = 0; i < N; i++) 
		{
			for ( j = 0; j < N; j++) 
			{
				val = (Math.PI/N)*(j+0.5)*i;
				
				o += (numbers.get(j))*(Math.cos(val)); 

			}

			output.add(String.format("%.3f", o));
			o=0.0;
		}
    }

    public void hook()
    {
    	
    }

}