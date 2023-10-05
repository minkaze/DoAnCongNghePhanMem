package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class GiaoDienSuaCauHoi extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GiaoDienSuaCauHoi() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Lưu");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(778, 518, 85, 33);
		add(btnNewButton);

	}

}
