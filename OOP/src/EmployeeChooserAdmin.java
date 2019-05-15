import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EmployeeChooserAdmin extends MyFrame{
	ProjDatabase db = new ProjDatabase();
	JLabel lblEmp = new JLabel("Employee: ");
	static JComboBox cboEmp;
	static JButton btnOk= new JButton("OK"), btnCancel= new JButton("CANCEL");
	
	public EmployeeChooserAdmin() { //for admin
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(null);
		db.setFilename("Employee.txt");
		cboEmp= new JComboBox(db.fillToComboBoxEmp());
		cboEmp.setBounds(123, 61, 166, 20);
		getContentPane().add(cboEmp);
		btnOk.setBounds(123, 163, 67, 23);
		getContentPane().add(btnOk);
		//btnCancel.setBounds(218, 163, 85, 23);
		//getContentPane().add(btnCancel);
		lblEmp.setBounds(123, 36, 67, 14);
		getContentPane().add(lblEmp);
		btnOk.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SelectionFrame s = new SelectionFrame();
			dispose();
				
			}
		});
		btnCancel.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				
			}
		});
		setMyFrame("Choose Employee", 420, 300, true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	

}
