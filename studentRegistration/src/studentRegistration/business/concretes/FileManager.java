package studentRegistration.business.concretes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.FillPatternType;

import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;


public class FileManager {

	public String getFileDirector() {
		
		JFileChooser fileChooser=new JFileChooser();
		fileChooser.showSaveDialog(null);
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		File file=fileChooser.getSelectedFile();
		String path=file.getAbsolutePath();
		file.setReadable(true);
		
		
		return path;
	}
	
	public String createAnExcelFile() {
		
		
		HSSFWorkbook workbook = new HSSFWorkbook();   
		workbook.createSheet("Kay�t Formu");
		String outputName = getFileDirector()+".xls"; 
		
		try {
			
		OutputStream fileOut = new FileOutputStream(outputName);     
		
		workbook.write(fileOut);
		fileOut.close();
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Dosya Olu�turulurken Bir Hata Olu�tu.");
		}
		
		
		return outputName;
		
	}
	
	public void writeTableOnExcelFile(JTable table) throws IOException {
		
		String outputName = createAnExcelFile();
		
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(outputName));
		OutputStream fileOut = new FileOutputStream(outputName);
		HSSFSheet spreadsheet = workbook.getSheetAt(0);
		HSSFCellStyle cellStyle = workbook.createCellStyle();
		HSSFCellStyle cellBorder = workbook.createCellStyle();
		
		
		
		createTheTitlesOfData(spreadsheet, workbook, cellStyle);
		
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		int numberOfRow=model.getRowCount();
		
