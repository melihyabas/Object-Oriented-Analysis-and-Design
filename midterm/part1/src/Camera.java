/**
 * Camera component
 */
public abstract class Camera{
	private String type;
	private String pixel;

	/**
	 * @param type Camera type
	 */
	public void SetType(String type){
		this.type = type;
	}

	/**
	 * @param pixel Camera pixel
	 */
	public void SetPixel(String pixel){
		this.pixel = pixel;
	}

	public String GetType()
	{
		return type;
	}

	public String GetPixel()
	{
		return pixel;
	}
}
