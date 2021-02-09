import java.io. *;

/***
 * A main class to test the design
 */
public class Main{

	public static void main(String[] args) {

		TurboPayment tp = new tPay();

		ModernPayment adapter = new Adapter(tp);
	
		adapter.pay("1462534", 400, "4561456", "install");


	}
}
