//package javaDoc;
/***
*	This abstract class is a base for suits
*/
public abstract class Suit {
	 String description = "Unknown Suit";

	 public String getDescription() {
	 	return description;
	 }
	 public abstract double cost();
	 public abstract double weight();

}

