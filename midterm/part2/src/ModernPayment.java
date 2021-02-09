public interface ModernPayment{
	/**
	 *
	 * @param cardNo Card number
	 * @param amount Amount of money
	 * @param destination Destination account
	 * @param installments
	 * @return
	 */
	int pay(String cardNo, float amount, String destination, String installments);
}