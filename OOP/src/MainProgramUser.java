import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MainProgramUser extends MyFrame{
	ImageIcon icon;
	JLabel back;
	public MainProgramUser() { 	//for user
		icon=new ImageIcon("IMAGES/7.jpg");
		back=new JLabel("",icon,0);
		
	}
	public void setUI(){
		
		add(new DateTab(),BorderLayout.NORTH);
		add(new MyTabUser(), BorderLayout.CENTER);
		setTitle("Abad Hotel Management");
		
		getContentPane().setBackground(new Color(0, 90, 250, 90));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setMyFrame("Abad Hotel Management", 1250, 680, true);
		setLocationRelativeTo(null);
		
TransactionButtonsPanel.btnExitTrans.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				SelectionFrame sf = new SelectionFrame();
				dispose();
				
			}
		});

RoomButtonsPanelUser.btnExitRoom.addActionListener(new ActionListener() {
	
	
	public void actionPerformed(ActionEvent e) {
		SelectionFrameUser sf = new SelectionFrameUser();
		dispose();
		
	}
});

	}


}
