package com.jnu.teamproject.interfaces;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSeparator;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Course {

	JFrame frame;
	private JTable table;
	private JTextField textField_9;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JButton button_7;
	private JLabel label_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Course window = new Course();
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
	public Course() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u4E3B\u8F6F\u4EF6\u7CFB\u7EDF");
		frame.setBounds(100, 100, 900, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(14, 121, 636, 160);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u8BFE\u7A0B\u7F16\u53F7", "\u8BFE\u7A0B\u540D", "\u5F00\u8BFE\u5BF9\u8C61", "\u4E0A\u8BFE\u65F6\u95F4", "\u4E0A\u8BFE\u5730\u70B9", "\u8003\u8BD5\u65F6\u95F4"},
				{"20190011", "\u5927\u5B66\u751F\u5FC3\u7406\u5065\u5EB7\u6559\u80B2", "\u4E0D\u9650", "\u672A\u5B9A", "\u672A\u5B9A", "\u672A\u5B9A"},
				{"", null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, ""},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(table);
	
		
		JLabel lblNewLabel_2 = new JLabel("\u6CE8\u9500");
		textField_9 = new JTextField();
		textField_9.setBounds(14, 27, 70, 66);
		textField_9.setColumns(10);
		frame.getContentPane().add(textField_9);
		
		label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(98, 27, 72, 18);
		label.setFont(new Font("宋体", Font.BOLD, 15));
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("\u667A\u80FD\u79D1\u5B66\u4E0E\u5DE5\u7A0B\u5B66\u9662");
		label_1.setBounds(98, 58, 160, 18);
		label_1.setFont(new Font("宋体", Font.BOLD, 15));
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("\u6CE8\u9500");
		label_2.setBounds(796, 27, 72, 18);
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login window = new Login();
				window.frame.setVisible(true);
			}
		});
		frame.getContentPane().add(label_2);
		
		button_7 = new JButton("\u9009\u8BFE");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_7.setBounds(664, 138, 96, 18);
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EnrollmentConfirmation select = new EnrollmentConfirmation();
				select.frame.setVisible(true);
			}
		});
		button_7.setForeground(Color.BLUE);
		frame.getContentPane().add(button_7);
		
		JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
		btnNewButton_1.setBounds(29, 499, 113, 27);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		label_3 = new JLabel("\u67E5\u770B\u5DF2\u9009\u8BFE\u7A0B");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CheckCourse watch = new CheckCourse();
				watch.frame.setVisible(true);
			}
		});
		label_3.setForeground(SystemColor.textHighlight);
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(24, 311, 130, 18);
		frame.getContentPane().add(label_3);
		
		
	}

	public void setVisible(boolean b) {
		// TODO 自动生成的方法存根
		
	}
}
