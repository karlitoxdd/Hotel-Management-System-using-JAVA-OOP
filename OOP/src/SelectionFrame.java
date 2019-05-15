import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SelectionFrame extends MyFrame{
	ImageIcon icon = new ImageIcon("IMAGES/Bg.jpg");
	MainProgram mp = new MainProgram();

	public SelectionFrame() { //main window for admin
		setContentPane(new JLabel(icon));
		setLayout(null);
		
		add(new SelectionButtons()).setBounds(210, 200, 350, 100);
		
		setMyFrame("Welcome!", 800, 600, true);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		SelectionButtons.btnTrans.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) {
			

						MainProgram mp = new MainProgram();
						mp.setUI();
						dispose();
					
						
			
				
				
			}
		
		});
		SelectionButtons.btnCust.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				Main2 mp = new Main2();
				mp.setUI2();
				dispose();
				
			
			}

		});
		SelectionButtons.btnEmp.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				Main3 mp = new Main3();
				mp.setUI3();
				dispose();
				
			}
		});
		SelectionButtons.btnSales.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Main4 mp = new Main4();
				mp.setUI4();
				dispose();
		}
		});
	}
	
}
