import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CustomerButtonsPanel extends JPanel{
	static JButton btnAddCust, btnEditCust, btnExitCust;
	Listener listen=new Listener();
	public CustomerButtonsPanel() {
		btnAddCust = new JButton("Add");
		btnEditCust = new JButton("Edit");
		btnExitCust = new JButton("Exit");
		btnAddCust.setIcon(new ImageIcon("IMAGES/add_user.png"));
		btnEditCust.setIcon(new ImageIcon("IMAGES/edit_user.png"));
		btnExitCust.setIcon(new ImageIcon("IMAGES/close.png"));
		setLayout(new GridLayout(1, 5, 4,2));
		add(btnAddCust); add(btnEditCust); add(btnExitCust);
		btnAddCust.addActionListener(listen);
		btnEditCust.addActionListener(listen);
		btnExitCust.addActionListener(listen);
	}

}