		HSSFRow  row[] = new HSSFRow[numberOfRow+2];
		
		
		//Create row 
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2] = spreadsheet.createRow(i+2);
		}
		
		//Insert ID
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2].createCell(0);
			row[i+2].getCell(0).setCellValue((Integer)model.getValueAt(i, 0));
			row[i+2].getCell(0).setCellStyle(cellBorder);
			
			
		}
		
		//Insert Name
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2].createCell(1);
			row[i+2].getCell(1).setCellValue(model.getValueAt(i, 2).toString());
			row[i+2].getCell(1).setCellStyle(cellBorder);
		}
		
		//Insert Surname
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2].createCell(2);
			row[i+2].getCell(2).setCellValue(model.getValueAt(i, 3).toString());
			row[i+2].getCell(2).setCellStyle(cellBorder);
		}
		
		//Insert  Phone Number
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2].createCell(3);
			row[i+2].getCell(3).setCellValue(model.getValueAt(i, 1).toString());
			row[i+2].getCell(3).setCellStyle(cellBorder);
		}

		//Insert Mail
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2].createCell(4);
			row[i+2].getCell(4).setCellValue(model.getValueAt(i, 4).toString());
			row[i+2].getCell(4).setCellStyle(cellBorder);
		}
		
		//Insert Location
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2].createCell(5);
			row[i+2].getCell(5).setCellValue(model.getValueAt(i, 11).toString());
			row[i+2].getCell(5).setCellStyle(cellBorder);
		}
		
		//Insert Departments
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2].createCell(6);
			row[i+2].getCell(6).setCellValue(model.getValueAt(i, 5).toString());
			row[i+2].getCell(6).setCellStyle(cellBorder);
		}
		
		//Insert Score
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2].createCell(7);
			row[i+2].getCell(7).setCellValue((Double)model.getValueAt(i, 7));
			HSSFCellStyle cellAlign = workbook.createCellStyle();
			cellAlign.setAlignment(HorizontalAlignment.LEFT);
			row[i+2].getCell(7).setCellStyle(cellAlign);
			row[i+2].getCell(7).setCellStyle(cellBorder);
		}
		
		//Insert Priority
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2].createCell(8);
			row[i+2].getCell(8).setCellValue(model.getValueAt(i, 13).toString());
			row[i+2].getCell(8).setCellStyle(cellBorder);
		}
		
		//Insert Score Type
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2].createCell(9);
			row[i+2].getCell(9).setCellValue(model.getValueAt(i, 6).toString());
			row[i+2].getCell(9).setCellStyle(cellBorder);
		}
		
		//Insert High School
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2].createCell(10);
			row[i+2].getCell(10).setCellValue(model.getValueAt(i, 8).toString());
			row[i+2].getCell(10).setCellStyle(cellBorder);
		}
		
		//Insert Education Situation
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2].createCell(11);
			row[i+2].getCell(11).setCellValue(model.getValueAt(i, 9).toString());
			row[i+2].getCell(11).setCellStyle(cellBorder);
		}
		
		//Insert Where Did You Hear From
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2].createCell(12);
			row[i+2].getCell(12).setCellValue(model.getValueAt(i, 10).toString());
			row[i+2].getCell(12).setCellStyle(cellBorder);
		}
		
		//Insert Save Date
		for(int i = 0 ; i<numberOfRow ; i++) {
			row[i+2].createCell(13);
			row[i+2].getCell(13).setCellValue(model.getValueAt(i, 12).toString());
			row[i+2].getCell(13).setCellStyle(cellBorder);
		}
		
		
		setCellWidth(spreadsheet);
		
		cellBorder.setBorderTop(BorderStyle.THIN);
		cellBorder.setBorderBottom(BorderStyle.THIN);
		cellBorder.setBorderLeft(BorderStyle.THIN);
		cellBorder.setBorderRight(BorderStyle.THIN);

		
		workbook.write(fileOut);
		fileOut.close();
		
		
		JOptionPane.showMessageDialog(null, "Tablo Excel Dosyas� Olarak D��ar� Aktar�ld�.");
	}
		
	public void createTheTitlesOfData(HSSFSheet spreadsheet, HSSFWorkbook workbook, HSSFCellStyle cellStyle){
		
		
		

		HSSFRow  row = spreadsheet.createRow(1);
		Cell cell[] = new Cell[14];
		
		

		for(int i = 0 ; i < 14 ; i++) {
			cell[i]=row.createCell(i);
		}
		
		cell[0].setCellValue("ID");
		cell[1].setCellValue("AD");
		cell[2].setCellValue("SOYAD");
		cell[3].setCellValue("TELEFON NUMARASI");
		cell[4].setCellValue("MA�L");
		cell[5].setCellValue("�L");
		cell[6].setCellValue("B�L�MLER");
		cell[7].setCellValue("PUAN");
		cell[8].setCellValue("SIRALAMA");
		cell[9].setCellValue("PUAN T�R�");
		cell[10].setCellValue("L�SE");
		cell[11].setCellValue("E��T�M DURUMU");
		cell[12].setCellValue("NEREDEN DUYDUN");
		cell[13].setCellValue("KAYIT TAR�H�");
		
		
		for(int i = 0 ; i < 14 ; i++) {
			row.getCell(i).setCellStyle(cellStyle);
			cellStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.index);

			cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		    cellStyle.setFont(createFont(workbook,"font"));
		    row.getCell(i).setCellStyle(cellStyle);
		}
		
		cellStyle.setBorderTop(BorderStyle.THIN);
		cellStyle.setBorderBottom(BorderStyle.THIN);
		cellStyle.setBorderLeft(BorderStyle.THIN);
		cellStyle.setBorderRight(BorderStyle.THIN);
		
	}
	
	public void setCellWidth(HSSFSheet spreadsheet) {
		
		for(int i = 0; i<14 ;i++){
			spreadsheet.autoSizeColumn(i);
			
		}
		
	}
	
	public HSSFFont createFont(HSSFWorkbook workbook, String text) {
		
		switch (text) {
			case "defaultFont": 
				HSSFFont defaultFont= workbook.createFont();
			    defaultFont.setFontHeightInPoints((short)10);
			    defaultFont.setFontName("Arial");
			    defaultFont.setColor(IndexedColors.BLACK.getIndex());
			    defaultFont.setBold(false);
			    defaultFont.setItalic(false);
				return defaultFont;
			
			case "font":
				HSSFFont font= workbook.createFont();
			    font.setFontHeightInPoints((short)10);
			    font.setFontName("Arial");
			    font.setColor(IndexedColors.BLACK.getIndex());
			    font.setBold(true);
			    font.setItalic(false);
			    return font;
			    
			default:
				return null;
				
		}
		
		
		

	    
	}
	
}
