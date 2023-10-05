package GUI;

import javax.swing.JPanel;
import GUI.GiaoDienSinhVien;
import javax.swing.JButton;

import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuSV extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public MenuSV() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Làm bài");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				MenuSV a = new MenuSV();
//				GiaoDienSinhVien.frame.remove(a);
//				GiaoDienLamBaiSV b = new GiaoDienLamBaiSV();
//				b.setBounds(0, 0, 978, 608);
//				GiaoDienSinhVien.frame.getContentPane().add(b);
				
				GiaoDienLamBaiSV b = new GiaoDienLamBaiSV();
			    b.setBounds(0, 0, 978, 608);			    
			    GiaoDienSinhVien.frame.getContentPane().add(b);
			    GiaoDienSinhVien.frame.revalidate();
			    GiaoDienSinhVien.frame.repaint();
			    GiaoDienSinhVien.frame.getContentPane().remove(MenuSV.this);

				
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(100, 431, 133, 98);
		add(btnNewButton);
		
		JButton btnLchKimTra = new JButton("Lịch kiểm tra");
		btnLchKimTra.setVerticalAlignment(SwingConstants.BOTTOM);
		btnLchKimTra.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLchKimTra.setBounds(319, 312, 133, 98);
		add(btnLchKimTra);
		
		JButton btnNhm = new JButton("Nhóm");
		btnNhm.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNhm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhm.setBounds(532, 199, 133, 98);
		add(btnNhm);
		
		JButton btnThngK = new JButton("Thống kê");
		btnThngK.setVerticalAlignment(SwingConstants.BOTTOM);
		btnThngK.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnThngK.setBounds(777, 71, 133, 98);
		add(btnThngK);
		

	}


}
