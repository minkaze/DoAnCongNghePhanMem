package GUI;

import DTO.TKDiemDTO;
import BUS.SinhVienBUS;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;

import org.jfree.chart.*;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.*;

public class ThongKe extends JPanel {

	private static final long serialVersionUID = 1L;

	private JFreeChart chart;
	private JPanel pMBar;
	private JButton btn_back;
	private JButton btn_home;
	private String id;

	private SinhVienBUS sv = new SinhVienBUS();

	Vector<TKDiemDTO> arr = new Vector<TKDiemDTO>();
	/**
	 * Create the panel.
	 */
	public ThongKe(String id) {
		this.id = id;
		arr = sv.tkDiem(id);

		pMBar = new JPanel(null);
		pMBar.setBounds(0, 0, 1000, 45);
		//pMBar.setOpaque(true)
		pMBar.setBackground(new Color(225,27,254));
		add(pMBar);

		FlowLayout ly = new FlowLayout();
		ly.setVgap(13);
		ly.setHgap(60);

		JPanel quesR = new JPanel(ly);
		quesR.setBounds(70, 70, 170, 80);
		quesR.setOpaque(true);
		quesR.setBackground(new Color(234,230,235));
		JLabel txt_qesR = new JLabel("Số câu đúng");
		txt_qesR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		quesR.add(txt_qesR);
		JLabel num_qesR = new JLabel(String.valueOf(sv.QuesR()));
		num_qesR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		quesR.add(num_qesR);
		quesR.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e){
				quesR.setBackground(new Color(215,207,218));
			}
			public void mouseExited(MouseEvent e){
				quesR.setBackground(new Color(234,230,235));
			}
		});
		add(quesR);

		JPanel quesW = new JPanel(ly);
		quesW.setBounds(290, 70, 170, 80);
		quesW.setOpaque(true);
		quesW.setBackground(new Color(234,230,235));
		JLabel txt_qesW = new JLabel("Số câu sai");
		txt_qesW.setFont(new Font("Tahoma", Font.PLAIN, 13));
		quesW.add(txt_qesW);
		JLabel num_qesW = new JLabel(String.valueOf(sv.QuesW()));
		num_qesW.setFont(new Font("Tahoma", Font.PLAIN, 13));
		quesW.add(num_qesW);
		quesW.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e){
				quesW.setBackground(new Color(215,207,218));
			}
			public void mouseExited(MouseEvent e){
				quesW.setBackground(new Color(234,230,235));
			}
		});
		add(quesW);

		JPanel quesP = new JPanel(ly);
		quesP.setBounds(510, 70, 170, 80);
		quesP.setOpaque(true);
		quesP.setBackground(new Color(234,230,235));
		JLabel txt_qesP = new JLabel("Số câu bỏ qua");
		txt_qesP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		quesP.add(txt_qesP);
		JLabel num_qesP = new JLabel(String.valueOf(sv.QuesP()));
		num_qesP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		quesP.add(num_qesP);
		quesP.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e){
				quesP.setBackground(new Color(215,207,218));
			}
			public void mouseExited(MouseEvent e){
				quesP.setBackground(new Color(234,230,235));
			}
		});
		add(quesP);

		JPanel grade = new JPanel(ly);
		grade.setBounds(760, 220, 170, 80);
		grade.setOpaque(true);
		grade.setBackground(new Color(63,247,255));
		JLabel txt_grade = new JLabel("Điểm trung bình");
		txt_grade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		grade.add(txt_grade);
		JLabel num_grade = new JLabel(String.format("%.2f",sv.DTB()));
		num_grade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		grade.add(num_grade);
		grade.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e){
				grade.setBackground(new Color(17, 217, 237));
			}
			public void mouseExited(MouseEvent e){
				grade.setBackground(new Color(63,247,255));
			}
		});
		add(grade);

		JPanel numed = new JPanel(ly);
		numed.setBounds(760, 325, 170, 80);
		numed.setOpaque(true);
		numed.setBackground(new Color(63,247,255));
		JLabel txt_numed = new JLabel("Số bài đã làm");
		txt_numed.setFont(new Font("Tahoma", Font.PLAIN, 13));
		numed.add(txt_numed);
		JLabel num_numed = new JLabel(String.valueOf(sv.SoBai()));
		num_numed.setFont(new Font("Tahoma", Font.PLAIN, 13));
		numed.add(num_numed);
		numed.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e){
				numed.setBackground(new Color(17, 217, 237));
			}
			public void mouseExited(MouseEvent e){
				numed.setBackground(new Color(63,247,255));
			}
		});
		add(numed);

		JPanel times = new JPanel(ly);
		times.setBounds(760, 430, 170, 80);
		times.setOpaque(true);
		times.setBackground(new Color(63,247,255));
		JLabel txt_times = new JLabel("Thời gian trung bình");
		txt_times.setFont(new Font("Tahoma", Font.PLAIN, 13));
		times.add(txt_times);
		JLabel num_times = new JLabel("0");
		num_times.setFont(new Font("Tahoma", Font.PLAIN, 13));
		times.add(num_times);
		times.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e){
				times.setBackground(new Color(17, 217, 237));
			}
			public void mouseExited(MouseEvent e){
				times.setBackground(new Color(63,247,255));
			}
		});
		add(times);

		Icon back_icon = new ImageIcon("img/icon_back.png");
		btn_back = new JButton();
		btn_back.setIcon(back_icon);
		btn_back.setBounds(15, 8, 30, 30);
		btn_back.setBackground(new Color(225,27,254));
		btn_back.setBorderPainted(false);

		JLabel q = new JLabel();
		q.setBounds(760, 100, 170, 30);
		add(q);

		btn_back.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				q.setText("afwffw");

			}
		});
		btn_back.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e){
				btn_back.setBackground(new Color(229,95,249));
			}
			public void mouseExited(MouseEvent e){
				btn_back.setBackground(new Color(225,27,254));
			}
		});
		pMBar.add(btn_back);

		Icon home_icon = new ImageIcon("img/icon_home.png");
		btn_home = new JButton();
		btn_home.setIcon(home_icon);
		btn_home.setBounds(65, 8, 30, 30);
		btn_home.setBackground(new Color(225,27,254));
		btn_home.setBorderPainted(false);
		btn_home.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				q.setText("");
			}
		});
		btn_home.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e){
				btn_home.setBackground(new Color(229,95,249));
			}
			public void mouseExited(MouseEvent e){
				btn_home.setBackground(new Color(225,27,254));
			}
		});

		pMBar.add(btn_home);

		chart = ChartFactory.createBarChart("", "", "",chartData(),PlotOrientation.VERTICAL, false, false, false);
		ChartPanel chartPanel = new ChartPanel(chart);

		CategoryPlot plot = (CategoryPlot) chart.getPlot();	
		NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setRange(0, 10);
		plot.setBackgroundPaint(Color.WHITE);
		plot.setOutlineVisible(false);
		chartPanel.setPreferredSize(new java.awt.Dimension(600,370));
		chartPanel.setBounds(25, 163, 700, 370);

		CategoryPlot categoryplot = chart.getCategoryPlot();
		BarRenderer bar = new BarRenderer();
		bar.setSeriesPaint(0,new Color(150,15,191,150));
		categoryplot.setRenderer(bar);
		
		add(chartPanel); 
		setBackground(Color.WHITE);
		setLayout(null);
	}

	public CategoryDataset chartData(){
		final DefaultCategoryDataset data = new DefaultCategoryDataset();	
		for (TKDiemDTO x : arr) {
			data.addValue(x.getDtb(),"Điểm",x.getChuyenDe());
		}
		return data;
	}
	
	public static void main(String[] args){
		
		JFrame f = new JFrame("Thống kê");

		f.getContentPane().add(new ThongKe("US001"));
        f.setSize(1000,600);
		f.setLocationRelativeTo(null);
        f.setResizable(false);
		f.setVisible(true);
		f.setBackground(Color.WHITE);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
