import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TransactionTablePanel extends JPanel{
static JTable tblTrans;
static DefaultTableModel model_trans = new DefaultTableModel();
static TableRowSorter tbl_TransSort = new TableRowSorter();
ProjDatabase data;
Listener listen = new Listener();
public TransactionTablePanel() { //table to display sales
	data = new ProjDatabase("TransactionColumn.txt");
	model_trans = new DefaultTableModel();
	data.setTransColumn(model_trans);
	
	
	data = new ProjDatabase("Transaction.txt");
	data.setTransRow(model_trans);
	tblTrans = new JTable(model_trans);
	tblTrans .addMouseListener(listen);
	
	TransactionPanel.txtTransactionCode.setText(getRowCount()+"");
	setLayout(new BorderLayout());
	add(new JScrollPane(tblTrans), BorderLayout.CENTER);
}
public static int getRowCount() {
	return model_trans.getRowCount()+111;
}
}
