//package javaDoc;
/***
*	This class describes features of Laser accessory
*/
public class Laser extends AccessoriesDecorator{
	Suit suit;
	
	/**
	* Constructure to combine a suit with Laser
	*/
	public Laser(Suit suit){
		this.suit = suit;
	}

	/**
	*@return Laser and the name of all other things
	*/
	public String getDescription(){
		return suit.getDescription() + ", Laser";
	}

	/**
	* Total cost of Laser and the other things inside of this object
	*/
	public double cost(){
		return 200 + suit.cost();

	}
	/**
	* Total weight of Laser and the other things inside of this object
	*/
	public double weight(){
		return 5.5 + suit.weight();
	}
}

