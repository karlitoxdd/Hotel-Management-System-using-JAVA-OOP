import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class SalesTablePanel extends JPanel{
	static JTable tblSales;
	static DefaultTableModel model_Sales = new DefaultTableModel();
	static TableRowSorter tbl_SalesSort = new TableRowSorter();
	ProjDatabase data;
	Listener listen = new Listener();
	
	public SalesTablePanel(){ //to display sales
		data = new ProjDatabase("SalesColumn.txt");
		model_Sales = new DefaultTableModel();
		data.setSalesColumn(model_Sales);
		
		
		data = new ProjDatabase("Sales.txt");
		data.setSalesRow(model_Sales);
		tblSales = new JTable(model_Sales);
		tblSales .addMouseListener(listen);
	
		SalesPanel.txtSalesID.setText(getRowCount()+"");
		setLayout(new BorderLayout());
		add(new JScrollPane(tblSales), BorderLayout.CENTER);
	}
	public static int getRowCount() {
		return model_Sales.getRowCount()+901;
	}
}
