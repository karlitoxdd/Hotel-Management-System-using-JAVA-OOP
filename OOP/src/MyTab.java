import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;
public class MyTab extends JTabbedPane {
	JPanel panelSecond, panelFirst, panelThird;
	ImageIcon icon;
	TransactionPanel tp1 = new TransactionPanel();
	TransactionButtonsPanel tp2 = new TransactionButtonsPanel();
	TransactionTablePanel tp3 = new TransactionTablePanel();
	TransactionReceiptPanel tp4 = new TransactionReceiptPanel();
	CheckoutButton tp5 = new CheckoutButton();
	RoomsPanel rm1 = new RoomsPanel();
	RoomsTablePanel rm2 = new RoomsTablePanel();
	RoomButtonsPanel rm3 = new RoomButtonsPanel();
	DescriptionTablePanel d = new DescriptionTablePanel();
	public MyTab() { //admin transaction tab
		setBackground(Color.WHITE);
	
		
		icon=new ImageIcon("IMAGES/bg2.jpg");
		panelFirst = new JPanel(null);
		panelFirst.setBackground(Color.DARK_GRAY);
		tp1.setBackground(Color.LIGHT_GRAY);
		tp1.setBounds(5, 5, 300, 300);
		panelFirst.add(tp1);
		tp2.setBackground(Color.LIGHT_GRAY);
		tp2.setBounds(5, 320, 350, 30);
		panelFirst.add(tp2);
		tp3.setBackground(Color.LIGHT_GRAY);
		tp3.setBounds(370, 5, 850, 550);
		panelFirst.add(tp3);
		tp4.setBackground(Color.LIGHT_GRAY);
		tp4.setBounds(5, 370, 220, 120);
		panelFirst.add(tp4);
		tp5.setBackground(Color.LIGHT_GRAY);
		tp5.setBounds(5, 500, 150, 50);
		panelFirst.add(tp5);
		JLabel label = new JLabel(icon);
		label.setBackground(Color.WHITE);
		add(label);
		add("Transactions",panelFirst);
		
				
		icon=new ImageIcon("IMAGES/1.png");
		setIconAt(0, icon);
		icon= new ImageIcon("IMAGES/7.png");
		setIconAt(1, icon);
		
		
		panelSecond = new JPanel(null);
		panelSecond.setBackground(Color.DARK_GRAY);
		rm1.setBackground(Color.LIGHT_GRAY);
		rm1.setBounds(5, 5, 300, 100);
		panelSecond.add(rm1);
		rm2.setBackground(Color.LIGHT_GRAY);
		rm2.setBounds(320, 5, 900, 304);
		panelSecond.add(rm2);
		rm3.setBackground(Color.LIGHT_GRAY);
		rm3.setBounds(5, 130, 300, 30);
		panelSecond.add(rm3);
		d.setBackground(Color.LIGHT_GRAY);
		d.setBounds(320, 320, 500, 92);
		panelSecond.add(d);
		add("Rooms", panelSecond);
		icon= new ImageIcon("IMAGES/4.jpg");
		setIconAt(2, icon);
		
		
		
		
	}

		
	

}
