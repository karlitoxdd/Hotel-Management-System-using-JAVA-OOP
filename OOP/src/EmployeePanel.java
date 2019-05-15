import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EmployeePanel extends JPanel implements KeyListener{
	JLabel lblEmpID, lblEmpName, lblEmpAge, lblEmpGender, lblEmpContact, lblEmpAddress;
	static JTextField txtEmpID, txtEmpName, txtEmpAge, txtEmpContact, txtEmpAddress;
	static JComboBox cboEmpGender;
	Font f = new Font("Arial", Font.BOLD, 16);
	Listener listen=new Listener();
	public EmployeePanel() {
		lblEmpID = new JLabel("Employee ID: ");
		lblEmpName = new JLabel("Employee Name: ");
		lblEmpAge = new JLabel("Employee Age: ");
		lblEmpGender = new JLabel("Employee Gender: ");
		lblEmpContact = new JLabel("Employee Contact: ");
		lblEmpAddress = new JLabel("Employee Address: ");
		
		txtEmpID = new JTextField(20);
		txtEmpID.setEditable(false);
		txtEmpID.setText(EmployeeTablePanel.getRowCount()+"");
		txtEmpName = new JTextField(20);
		txtEmpAge = new JTextField(20);
		txtEmpContact = new JTextField(20);
		txtEmpAddress = new JTextField(20);
		
		cboEmpGender = new JComboBox();
		cboEmpGender.addItem("Male");
		cboEmpGender.addItem("Female");
		
		setBorder(BorderFactory.createTitledBorder(null,"Employee",0,0,f));
		setLayout(new GridLayout(6, 2));
		setFont(f);
		
		add(lblEmpID); add(txtEmpID);
		add(lblEmpName); add(txtEmpName);
		add(lblEmpAge); add(txtEmpAge);
		add(lblEmpGender); add(cboEmpGender);
		add(lblEmpContact); add(txtEmpContact);
		add(lblEmpAddress); add(txtEmpAddress);
		txtEmpContact.addKeyListener(this);
		txtEmpAge.addKeyListener(this);
		txtEmpName.addKeyListener(this);
	}
	@Override
	public void keyPressed(KeyEvent e) {}
	
	public void keyReleased(KeyEvent arg0) {}
	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getSource().equals(txtEmpAge)) {
			if((e.getKeyChar()>='a' && e.getKeyChar()<='z')){
				e.consume();
			}
		}
		if(e.getSource().equals(txtEmpContact)) {
			if((e.getKeyChar()>='a' && e.getKeyChar()<='z')) {
				e.consume();
			}
		}
		if(e.getSource().equals(txtEmpName)) {
			if(!(e.getKeyChar()>='a' && e.getKeyChar()<='z' || e.getKeyChar()>='A' && e.getKeyChar()<='Z')) {
				e.consume();
			}
		}
	}

}
