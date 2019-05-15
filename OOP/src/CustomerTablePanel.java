import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CustomerTablePanel extends JPanel{
	static JTable tblCust;
	static DefaultTableModel model_cust = new DefaultTableModel();
	static TableRowSorter tbl_CustSort = new TableRowSorter();
	ProjDatabase data;
	Listener listen = new Listener();
	
	public CustomerTablePanel() { //to display customer infos
		data = new ProjDatabase("CustomerColumn.txt");
		model_cust = new DefaultTableModel();
		data.setRoomColumn(model_cust);
		
		
		data = new ProjDatabase("Customer.txt");
		data.setRoomRow(model_cust);
		tblCust = new JTable(model_cust);
		tblCust .addMouseListener(listen);
	
		CustomerPanel.txtCustomerID.setText(getRowCount()+"");
		setLayout(new BorderLayout());
		add(new JScrollPane(tblCust), BorderLayout.CENTER);
	}


	public static int getRowCount() {
		return model_cust.getRowCount()+201;
	}
}
