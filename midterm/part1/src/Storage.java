/**
 * Storage component
 */
public abstract class Storage{
	private String type;
	private String support;

	/**
	 * @param type Type of storage
	 */
	public void SetType(String type){
		this.type = type;
	}

	/**
	 * @param support Support of storage
	 */
	public void SetSupport(String support){
		this.support = support;
	}

	public String GetType()
	{
		return type;
	}

	public String GetSupport()
	{
		return support;
	}
}
