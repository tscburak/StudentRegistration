package studentRegistration.business.abstracts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import studentRegistration.entities.concretes.Student;

public interface StudentService {

	public void saveStudent(Student student);
	
	public void getAllStudent(JTable table, JLabel labeltablo,JLabel labeltoday);
	
	public void deleteStudent(String[] value,JTable table);
	
	public void updateStudent(Student student,String value);
	
	public void getFindStudent(Student student, JTable table, String findValue, JLabel labeltablo,String findElements,JLabel labeltoday);
	
	public void sortByColumName(Student student,  JTable table);
	
	}
