import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CustomerPanel extends JPanel implements KeyListener{
	JLabel lblCustomerID, lblCustName, lblCustGender, lblCustAge, lblCustContact, lblCustAddress;
	static JTextField txtCustName, txtCustAge, txtCustContact, txtCustAddress, txtCustomerID;
	static JComboBox cboCustGender;
	Font f = new Font("Arial", Font.BOLD, 16);
	public CustomerPanel() {
		lblCustomerID = new JLabel("Customer ID: ");
		lblCustName = new JLabel("Customer Name: ");
		lblCustGender = new JLabel("Customer Gender: ");
		lblCustAge = new JLabel("Customer Age: ");
		lblCustContact = new JLabel("Customer Contact: ");
		lblCustAddress = new JLabel("Customer Location: ");
		
		txtCustomerID = new JTextField(20);
		txtCustomerID.setEditable(false);
		txtCustomerID.setText(CustomerTablePanel.getRowCount()+"");
		txtCustName = new JTextField(20);
		txtCustAge = new JTextField(20);
		txtCustContact = new JTextField(20);
		txtCustAddress = new JTextField(20);
		
		cboCustGender = new JComboBox();
		cboCustGender.addItem("Male");
		cboCustGender.addItem("Female");
		
		setBorder(BorderFactory.createTitledBorder(null,"Customer",0,0,f));
		setLayout(new GridLayout(6, 2));
		setFont(f);
		
		add(lblCustomerID); add(txtCustomerID);
		add(lblCustName); add(txtCustName);
		add(lblCustGender); add(cboCustGender);
		add(lblCustAge); add(txtCustAge);
		add(lblCustContact); add(txtCustContact);
		add(lblCustAddress); add(txtCustAddress);
		txtCustAge.addKeyListener(this);
		txtCustContact.addKeyListener(this);
		txtCustName.addKeyListener(this);
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getSource().equals(txtCustAge)) {
			if((e.getKeyChar()>='a' && e.getKeyChar()<='z')){
				e.consume();
			}
		
		}
		if(e.getSource().equals(txtCustContact)) {
			if((e.getKeyChar()>='a' && e.getKeyChar()<='z')){
				e.consume();
			}
		}
		if(e.getSource().equals(txtCustName)) {
			if(!(e.getKeyChar()>='a' && e.getKeyChar()<='z' || e.getKeyChar()>='A' && e.getKeyChar()<='Z'  )){
				e.consume();
			}
		}
	}
}
