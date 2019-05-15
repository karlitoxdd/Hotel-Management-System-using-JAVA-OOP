import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RoomsPanel extends JPanel{
	JLabel lblRoomID, lblRoomDescription,lblRoomStatus, lblPersonsOccupied;
	static JTextField txtID;
	static JComboBox cboDescription, cboPersons,cboStatus;
		Font f = new Font("Arial", Font.BOLD, 20);
	public RoomsPanel() {
		lblRoomID = new JLabel("Room ID: ");
		lblRoomDescription = new JLabel("Description: ");
		lblRoomStatus = new JLabel("Room Status: ");
		lblPersonsOccupied = new JLabel("Max Occupied: ");
		
		txtID = new JTextField(20);
		txtID.setEditable(false);
		txtID.setText(RoomsTablePanel.getRowCount()+"");
		cboDescription = new JComboBox();
		cboDescription.addItem("Standard");
		cboDescription.addItem("Deluxe");
		cboDescription.addItem("Aircon");
		cboDescription.addItem("Family");
		cboPersons = new JComboBox();
		cboPersons.addItem("2");
		cboPersons.addItem("4");
		cboPersons.addItem("8");
		cboStatus = new JComboBox();
		cboStatus.addItem("Vacant");
		cboStatus.addItem("Occupied");
		cboStatus.addItem("Under maintenance");
		setBorder(BorderFactory.createTitledBorder(null,"Rooms",0,0,f));
		setLayout(new GridLayout(4, 2));
		setFont(f);
		
		add(lblRoomID);add(txtID);
		add(lblRoomDescription);add(cboDescription);
		add(lblRoomStatus);add(cboStatus);
		add(lblPersonsOccupied);add(cboPersons);
		
	}
}
