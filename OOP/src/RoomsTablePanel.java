import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class RoomsTablePanel extends JPanel{
	static JTable tbl_room;
	static DefaultTableModel model_room = new DefaultTableModel();
	static TableRowSorter tbl_RoomSort = new TableRowSorter();
	ProjDatabase data;
	Listener listen = new Listener();
	public RoomsTablePanel() { //for room infos
		data = new ProjDatabase("RoomColumn.txt");
		model_room = new DefaultTableModel();
		data.setRoomColumn(model_room);
		
		data = new ProjDatabase("Room.txt");
		data.setRoomRow(model_room);
		tbl_room = new JTable(model_room);
		tbl_room .addMouseListener(listen);
	
		RoomsPanel.txtID.setText(getRowCount()+"");
		setLayout(new BorderLayout());
		add(new JScrollPane(tbl_room), BorderLayout.CENTER);
	}


	public static int getRowCount() {
		return model_room.getRowCount()+101;
	}
}
