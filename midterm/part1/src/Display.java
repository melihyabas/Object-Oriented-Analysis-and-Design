/**
 * Display component
 */
public abstract class Display{
	private String type;
	private String inches;

	/**
	 * @param type Type of display
	 */
	public void SetType(String type){
		this.type = type;
	}

	/**
	 * @param inches Inches of display
	 */
	public void SetInches(String inches){
		this.inches = inches;
	}

	public String GetType()
	{
		return type;
	}

	public String GetInches()
	{
		return inches;
	}
}
