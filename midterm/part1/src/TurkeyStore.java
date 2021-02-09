/**
 * Turkey store class. Produces its phones using its factory
 */
public class TurkeyStore extends Store{
	
	public Phone producePhone(String phoneName)
	{
		AbstractFactory factory = new TurkeyFactory();
		Phone phone = null;
		if(phoneName.equals("IIAmanIflas"))
		{
			phone = new IIAmanIflas(factory);
		}
		else if(phoneName.equals("IflasDeluxe"))
		{
			phone = new IflasDeluxe(factory);
		}
		else if(phoneName.equals("MaximumEffort"))
		{
			phone = new MaximumEffort(factory);
		}

		return phone;
	}
}
