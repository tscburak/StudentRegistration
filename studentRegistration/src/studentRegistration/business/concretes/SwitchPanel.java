package studentRegistration.business.concretes;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class SwitchPanel {
	
	public SwitchPanel (JPanel panel, JLayeredPane layeredPane) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
		
	}

}
