import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class EmployeeButtonsPanel extends JPanel{

	static JButton btnAddEmp, btnEditEmp, btnExitEmp;
	Listener listen=new Listener();
	public EmployeeButtonsPanel() {
		btnAddEmp = new JButton("Add");
		btnEditEmp = new JButton("Edit");
		btnExitEmp = new JButton("Exit");
		btnAddEmp.setIcon(new ImageIcon("IMAGES/add_user.png"));
		btnEditEmp.setIcon(new ImageIcon("IMAGES/edit_user.png"));
		btnExitEmp.setIcon(new ImageIcon("IMAGES/close.png"));
		setLayout(new GridLayout(1, 5, 4,2));
		add(btnAddEmp); add(btnEditEmp); add(btnExitEmp);
		btnAddEmp.addActionListener(listen);
		btnEditEmp.addActionListener(listen);
		btnExitEmp.addActionListener(listen);
	}
}
