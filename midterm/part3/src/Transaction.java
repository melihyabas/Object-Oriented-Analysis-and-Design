import java.util.Stack;

/**
 * This class keeps a command object. It can be used for multiple operations
 */
public class Transaction 
{ 
    Command command;
    Stack<Command> commands= new Stack<>();  
 
    public Transaction()
    { 
    } 
  
    public void setCommand(Command command) 
    { 
        // set the command the remote will 
        // execute 
        this.command = command;
        commands.push(command);

    } 
  
    public void applyCommand() 
    {
        command.execute();
    }

    /***
     * Undo all commands using stack
     */
    public void undoCommands() 
    {
        Command temp = commands.pop();
        while(commands.size()!=0)
        {
            temp.undo();
            temp = commands.pop();
        }      
       temp.undo();

    } 
} 
