/***
 * Alter command keeps a database object and for execute and undo operations
 */
public class Alter implements Command
{
    DataBase data;
  
    // The constructor is passed the light it 
    // is going to control. 
    public Alter(DataBase data)
    { 
       this.data = data; 
    } 
    public void execute() 
    { 
        System.out.print("Execute:\t");
        data.ALTER(); 
    }
    public void undo()
    {
        System.out.print("Undo:\t");
        data.ALTER(); 

    }
} 
