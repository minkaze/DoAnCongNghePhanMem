package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GiaoDienAdmin extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GiaoDienAdmin() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Quản lý tài khoản");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(82, 114, 222, 57);
		add(btnNewButton);
		
		JButton btnQunLNgi = new JButton("Quản lý người dùng");
		btnQunLNgi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQunLNgi.setBounds(217, 222, 222, 57);
		add(btnQunLNgi);
		
		JButton btnQunLCu = new JButton("Quản lý câu hỏi");
		btnQunLCu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQunLCu.setBounds(362, 315, 222, 57);
		add(btnQunLCu);
		
		JButton btnQunLNhm = new JButton("Quản lý nhóm");
		btnQunLNhm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQunLNhm.setBounds(517, 414, 222, 57);
		add(btnQunLNhm);

	}

}
