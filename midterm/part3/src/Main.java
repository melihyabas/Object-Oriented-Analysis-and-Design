/***
 * Test all the system
 */
public class Main {
    public static void main(String args[])
    {

    	Transaction trs = new Transaction();

    	DataBase database = new DataBase();

    	trs.setCommand(new Select(database));
    	trs.applyCommand();

    	trs.setCommand(new Update(database));
    	trs.applyCommand();

    	trs.setCommand(new Alter(database));
    	trs.applyCommand();

    	trs.setCommand(new Update(database));
    	trs.applyCommand();

    	trs.setCommand(new Update(database));
    	trs.applyCommand();

    	trs.setCommand(new Alter(database));
    	trs.applyCommand();

    	trs.setCommand(new Select(database));
    	trs.applyCommand();

    	trs.setCommand(new Select(database));
    	trs.applyCommand();
 
    	trs.setCommand(new Update(database));
    	trs.applyCommand();



    	//*Error Situation*//

    	trs.undoCommands();
	    }
}
