/**
 * Cpu and Ram component
 */
public abstract class CPURAM{
	private String type;
	private String capacity;


	/**
	 * @param type Type of cpu and ram
	 */
	public void SetType(String type){
		this.type = type;
	}

	/**
	 * @param capacity Capacity of cpu and ram
	 */
	public void SetCapacity(String capacity){
		this.capacity = capacity;
	}

	public String GetType()
	{
		return type;
	}

	public String GetCapacity()
	{
		return capacity;
	}
}
