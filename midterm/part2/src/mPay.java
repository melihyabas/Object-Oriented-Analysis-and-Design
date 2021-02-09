public class mPay implements ModernPayment{
	public mPay(){
		
	}
	/**
	 *
	 * @param cardNo Card number
	 * @param amount Amount of money
	 * @param destination Destination account
	 * @param installments
	 * @return
	 */
	public int pay(String cardNo, float amount, String destination, String installments)
	{
		System.out.println("Card No: "+cardNo);		
		System.out.println("Amount: "+amount);
		System.out.println("Destination: "+destination);
		System.out.println("Installments: "+installments);
		return ((int)amount);		
	}
}