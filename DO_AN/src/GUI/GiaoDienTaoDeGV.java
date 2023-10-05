package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class GiaoDienTaoDeGV extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GiaoDienTaoDeGV() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Tiếp theo");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(430, 504, 100, 31);
		add(btnNewButton);

	}

}
