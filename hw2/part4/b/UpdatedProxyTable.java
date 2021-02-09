/**
 * Proxytable uses table class and controls it
 */
public class UpdatedProxyTable implements ITable {
	Table realTable;
	Integer[] locks;
	int setting = 1;

	public UpdatedProxyTable(Table toLock) {
		realTable = toLock;
		locks = new Integer[toLock.getNumberOfRows()];
		for (int row = 0; row < toLock.getNumberOfRows(); row++)
			locks[row] = new Integer(row);
	}

	public Object getElementAt(int row, int column) {
		synchronized (locks[row]) {
			while(setting>0)
			{
				try{
					wait();

				}
				catch(Exception e)
				{

				}
			}

			return realTable.getElementAt(row, column);
		}
	}

	public void setElementAt(Object element, int row, int column) {
		synchronized (locks[row]) {
			realTable.setElementAt(element, row, column);
			setting--;
		}
	}

	public int getNumberOfRows() {
		return realTable.getNumberOfRows();
	}
}
