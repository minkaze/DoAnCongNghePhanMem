package GUI;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Point;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JSeparator;

public class GiaoDienNhomGV2 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Create the panel.
	 */
	public GiaoDienNhomGV2() {
		setPreferredSize(new Dimension(1000, 600));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(250, 600));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		lblNewLabel = new JLabel("Mã nhóm");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBorder(new EmptyBorder(50, 0, 5, 0));
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("XYZ123");
		lblNewLabel_1.setBorder(new EmptyBorder(10, 0, 10, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Môn học");
		lblNewLabel_2.setBorder(new EmptyBorder(10, 0, 10, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("New label");
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(750, 600));
		add(panel_1, BorderLayout.EAST);
		
		

	}
}
