package com.jnu.teamproject.interfaces;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class TrainScheme {

	JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrainScheme window = new TrainScheme();
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
	public TrainScheme() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u4E3B\u8F6F\u4EF6\u7CFB\u7EDF");
		frame.setBounds(100, 100, 637, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(14, 27, 70, 66);
		textField.setColumns(10);
		frame.getContentPane().add(textField);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(98, 27, 72, 18);
		label.setFont(new Font("ËÎÌו", Font.BOLD, 15));
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u667A\u80FD\u79D1\u5B66\u4E0E\u5DE5\u7A0B\u5B66\u9662");
		label_1.setBounds(98, 61, 160, 18);
		label_1.setFont(new Font("ËÎÌו", Font.BOLD, 15));
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u6CE8\u9500");
		label_2.setBounds(486, 13, 72, 18);
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login window = new Login();
				window.frame.setVisible(true);
			}
		});
		frame.getContentPane().add(label_2);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.setBounds(29, 499, 113, 27);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.setBounds(29, 382, 113, 27);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
			}
		});
		frame.getContentPane().add(button_1);
		
		table = new JTable();
		table.setBounds(98, 273, 160, -100);
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u5B66\u4E60\u6A21\u5757", "\u8981\u6C42", "\u5DF2\u4FEE", "\u8FD8\u5DEE"},
				{"\u603B\u5206", "150", "150", "0"},
				{"\u5FC5\u4FEE", "75", "75", "0"},
				{"\u901A\u8BC6\u9009\u4FEE", "20", "20", "0"},
				{"\u57FA\u7840\u6559\u80B2", "20", "20", "0"},
				{"\u4E13\u4E1A\u6559\u80B2", "20", "20", "0"},
				{"\u8DE8\u4E13\u4E1A\u8BFE\u7A0B", "15", "15", "0"},
				{"\u9009\u4FEE\u5408\u8BA1", "75", "75", "0"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table_1.setBounds(29, 187, 430, 128);
		frame.getContentPane().add(table_1);
		
		JLabel label_3 = new JLabel("\u4EBA\u624D\u57F9\u517B\u65B9\u6848");
		label_3.setForeground(Color.RED);
		label_3.setBounds(29, 155, 141, 18);
		frame.getContentPane().add(label_3);
	}
}
