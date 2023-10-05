package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class GiaoDienXemDe extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GiaoDienXemDe() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Quay lại");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(599, 512, 85, 33);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tiếp theo");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(762, 512, 106, 33);
		add(btnNewButton_1);

	}

}
