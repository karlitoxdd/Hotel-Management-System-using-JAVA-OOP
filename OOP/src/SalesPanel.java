import java.awt.Font;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;

import javax.swing.*;


public class SalesPanel extends JPanel{
	JLabel lblSalesID, lblSalesDate, lblSalesTotal;
	static JTextField txtSalesID, txtSalesDate, txtSalesTotal;
	Font f = new Font("Arial", Font.BOLD, 16);
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	String pay = "";
	int amount =0;
	public SalesPanel(){
		
		for(int i = 0; i<TransactionTablePanel.model_trans.getRowCount();i++) {
			if(TransactionTablePanel.model_trans.getValueAt(i, 1).equals(sdf.format(new java.util.Date()))) {
			pay = TransactionTablePanel.model_trans.getValueAt(i, 7).toString();
			amount += Integer.parseInt(pay);
		}
		}
		lblSalesID= new JLabel("Sales ID: ");
		lblSalesDate = new JLabel("Date: ");
		lblSalesTotal = new JLabel("Total: ");
		
		txtSalesID = new JTextField(20);
		txtSalesID.setEditable(false);
		txtSalesID.setText(SalesTablePanel.getRowCount()+"");
		txtSalesDate = new JTextField(20);
		txtSalesDate.setText(sdf.format(new java.util.Date()));
		txtSalesTotal = new JTextField(20);
		txtSalesTotal.setText(amount+"");
		txtSalesTotal.setEditable(false);
		
		setBorder(BorderFactory.createTitledBorder(null,"Sales",0,0,f));
		setLayout(new GridLayout(3, 2));
		setFont(f);
		
		add(lblSalesID); add(txtSalesID);
		add(lblSalesDate); add(txtSalesDate);
		add(lblSalesTotal); add(txtSalesTotal);
	}
}
