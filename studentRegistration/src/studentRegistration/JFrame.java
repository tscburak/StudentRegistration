package studentRegistration;


import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import studentRegistration.business.abstracts.StudentService;
import studentRegistration.business.concretes.EducationTypeManager;
import studentRegistration.business.concretes.FileManager;
import studentRegistration.business.concretes.FindManager;
import studentRegistration.business.concretes.StudentManager;
import studentRegistration.business.concretes.SwitchPanel;
import studentRegistration.business.concretes.TableManager;
import studentRegistration.business.concretes.WhereManager;
import studentRegistration.entities.concretes.Student;

import java.awt.Dimension;

import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;




import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;

import java.awt.Rectangle;

import java.awt.GridLayout;
import java.awt.Window.Type;

public class JFrame extends javax.swing.JFrame {
	
	
	EducationTypeManager educationTypeManager = new EducationTypeManager();
	StudentService studentManager = new StudentManager();

	
	

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textSurname;
	private JTextField textPhone;
	private JTextField textMail;
	private JTextField textDeparments;
	private JTextField textScore;
	private JTextField textProprioraty;
	private JTextField textHighschool;
	private JTextField textField_8;
	private JTable table;
	private JTextField textField;
	
	String updateValueId=null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		
			}
		});
		
		
		
		
		
		
	}
	
	
	
	
	
	/**
	 * Create the frame.
	 */
	public JFrame() {
		setResizable(false);
		setTitle("Kay\u0131t Formu\r\n");
		setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		setMaximumSize(new Dimension(1460, 800));
		setBounds(100, 100, 1200, 719);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 34, 1164, 632);
		layeredPane.setLayout(null);
		contentPane.add(layeredPane);
		
		JPanel panelkayit = new JPanel();
		layeredPane.setLayer(panelkayit, 2);
		panelkayit.setBackground(SystemColor.controlHighlight);
		panelkayit.setFont(new Font("Dialog", Font.PLAIN, 12));
		panelkayit.setBounds(0, 0, 1164, 639);
		layeredPane.add(panelkayit);
		
		
		JPanel panelogrenciler = new JPanel();
		panelogrenciler.setBackground(SystemColor.controlHighlight);
		layeredPane.setLayer(panelogrenciler, 1);
		panelogrenciler.setBounds(0, 0, 1164, 639);
		layeredPane.add(panelogrenciler);
		
		JPanel panelmain = new JPanel();
		panelmain.setBackground(SystemColor.controlHighlight);
		layeredPane.setLayer(panelmain, 0);
		panelmain.setBounds(0, 0, 1164, 632);
		layeredPane.add(panelmain);
		panelmain.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(SystemColor.controlHighlight);
		btnNewButton_3.setIcon(new ImageIcon(JFrame.class.getResource("/images/add.png")));
		panelmain.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("... \u00DCN\u0130VERS\u0130TES\u0130");
		lblNewLabel.setBounds(477, 105, 210, 31);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		
		JLabel lblAdayrenciKayt = new JLabel("Aday \u00D6\u011Frenci Kay\u0131t Formu");
		lblAdayrenciKayt.setBounds(470, 133, 223, 31);
		lblAdayrenciKayt.setFont(new Font("Arial", Font.PLAIN, 19));
		
		textName = new JTextField();
		textName.setBounds(193, 205, 172, 20);
		textName.setColumns(10);
		
		textSurname = new JTextField();
		textSurname.setBounds(510, 205, 172, 20);
		textSurname.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("*Ad:");
		lblNewLabel_2.setBounds(156, 208, 30, 14);
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		JLabel lblNewLabel_2_1 = new JLabel("*Soyad:");
		lblNewLabel_2_1.setBounds(451, 207, 56, 17);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Telefon No:");
		lblNewLabel_2_1_1.setBounds(739, 207, 83, 17);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		textPhone = new JTextField();
		textPhone.setBounds(829, 205, 172, 20);
		textPhone.setColumns(10);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("\u0130l:");
		lblNewLabel_2_1_2.setBounds(167, 253, 19, 17);
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_2.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(193, 251, 172, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Se\u00E7iniz", "Adana", "Ad\u0131yaman", "Afyonkarahisar", "A\u011Fr\u0131", "Aksaray", "Amasya", "Ankara", "Antalya", "Ardahan", "Artvin", "Ayd\u0131n", "Bal\u0131kesir", "Bart\u0131n", "Batman", "Bayburt", "Bilecik", "Bing\u00F6l", "Bitlis", "Bolu", "Burdur", "Bursa", "\u00C7anakkale", "\u00C7ank\u0131r\u0131", "\u00C7orum", "Denizli", "Diyarbak\u0131r", "D\u00FCzce", "Edirne", "Elaz\u0131\u011F", "Erzincan", "Erzurum", "Eski\u015Fehir", "Gaziantep", "Giresun", "G\u00FCm\u00FC\u015Fhane", "Hakk\u00E2ri", "Hatay", "I\u011Fd\u0131r", "Isparta", "\u0130stanbul", "\u0130zmir", "Kahramanmara\u015F", "Karab\u00FCk", "Karaman", "Kars", "Kastamonu", "Kayseri", "Kilis", "K\u0131r\u0131kkale", "K\u0131rklareli", "K\u0131r\u015Fehir", "Kocaeli", "Konya", "K\u00FCtahya", "Malatya", "Manisa", "Mardin", "Mersin", "Mu\u011Fla", "Mu\u015F", "Nev\u015Fehir", "Ni\u011Fde", "Ordu", "Osmaniye", "Rize", "Sakarya", "Samsun", "\u015Eanl\u0131urfa", "Siirt", "Sinop", "Sivas", "\u015E\u0131rnak", "Tekirda\u011F", "Tokat", "Trabzon", "Tunceli", "U\u015Fak", "Van", "Yalova", "Yozgat", "Zonguldak"}));
		
		JLabel lblNewLabel_2_1_3 = new JLabel("*E-Posta:");
		lblNewLabel_2_1_3.setBounds(435, 253, 69, 17);
		lblNewLabel_2_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_3.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		textMail = new JTextField();
		textMail.setBounds(510, 251, 172, 20);
		textMail.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("B\u00F6l\u00FCmler:");
		lblNewLabel_2_1_1_1.setBounds(739, 253, 83, 17);
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1_1.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		textDeparments = new JTextField();
		textDeparments.setBounds(829, 251, 172, 20);
		textDeparments.setColumns(10);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Puan:");
		lblNewLabel_2_1_2_1.setBounds(140, 295, 46, 17);
		lblNewLabel_2_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_2_1.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		textScore = new JTextField();
		textScore.setBounds(193, 293, 172, 20);
		textScore.setColumns(10);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Puan T\u00FCr\u00FC:");
		lblNewLabel_2_1_2_2.setBounds(739, 295, 83, 17);
		lblNewLabel_2_1_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_2_2.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(829, 293, 172, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Se\u00E7iniz", "SAY", "S\u00D6Z", "EA", "D\u0130L", "TYT"}));
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("S\u0131ralama:");
		lblNewLabel_2_1_3_1.setBounds(435, 295, 69, 17);
		lblNewLabel_2_1_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_3_1.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		textProprioraty = new JTextField();
		textProprioraty.setBounds(510, 293, 172, 20);
		textProprioraty.setColumns(10);
		
		textHighschool = new JTextField();
		textHighschool.setBounds(193, 338, 172, 20);
		textHighschool.setColumns(10);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("Lise:");
		lblNewLabel_2_1_2_1_1.setBounds(140, 340, 46, 17);
		lblNewLabel_2_1_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_2_1_1.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("E\u011Fitim Durumu:");
		lblNewLabel_2_1_3_1_1.setBounds(593, 340, 109, 17);
		lblNewLabel_2_1_3_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_3_1_1.setFont(new Font("Arial Narrow", Font.BOLD, 17));
		
		
		
		JCheckBox chckbox1 = new JCheckBox("12. S\u0131n\u0131f");
		chckbox1.setBackground(SystemColor.controlHighlight);
		chckbox1.setBounds(716, 338, 86, 20);
		
		JCheckBox chckbox2 = new JCheckBox("Mezun");
		chckbox2.setBackground(SystemColor.controlHighlight);
		chckbox2.setBounds(824, 338, 69, 20);
		
		
		chckbox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbox2.setSelected(false);
			}
		});
		
		chckbox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbox1.setSelected(false);
			}
		});
		
		JCheckBox chckbox3 = new JCheckBox("Gazete-Dergi \u0130lan\u0131");
		chckbox3.setBackground(SystemColor.controlHighlight);
		chckbox3.setBounds(156, 427, 124, 23);
		
		JCheckBox chckbox4 = new JCheckBox("Televizyon");
		chckbox4.setBackground(SystemColor.controlHighlight);
		chckbox4.setBounds(156, 462, 124, 23);
		
		JCheckBox chckbox5 = new JCheckBox("\u0130nternet");
		chckbox5.setBackground(SystemColor.controlHighlight);
		chckbox5.setBounds(156, 497, 124, 23);
		
		JCheckBox chckbox8 = new JCheckBox("Panel ve Seminerler");
		chckbox8.setBackground(SystemColor.controlHighlight);
		chckbox8.setBounds(392, 497, 139, 23);
		
		JCheckBox chckbox7 = new JCheckBox("Yak\u0131n \u00C7evre");
		chckbox7.setBackground(SystemColor.controlHighlight);
		chckbox7.setBounds(392, 462, 124, 23);
		
		JCheckBox chckbox6 = new JCheckBox("Okul");
		chckbox6.setBackground(SystemColor.controlHighlight);
		chckbox6.setBounds(392, 427, 124, 23);
		
		JCheckBox chckbox11 = new JCheckBox("\u00D6SYM K\u0131lavuzu");
		chckbox11.setBackground(SystemColor.controlHighlight);
		chckbox11.setBounds(628, 497, 124, 23);
		
		JCheckBox chckbox10 = new JCheckBox("\u00DCniversite Web Sayfas\u0131");
		chckbox10.setBackground(SystemColor.controlHighlight);
		chckbox10.setBounds(628, 462, 161, 23);
		
		JCheckBox chckbox9 = new JCheckBox("Billboard");
		chckbox9.setBackground(SystemColor.controlHighlight);
		chckbox9.setBounds(628, 427, 124, 23);
		
		JCheckBox chckbox14 = new JCheckBox("Online Etkinlikler");
		chckbox14.setBackground(SystemColor.controlHighlight);
		chckbox14.setBounds(864, 497, 124, 23);
		
		JCheckBox chckbox13 = new JCheckBox("Sosyal Medya");
		chckbox13.setBackground(SystemColor.controlHighlight);
		chckbox13.setBounds(864, 462, 124, 23);
		
		JCheckBox chckbox12 = new JCheckBox("E\u011Fitim Fuarlar\u0131");
		chckbox12.setBackground(SystemColor.controlHighlight);
		chckbox12.setBounds(864, 427, 124, 23);
		
		JCheckBox chckbox15 = new JCheckBox("Di\u011Fer (Yaz\u0131n\u0131z)");
		chckbox15.setBackground(SystemColor.controlHighlight);
		chckbox15.setBounds(156, 533, 124, 23);
		
		
		JLabel lblCurrentUpdateText = new JLabel("\u015Eu An G\u00FCncellenen ID:");
		lblCurrentUpdateText.setBounds(480, 543, 124, 16);
		lblCurrentUpdateText.setVisible(false);
		panelkayit.add(lblCurrentUpdateText);
		
		JLabel lblCurrentUpdateId = new JLabel("");
		lblCurrentUpdateId.setBounds(609, 543, 43, 16);
		lblCurrentUpdateId.setVisible(false);
		panelkayit.add(lblCurrentUpdateId);
		
		
		
		chckbox15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_8.isEditable()) {
					textField_8.setEditable(false);
					textField_8.setText(null);
				}
				else
				{
					textField_8.setEditable(true);
				}
			}
		});
		
		textField_8 = new JTextField();
		textField_8.setBounds(156, 569, 172, 22);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		
		JLabel lblskdarniversitesiniNereden = new JLabel("... \u00DCniversitesini Nereden Duydunuz?");
		lblskdarniversitesiniNereden.setBounds(156, 385, 289, 31);
		lblskdarniversitesiniNereden.setFont(new Font("Arial", Font.BOLD, 16));
		
		JButton btnUpdate = new JButton("G\u00FCncelle");
		btnUpdate.setBounds(537, 578, 89, 23);
		btnUpdate.setEnabled(false);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				
				
				try {
					StudentService studentManager = new StudentManager();
					Student student=new Student();
					WhereManager whereManager = new WhereManager(chckbox3, chckbox4, chckbox5, chckbox6, chckbox7, chckbox8, chckbox9, chckbox10, chckbox11, chckbox12, chckbox13, chckbox14);
					
					student.setName(textName.getText());
					student.setSurname(textSurname.getText());
					student.setPhone_number(textPhone.getText());
					student.setEmail(textMail.getText());
					student.setDepartments(textDeparments.getText());
					student.setScore_type(comboBox_1.getSelectedItem().toString());
					if(textScore.getText().isEmpty() || textScore.getText().isBlank()) {
						student.setScore(0.0);
					}else {
						student.setScore(Double.parseDouble(textScore.getText()));
					}
					student.setPlacement_priority(textProprioraty.getText());
					student.setHighschool(textHighschool.getText());
					student.setEducation_situation(educationTypeManager.whichOne(chckbox1, chckbox2));
					student.setWhere(whereManager.whereYouHearFrom()+textField_8.getText());
					student.setLocation(comboBox.getSelectedItem().toString());
					student.setSave(null);

					studentManager.updateStudent(student, updateValueId);
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
					JOptionPane.showMessageDialog(null,"Seçili Öðrenci Yok.");
					btnUpdate.setEnabled(false);
					
					textName.setText(null);
					textSurname.setText(null);
					textPhone.setText(null);
					textMail.setText(null);
					textDeparments.setText(null);
					textScore.setText(null);
					textProprioraty.setText(null);
					textHighschool.setText(null);
					textField_8.setText(null);
					chckbox1.setSelected(false);
					chckbox2.setSelected(false);
					chckbox3.setSelected(false);
					chckbox4.setSelected(false);
					chckbox5.setSelected(false);
					chckbox6.setSelected(false);
					chckbox7.setSelected(false);
					chckbox8.setSelected(false);
					chckbox9.setSelected(false);
					chckbox10.setSelected(false);
					chckbox11.setSelected(false);
					chckbox12.setSelected(false);
					chckbox13.setSelected(false);
					chckbox14.setSelected(false);
					chckbox15.setSelected(false);
					comboBox.setSelectedIndex(0);
					comboBox_1.setSelectedIndex(0);
					textField_8.setEditable(false);
				}
				
	
			}
		});
		panelkayit.setLayout(null);
		panelkayit.add(btnUpdate);
		
		
		
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.setBounds(680, 578, 89, 23);
		btnKaydet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				Student student = new Student();
				WhereManager whereManager = new WhereManager(chckbox3, chckbox4, chckbox5, chckbox6, chckbox7, chckbox8, chckbox9, chckbox10, chckbox11, chckbox12, chckbox13, chckbox14);
				
					try {				
						
//						Student student = new Student(textName.getText(),textSurname.getText(),textPhone.getText(),textMail.getText(),textDeparments.getText(),comboBox_1.getSelectedItem().toString(),Double.parseDouble(textScore.getText()),textProprioraty.getText(),textHighschool.getText(),educationTypeManager.whichOne(chckbox1, chckbox2),whereManager.whereYouHearFrom(chckbox3, chckbox4, chckbox5, chckbox6, chckbox7, chckbox8, chckbox9, chckbox10, chckbox11, chckbox12, chckbox13, chckbox14)+textField_8.getText(),comboBox.getSelectedItem().toString(),null);
						
						student.setName(textName.getText());
						student.setSurname(textSurname.getText());
						student.setPhone_number(textPhone.getText());
						student.setEmail(textMail.getText());
						student.setDepartments(textDeparments.getText());
						student.setScore_type(comboBox_1.getSelectedItem().toString());
						if(textScore.getText().isEmpty() || textScore.getText().isBlank()) {
							student.setScore(0.0);
						}else {
							student.setScore(Double.parseDouble(textScore.getText()));
						}
						student.setPlacement_priority(textProprioraty.getText());
						student.setHighschool(textHighschool.getText());
						student.setEducation_situation(educationTypeManager.whichOne(chckbox1, chckbox2));
						student.setWhere(whereManager.whereYouHearFrom()+textField_8.getText());
						student.setLocation(comboBox.getSelectedItem().toString());
						student.setSave(null);
						
						
						studentManager.saveStudent(student);
						btnUpdate.setEnabled(false);
						lblCurrentUpdateText.setVisible(false);
						lblCurrentUpdateId.setVisible(false);
					}
					catch(java.lang.NumberFormatException error) {
						JOptionPane.showMessageDialog(null, "Puan Sekmesine Sayýsal Deðer Yazdýðýnýzdan Emin Olunuz!");
						System.out.println(error.getMessage());
						
					}
				
				
				
				
			}
		});
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		
		
		
		
		
		JButton btnSfrla = new JButton("S\u0131f\u0131rla");
		btnSfrla.setBounds(402, 578, 89, 23);
		btnSfrla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int reply = JOptionPane.showConfirmDialog(null, "Sýfýrlamak Ýstediðinize Emin Misiniz?", "Sýfýrla?",  JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
				{
					textName.setText(null);
					textSurname.setText(null);
					textPhone.setText(null);
					textMail.setText(null);
					textDeparments.setText(null);
					textScore.setText(null);
					textProprioraty.setText(null);
					textHighschool.setText(null);
					textField_8.setText(null);
					chckbox1.setSelected(false);
					chckbox2.setSelected(false);
					chckbox3.setSelected(false);
					chckbox4.setSelected(false);
					chckbox5.setSelected(false);
					chckbox6.setSelected(false);
					chckbox7.setSelected(false);
					chckbox8.setSelected(false);
					chckbox9.setSelected(false);
					chckbox10.setSelected(false);
					chckbox11.setSelected(false);
					chckbox12.setSelected(false);
					chckbox13.setSelected(false);
					chckbox14.setSelected(false);
					chckbox15.setSelected(false);
					comboBox.setSelectedIndex(0);
					comboBox_1.setSelectedIndex(0);
					textField_8.setEditable(false);
					
					btnUpdate.setEnabled(false);
					lblCurrentUpdateText.setVisible(false);
					lblCurrentUpdateId.setVisible(false);
				   
				}
				
				
				
				
				
				
			}
		});
		btnSfrla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelkayit.add(lblNewLabel);
		panelkayit.add(lblAdayrenciKayt);
		panelkayit.add(lblNewLabel_2);
		panelkayit.add(textName);
		panelkayit.add(lblNewLabel_2_1);
		panelkayit.add(textSurname);
		panelkayit.add(lblNewLabel_2_1_1);
		panelkayit.add(textPhone);
		panelkayit.add(lblNewLabel_2_1_2);
		panelkayit.add(comboBox);
		panelkayit.add(lblNewLabel_2_1_3);
		panelkayit.add(textMail);
		panelkayit.add(lblNewLabel_2_1_1_1);
		panelkayit.add(textDeparments);
		panelkayit.add(lblNewLabel_2_1_2_1);
		panelkayit.add(textScore);
		panelkayit.add(lblNewLabel_2_1_3_1);
		panelkayit.add(textProprioraty);
		panelkayit.add(lblNewLabel_2_1_2_2);
		panelkayit.add(comboBox_1);
		panelkayit.add(lblNewLabel_2_1_2_1_1);
		panelkayit.add(textHighschool);
		panelkayit.add(lblNewLabel_2_1_3_1_1);
		panelkayit.add(chckbox1);
		panelkayit.add(chckbox2);
		panelkayit.add(lblskdarniversitesiniNereden);
		panelkayit.add(chckbox3);
		panelkayit.add(chckbox6);
		panelkayit.add(chckbox9);
		panelkayit.add(chckbox12);
		panelkayit.add(chckbox4);
		panelkayit.add(chckbox7);
		panelkayit.add(chckbox10);
		panelkayit.add(chckbox13);
		panelkayit.add(chckbox5);
		panelkayit.add(chckbox8);
		panelkayit.add(chckbox11);
		panelkayit.add(chckbox14);
		panelkayit.add(chckbox15);
		panelkayit.add(textField_8);
		panelkayit.add(btnSfrla);
		panelkayit.add(btnKaydet);
		
	
		
		
