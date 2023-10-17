package GUI;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;

import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.ImageIcon;

public class GiaoDienNhomGV extends JPanel {

	/**
	 * Create the panel.
	 */
	public GiaoDienNhomGV() {
		setSize(1000, 600);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(1000, 100));
		add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0};
		gbl_panel.rowWeights = new double[]{Double.MIN_VALUE, 0.0, 0.0, 0.0, 0.0};
		panel.setLayout(gbl_panel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
        
		JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("D:\\DoAnCongNghePhanMem-main\\DO_AN\\img\\add.png"));
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel.insets = new Insets(30, 30, 30, 30);
//        gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 3;
        panel.add(lblNewLabel, gbc_lblNewLabel);
        
        
        GridBagConstraints gbl = new GridBagConstraints();
        // Khoảng cách 10px từ các viền
        gbl.insets = new Insets(15, 15, 15, 15);
        
        gbl.gridx = 0; // Cột 0
        gbl.gridy = 3; // Hàng 0
        JLabel lb_monHoc = new JLabel("Các nhóm đang phụ trách");
        lb_monHoc.setFont(new Font("Tahoma", Font.PLAIN, 30));
        panel.add(lb_monHoc,gbl);
	}

}
