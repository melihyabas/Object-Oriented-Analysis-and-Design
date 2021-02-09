/**
 * Table interface keeps important methods
 */
public interface ITable {

	public Object getElementAt(int row, int column);
	public void setElementAt(Object element, int row, int column );
	public int getNumberOfRows();
}
