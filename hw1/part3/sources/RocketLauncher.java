//package javaDoc;
/***
*	This class describes features of RocketLauncher accessory
*/
public class RocketLauncher extends AccessoriesDecorator{
	Suit suit;

	/**
	* Constructure to combine a suit with RocketLauncher
	*/
	public RocketLauncher(Suit suit){
		this.suit = suit;
	}

	/**
	*@return RocketLauncher and the name of all other things
	*/
	public String getDescription(){
		return suit.getDescription() + ", RocketLauncher";
	}

	/**
	* Total cost of rocket launcher and the other things inside of this object
	*/
	public double cost(){
		return 150 + suit.cost();

	}

	/**
	* Total weight of rocket launcher and the other things inside of this object 
	*/
	public double weight(){
		return 7.5 + suit.weight();
	}
}
