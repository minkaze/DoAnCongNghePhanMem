package DTO;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.LookAndFeel;
import javax.swing.border.AbstractBorder;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class SharedData {
	public static final String URL_DB = "jdbc:sqlserver://localhost:1433;databaseName=qltn;instance=SQLSERVER;encrypt=true;trustServerCertificate=true";
	public static final String USERNAME_DB = "sa";
	public static final String PASSWORD_DB = "1234567";
	public static Font TEXT_FONT = new Font("Tahoma", Font.PLAIN, 16);
	public static Font TEXT_FONT_BOLD = new Font("Tahoma", Font.BOLD, 16);
	public static Font TITLE_FONT = new Font("Tahoma", Font.PLAIN, 24);
    public static AbstractBorder BORDER_RADIUS = new TextBubbleBorder(Color.BLACK, 1, 8, 0);
    public static Color OPACITY = new Color(0,0,0,0);
    public static Color GREY = new Color(217,217,217);
    public static MyComboBoxUI TRANSPARENT_CBB_UI = new MyComboBoxUI();
    
}

