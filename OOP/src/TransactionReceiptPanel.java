import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TransactionReceiptPanel extends JPanel{
	JLabel lblTransID, lblCustomerID, lblTotal,lblMode;
	static JTextField txtTotal,txtTransID,txtCustID,txtPayment;
	ProjDatabase db = new ProjDatabase();
	Font f = new Font("Arial", Font.BOLD, 16);
	public TransactionReceiptPanel() {
		lblTransID = new JLabel("Transaction ID: ");
		lblCustomerID = new JLabel("Customer ID: ");
		lblTotal = new JLabel("Total: ");
		lblMode = new JLabel("Mode of Payment: ");
		txtTotal = new JTextField(20);
		txtTotal.setEditable(false);
		txtTransID = new JTextField(20);
		txtTransID.setEditable(false);
		txtCustID = new JTextField(20);
		txtCustID.setEditable(false);
		txtPayment = new JTextField(20);
		txtPayment.setText("CASH ONLY");
		txtPayment.setEditable(false);
		setBorder(BorderFactory.createTitledBorder(null,"Receipt",0,0,f));
		setLayout(new GridLayout(4, 2));
		setFont(f);
		add(lblTransID);add(txtTransID);
		add(lblCustomerID);add(txtCustID);
		add(lblTotal);add(txtTotal);
		add(lblMode);add(txtPayment);
	}

	
}
