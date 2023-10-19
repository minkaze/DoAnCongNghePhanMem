package GUI;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.AbstractBorder;
import javax.swing.border.LineBorder;

import DTO.MyComboBoxUI;
import DTO.SharedData;
import DTO.TextBubbleBorder;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GiaoDienLamBaiSV extends JPanel {

	private static final long serialVersionUID = 1L;
	private GridBagLayout GBLayout;
	private GridBagConstraints GBConstraints;
	private JLabel chonMonHoc_LB;
	private JLabel soLuongCau_LB;
	private JLabel thoiGian_LB;
	private JPanel soLuongCau_PN;
	private JPanel thoiGian_PN;
	private JLabel soCauDe_LB;
	private JLabel soCauKho_LB;
	private JPanel soCauDe_PN;
	private JPanel soCauKho_PN;
	private JComboBox<String> soLuongCau_CBB;
	private JComboBox<String> thoiGian_CBB;
	private JComboBox<String> chonMonHoc_CBB;
	private JComboBox<String> soCauDe_CBB;
	private JComboBox<String> soCauKho_CBB;
	private JButton lamBai_BT;
	
	
	public GiaoDienLamBaiSV() {
		GBLayout = new GridBagLayout();
		setBackground(Color.WHITE);
		setLayout(GBLayout);
		GBConstraints = new GridBagConstraints();		
		setRow1();
		setRow2();
		setRow3();
		setRow4();

	}
	
	public void setChonMon_CBB()
	{
		chonMonHoc_CBB = new JComboBox<String>();
        chonMonHoc_CBB.setFont(SharedData.TEXT_FONT);
        chonMonHoc_CBB.setBorder(SharedData.BORDER_RADIUS);
		chonMonHoc_CBB.setUI(new MyComboBoxUI());
	}
	public void setThoiGian_CBB()
	{
		String[] Items = {"5","10","15","20","25","30","35","40","45","50",
							"55","60","65","70","75","80","85","90","95","100","105","110", "115", "120"};
		thoiGian_CBB = new JComboBox<String>(Items);
		thoiGian_CBB.setFont(SharedData.TEXT_FONT);
		thoiGian_CBB.setBorder(SharedData.BORDER_RADIUS);
		thoiGian_CBB.setUI(new MyComboBoxUI());
		
	}
	
	public void setSoLuongCau_CBB()
	{
		String[] Items = {"5","10","15","20","25","30","35","40","45","50",
							"55","60","65","70","75","80","85","90","95","100","105","110", "115", "120"};
		soLuongCau_CBB = new JComboBox<String>(Items);
		soLuongCau_CBB.setFont(SharedData.TEXT_FONT);
		soLuongCau_CBB.setBorder(SharedData.BORDER_RADIUS);
		soLuongCau_CBB.setUI(new MyComboBoxUI());
		
	}
	public void setSoCauDe_CBB()
	{
		String[] Items = {"5","10","15","20","25","30","35","40","45","50",
							"55","60","65","70","75","80","85","90","95","100","105","110", "115", "120"};
		soCauDe_CBB = new JComboBox<String>(Items);
		soCauDe_LB.setFont(SharedData.TEXT_FONT);
		soCauDe_CBB.setBorder(SharedData.BORDER_RADIUS);
		soCauDe_CBB.setUI(new MyComboBoxUI());
		
	}
	public void setSoCauKho_CBB()
	{
		String[] Items = {"5","10","15","20","25","30","35","40","45","50",
							"55","60","65","70","75","80","85","90","95","100","105","110", "115", "120"};
		soCauKho_CBB = new JComboBox<String>(Items);
		soCauKho_CBB.setFont(SharedData.TEXT_FONT);
		soCauKho_CBB.setBorder(SharedData.BORDER_RADIUS);
		soCauKho_CBB.setUI(new MyComboBoxUI());
		
	}
	
	public void setRow1()
	{
		GBConstraints.fill = GridBagConstraints.BOTH;
		GBConstraints.insets = new Insets(10, 100, 10, 100);
		GBConstraints.gridx = 0;
		GBConstraints.gridy = 0;  
		GBConstraints.weightx = 1;
		chonMonHoc_LB = new JLabel("*Chọn môn học:");
		chonMonHoc_LB.setFont(SharedData.TEXT_FONT);
		add(chonMonHoc_LB, GBConstraints);
		
		GBConstraints.fill = GridBagConstraints.BOTH;
		GBConstraints.gridx = 0;
		GBConstraints.gridy = 1;
		GBConstraints.gridwidth = 3;
		setChonMon_CBB();
        add(chonMonHoc_CBB, GBConstraints);
	}
	
	
	public void setRow2()
	{
		GBConstraints.fill = GridBagConstraints.BOTH;
		GBConstraints.anchor = GridBagConstraints.EAST;
		GBConstraints.gridx = 0;
        GBConstraints.gridy = 2;
        GBConstraints.gridwidth = 1;
		soLuongCau_LB = new JLabel("*Số lượng câu:");
		soLuongCau_LB.setFont(SharedData.TEXT_FONT);
		soLuongCau_LB.setHorizontalAlignment(JLabel.CENTER);
		add(soLuongCau_LB, GBConstraints);     
		
		GBConstraints.fill = GridBagConstraints.BOTH;
		GBConstraints.anchor = GridBagConstraints.EAST;
        GBConstraints.gridx = 2;
        GBConstraints.gridy = 2;
        GBConstraints.gridwidth = 1;
		thoiGian_LB = new JLabel("*Thời gian làm (phút):");
		thoiGian_LB.setFont(SharedData.TEXT_FONT);
		thoiGian_LB.setHorizontalAlignment(JLabel.CENTER);
		add(thoiGian_LB, GBConstraints);
		
		
		GBConstraints.gridwidth = 1;
		GBConstraints.gridheight = 1;
		GBConstraints.fill = GridBagConstraints.BOTH;
		GBConstraints.anchor = GridBagConstraints.EAST;
		GBConstraints.gridx = 0;
		GBConstraints.gridy = 3;
		setSoLuongCau_CBB();
        add(soLuongCau_CBB, GBConstraints);
        
		GBConstraints.fill = GridBagConstraints.BOTH;
		GBConstraints.anchor = GridBagConstraints.EAST;
		GBConstraints.gridx = 2;
		GBConstraints.gridy = 3;
		setThoiGian_CBB();
        add(thoiGian_CBB, GBConstraints);
	}
	
	public void setRow3()
	{
		GBConstraints.fill = GridBagConstraints.BOTH;
		GBConstraints.anchor = GridBagConstraints.EAST;
		GBConstraints.gridx = 0;
        GBConstraints.gridy = 5;
        GBConstraints.gridwidth = 1;
        GBConstraints.gridheight = 1;
		soCauDe_LB = new JLabel("*Số Câu dễ:");
		soCauDe_LB.setHorizontalAlignment(JLabel.CENTER);
		add(soCauDe_LB, GBConstraints);     
		
		GBConstraints.fill = GridBagConstraints.BOTH;
		GBConstraints.anchor = GridBagConstraints.EAST;
        GBConstraints.gridx = 2;
        GBConstraints.gridy = 5;
		soCauKho_LB = new JLabel("*Số câu khó:");
		soCauKho_LB.setFont(SharedData.TEXT_FONT);
		soCauKho_LB.setHorizontalAlignment(JLabel.CENTER);
		add(soCauKho_LB, GBConstraints);

		GBConstraints.gridwidth = 1;
		GBConstraints.gridheight = 1;
		GBConstraints.fill = GridBagConstraints.BOTH;
		GBConstraints.anchor = GridBagConstraints.EAST;
		GBConstraints.gridx = 0;
		GBConstraints.gridy = 6;
		setSoCauDe_CBB();
        add(soCauDe_CBB, GBConstraints);
        
		GBConstraints.fill = GridBagConstraints.BOTH;
		GBConstraints.anchor = GridBagConstraints.EAST;
		GBConstraints.gridx = 2;
		GBConstraints.gridy = 6;
		setSoCauKho_CBB();
        add(soCauKho_CBB, GBConstraints);
	}
	
	public void setRow4()
	{
		GBConstraints.insets = new Insets(50, 10, 10, 10);
		GBConstraints.fill = GridBagConstraints.BOTH;
		GBConstraints.anchor = GridBagConstraints.CENTER;
		GBConstraints.gridx = 1;
		GBConstraints.gridy = 7;
		GBConstraints.gridwidth = 1;
        lamBai_BT = new JButton("Bắt đầu làm");
        lamBai_BT.setFont(SharedData.TEXT_FONT);
        lamBai_BT.setBorder(SharedData.BORDER_RADIUS);
        add(lamBai_BT, GBConstraints);
        
        lamBai_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				LamTracNghiemSV b = new LamTracNghiemSV();
			    b.setBounds(0, 0, 1000, 600);			    
			    GiaoDienSinhVien.frame.getContentPane().add(b);
			    GiaoDienSinhVien.frame.revalidate();
			    GiaoDienSinhVien.frame.repaint();
			    GiaoDienSinhVien.frame.getContentPane().remove(GiaoDienLamBaiSV.this);
				
			}
		});

	}
	
}
