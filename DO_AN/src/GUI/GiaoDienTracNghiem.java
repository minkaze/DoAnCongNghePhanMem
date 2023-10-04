package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;

public class GiaoDienTracNghiem extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GiaoDienTracNghiem() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(685, 544, 85, 26);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(856, 544, 85, 26);
		add(btnNewButton_1);

	}

}
