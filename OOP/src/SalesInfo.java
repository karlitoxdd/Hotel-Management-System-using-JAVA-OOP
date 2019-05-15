import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class SalesInfo extends JPanel{
	static JTable tblSalesInfo;
	static DefaultTableModel model_SalesInfo = new DefaultTableModel();
	static TableRowSorter tbl_SalesInfoSort = new TableRowSorter();
	ProjDatabase data;
	Listener listen = new Listener();
	
	public SalesInfo() { //to display info of sales
		data = new ProjDatabase("TransactionColumn.txt");
		model_SalesInfo = new DefaultTableModel();
		data.setSalesColumn(model_SalesInfo);
		
		data = new ProjDatabase("Transaction.txt");
		data.setSalesInfoRow(model_SalesInfo);
		tblSalesInfo = new JTable(model_SalesInfo);
		tblSalesInfo .addMouseListener(listen);
		
		setLayout(new BorderLayout());
		add(new JScrollPane(tblSalesInfo), BorderLayout.CENTER);
	}
}
