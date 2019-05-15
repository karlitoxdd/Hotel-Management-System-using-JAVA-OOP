import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class SalesButtonsPanel extends JPanel{
	static JButton btnAddSales, btnEditSales, btnExitSales;
	Listener listen=new Listener();
	public SalesButtonsPanel(){
		btnAddSales = new JButton("Add");
		btnEditSales = new JButton("Edit");
		btnExitSales = new JButton("Exit");
		
		btnAddSales.setIcon(new ImageIcon("IMAGES/add_user.png"));
		btnEditSales.setIcon(new ImageIcon("IMAGES/edit_user.png"));
		btnExitSales.setIcon(new ImageIcon("IMAGES/close.png"));
		setLayout(new GridLayout(1, 5, 4,2));
		add(btnAddSales); add(btnEditSales); add(btnExitSales);
		btnAddSales.addActionListener(listen);
		btnEditSales.addActionListener(listen);
		btnExitSales.addActionListener(listen);
	}
}
