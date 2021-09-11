package studentRegistration.business.concretes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class TableManager {
	
	JTable table;
	
	public TableManager(JTable table) {
		super();
		this.table = table;
	}
	
	
	public void setWidth(){
		
		TableColumnModel columnModel = table.getColumnModel();
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		columnModel.getColumn(0).setPreferredWidth(42);
		columnModel.getColumn(1).setPreferredWidth(90);
		columnModel.getColumn(2).setPreferredWidth(70);
		columnModel.getColumn(3).setPreferredWidth(70);
		columnModel.getColumn(4).setPreferredWidth(150);
		columnModel.getColumn(5).setPreferredWidth(130);
		columnModel.getColumn(6).setPreferredWidth(50);
		columnModel.getColumn(7).setPreferredWidth(40);
		columnModel.getColumn(8).setPreferredWidth(150);
		columnModel.getColumn(9).setPreferredWidth(60);
		columnModel.getColumn(10).setPreferredWidth(60);
		columnModel.getColumn(11).setPreferredWidth(70);
		columnModel.getColumn(12).setPreferredWidth(50);
		columnModel.getColumn(13).setPreferredWidth(70);
		
		
	}
	
	
	public int findMaxCharRow(int column){
		
		int max = table.getValueAt(0,column).toString().length();
		int row = 0;
		int count = table.getRowCount();
		
		for(int i = 1 ; i < count ; i++) {
			if(table.getValueAt(i, column).toString().length()>max) {
				max = table.getValueAt(i, column).toString().length();
				row = i;
			}
		}
		
	
	
		return row;
	}
	
	public int countasDate(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));
		
		int count = 0;
		for(int i = 0; i < table.getRowCount(); i++) {
			if (table.getValueAt(i, 12).toString().startsWith(dtf.format(now))) {
				count+=1;
			}
		}
		
		return count;
	}

}
