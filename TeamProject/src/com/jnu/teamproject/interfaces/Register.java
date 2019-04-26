package com.jnu.teamproject.interfaces;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Register {

	JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
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
	public Register() {
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
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setFont(new Font("宋体", Font.BOLD, 15));
		label.setBounds(98, 27, 72, 18);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u667A\u80FD\u79D1\u5B66\u4E0E\u5DE5\u7A0B\u5B66\u9662");
		label_1.setFont(new Font("宋体", Font.BOLD, 15));
		label_1.setBounds(98, 58, 160, 18);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u6CE8\u9500");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Login window = new Login();
			window.frame.setVisible(true);}
		});
		label_2.setBounds(486, 13, 72, 18);
		frame.getContentPane().add(label_2);
		
		JButton btnNewButton = new JButton("\u67E5\u770B\u5DF2\u9009\u8BFE\u7A0B");
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 15));
		
		btnNewButton.setBounds(24, 156, 176, 66);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u5F00\u8BFE\u5217\u8868");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List list = new List();
				list.frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 15));
		btnNewButton_1.setBounds(24, 264, 176, 66);
		frame.getContentPane().add(btnNewButton_1);
	}
}
