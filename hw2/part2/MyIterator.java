import java.util.Iterator;

/***
 * This class iterate a two dimentional array spirally.
 */
public class MyIterator implements Iterator {

    private MyArrayList d = new MyArrayList();
    private int index = 0;


    /*
        1->right
        2->down
        3->left
        4->top
    */

    /**
     * No parameter constructure.
     */
    public MyIterator()
    {

    }

    /***
     * The constructure takes an array and send it to the order method
     * @param data 2 dimensional array.
     */
    public MyIterator(int[][] data)
    {
        orderSpiral(data,data.length,data[0].length,1,0,0,0,0);
    }

    /***
     * This method keeps the array and spirally, adds to the list.
     * @param data Array
     * @param m Row
     * @param n Column
     * @param dir Direction
     * @param x X coordinate
     * @param y Y coordinate
     * @param startX Start of X
     * @param startY Start of Y
     */
    public void orderSpiral(int[][] data, int m, int n, int dir, int x, int y,int startX,int startY)
    {

        d.add(data[x][y]);
        if(dir == 1)
        {

            if(y<n-1)
            {
                orderSpiral(data,m,n,1,x,y+1,startX,startY);
            }
            else if(x<m-1)
            {
                orderSpiral(data,m,n,2,x+1,y,startX,startY);
            }
        }
        else if(dir == 2)
        {

            if(x<m-1)
            {
                orderSpiral(data,m,n,2,x+1,y,startX,startY);
            }
            else if(y>startY)
            {
                startX++;
                m--;
                orderSpiral(data,m,n,3,x,y-1,startX,startY);
            }
        }
        else if(dir == 3)
        {
            if(y>startY)
            {
                orderSpiral(data,m,n,3,x,y-1,startX,startY);
            }
            else if(x>startX)
            {
                n--;
                orderSpiral(data,m,n,4,x-1,y,startX,startY);
            }
        }
        else if(dir == 4)
        {

            if(x>startX)
            {

                orderSpiral(data,m,n,4,x-1,y,startX,startY);

            }
            else if (y<n-1)
            {
                startY++;
                orderSpiral(data,m,n,1,x,y+1,startX,startY);
            }
        }

    }

    /***
     * This method prints the structure recursively.
     * @param ix
     */
    public void printSpiral(int ix)
    {
        if(ix == d.getIndex())
            return;
        System.out.printf("%d ",d.get(ix++));
        printSpiral(ix);
    }

    /***
     * Returns the next element if it is exist.
     * @return next element
     */
    public Object next()
    {

        if(hasNext())
            return (d.get(++index));
        else
            throw new ArrayIndexOutOfBoundsException();
    }

    /***
     * Returns true if the next element exist.
     * @return Boolean value
     */
    public boolean hasNext()
    {
        return  (index<d.getIndex()-1);
    }

}
