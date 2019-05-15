import java.awt.BorderLayout;
import java.awt.color.ProfileDataException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class EmployeeTablePanel extends JPanel{
	static JTable tblEmp;
	static DefaultTableModel model_emp = new DefaultTableModel();
	static TableRowSorter tbl_EmpSort = new TableRowSorter();
	ProjDatabase data;
	Listener listen = new Listener();
	public EmployeeTablePanel() { //to display employee info
		data = new ProjDatabase("EmployeeColumn.txt");
		model_emp = new DefaultTableModel();
		data.setRoomColumn(model_emp);
		
		
		data = new ProjDatabase("Employee.txt");
		data.setRoomRow(model_emp);
		tblEmp = new JTable(model_emp);
		tblEmp .addMouseListener(listen);
	
		EmployeePanel.txtEmpID.setText(getRowCount()+"");
		setLayout(new BorderLayout());
		add(new JScrollPane(tblEmp), BorderLayout.CENTER);
	}


	public static int getRowCount() {
		return model_emp.getRowCount()+301;
	}
}
