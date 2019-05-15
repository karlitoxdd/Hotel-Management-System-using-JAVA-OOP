import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.Color;


public class SalesTab extends JTabbedPane{
	JPanel panelFirst;
	ImageIcon icon;
	SalesPanel s1 = new SalesPanel();
	SalesButtonsPanel s2 = new SalesButtonsPanel();
	SalesTablePanel s3 = new SalesTablePanel();
	SalesInfo s4 = new SalesInfo();
	
	public SalesTab(){ //tabs to display sales infos
		icon=new ImageIcon("IMAGES/bg2.jpg");
		panelFirst = new JPanel(null);
		panelFirst.setBackground(Color.DARK_GRAY);
		s1.setBackground(Color.LIGHT_GRAY);
		s1.setBounds(5,5,300,100);
		panelFirst.add(s1);
		s2.setBackground(Color.LIGHT_GRAY);
		s2.setBounds(5,120,350,30);
		panelFirst.add(s2);
		s3.setBackground(Color.LIGHT_GRAY);
		s3.setBounds(370,5,850,250);
		panelFirst.add(s3);
		s4.setBackground(Color.LIGHT_GRAY);
		s4.setBounds(370,300,850,250);
		panelFirst.add(s4);
		add(new JLabel(icon));
		add("Sales",panelFirst);
		
		icon=new ImageIcon("IMAGES/1.png");
		setIconAt(0, icon);
		icon= new ImageIcon("IMAGES/4.jpg");
		setIconAt(1, icon);
		
	}
}
