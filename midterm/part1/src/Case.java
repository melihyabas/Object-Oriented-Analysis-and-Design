/**
 * Case component
 */
public abstract class Case{
	private String type;
	private String strength;

	/**
	 * @param type Case type
	 */
	public void SetType(String type){
		this.type = type;
	}

	/**
	 * @param strength Case strength
	 */
	public void SetStrength(String strength){
		this.strength = strength;
	}

	public String GetType()
	{
		return type;
	}

	public String GetStrength()
	{
		return strength;
	}
}
