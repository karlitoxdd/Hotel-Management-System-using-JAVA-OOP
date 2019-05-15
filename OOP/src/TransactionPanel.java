import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TransactionPanel extends JPanel implements ActionListener,MouseListener, KeyListener, ItemListener{
	JLabel lblTransactionCode, lblTransactionDate, lblTransactionRoomID, lblTransactionCustID, lblTransactionEmpID, lblTransactionDuration, lblTransactionTotal, lblTransactionRemarks;
	static JTextField txtTransactionCode, txtTransactionDate,txtPrice, txtRemarks;
	static JComboBox cboTransRoomID, cboTransCustID, cboTransEmpID, cboTransDuration;
	Font f = new Font("Arial", Font.BOLD, 16);
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	Listener listen = new Listener();
	ProjDatabase db=new ProjDatabase();
	public TransactionPanel() {
		lblTransactionCode = new JLabel("Transaction Code: ");
		lblTransactionDate = new JLabel("Transaction Date: ");
		lblTransactionRoomID = new JLabel("Room ID: ");
		lblTransactionCustID = new JLabel("Customer ID: ");
		lblTransactionEmpID = new JLabel("Employee ID: ");
		lblTransactionDuration = new JLabel("Duration: ");
		lblTransactionTotal = new JLabel("Amount to pay: ");
		lblTransactionRemarks = new JLabel("Remarks: ");
		
		txtTransactionCode = new JTextField(20);
		txtTransactionCode.setEditable(false);
		txtTransactionCode.setText(TransactionTablePanel.getRowCount()+"");
		txtTransactionDate = new JTextField(20);
		txtTransactionDate.setText(sdf.format(new java.util.Date()));
		
		
		db.setFilename("Room.txt");
		cboTransRoomID = new JComboBox(db.fillToComboBoxRoom());
		cboTransRoomID.addItemListener(this);
		
		db.setFilename("Customer.txt");
		cboTransCustID = new JComboBox(db.fillToComboBoxCust());
		cboTransCustID.addItemListener(this);
		
		//db.setFilename("Employee.txt");
		cboTransEmpID = new JComboBox();
		
		if(Login.txtUN.getText().equals("admin")&&Login.txtPass.getText().equals("owner")) {
			cboTransEmpID.addItem(EmployeeChooserAdmin.cboEmp.getSelectedItem());
		}else {
		cboTransEmpID.addItem(EmployeeChooserPanel.cboEmp.getSelectedItem());
		}
		cboTransDuration = new JComboBox();
		cboTransDuration.addItem(null);
		cboTransDuration.addItem("12Hours");
		cboTransDuration.addItem("24Hours");
		
		txtPrice = new JTextField(20);
		txtPrice.setEditable(false);
		
		txtRemarks = new JTextField(20);
		txtRemarks.setText("Checked In");
		txtRemarks.setEditable(false);
		
		
		setBorder(BorderFactory.createTitledBorder(null,"Transactions",0,0,f));
		setLayout(new GridLayout(8, 2));
		setFont(f);
		
		add(lblTransactionCode);add(txtTransactionCode);
		add(lblTransactionDate);add(txtTransactionDate);
		add(lblTransactionRoomID);add(cboTransRoomID);
		add(lblTransactionCustID);add(cboTransCustID);
		add(lblTransactionEmpID);add(cboTransEmpID);
		add(lblTransactionDuration);add(cboTransDuration);
		add(lblTransactionTotal);add(txtPrice);
		add(lblTransactionRemarks);add(txtRemarks);
		cboTransRoomID.addMouseListener(listen);
		cboTransCustID.addMouseListener(listen);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
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
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
