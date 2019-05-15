import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CheckoutButton extends JPanel{
	static JButton btnCheckOut;
	Listener listen=new Listener();
	public CheckoutButton() {
		btnCheckOut = new JButton("Check Out");
		btnCheckOut.setIcon(new ImageIcon("IMAGES/close.png)"));
		add(btnCheckOut);
		setLayout(new GridLayout(1, 5, 4,2));
		btnCheckOut.addActionListener(listen);
	}
}
