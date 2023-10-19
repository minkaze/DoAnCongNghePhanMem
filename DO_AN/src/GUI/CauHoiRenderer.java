package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;

import DTO.CauHoi;
import DTO.SharedData;
import DTO.TextBubbleBorder;

public class CauHoiRenderer extends JPanel implements ListCellRenderer<CauHoi>{

	private Image backgroundImage;
	private JLabel STT_LB;
	private CauHoi thisCauHoi;
	
	public CauHoiRenderer() {
        setPreferredSize(new Dimension(40, 40));
        setBorder(SharedData.BORDER_CIRCLE);
		BorderLayout boderLayout = new BorderLayout();
	    this.setLayout(boderLayout);
	    this.setFont(SharedData.TEXT_FONT);
    }

	//Vẽ vòng tròn

    //kết thúc vẽ vòng tròn

    //Thiết lặp ListCellRenderer
	@Override
	public Component getListCellRendererComponent(JList<? extends CauHoi> list, CauHoi cauHoi, int index,
			boolean isSelected, boolean cellHasFocus) {
		thisCauHoi = cauHoi;
		STT_LB = new JLabel(index + "sdasdasdasd");
		STT_LB.setHorizontalAlignment(JLabel.CENTER);
		STT_LB.setBackground(list.getBackground());
		BorderLayout boderLayout = new BorderLayout();
	    this.setLayout(boderLayout);
		this.add(STT_LB, BorderLayout.CENTER);
		//this.setOpaque(true);
		STT_LB.setOpaque(true);
	 
	    // when select item
	    if (isSelected) {
	        STT_LB.setBackground(list.getSelectionBackground());
	        setBackground(list.getSelectionBackground());
	    } else { // when don't select
	        STT_LB.setBackground(list.getBackground());
	        setBackground(list.getBackground());
	    }
	    
		return this;
	}

	public CauHoi getCauHoi()
	{
		return thisCauHoi;
	}
}
