package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class GiaoDienTaoDeGV2 extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GiaoDienTaoDeGV2() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Bắt đầu tạo");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(416, 496, 124, 31);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tạo tự động");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(207, 270, 124, 97);
		add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Tự tạo");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(633, 270, 124, 97);
		add(btnNewButton_1_1);

	}

}
