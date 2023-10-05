package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class GiaoDienTaoCauHoi extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GiaoDienTaoCauHoi() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Quay lại");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(603, 520, 99, 30);
		add(btnNewButton);
		
		JButton btnTipTheo = new JButton("Tiếp theo");
		btnTipTheo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTipTheo.setBounds(775, 520, 99, 30);
		add(btnTipTheo);

	}

}
