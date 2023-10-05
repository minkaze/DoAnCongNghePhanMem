package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class QuanLyTaiKhoan extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public QuanLyTaiKhoan() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(224, 107, 85, 32);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xóa");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(379, 107, 85, 32);
		add(btnNewButton_1);

	}

}
