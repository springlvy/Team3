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

public class Watch {

	JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Watch window = new Watch();
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
	public Watch() {
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
		textField.setColumns(10);
		textField.setBounds(14, 27, 70, 66);
		frame.getContentPane().add(textField);
		
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
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(29, 499, 113, 27);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				MainActivity main=new MainActivity();
				main.setVisible(true);
			}
		});
		button_1.setBounds(29, 382, 113, 27);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("images/peiyangfangan.png"));
		lblNewLabel.setBounds(39, 165, 547, 190);
		frame.getContentPane().add(lblNewLabel);
	}
}
