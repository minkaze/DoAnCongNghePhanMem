package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaoDienLamBaiSV extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	
	
	public GiaoDienLamBaiSV() {
		setLayout(null);
		
		JLabel lblSLngCu = new JLabel("Số lượng câu");
		lblSLngCu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSLngCu.setBounds(93, 223, 120, 21);
		add(lblSLngCu);
		
		JLabel lblChnMnHc = new JLabel("Chọn môn học");
		lblChnMnHc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChnMnHc.setBounds(265, 101, 147, 28);
		add(lblChnMnHc);
		
		JLabel lblThiGianpht = new JLabel("Thời gian (phút)");
		lblThiGianpht.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblThiGianpht.setBounds(668, 223, 137, 21);
		add(lblThiGianpht);
		
		JLabel lblCuD = new JLabel("Câu dễ");
		lblCuD.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCuD.setBounds(103, 312, 83, 21);
		add(lblCuD);
		
		JLabel lblCuKh = new JLabel("Câu khó");
		lblCuKh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCuKh.setBounds(694, 312, 83, 21);
		add(lblCuKh);
		
		JButton btnNewButton = new JButton("Bắt đầu làm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GiaoDienTracNghiem a = new GiaoDienTracNghiem();
				a.setBounds(0, 0, 936, 512);
				GiaoDienSinhVien.frame.getContentPane().add(a);
				GiaoDienSinhVien.frame.revalidate();
				GiaoDienSinhVien.frame.repaint();
				GiaoDienSinhVien.frame.getContentPane().remove(GiaoDienLamBaiSV.this);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(392, 461, 137, 34);
		add(btnNewButton);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(188, 139, 510, 28);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(90, 265, 96, 19);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(90, 366, 96, 19);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(681, 265, 96, 19);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(681, 366, 96, 19);
		add(textField_4);
		
		

	}
	public void hien() {
		GiaoDienLamBaiSV gd = new GiaoDienLamBaiSV();
//		frame.add
	}
	
}
