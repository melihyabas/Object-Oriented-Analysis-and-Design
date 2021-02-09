/***
 * Main class tests the program
 */
public class Main {

    public static void main(String[] args) {
   		
   		Light light = new Light();     
    	int i = 0;
		int seconds = 200; //change it to test how many seconds do you want to see    

   		for(i=0 ; i<seconds ; i++)
        {
            light.showSituation();        
        }

        /*Test it with heavy traffic*/	

        light.ChangeTraffic(true);
        
        System.out.println("\n\n--------------------------------\nThere is an heavy traffic out there!\n\n");
   		for(i=0 ; i<seconds ; i++)
        {
            light.showSituation();        
        }

    }
}
