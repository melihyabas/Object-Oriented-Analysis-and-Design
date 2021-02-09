/**
 * Battery component
 */
public abstract class Battery{
	private String type;
	private String amper;

	/**
	 * @param type Battery type
	 */
	public void SetType(String type){
		this.type = type;
	}

	/**
	 * @param amper Battery amper
	 */
	public void SetAmper(String amper){
		this.amper = amper;
	}

	public String GetType()
	{
		return type;
	}

	public String GetAmper()
	{
		return amper;
	}
}
