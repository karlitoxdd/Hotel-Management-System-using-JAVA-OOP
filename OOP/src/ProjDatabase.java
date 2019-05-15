import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;

public class ProjDatabase {
	File file=null;
	FileWriter fWrite=null;
	FileReader fRead=null;
	Scanner scan=null;
	String message="";
	Vector row, column;
	StringTokenizer strToken;
	public ProjDatabase() {}
	public ProjDatabase(String filename) {
		file=new File(filename);
	}
	public void setFilename(String filename) { 
		file=new File(filename);
	}
	public String getFilename() { 
		return file.getName();
	}
	public void storeToFile(String records){
		try {
			fWrite=new FileWriter(file);
			fWrite.write(records);
			fWrite.flush();
		} catch (Exception e) {
			
		}
	}
	public String readRecordsFromTextFile(){
		String original="";
		try {
			fRead=new FileReader(file);
			scan=new Scanner(fRead);		
			while(scan.hasNext()){
				original+=scan.nextLine()+"\n"; //reads the information per line -from a textfile
			}
			fRead.close();
			scan.close();
		} catch (Exception e) {
			
		}
		return original;
	}
	
	public void displayRecords(DefaultTableModel model){
		try {		
			//Extracting the information via #
			strToken=new StringTokenizer(readRecordsFromTextFile(), "#"); //read String from original, then separate each datum by #			
			while(strToken.hasMoreTokens()){
				row=new Vector();
				for (int i = 0; i < model.getColumnCount(); i++) {
					row.add(strToken.nextToken()); 
					//read each record based on column count of a  table-store to a vector
				}
				model.addRow(row);
			}
		} catch (Exception e) {
			
		}
	}
	public void setRoomColumn(DefaultTableModel model) { //for Rooms
		try {
			column=new Vector();
			fRead=new FileReader(file);
			scan=new Scanner(fRead);
			while(scan.hasNext()){
				column.add(scan.nextLine());
			}
			model.setColumnIdentifiers(column);
			fRead.close();
			scan.close();
			
		} catch (Exception e) {
			
		}
	}
	
	
	public void setRoomRow(DefaultTableModel model) { //for Rooms

		try {		
		
			strToken=new StringTokenizer(readRecordsFromTextFile(), "#");		
			while(strToken.hasMoreTokens()){
				row=new Vector();
				for (int i = 0; i < model.getColumnCount(); i++) {
					row.add(strToken.nextToken()); 
					
					
				}
				model.addRow(row);
			}
		} catch (Exception e) {
			
		}
	}
	public void setTransColumn(DefaultTableModel model) { //for transactions
		try {
			column=new Vector();
			fRead=new FileReader(file);
			scan=new Scanner(fRead);
			while(scan.hasNext()){
				column.add(scan.nextLine());
			}
			model.setColumnIdentifiers(column);
			fRead.close();
			scan.close();
			
		} catch (Exception e) {
			
		}
	}
	public void setTransRow(DefaultTableModel model) { //for transactions
		try {		
		
			strToken=new StringTokenizer(readRecordsFromTextFile(), "#");		
			while(strToken.hasMoreTokens()){
				row=new Vector();
				for (int i = 0; i < model.getColumnCount(); i++) {
					row.add(strToken.nextToken()); 
					
				}
				model.addRow(row);
			}
		} catch (Exception e) {
			
		}
	}
	public void setCustColumn(DefaultTableModel model) { //for customers
		try {
			column=new Vector();
			fRead=new FileReader(file);
			scan=new Scanner(fRead);
			while(scan.hasNext()){
				column.add(scan.nextLine());
			}
			model.setColumnIdentifiers(column);
			fRead.close();
			scan.close();
			
		} catch (Exception e) {
			
		}
	}
	public void setCustRow(DefaultTableModel model) { //for customers
		try {		
		
			strToken=new StringTokenizer(readRecordsFromTextFile(), "#");		
			while(strToken.hasMoreTokens()){
				row=new Vector();
				for (int i = 0; i < model.getColumnCount(); i++) {
					row.add(strToken.nextToken()); 
					
				}
				model.addRow(row);
			}
		} catch (Exception e) {
			
		}
	}
	public void setEmpColumn(DefaultTableModel model) { //for employee
		try {
			column=new Vector();
			fRead=new FileReader(file);
			scan=new Scanner(fRead);
			while(scan.hasNext()){
				column.add(scan.nextLine());
			}
			model.setColumnIdentifiers(column);
			fRead.close();
			scan.close();
			
		} catch (Exception e) {
			
		}
	}
	public void setEmpRow(DefaultTableModel model) { //for employee
		try {		
		
			strToken=new StringTokenizer(readRecordsFromTextFile(), "#");		
			while(strToken.hasMoreTokens()){
				row=new Vector();
				for (int i = 0; i < model.getColumnCount(); i++) {
					row.add(strToken.nextToken()); 
					
				}
				model.addRow(row);
			}
		} catch (Exception e) {
			
		}
	}
	public void setSalesColumn(DefaultTableModel model) { // for Sales
		try {
			column=new Vector();
			fRead=new FileReader(file);
			scan=new Scanner(fRead);
			while(scan.hasNext()){
				column.add(scan.nextLine());
			}
			model.setColumnIdentifiers(column);
			fRead.close();
			scan.close();
			
		} catch (Exception e) {
			
		}
	}
	public void setSalesRow(DefaultTableModel model) { // for sales
		try {		
		
			strToken=new StringTokenizer(readRecordsFromTextFile(), "#");		
			while(strToken.hasMoreTokens()){
				row=new Vector();
				for (int i = 0; i < model.getColumnCount(); i++) {
					row.add(strToken.nextToken()); 
					
				}
				model.addRow(row);
			}
		} catch (Exception e) {
			
		}
	}
	public void setDesColumn(DefaultTableModel model) { // for Sales
		try {
			column=new Vector();
			fRead=new FileReader(file);
			scan=new Scanner(fRead);
			while(scan.hasNext()){
				column.add(scan.nextLine());
			}
			model.setColumnIdentifiers(column);
			fRead.close();
			scan.close();
			
		} catch (Exception e) {
			
		}
	}
	public void setDesRow(DefaultTableModel model) { // for sales
		try {		
		
			strToken=new StringTokenizer(readRecordsFromTextFile(), "#");		
			while(strToken.hasMoreTokens()){
				row=new Vector();
				for (int i = 0; i < model.getColumnCount(); i++) {
					row.add(strToken.nextToken()); 
					
				}
				model.addRow(row);
			}
		} catch (Exception e) {
			
		}
	}
	public int recordCount(){
		int i=0;
		try {
			fRead=new FileReader(file);
			scan=new Scanner(fRead);		
			while(scan.hasNext()){
				scan.nextLine();
				i++;
			}
			fRead.close();
			scan.close();
		} catch (Exception e) {
			
		}
		return i;
	}
	public void fillToComboBox(JComboBox combo){ 
		try {
			strToken=new StringTokenizer(readRecordsFromTextFile(), "#"); //read String from original, then separate each datum by #			
			while(strToken.hasMoreTokens()){
				combo.addItem(strToken.nextToken()); 
			}
		} catch (Exception e) {
			
		}
	}
	public void errorMessage(String msg){ //universal error message
		System.err.println(msg);
	}
	
