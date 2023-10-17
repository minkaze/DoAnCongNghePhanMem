package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import DTO.CauHoi;
import DTO.DeThi;

public class LamTracNghiemSV extends JPanel {

	private GridBagLayout GBLayout;
	private GridBagConstraints GBConstraints;
	private JPanel quest_PN;
	private JList<CauHoi> listQuest;
	
	public LamTracNghiemSV() 
	{
		createQuestPanel();
		BorderLayout boderLayout = new BorderLayout();
	    this.setLayout(boderLayout);
		this.add(quest_PN, BorderLayout.WEST);
		
	}
	
	public void createQuestPanel()
	{
		quest_PN = new JPanel(new BorderLayout());
		quest_PN.setBorder(new EmptyBorder(10, 10, 10, 10));
		quest_PN.add(new JScrollPane(listQuest = createListQuest()), BorderLayout.CENTER);
	}
	
	private JList<CauHoi> createListQuest() {
        // create List model
        DefaultListModel<CauHoi> model = new DefaultListModel<>();
        // add item to model
        model.addElement(new CauHoi());
        model.addElement(new CauHoi());
        model.addElement(new CauHoi());
        model.addElement(new CauHoi());
        model.addElement(new CauHoi());
        model.addElement(new CauHoi());
        model.addElement(new CauHoi());
        model.addElement(new CauHoi());
        model.addElement(new CauHoi());
        model.addElement(new CauHoi());
        model.addElement(new CauHoi());
        // create JList with model
        JList<CauHoi> list = new JList<CauHoi>(model);
        list.setCellRenderer(new CauHoiRenderer());
        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list.setVisibleRowCount(3);
        return list;
    }
	
	public LamTracNghiemSV(DeThi deThi, boolean isView)
	{
		
	}

	
	public void componenrInit()
	{
		GBLayout = new GridBagLayout();
		this.setLayout(GBLayout);
		
	}
	
	public void setColum1()
	{
		
	}
}
