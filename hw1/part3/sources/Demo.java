//package javaDoc;

/***
*@author Melih Yabaş
*/
public class Demo{
	/***
	*
	*This is a driver main function to test the program
	*/
	public static void main(String args[]){

		Suit suit = new ora();
		suit = new Laser(suit);
		suit = new RocketLauncher(suit);
		System.out.print("\nCombination: "+suit.getDescription()+"\n");
		System.out.print("Total Price: "+suit.cost()+"k\n");
		System.out.print("Total Weight: "+suit.weight()+"kg\n");

		Suit suit2 = new dec();
		suit2 = new Laser(suit2);
		suit2 = new AutoRifle(suit2);
		suit2 = new Flamethrower(suit2);
		suit2 = new RocketLauncher(suit2);
		System.out.print("\nCombination: "+suit2.getDescription()+"\n");
		System.out.print("Total Price: "+suit2.cost()+"k\n");
		System.out.print("Total Weight: "+suit2.weight()+"kg\n");

		Suit suit3 = new tor();
		suit3 = new Laser(suit3);
		suit3 = new RocketLauncher(suit3);
		suit3 = new AutoRifle(suit3);

		System.out.print("\nCombination: "+suit3.getDescription()+"\n");
		System.out.print("Total Price: "+suit3.cost()+"k\n");
		System.out.print("Total Weight: "+suit3.weight()+"kg\n");
	}
}
