import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.Timer;

public class DateTab extends JToolBar{
		ImageIcon icon;	
		JLabel lblTime, lblDatepud;
		SimpleDateFormat sdf;

		public DateTab() { //to display date


			lblTime=new JLabel("Time: ");
			lblTime.setFont(new Font("Arial", Font.BOLD, 18));
			add(lblTime);
			addSeparator();
			
			lblDatepud=new JLabel("Date");
			lblDatepud.setFont(new Font("Arial", Font.BOLD, 18));
			add(lblDatepud);
			
			forTime();
			
			setFloatable(false);		
			

		}
		public void forTime(){
			Timer time=new Timer(1000, new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sdf=new SimpleDateFormat("hh:mm:ss a");
					lblTime.setText("Time: "+sdf.format(new java.util.Date()));
					
					sdf=new SimpleDateFormat("dd-MM-yyyy");
					lblDatepud.setText("Date: "+sdf.format(new java.util.Date()));
				}
			});
			time.start();
		}
		
}
