/***
 * This is a driver class to test all the other methods of classes
 */
public class Main
{
    /***
     * main method of program
     * @param args
     */
    public static void main(String[] args)
    {
        int i, j;
        int[][] data = new int[7][7];

        int x = 1;
        for (i = 0; i < data.length; i++)
        {
            for (j = 0; j < data[i].length; j++)
            {
                data[i][j] = x;
                x++;
            }
        }


        System.out.printf("\nTwo dimensional array:\n");
        for (i = 0; i < data.length; i++)
        {
            for (j = 0; j < data[i].length; j++)
            {
               System.out.printf("%s ", data[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");
	
	Satellite sat = new Satellite();
        MyIterator obj = sat.getIterator(data);


        System.out.printf("\nThe 2D array is printing spirally clockwise... \n");
        obj.printSpiral(0);
    }

}
