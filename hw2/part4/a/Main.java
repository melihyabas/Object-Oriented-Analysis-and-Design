import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors;

/***
 * Main class tests the program using threads
 */
public class Main{

    public static void main(String[] args) {
 
    	/*---------TEST FOR PART 1---------*/
    	System.out.println("TEST FOR PART a");
    	Table tbl = new Table();
    	ProxyTable obj = new ProxyTable(tbl);

        Threads th1 = new Threads("Thread1", obj); 
        Threads th2 = new Threads("Thread2", obj); 
        Threads th3 = new Threads("Thread3", obj); 

   
        ExecutorService pool = Executors.newFixedThreadPool(3);   
         
        pool.execute(th1); 
        pool.execute(th2); 
        pool.execute(th3); 

        pool.shutdown();





    }
}