/*
*This class used to choose a method for calculation.
*/
public class Context{

	private Strategy choice;

	/*
	* Constructure to select method
	*/
	public Context(Strategy choice){
		this.choice = choice;
	}

	/*
	* Starts calculation
	*/
	public double[] calculate(double arr[][],  double b[]){
		return (choice.calculation(arr, b));
	}

}