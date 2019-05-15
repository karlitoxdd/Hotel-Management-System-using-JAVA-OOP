import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Main4 extends MyFrame{
	ImageIcon icon;
	JLabel back;
	
	public Main4(){ ///for sales
		icon=new ImageIcon("IMAGES/7.jpg");
		back=new JLabel("",icon,0);
	}
	public void setUI4(){
		add(new DateTab(),BorderLayout.NORTH);
		add(new SalesTab(), BorderLayout.CENTER);
		getContentPane().setBackground(new Color(0, 90, 250, 90));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setMyFrame("Abad Hotel Reservation", 1250, 680, true);
		setLocationRelativeTo(null);
		
		SalesButtonsPanel.btnExitSales.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				SelectionFrame sf = new SelectionFrame();
				dispose();
				
			}
		});
	}
	}

