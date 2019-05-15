import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class RoomButtonsPanelUser extends JPanel{
	static JButton btnExitRoom;
	Listener listen=new Listener();
	public RoomButtonsPanelUser() {
		btnExitRoom = new JButton("Exit");
		btnExitRoom.setIcon(new ImageIcon("IMAGES/close.png"));
		setLayout(new GridLayout(1, 5, 4,2));
		add(btnExitRoom);
		btnExitRoom.addActionListener(listen);
	
	}
}