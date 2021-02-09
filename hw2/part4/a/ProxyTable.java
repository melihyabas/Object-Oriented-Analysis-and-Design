/**
 * Proxytable uses table class and controls it
 */
public class ProxyTable implements ITable {
	Table realTable;
	Integer[] lockArr;
	public ProxyTable(Table toLock) {
		realTable = toLock;
		lockArr = new Integer[toLock.getNumberOfRows()];
		for (int row = 0; row < toLock.getNumberOfRows(); row++)
			lockArr[row] = new Integer(row);
	}

	public Object getElementAt(int row, int column) {
		synchronized (lockArr[row]) {
			return realTable.getElementAt(row, column);
		}
	}

	public void setElementAt(Object element, int row, int column) {
		synchronized (lockArr[row]) {
			realTable.setElementAt(element, row, column);
		}
	}

	public int getNumberOfRows() {
		return realTable.getNumberOfRows();
	}
}
