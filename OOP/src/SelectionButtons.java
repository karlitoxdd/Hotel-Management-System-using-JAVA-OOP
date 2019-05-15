import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class SelectionButtons extends JPanel{
static JButton btnTrans, btnCust, btnEmp,btnSales;
Listener listen = new Listener();
public SelectionButtons() { 
	setBackground(Color.BLUE);
	btnTrans = new JButton("Transaction");
	btnCust = new JButton("Customer");
	btnEmp = new JButton("Employee");
	btnSales = new JButton("Sales");
	btnTrans.setIcon(new ImageIcon("IMAGES/1.png"));
	btnCust.setIcon(new ImageIcon("IMAGES/3.png"));
	btnEmp.setIcon(new ImageIcon("IMAGES/3.png"));
	btnSales.setIcon(new ImageIcon("IMAGES/4.jpg"));
	setLayout(new GridLayout(2, 2, 10,5));
	add(btnTrans); add(btnCust); add(btnEmp); add(btnSales);
	btnTrans.addActionListener(listen);
	btnCust.addActionListener(listen);
	btnEmp.addActionListener(listen);
	btnSales.addActionListener(listen);
	
	
}
}
