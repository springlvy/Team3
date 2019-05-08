package com.jnu.teamproject.interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EnrollmentConfirmation {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnrollmentConfirmation window = new EnrollmentConfirmation();
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
	public EnrollmentConfirmation() {
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(71, 129, -30, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CheckCourse select = new CheckCourse();
				select.frame.setVisible(true);
			}
		});
		button.setBounds(182, 203, 88, 18);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Course no = new Course();
				no.frame.setVisible(true);
			}
		});
		button_1.setBounds(324, 203, 102, 18);
		frame.getContentPane().add(button_1);
		
		JLabel label = new JLabel("\u662F\u5426\u786E\u5B9A\u8981\u9009\u4FEE\u8BE5\u8BFE\u7A0B");
		label.setBounds(220, 148, 150, 18);
		frame.getContentPane().add(label);
	}
}
