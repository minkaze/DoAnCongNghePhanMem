package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class GiaoDienKetQua extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GiaoDienKetQua() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Xem kết quả");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(803, 549, 111, 34);
		add(btnNewButton);

	}

}
