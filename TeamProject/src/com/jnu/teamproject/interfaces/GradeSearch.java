package com.jnu.teamproject.interfaces;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSpinner;

public class GradeSearch {

	JFrame frame;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeSearch window = new GradeSearch();
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
	public GradeSearch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(14, 27, 70, 66);
		frame.getContentPane().add(textField_1);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setFont(new Font("ËÎÌו", Font.BOLD, 15));
		label.setBounds(98, 27, 72, 18);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u667A\u80FD\u79D1\u5B66\u4E0E\u5DE5\u7A0B\u5B66\u9662");
		label_1.setFont(new Font("ËÎÌו", Font.BOLD, 15));
		label_1.setBounds(98, 61, 160, 18);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u6CE8\u9500");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Login window = new Login();
			window.frame.setVisible(true);
			}
		});
		label_2.setBounds(486, 13, 72, 18);
		frame.getContentPane().add(label_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(341, 192, -40, -12);
		frame.getContentPane().add(separator);
		
		JList list = new JList();
		list.setBounds(243, 225, 103, -64);
		frame.getContentPane().add(list);
		frame.setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u4E3B\u8F6F\u4EF6\u7CFB\u7EDF");
		frame.setBounds(100, 100, 637, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
			}
		});
		button_1.setBounds(30, 348, 113, 27);
		frame.getContentPane().add(button_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u8BFE\u7A0B\u540D", "\u5B66\u5206", "\u6210\u7EE9", "\u7EE9\u70B9"},
				{"\u8BED\u6587", "3", "85", "4.3"},
				{"\u9A6C\u514B\u601D\u4E3B\u4E49\u54F2\u5B66\u539F\u7406", "3", "75", "3.7"},
				{"", null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{"", "", null, ""},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(14, 138, 576, 160);
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u603B\u7EE9\u70B9", "3"},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table_1.setBounds(14, 311, 287, 18);
		frame.getContentPane().add(table_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u7B2C\u4E00\u5B66\u671F", "\u7B2C\u4E8C\u5B66\u671F"}));
		comboBox.setBounds(169, 101, 95, 24);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u7B2C\u4E00\u5B66\u5E74", "\u7B2C\u4E8C\u5B66\u5E74", "\u7B2C\u4E09\u5B66\u5E74", "\u7B2C\u56DB\u5B66\u5E74"}));
		comboBox_1.setBounds(34, 101, 95, 24);
		frame.getContentPane().add(comboBox_1);
	}
}