//		switchPanel(panelkayit,layeredPane);
		
		
		JLabel labeltoday = new JLabel("0");
		labeltoday.setHorizontalAlignment(SwingConstants.CENTER);
		labeltoday.setBounds(1074, 476, 46, 14);
		panelogrenciler.add(labeltoday);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setBounds(29, 42, 1105, 402);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	
		JLabel labeltablo = new JLabel("New label");
		labeltablo.setHorizontalAlignment(SwingConstants.CENTER);
		labeltablo.setBounds(1074, 455, 46, 14);
		panelogrenciler.add(labeltablo);
		labeltablo.setText(String.valueOf(table.getRowCount()));
		
		
		
		studentManager.getAllStudent(table, labeltablo,labeltoday);
		
		
		TableManager tableManager = new TableManager(table);
		tableManager.setWidth();
		
		
		
		
		
		JButton btnNewButton_2_1 = new JButton("Sil");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					
					
					
					int[] row = table.getSelectedRows();
					int rowcount = row.length;
					
					if(rowcount==0) {
						rowcount=-1;
					}

					String[] value = new String[rowcount+1];
			
					
					for(int i = 0; i < row.length; i++) {
						
						value[i]=table.getModel().getValueAt(row[i], 0).toString();
						
						System.out.println(table.getModel().getValueAt(row[i], 0));
					}
					
					
					System.out.println(value[0]);
					
					int reply = JOptionPane.showConfirmDialog(null, "Silmek Ýstediðinize Emin Misiniz?", "Sil?",  JOptionPane.YES_NO_OPTION);
					if (reply == JOptionPane.YES_OPTION)		
					{	
					studentManager.deleteStudent(value,table);
					
					
					studentManager.getAllStudent(table, labeltablo,labeltoday);
					
					if(row.length==1) {
						JOptionPane.showMessageDialog(null, "Seçili Öðrenci Silindi!");
					}
					else if(row.length>1) {
						JOptionPane.showMessageDialog(null, "Seçili Öðrenciler Silindi!");
					}
					
					
					}
					
				}
				
				catch(java.lang.ArrayIndexOutOfBoundsException error) {
					JOptionPane.showMessageDialog(null, "Seçili Öðrenci Yok.");
				}
				
				
				

			}
		});
		
		btnNewButton_2_1.setBounds(931, 558, 89, 23);
		panelogrenciler.add(btnNewButton_2_1);
		
		
		JButton btnNewButton_2_1_1 = new JButton("D\u00FCzenle");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				
				
				
				try {
					
					
					//Reset All Data which in Registered Screen
					textName.setText(null);
					textSurname.setText(null);
					textPhone.setText(null);
					textMail.setText(null);
					textDeparments.setText(null);
					textScore.setText(null);
					textProprioraty.setText(null);
					textHighschool.setText(null);
					textField_8.setText(null);
					chckbox1.setSelected(false);
					chckbox2.setSelected(false);
					chckbox3.setSelected(false);
					chckbox4.setSelected(false);
					chckbox5.setSelected(false);
					chckbox6.setSelected(false);
					chckbox7.setSelected(false);
					chckbox8.setSelected(false);
					chckbox9.setSelected(false);
					chckbox10.setSelected(false);
					chckbox11.setSelected(false);
					chckbox12.setSelected(false);
					chckbox13.setSelected(false);
					chckbox14.setSelected(false);
					chckbox15.setSelected(false);
					comboBox.setSelectedIndex(0);
					comboBox_1.setSelectedIndex(0);
					textField_8.setEditable(false);
					
					
					
					
					int row = table.getSelectedRow();
					
					updateValueId=model.getValueAt(row, 0).toString();
					
					lblCurrentUpdateId.setText(updateValueId);
					textPhone.setText(model.getValueAt(row, 1).toString());
					textName.setText(model.getValueAt(row, 2).toString());
					textSurname.setText(model.getValueAt(row, 3).toString());
					textMail.setText(model.getValueAt(row,4).toString());
					textDeparments.setText(model.getValueAt(row,5).toString());
					textScore.setText(model.getValueAt(row,7).toString());
					textProprioraty.setText(model.getValueAt(row,13).toString());
					textHighschool.setText(model.getValueAt(row,8).toString());
					
					
					switch(model.getValueAt(row, 9).toString()){
						case "12. Sýnýf":
							chckbox1.setSelected(true);
							chckbox2.setSelected(false);
							break;
						case "Mezun":
							chckbox2.setSelected(true);
							chckbox1.setSelected(false);
							break;
							
					}
					
					String[] neredenArr = model.getValueAt(row, 10).toString().split(", ");
					
					for(int i = 0 ; i < neredenArr.length ; i++) {
						
						switch(neredenArr[i]) {
						case"Gazete-Dergi Ýlaný":
							chckbox3.setSelected(true);
							break;
						case"Televizyon":
							chckbox4.setSelected(true);
							break;
						case"Ýnternet":
							chckbox5.setSelected(true);
							break;
						case"Okul":
							chckbox6.setSelected(true);
							break;
						case"Yakýn Çevre":
							chckbox7.setSelected(true);
							break;
						case"Panel ve Seminerler":
							chckbox8.setSelected(true);
							break;
						case"Billboard":
							chckbox9.setSelected(true);
							break;
						case"ÜÜ Web Sayfasý":
							chckbox10.setSelected(true);
							break;
						case"ÖSYM Kýlavuzu":
							chckbox11.setSelected(true);
							break;
						case"Eðitim Fuarlarý":
							chckbox12.setSelected(true);
							break;
						case"Sosyal Medya":
							chckbox13.setSelected(true);
							break;
						case"Online Etkinlikler":
							chckbox14.setSelected(true);
							break;
							default:
								chckbox15.setSelected(true);
								textField_8.setEditable(true);
								textField_8.setText(neredenArr[neredenArr.length-1]);
							
						
						}
						
						
						
					}
					
					
					for(int j = 0; j < comboBox.getModel().getSize(); j++) {
						
						if(model.getValueAt(row,11).equals(comboBox.getModel().getElementAt(j))) {
							comboBox.setSelectedIndex(j);
							break;
						}
						
					}
					
					for(int j = 0; j < comboBox_1.getModel().getSize(); j++) {
						
						if(model.getValueAt(row,6).equals(comboBox_1.getModel().getElementAt(j))) {
							comboBox_1.setSelectedIndex(j);
							break;
						}
						
					}
					
					new SwitchPanel(panelkayit, layeredPane);
					btnUpdate.setEnabled(true);
					lblCurrentUpdateText.setVisible(true);
					lblCurrentUpdateId.setVisible(true);
					
					
				}
				catch(java.lang.ArrayIndexOutOfBoundsException error) {
					JOptionPane.showMessageDialog(null, "Seçili Öðrenci Yok.");
				}
				
				
				
				
				
			}
		});
		btnNewButton_2_1_1.setBounds(1045, 558, 89, 23);
		panelogrenciler.add(btnNewButton_2_1_1);
		
		JPanel panelAra = new JPanel();
		panelAra.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelAra.setBackground(UIManager.getColor("Button.background"));
		panelAra.setBounds(29, 451, 565, 157);
		panelogrenciler.add(panelAra);
		
		
		
		JCheckBox chckbxMail = new JCheckBox("E-Mail");
		chckbxMail.setBounds(387, 116, 126, 23);
		
		panelAra.add(chckbxMail);
		
		
		
		JLabel lblNewLabel_3_1 = new JLabel("Tabloda G\u00F6sterilen \u00D6\u011Frenci Say\u0131s\u0131:");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1.setBounds(854, 455, 211, 14);
		panelogrenciler.add(lblNewLabel_3_1);
		
		JCheckBox chckbxId = new JCheckBox("Id");
		chckbxId.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxId.setBounds(6, 5, 126, 23);
		
		panelAra.add(chckbxId);
		
		JCheckBox chckbxName = new JCheckBox("Ad");
		chckbxName.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxName.setBounds(134, 5, 126, 23);
		
		panelAra.add(chckbxName);
		
		JCheckBox chckbxSurname = new JCheckBox("Soyad");
		chckbxSurname.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxSurname.setBounds(259, 5, 126, 23);
		
		panelAra.add(chckbxSurname);
		
		JCheckBox chckbxTelefonNumaras = new JCheckBox("Telefon Numaras\u0131");
		chckbxTelefonNumaras.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxTelefonNumaras.setBounds(387, 5, 126, 23);
		
		panelAra.add(chckbxTelefonNumaras);
		
		textField = new JTextField();
		textField.setBounds(10, 116, 144, 20);
		
		textField.setColumns(10);
		panelAra.add(textField);
		
		JCheckBox chckbxBolumler = new JCheckBox("B\u00F6l\u00FCmler");
		chckbxBolumler.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxBolumler.setBounds(259, 79, 126, 23);
		panelAra.add(chckbxBolumler);
		
		JCheckBox chckbxPuan = new JCheckBox("Puan");
		chckbxPuan.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxPuan.setBounds(6, 42, 126, 23);
		panelAra.add(chckbxPuan);
		
		JCheckBox chckbxSiralama = new JCheckBox("S\u0131ralama");
		chckbxSiralama.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxSiralama.setBounds(134, 42, 126, 23);
		panelAra.add(chckbxSiralama);
		
		JCheckBox chckbxPuanturu = new JCheckBox("Puan T\u00FCr\u00FC");
		chckbxPuanturu.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxPuanturu.setBounds(259, 42, 126, 23);
		panelAra.add(chckbxPuanturu);
		
		JCheckBox chckbxLise = new JCheckBox("Lise");
		chckbxLise.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxLise.setBounds(387, 79, 126, 23);
		panelAra.add(chckbxLise);
		
		JCheckBox chckbxNereden = new JCheckBox("Nereden Duydun?");
		chckbxNereden.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxNereden.setBounds(387, 42, 126, 23);
		panelAra.add(chckbxNereden);
		
		JCheckBox chckbxEitimDurumu = new JCheckBox("E\u011Fitim Durumu");
		chckbxEitimDurumu.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxEitimDurumu.setBounds(6, 79, 114, 23);
		panelAra.add(chckbxEitimDurumu);
		
		JCheckBox chckbxIl = new JCheckBox("\u0130l");
		chckbxIl.setBounds(new Rectangle(100, 0, 0, 0));
		chckbxIl.setBounds(134, 79, 126, 23);
		panelAra.add(chckbxIl);

		JCheckBox chckbxKaytTarihi = new JCheckBox("Kay\u0131t Tarihi");
		chckbxKaytTarihi.setBounds(259, 115, 126, 23);
		panelAra.add(chckbxKaytTarihi);
		
		
		JButton btnNewButton = new JButton("Ara");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				FindManager findManager = new FindManager(chckbxId,chckbxName,chckbxSurname,chckbxTelefonNumaras,
						chckbxPuan,chckbxSiralama,chckbxPuanturu,chckbxNereden,chckbxEitimDurumu,
						chckbxIl,chckbxBolumler,chckbxLise,chckbxMail,chckbxKaytTarihi);
				
				studentManager.getFindStudent(null, table, textField.getText(),labeltablo,findManager.findAt(),labeltoday);
			}
		});
		panelAra.setLayout(null);
		
		btnNewButton.setBounds(166, 116, 55, 20);
		
		panelAra.add(btnNewButton);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 1164, 649);
		panel_2.setLayout(null);
		
		
		
		JButton btnNewButton_1 = new JButton("Kay\u0131t Formu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				new SwitchPanel(panelkayit, layeredPane);
			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBounds(0, 0, 89, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\u00D6\u011Frenciler");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SwitchPanel(panelogrenciler, layeredPane);
			}
		});
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBounds(88, 0, 89, 23);
		panel_2.add(btnNewButton_1_1);
		contentPane.setLayout(null);
		
		contentPane.add(panel_2);
		
		JButton btnNewButton_1_2 = new JButton("Ana Sayfa");
		btnNewButton_1_2.setVisible(false);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SwitchPanel(panelmain,layeredPane);
			}
		});
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBounds(176, 0, 89, 23);
		panel_2.add(btnNewButton_1_2);
		
		JButton btnNewButton_2 = new JButton("Yenile");
		btnNewButton_2.setBounds(815, 558, 89, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				studentManager.getAllStudent(table, labeltablo,labeltoday);

				tableManager.setWidth();
				textField.setText(null);
				
				chckbxBolumler.setSelected(false);
				chckbxEitimDurumu.setSelected(false);
				chckbxId.setSelected(false);
				chckbxIl.setSelected(false);
				chckbxLise.setSelected(false);
				chckbxMail.setSelected(false);
				chckbxName.setSelected(false);
				chckbxNereden.setSelected(false);
				chckbxPuan.setSelected(false);
				chckbxPuanturu.setSelected(false);
				chckbxSiralama.setSelected(false);
				chckbxSurname.setSelected(false);
				chckbxTelefonNumaras.setSelected(false);
				
				
			}
		});
		panelogrenciler.setLayout(null);
		panelogrenciler.add(scrollPane);
		panelogrenciler.add(btnNewButton_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(new Rectangle(100, 0, 0, 0));
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Arama yapmak istediðinizde: hangi sütunlarda arama yapmak istiyorsanýz\n ilgili kutucuklarý iþaretleyip, anahtar kelimenizi aratabilirsiniz. ","Bilgi",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		lblNewLabel_3.setBounds(598, 451, 20, 23);
		panelogrenciler.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(JFrame.class.getResource("/images/help3.png")));
		
		JButton btnNewButton_2_1_1_1 = new JButton("D\u0131\u015Fa Aktar\r\n");
		btnNewButton_2_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				FileManager fileManager = new FileManager();
				try {
					fileManager.writeTableOnExcelFile(table);
				}catch(Exception e2) {
					System.out.println(e2.getMessage());
				}
				
			}
		});
		btnNewButton_2_1_1_1.setBounds(1029, 12, 105, 23);
		panelogrenciler.add(btnNewButton_2_1_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Bug\u00FCn Kay\u0131t Olan \u00D6\u011Frenci Say\u0131s\u0131:");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1_1.setBounds(854, 477, 211, 14);
		panelogrenciler.add(lblNewLabel_3_1_1);
		
		
	}
}
