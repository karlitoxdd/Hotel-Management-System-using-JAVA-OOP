import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class RoomButtonsPanel extends JPanel{
	static JButton btnExitRoom, btnAddRoom,btnEditRoom;
	Listener listen=new Listener();
	public RoomButtonsPanel() {
		btnExitRoom = new JButton("Exit");
		btnExitRoom.setIcon(new ImageIcon("IMAGES/close.png"));
		btnEditRoom = new JButton("Edit");
		btnEditRoom.setIcon(new ImageIcon("IMAGES/1.png"));
		btnAddRoom = new JButton("Add");
		btnAddRoom.setIcon(new ImageIcon("IMAGES/7.png"));
		setLayout(new GridLayout(1, 5, 4,2));
		add(btnAddRoom);
		add(btnEditRoom);
		add(btnExitRoom);
		
		btnAddRoom.addActionListener(listen);
		btnEditRoom.addActionListener(listen);
		btnExitRoom.addActionListener(listen);
	
	}
}
