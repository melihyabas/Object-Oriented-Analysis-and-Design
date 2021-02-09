import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors;

public class Main{

    public static void main(String[] args) {
 
    	/*---------TEST FOR PART B---------*/
    	System.out.println("TEST FOR PART B");
    	Table tbl = new Table();
    	UpdatedProxyTable obj = new UpdatedProxyTable(tbl);

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