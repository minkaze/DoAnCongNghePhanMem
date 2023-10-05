package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class LichKiemTra extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public LichKiemTra() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Gần nhất");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(101, 79, 85, 32);
		add(btnNewButton);

	}
}
