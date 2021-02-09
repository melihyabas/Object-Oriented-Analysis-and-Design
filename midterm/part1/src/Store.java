/**
 * A general store class to create specific stores
 */
public abstract class Store {
	
	public abstract Phone producePhone(String phoneName);

	/**
	 * @param s Phone ordering method
	 * @return A phone with all components
	 */
	public Phone order(String s)
	{
		Phone phone = producePhone(s);
		phone.makeModel();
		phone.displayOfPhone();
		phone.batteryOfPhone();
		phone.cpuramOfPhone();
		phone.storageOfPhone();
		phone.cameraOfPhone();
		phone.caseOfPhone();

		return phone;
	}
}