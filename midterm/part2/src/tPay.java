public class tPay implements TurboPayment{

	public tPay(){
		
	}
	/***
	 * @param turboCardNo Card number
	 * @param turboAmount Amount of money
	 * @param destinationTurboOfCourse Destination account
	 * @param installmentsButInTurbo installments
	 * @return
	 */
	public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo){
		System.out.println("Card No: "+turboCardNo);		
		System.out.println("Amount: "+turboAmount);
		System.out.println("Destination: "+destinationTurboOfCourse);
		System.out.println("Installments: "+installmentsButInTurbo);

		return ((int)turboAmount);		
	}
	
}