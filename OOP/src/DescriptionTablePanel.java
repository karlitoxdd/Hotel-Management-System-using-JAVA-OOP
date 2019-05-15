import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class DescriptionTablePanel extends JPanel{
	static JTable tblDes;
	static DefaultTableModel model_des = new DefaultTableModel();
	static TableRowSorter tbl_DesSort = new TableRowSorter();
	ProjDatabase data;
	Listener listen = new Listener();
	
	public DescriptionTablePanel() { //room descriptions
		data = new ProjDatabase("DescriptionColumn.txt");
		model_des = new DefaultTableModel();
		data.setRoomColumn(model_des);
		
		data = new ProjDatabase("Description.txt");
		data.setRoomRow(model_des);
		tblDes = new JTable(model_des);
		tblDes .addMouseListener(listen);
	
	
		setLayout(new BorderLayout());
		add(new JScrollPane(tblDes), BorderLayout.CENTER);
	}



	
}
