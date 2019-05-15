import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;

public class MyTabCustomer extends JTabbedPane{
	JPanel panelSecond, panelFirst, panelThird, panelFourth;
	ImageIcon icon;
	CustomerPanel cp1 = new CustomerPanel();
	CustomerButtonsPanel cp2 = new CustomerButtonsPanel();
	CustomerTablePanel cp3 = new CustomerTablePanel();
	public MyTabCustomer() { //customer infos
		icon=new ImageIcon("IMAGES/bg2.jpg");
		panelFirst = new JPanel(null);
		panelFirst.setBackground(Color.DARK_GRAY);
		cp1.setBackground(Color.LIGHT_GRAY);
		cp1.setBounds(5, 5, 300, 300);
		panelFirst.add(cp1);
		cp2.setBackground(Color.LIGHT_GRAY);
		cp2.setBounds(5, 320, 350, 30);
		panelFirst.add(cp2);
		cp3.setBackground(Color.LIGHT_GRAY);
		cp3.setBounds(370, 5, 850, 550);
		panelFirst.add(cp3);
		add(new JLabel(icon));
		add("Customer",panelFirst);
		icon=new ImageIcon("IMAGES/1.png");
		setIconAt(0, icon);
		icon= new ImageIcon("IMAGES/7.png");
		setIconAt(1, icon);
	}

}
