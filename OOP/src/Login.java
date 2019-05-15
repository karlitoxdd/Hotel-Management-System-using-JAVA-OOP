import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;

public class Login extends MyFrame{ //used for login
	JLabel lblUsername = new JLabel("Username: "), lblPassword = new JLabel("Password: ");
	static JTextField txtUN=new JTextField(20);
	static JPasswordField txtPass=new JPasswordField(20);
	JButton btnLogin=new JButton("Login");
	ProjDatabase db = new ProjDatabase();
	public Login() {
		getContentPane().setBackground(Color.DARK_GRAY);
		db.setFilename("Account.txt");
		getContentPane().setLayout(null);
		txtUN.setBounds(123, 61, 166, 20);
		
		getContentPane().add(txtUN);
		txtPass.setBounds(123, 117, 166, 20);
		txtPass.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) btnLogin.doClick();
			}
		});
		getContentPane().add(txtPass);
		btnLogin.setBounds(123, 163, 67, 23);
		getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(222, 163, 67, 23);
		getContentPane().add(btnExit);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setForeground(Color.CYAN);
		lblPassword_1.setBackground(Color.WHITE);
		lblPassword_1.setBounds(123, 92, 67, 14);
		getContentPane().add(lblPassword_1);
		
		JLabel lblUsername_1 = new JLabel("Username");
		lblUsername_1.setForeground(Color.CYAN);
		lblUsername_1.setBounds(123, 36, 67, 14);
		getContentPane().add(lblUsername_1);
		
		JLabel lblLogIn = new JLabel("Log In");
		lblLogIn.setForeground(Color.RED);
		lblLogIn.setBounds(10, 11, 46, 14);
		getContentPane().add(lblLogIn);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String u, p;
				u=txtUN.getText();
				p=txtPass.getText();
				if(txtUN.getText().equals("admin")&&txtPass.getText().equals("owner")){
				
						JOptionPane.showMessageDialog(null, "Log-in Successful"+"\nWelcome Admin!");
						new EmployeeChooserAdmin();
						dispose();
					

				}else if(txtUN.getText().equals("user")&&txtPass.getText().equals("employee")) {
					JOptionPane.showMessageDialog(null, "Log-in Successful"+"\nWelcome Employee!");
					new EmployeeChooserPanel();
					dispose();
					
					
					
				}else{
					JOptionPane.showMessageDialog(null, "Incorrect");
				}
				
			
			}
		});
		setMyFrame("Log In", 420, 300, true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new Login();
	}
}
