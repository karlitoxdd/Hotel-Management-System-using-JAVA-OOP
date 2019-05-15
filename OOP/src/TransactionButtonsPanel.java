import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TransactionButtonsPanel extends JPanel{
	static JButton btnAddTrans, btnEditTrans, btnExitTrans;
	Listener listen=new Listener();
	public TransactionButtonsPanel() {
		btnAddTrans  = new JButton("Add");
		btnEditTrans  = new JButton("Edit");
		btnExitTrans  = new JButton("Exit");
		btnAddTrans.setIcon(new ImageIcon("IMAGES/add_user.png"));
		btnEditTrans.setIcon(new ImageIcon("IMAGES/edit_user.png"));
		btnExitTrans.setIcon(new ImageIcon("IMAGES/close.png"));
		setLayout(new GridLayout(1, 5, 4,2));
		add(btnAddTrans); add(btnEditTrans); add(btnExitTrans);
		btnAddTrans.addActionListener(listen);
		btnEditTrans.addActionListener(listen);
		btnExitTrans.addActionListener(listen);
		
	}
}
