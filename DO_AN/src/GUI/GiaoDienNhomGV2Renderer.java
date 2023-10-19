package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;

import DTO.BaiTap;

public class GiaoDienNhomGV2Renderer extends JPanel implements ListCellRenderer<BaiTap> {
	private JLabel lbIcon = new JLabel();
	private JLabel lbName = new JLabel();
	private JLabel lbTime = new JLabel();
	private JPanel panelText;
	private JPanel panelIcon;

	public GiaoDienNhomGV2Renderer() {
		setLayout(new BorderLayout(5, 5));

		panelText = new JPanel(new GridLayout(0, 1));
		panelText.add(lbName);
		panelText.add(lbTime);

		panelIcon = new JPanel();
		panelIcon.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelIcon.add(lbIcon);

		add(panelIcon, BorderLayout.EAST);
		add(panelText, BorderLayout.CENTER);
	}

	@Override
	public Component getListCellRendererComponent(JList<? extends BaiTap> list,
			BaiTap bt, int index, boolean isSelected, boolean cellHasFocus) {

		lbIcon.setIcon(new ImageIcon(getClass().getResource(
				"/nguyenvanquan7826/JList/" + bt.getIconName() + ".jpg")));
		lbName.setText(bt.getTenBT());
//		lbTime.setText(bt.getThoiGian());

		// set Opaque to change background color of JLabel
		lbName.setOpaque(true);
		lbTime.setOpaque(true);
		lbIcon.setOpaque(true);

		// when select item
		if (isSelected) {
			lbName.setBackground(list.getSelectionBackground());
			lbTime.setBackground(list.getSelectionBackground());
			lbIcon.setBackground(list.getSelectionBackground());
			setBackground(list.getSelectionBackground());
			panelIcon.setBackground(list.getSelectionBackground());
		} else { // when don't select
			lbName.setBackground(list.getBackground());
			lbTime.setBackground(list.getBackground());
			lbIcon.setBackground(list.getBackground());
			setBackground(list.getBackground());
			panelIcon.setBackground(list.getBackground());
		}
		return this;
	}
}
