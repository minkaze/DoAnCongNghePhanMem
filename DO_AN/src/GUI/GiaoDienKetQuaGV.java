package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class GiaoDienKetQuaGV extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GiaoDienKetQuaGV() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Xuất file Excel");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(405, 510, 128, 33);
		add(btnNewButton);

	}

}
