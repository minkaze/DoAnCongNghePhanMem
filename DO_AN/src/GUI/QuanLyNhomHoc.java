package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class QuanLyNhomHoc extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public QuanLyNhomHoc() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(109, 105, 96, 35);
		add(btnNewButton);

	}

}
