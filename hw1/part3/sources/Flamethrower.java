//package javaDoc;
public class Flamethrower extends AccessoriesDecorator{
	Suit suit;
	/**
	* Constructure to combine a suit with Laser
	*/
	public Flamethrower(Suit suit){
		this.suit = suit;
	}
	/**
	*@return Flamethrower and the name of all other things
	*/
	public String getDescription(){
		return suit.getDescription() + ", Flamethrower";
	}
	/**
	* Total cost of Flamethrower and the other things inside of this object
	*/
	public double cost(){
		return 50 + suit.cost();

	}
	/**
	* Total weight of Flamethrower and the other things inside of this object
	*/
	public double weight(){
		return 2 + suit.weight();
	}
}

