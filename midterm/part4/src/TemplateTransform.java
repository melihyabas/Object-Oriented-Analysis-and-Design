import java.io.*; 
import java.util.*;

/**
 * A template class for calculation methods
 */
public abstract class TemplateTransform {

	/**
	 * input file name
	 */
	protected String inputFile;
	
	protected ArrayList<Double> numbers= new ArrayList<Double>(1);

	protected ArrayList<String> output= new ArrayList<String>(1);

	protected String method = null;

    public abstract void transform();

    public abstract void hook();

	/**
	 * Method to read from input file
	 * @throws Exception File not found
	 */
    public void readInput() throws Exception
    {
	    StringBuffer sb = new StringBuffer();
	    String str;
	    double num;
	    FileReader fr = 
	    new FileReader(inputFile); 

	    int i; 
	    while ((i=fr.read()) != -1){
	        if((char)i != '\t')
	        {
	            sb.append((char)i);    
	        }
	        else
	        {
	            str = sb.toString();

	            num = Double.parseDouble(str);

	            numbers.add(num);
	            str=null;
	            sb.setLength(0);
	        }
	  
	    }
	    str = sb.toString();

	    num = Double.parseDouble(str);

	    numbers.add(num);
	    str=null;
	    sb.setLength(0);


    }

	/**
	 * Write output into the output file
	 * @throws IOException File not found etc
	 */
    public void writeOutput() throws IOException
    {
		FileWriter fileWriter = null;
		int i;

    	if(method.equals("DFT"))
	   	 	fileWriter = new FileWriter("OutputDFT.txt");
    	if(method.equals("DCT"))
	   	 	fileWriter = new FileWriter("OutputDCT.txt");

	    PrintWriter printWriter = new PrintWriter(fileWriter);

	    for(i=0 ; i<output.size() ; i++)
	    	printWriter.print(output.get(i)+"\n");


	    printWriter.close();

    }

	/**
	 * Calls necessary functions for calculation
	 * @throws Exception
	 */
    public void calculation() throws Exception
    {
        readInput();
        transform();
        writeOutput();
    	if(method.equals("DFT"))
    	hook();
    }


}
