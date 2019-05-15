import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Main2 extends MyFrame{
	ImageIcon icon;
	JLabel back;
	public Main2() { //for customer
		getContentPane().setBackground(Color.WHITE);
		icon=new ImageIcon("IMAGES/7.jpg");
		back=new JLabel("",icon,0);
		
	}
	public void setUI2() {
		getContentPane().add(new DateTab(),BorderLayout.NORTH);
		getContentPane().add(new MyTabCustomer(), BorderLayout.CENTER);
		getContentPane().setBackground(new Color(0, 90, 250, 90));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setMyFrame("Abad Hotel Reservation", 1250, 680, true);
		setLocationRelativeTo(null);
		
		CustomerButtonsPanel.btnExitCust.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				SelectionFrame sf = new SelectionFrame();
				dispose();
				
			}
		});
		
	}
	
}
