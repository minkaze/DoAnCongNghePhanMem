package GUI;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Point;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class GiaoDienNhomGV2 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;



	/**
	 * Create the panel.
	 */
	public GiaoDienNhomGV2() {
		setPreferredSize(new Dimension(1000, 550));
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
		lblNewLabel_1.setBorder(new EmptyBorder(10, 0, 20, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblNewLabel_1);
		
		JSeparator separator1 = new JSeparator();
		separator1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(separator1);
		
		lblNewLabel_2 = new JLabel("Môn học");
		lblNewLabel_2.setBorder(new EmptyBorder(20, 0, 10, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Ngôn ngữ E");
		lblNewLabel_3.setBorder(new EmptyBorder(10, 0, 20, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblNewLabel_3);
		
		JSeparator separator2 = new JSeparator();
		separator2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(separator2);
		
		lblNewLabel_4 = new JLabel("Số thành viên");
		lblNewLabel_4.setBorder(new EmptyBorder(20, 0, 10, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("19/40");
		lblNewLabel_5.setToolTipText("");
		lblNewLabel_5.setBorder(new EmptyBorder(10, 0, 20, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_5.setIcon(new ImageIcon("D:\\Github\\DoAnCongNghePhanMem\\DO_AN\\img\\find.png") );
		panel.add(lblNewLabel_5);
		
		JSeparator separator3 = new JSeparator();
		separator3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(separator3);
		
		lblNewLabel_6 = new JLabel("Ngày tạo");
		lblNewLabel_6.setBorder(new EmptyBorder(20, 0, 10, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("1/1/2023");
		lblNewLabel_7.setBorder(new EmptyBorder(10, 0, 20, 0));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblNewLabel_7);
		
		JSeparator separator4 = new JSeparator();
		separator4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(separator4);
		
		lblNewLabel_8 = new JLabel("Xem kết quả học tập");
		lblNewLabel_8.setForeground(Color.CYAN);
		lblNewLabel_8.setBorder(new EmptyBorder(20, 0, 10, 0));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblNewLabel_8);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(750, 600));
		add(panel_1, BorderLayout.EAST);
		
		

	}
}
