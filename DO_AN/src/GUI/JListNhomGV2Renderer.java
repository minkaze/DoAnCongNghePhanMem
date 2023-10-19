package GUI;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import DTO.BaiTap;

public class JListNhomGV2Renderer extends JPanel {
	private int width = 750;
	private int height = 550;
	private JList<BaiTap> listBaiTap;

	public JListNhomGV2Renderer() {
		// add main panel
		add(createMainPanel());
		setSize(width, height);
		setVisible(true);
	}

	private JPanel createMainPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		// create list book and set to scrollpane and add to panel
		panel.add(new JScrollPane(listBaiTap = createListBaiTap()),
				BorderLayout.CENTER);
		return panel;
	}

	private JList<BaiTap> createListBaiTap() {
		// create List model
		DefaultListModel<BaiTap> model = new DefaultListModel<>();
		// add item to model
		model.addElement(new BaiTap());
		// create JList with model
		JList<BaiTap> list = new JList<BaiTap>(model);
		// set cell renderer
		list.setCellRenderer(new GiaoDienNhomGV2Renderer());
		return list;
	}

	public static void main(String[] args) {
		new JListNhomGV2Renderer();
	}
}
