package studentRegistration.business.concretes;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;


import studentRegistration.business.abstracts.StudentService;
import studentRegistration.dataAccess.concretes.ConnectDb;
import studentRegistration.entities.concretes.Student;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import net.proteanit.sql.DbUtils;

public class StudentManager implements StudentService{

	ConnectDb connectDb = new ConnectDb();
	
	Connection connection = connectDb.connectDb();
	PreparedStatement pst = null;
	ResultSet rs= null;
	
	
	
	@Override
	public void saveStudent(Student student) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		
		
		String sql = "INSERT INTO candidate_student(name, surname, phone_number, email,"
				+ "departments, score_type, score, placement_priority, highschool,"
				+ "education_situation, nereden, location, save)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			pst = connection.prepareStatement(sql);
			
			
			pst.setString(1, student.getName());
			pst.setString(2, student.getSurname());
			pst.setString(3, student.getPhone_number());
			pst.setString(4, student.getEmail());
			pst.setString(5, student.getDepartments());
			pst.setString(6, student.getScore_type());
			pst.setDouble(7, student.getScore());
			pst.setString(8, student.getPlacement_priority());
			pst.setString(9, student.getHighschool());
			pst.setString(10, student.getEducation_situation());
			pst.setString(11, student.getWhere());
			pst.setString(12, student.getLocation());
			pst.setString(13, dtf.format(now));
			
			if(student.getName().isEmpty() || student.getSurname().isEmpty() || student.getEmail().isEmpty()) {
				JOptionPane.showMessageDialog(null,"Zorunlu Bilgileri Girdiðinizden Emin olunuz.");
			}
			else {
				pst.execute();
				JOptionPane.showMessageDialog(null, "Öðrenci Eklendi!");
			}

		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Özel Karakter Kullanmadýðýnýzdan Emin Olunuz ('^+%&/");
		}
		
	}

	@Override
	public void getAllStudent(JTable table, JLabel labeltablo,JLabel labeltoday) {
		String sql = "SELECT * from candidate_student ORDER BY id";
		
		try {
			pst = connection.prepareStatement(sql);
			rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));

//			table.setAutoCreateRowSorter(true);
//			table.getRowSorter().toggleSortOrder(0);
			TableManager tableManager = new TableManager(table);
			tableManager.setWidth();
			labeltablo.setText(String.valueOf(table.getRowCount()));
			labeltoday.setText(String.valueOf(tableManager.countasDate()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void deleteStudent(String[] value,JTable table ) {
		
		for(int i = 0 ; i<value.length ; i++) {
			String sql = "DELETE from candidate_student WHERE id="+value[i];
			
			try {

				pst = connection.prepareStatement(sql);	
				pst.execute();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

	@Override
	public void updateStudent(Student student,String value) {
		
		String sql = "UPDATE candidate_student SET name ='"+student.getName()+"', surname='"+student.getSurname()+"', phone_number='"+student.getPhone_number() +
				"', email='"+student.getEmail()+"', departments='"+student.getDepartments()+"', score_type='"+student.getScore_type()+"', score="+student.getScore()+
				", placement_priority='"+student.getPlacement_priority()+"', highschool='"+student.getHighschool()
				+ "', education_situation='"+student.getEducation_situation()+"', nereden='"+student.getWhere()+"', location='"+student.getLocation()+"' WHERE id="+value;
		try {
			pst = connection.prepareStatement(sql);
			
			
			pst.execute();
			JOptionPane.showMessageDialog(null, "Öðrenci Güncellendi!");
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void getFindStudent(Student student, JTable table, String findValue,JLabel labeltablo,String findElements,JLabel labeltoday ) {

		
		
		String sql = "SELECT * from candidate_student WHERE CONCAT ("+findElements+") LIKE '%"+findValue+"%' ORDER BY id";
		
		try {
			pst = connection.prepareStatement(sql);
			rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));

//			table.setAutoCreateRowSorter(true);
//			table.getRowSorter().toggleSortOrder(0);
			
			TableManager tableManager = new TableManager(table);
			tableManager.setWidth();
			labeltablo.setText(String.valueOf(table.getRowCount()));
			labeltoday.setText(String.valueOf(tableManager.countasDate()));
		}catch(org.postgresql.util.PSQLException e2) {
			JOptionPane.showMessageDialog(null, "Lütfen Arama Yapacaðýnýz Sütun/Sütunlarý Kutucuklardan Ýþaretleyiniz.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void sortByColumName(Student student, JTable table) {


		String sql = "SELECT * FROM candidate_student ORDER BY id";
		
		try {
			pst = connection.prepareStatement(sql);
			rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
	
			
			TableManager tableManager = new TableManager(table);
			tableManager.setWidth();

		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

}
