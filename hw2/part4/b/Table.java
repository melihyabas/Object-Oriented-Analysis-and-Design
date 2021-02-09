public class Table implements ITable {

	int[][] matrix;

	public Table()
	{
		matrix = new int[10][10];

		for(int i=0 ; i<10 ; i++)
		{
			for(int j=0 ; j<10 ; j++)
			{
				matrix[i][j] = 0;
			}
		}
	}
	public Object getElementAt(int row, int column) {
		return matrix[row][column];
	}
	public void setElementAt(Object element, int row, int column ) {
		matrix[row][column] = (int)element;
	}
	public int getNumberOfRows() {
	//	System.out.println("GetNumberOfRows");
		return 10;
	}
}
