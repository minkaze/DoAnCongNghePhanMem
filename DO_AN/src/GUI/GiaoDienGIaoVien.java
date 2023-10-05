package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class GiaoDienGIaoVien extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GiaoDienGIaoVien() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Tạo câu hỏi");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(439, 221, 111, 89);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Nhóm");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(175, 221, 111, 89);
		add(btnNewButton_1);

	}

}
