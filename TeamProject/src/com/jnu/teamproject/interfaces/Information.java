package com.jnu.teamproject.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Information extends JFrame {

	private JFrame self;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JButton btnNewButton_1;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Information frame = new Information();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Information() {
		self=this;
		setTitle("\u4E2A\u4EBA\u4FE1\u606F\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("\u5934\u50CF");
		btnNewButton.setIcon(new ImageIcon("images/avtar.jpg"));
		btnNewButton.setBounds(15, 34, 152, 188);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D");
		lblNewLabel.setBounds(186, 34, 36, 21);
		
		JLabel lblNewLabel_1 = new JLabel("\u6027\u522B");
		lblNewLabel_1.setBounds(186, 87, 36, 21);
		
		textField = new JTextField();
		textField.setBounds(228, 31, 111, 27);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\u9648\u707F\u6770");
		textField.setEditable(false);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(228, 84, 111, 27);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setText("\u7537");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u5B66\u53F7");
		lblNewLabel_2.setBounds(186, 142, 36, 21);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(228, 139, 111, 27);
		textField_2.setEditable(false);
		textField_2.setText("2016052382");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u5B66\u9662");
		lblNewLabel_3.setBounds(443, 34, 36, 21);
		
		JLabel lblNewLabel_4 = new JLabel("\u4E13\u4E1A");
		lblNewLabel_4.setBounds(443, 87, 36, 21);
		
		JLabel lblNewLabel_5 = new JLabel("\u5BBF\u820D\u53F7");
		lblNewLabel_5.setBounds(425, 142, 54, 21);
		
		textField_3 = new JTextField();
		textField_3.setBounds(494, 31, 177, 27);
		textField_3.setText("\u667A\u80FD\u79D1\u5B66\u4E0E\u5DE5\u7A0B\u5B66\u9662");
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(494, 84, 96, 27);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("\u8F6F\u4EF6\u5DE5\u7A0B");
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(494, 137, 96, 27);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setText("3313");
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u5361\u53F7");
		lblNewLabel_6.setBounds(186, 198, 36, 21);
		
		textField_6 = new JTextField();
		textField_6.setBounds(228, 198, 111, 27);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setEditable(false);
		textField_6.setText("252237");
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("\u6821\u56ED\u5361\u5BC6\u7801");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7.setBounds(389, 201, 90, 21);
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		contentPane.add(lblNewLabel);
		contentPane.add(textField);
		contentPane.add(lblNewLabel_1);
		contentPane.add(textField_1);
		contentPane.add(lblNewLabel_2);
		contentPane.add(textField_2);
		contentPane.add(lblNewLabel_6);
		contentPane.add(textField_6);
		contentPane.add(lblNewLabel_7);
		contentPane.add(lblNewLabel_5);
		contentPane.add(textField_5);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_4);
		contentPane.add(textField_4);
		contentPane.add(textField_3);
		
		textField_7 = new JTextField();
		textField_7.setBounds(494, 195, 96, 27);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		label = new JLabel("\u5404\u7C7B\u7F51\u7AD9\u7684\u8D26\u53F7\u548C\u5BC6\u7801");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(47, 263, 624, 21);
		contentPane.add(label);
		
		label_1 = new JLabel("\u6559\u52A1\u5904");
		label_1.setBounds(47, 311, 81, 21);
		contentPane.add(label_1);
		
		lblNewLabel_8 = new JLabel("\u8D26\u53F7");
		lblNewLabel_8.setBounds(158, 311, 81, 21);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("\u6559\u52A1\u5904\u7CFB\u7EDF");
		lblNewLabel_9.setBounds(47, 367, 96, 21);
		contentPane.add(lblNewLabel_9);
		
		label_2 = new JLabel("\u5B66\u6821\u8BBA\u575B");
		label_2.setBounds(47, 422, 81, 21);
		contentPane.add(label_2);
		
		label_3 = new JLabel("\u8D26\u53F7");
		label_3.setBounds(158, 367, 81, 21);
		contentPane.add(label_3);
		
		label_4 = new JLabel("\u8D26\u53F7");
		label_4.setBounds(158, 422, 81, 21);
		contentPane.add(label_4);
		
		label_5 = new JLabel("\u6559\u52A1\u7CFB\u7EDF");
		label_5.setBounds(47, 471, 81, 21);
		contentPane.add(label_5);
		
		label_6 = new JLabel("\u8D26\u53F7");
		label_6.setBounds(158, 471, 81, 21);
		contentPane.add(label_6);
		
		label_7 = new JLabel("\u5BC6\u7801");
		label_7.setBounds(336, 311, 81, 21);
		contentPane.add(label_7);
		
		label_8 = new JLabel("\u5BC6\u7801");
		label_8.setBounds(336, 367, 81, 21);
		contentPane.add(label_8);
		
		label_9 = new JLabel("\u5BC6\u7801");
		label_9.setBounds(336, 422, 81, 21);
		contentPane.add(label_9);
		
		label_10 = new JLabel("\u5BC6\u7801");
		label_10.setBounds(336, 471, 81, 21);
		contentPane.add(label_10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(205, 308, 96, 27);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(205, 364, 96, 27);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(205, 419, 96, 27);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(205, 468, 96, 27);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setBounds(393, 308, 152, 27);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(393, 364, 152, 27);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(393, 419, 152, 27);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(393, 468, 152, 27);
		contentPane.add(textField_15);
		
		btnNewButton_1 = new JButton("\u66F4\u65B0\u4FE1\u606F");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				self.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(590, 467, 142, 29);
		contentPane.add(btnNewButton_1);
		
		separator = new JSeparator();
		separator.setBounds(47, 246, 624, 9);
		contentPane.add(separator);
	}

}
