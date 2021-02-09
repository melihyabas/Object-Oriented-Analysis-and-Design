//package javaDoc;
public class AutoRifle extends AccessoriesDecorator{
	Suit suit;
	/**
	* Constructure to combine a suit with AutoRifle
	*/
	public AutoRifle(Suit suit){
		this.suit = suit;
	}
	/**
	*@return AutoRifle and the name of all other things
	*/
	public String getDescription(){
		return suit.getDescription() + ", AutoRifle";
	}
	/**
	* Total cost of AutoRifle and the other things inside of this object
	*/
	public double cost(){
		return 30 + suit.cost();

	}
	/**
	* Total weight of AutoRifle and the other things inside of this object
	*/
	public double weight(){
		return 1.5 + suit.weight();
	}
}