	public Vector fillToComboBoxRoom(){ // for cboroomID
		String roomID = "", roomPrice="", roomStatus = "", Persons="";
		try {
			column=new Vector();
			fRead=new FileReader(file);
			scan=new Scanner(fRead);
			strToken=new StringTokenizer(readRecordsFromTextFile(), "#"); //read String from original, then separate each datum by #			
			while(strToken.hasMoreTokens()){
				roomID = strToken.nextToken();
				roomPrice = strToken.nextToken();
				roomStatus = strToken.nextToken();
				Persons = strToken.nextToken();
				column.add(roomID); 
			}
			
			fRead.close();
			scan.close();
		} catch (Exception e) {
			
		}
		return column;
	}

	public Vector fillToComboBoxCust(){ //for cbocustID
		String custID = "", custName="", custGender = "", custAge="",custContact="",custAddress="";
		try {
			column=new Vector();
			fRead=new FileReader(file);
			scan=new Scanner(fRead);
			strToken=new StringTokenizer(readRecordsFromTextFile(), "#"); //read String from original, then separate each datum by #			
			while(strToken.hasMoreTokens()){
				custID = strToken.nextToken();
				custName = strToken.nextToken();
				custGender = strToken.nextToken();
				custAge = strToken.nextToken();
				custContact = strToken.nextToken();
				custAddress = strToken.nextToken();
				column.add(custID); 
			}
			
			fRead.close();
			scan.close();
		} catch (Exception e) {
			
		}
		return column;
	}
	public Vector fillToComboBoxEmp(){ //for cboEmpID
		String empID = "", empName="", empAge = "", empGender="",empContact="",empAddress="";
		try {
			column=new Vector();
			fRead=new FileReader(file);
			scan=new Scanner(fRead);
			strToken=new StringTokenizer(readRecordsFromTextFile(), "#"); //read String from original, then separate each datum by #			
			while(strToken.hasMoreTokens()){
				empID = strToken.nextToken();
				empName = strToken.nextToken();
				empAge = strToken.nextToken();
				empGender = strToken.nextToken();
				empContact = strToken.nextToken();
				empAddress = strToken.nextToken();
				column.add(empID); 
			}
			
			fRead.close();
			scan.close();
		} catch (Exception e) {
			
		}
		return column;
	}
	public Vector fillToComboBoxTrans(){ //for cbotransID
		String TransCode = "", TransDate="", RoomID = "", CustID="",EmpID="",Duration="",Total="", Remarks = "";
		try {
			column=new Vector();
			fRead=new FileReader(file);
			scan=new Scanner(fRead);
			strToken=new StringTokenizer(readRecordsFromTextFile(), "#"); //read String from original, then separate each datum by #			
			while(strToken.hasMoreTokens()){
				TransCode = strToken.nextToken();
				TransDate = strToken.nextToken();
				RoomID = strToken.nextToken();
				CustID = strToken.nextToken();
				EmpID = strToken.nextToken();
				Duration = strToken.nextToken();
				Total = strToken.nextToken();
				Remarks = strToken.nextToken();
				column.add(TransCode); 
			}
			
			fRead.close();
			scan.close();
		} catch (Exception e) {
			
		}
		return column;
	}
	public boolean isFound(String username, String password){ //for login
		boolean f=false;
		try {
			String un="", pwd="";
			fRead=new FileReader(file);
			scan=new Scanner(fRead);
			while(scan.hasNext()){
				un=scan.next();
				pwd=scan.next();
				if(un.equals(username) && pwd.equals(password)){
					f=true;
				}	
			}
			fRead.close();
			scan.close();
		} catch (Exception e) {
			
		}
		return f;
	}
	public void setSalesInfoRow(DefaultTableModel model) { //sales infos
		try {		
		
			strToken=new StringTokenizer(readRecordsFromTextFile(), "#");		
			while(strToken.hasMoreTokens()){
				row=new Vector();
				for (int i = 0; i < model.getColumnCount(); i++) {
					row.add(strToken.nextToken()); 
					
				}
				model.addRow(row);
			}
		} catch (Exception e) {
			
		}
	}

}
