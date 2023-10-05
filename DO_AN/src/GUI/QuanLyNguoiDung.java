package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class QuanLyNguoiDung extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public QuanLyNguoiDung() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Gần nhất");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(101, 80, 85, 33);
		add(btnNewButton);

	}

}
