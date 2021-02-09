/**
 * This is an adapter class. It is a converter from modern payment to turbo payment
 */
public class Adapter implements ModernPayment{

	TurboPayment turbo;

	/**
	 * Constructure
	 * @param turbo old method object
	 */
	public Adapter(TurboPayment turbo)
	{
		this.turbo = turbo;
	}

	/**
	 *
	 * @param cardNo Card number
	 * @param amount Amount of money
	 * @param destination Destination account
	 * @param installments
	 * @return
	 */
	public int pay(String cardNo, float amount, String destination, String installments){

		System.out.println("\n-Adaption ModernPayment to TurboPayment-\n");


		return turbo.payInTurbo(cardNo, amount, destination, installments);
	}

}
