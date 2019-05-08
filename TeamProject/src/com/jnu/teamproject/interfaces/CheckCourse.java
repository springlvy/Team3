package com.jnu.teamproject.interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CheckCourse {

	JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckCourse window = new CheckCourse();
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
	public CheckCourse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u4E3B\u8F6F\u4EF6\u7CFB\u7EDF");
		frame.setBounds(100, 100, 637, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u8BFE\u7A0B\u7F16\u53F7", "\u8BFE\u7A0B\u540D", "\u4E0A\u8BFE\u65F6\u95F4", "\u4E0A\u8BFE\u5730\u70B9", "\u8003\u8BD5\u5730\u70B9"},
				{"20190011", "\u5927\u5B66\u751F\u5FC3\u7406\u5065\u5EB7\u6559\u80B2", "\u672A\u5B9A", "\u672A\u5B9A", "\u672A\u5B9A"},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(14, 138, 591, 128);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("\u8FD4\u56DE");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Course retreat = new Course();
				retreat.frame.setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(33, 384, 113, 27);
		frame.getContentPane().add(btnNewButton);
		
	}

}
