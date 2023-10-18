package GUI;

import java.awt.EventQueue;
import java.awt.Menu;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaoDienSinhVien {

	public static JFrame frame;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDienSinhVien window = new GiaoDienSinhVien();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public GiaoDienSinhVien() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 634);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 978, 50);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("Avatar");
		btnNewButton.setBounds(802, 10, 85, 35);
		panel.add(btnNewButton);
		
		GiaoDienNhomGV2 b = new GiaoDienNhomGV2();
		b.setBounds(0, 0, 978, 600);
		frame.getContentPane().add(b);
		
	}
	
}
