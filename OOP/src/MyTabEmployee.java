import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;

public class MyTabEmployee extends JTabbedPane{
	JPanel panelFirst;
	ImageIcon icon;
	EmployeePanel ep1 = new EmployeePanel();
	EmployeeButtonsPanel ep2 = new EmployeeButtonsPanel();
	EmployeeTablePanel ep3 = new EmployeeTablePanel();
	public MyTabEmployee() { //employee infos
	
		icon=new ImageIcon("IMAGES/bg2.jpg");
		panelFirst = new JPanel(null);
		panelFirst.setBackground(Color.DARK_GRAY);
		ep1.setBackground(Color.LIGHT_GRAY);
		ep1.setBounds(5, 5, 300, 300);
		panelFirst.add(ep1);
		ep2.setBackground(Color.LIGHT_GRAY);
		ep2.setBounds(5, 320, 350, 30);
		panelFirst.add(ep2);
		ep3.setBackground(Color.LIGHT_GRAY);
		ep3.setBounds(370, 5, 850, 550);
		panelFirst.add(ep3);
		add(new JLabel(icon));
		add("Employee",panelFirst);
		icon=new ImageIcon("IMAGES/1.png");
		setIconAt(0, icon);
		icon= new ImageIcon("IMAGES/7.png");
		setIconAt(1, icon);
	}
}
