/***
*This class keeps satellite data
*
*/
public class Satellite implements Container{

	public Satellite()
	{
	}
	public MyIterator getIterator(int[][] data)
	{
		return new MyIterator(data);

	}


}
