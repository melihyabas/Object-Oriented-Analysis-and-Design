public interface TurboPayment{
	/***
	 * @param turboCardNo Card number
	 * @param turboAmount Amount of money
	 * @param destinationTurboOfCourse Destination account
	 * @param installmentsButInTurbo installments
	 * @return
	 */
	int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo);
}