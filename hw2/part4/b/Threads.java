import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors;
import java.util.Random;

/***
 * This thread class tests the system in a parallel way
 */
public class Threads implements Runnable    
{ 
    private String name; 
    private ITable table;
    public Threads(String s, ITable table) 
    { 
        name = s; 
        this.table = table;
    } 
      
    // Prints task name and sleeps for 1s 
    // This Whole process is repeated 5 times 
    public void run() 
    { 
        try
        { 
            Random gen = new Random();
            int rand1;
            int rand2;
            int randEl;

            for (int i = 0; i<=5; i++) 
            { 
                if (i==0) 
                { 
                    System.out.println(name + " starting...");    
                } 
                else
                { 
                    rand1= gen.nextInt(10);
                    rand2= gen.nextInt(10);
                    randEl= gen.nextInt(100);                   
                    System.out.println(name + " Set Element: "+ randEl +", Position: "+ rand1 + ", " + rand2);                        
                    table.setElementAt(randEl,rand1,rand2); 
                    System.out.println("\n"+name + " Get Element At "+rand1+", "+rand2+ " Return Value: "+table.getElementAt(rand1,rand2));                        
                    
                } 
            } 
            System.out.println(name+" complete"); 
        } 
          
        catch(Exception e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 