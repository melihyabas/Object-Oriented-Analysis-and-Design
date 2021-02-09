/***
 * Update command keeps a database object and for execute and undo operations
 */
public class Update implements Command
{ 
    DataBase data;
  
    // The constructor is passed the light it 
    // is going to control. 
    public Update(DataBase data)
    { 
       this.data = data; 
    } 
    public void execute() 
    { 
       System.out.print("Execute:\t");
       data.UPDATE(); 
    }
    public void undo()
    {
        System.out.print("Undo:\t");
        data.UPDATE(); 

    }
} 
