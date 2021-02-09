/**
 * A command interface for all commands
 */
public interface Command
{
    /**
     * Execute a command
     */
    public void execute();

    /**
     * Undo a command
     */
    public void undo();

} 
