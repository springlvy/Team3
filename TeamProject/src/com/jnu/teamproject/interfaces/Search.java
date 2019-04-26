package com.jnu.teamproject.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Search extends JFrame {
	private JFrame self;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
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
	public Search() {
		self=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 418, 80);
		contentPane.add(layeredPane);
		
	//	ImageIcon img = new ImageIcon(getClass().getResource("/images/title.png"));
	//	img.setImage(img.getImage().getScaledInstance(418, 73, Image.SCALE_DEFAULT));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 418, 80);
		layeredPane.add(panel, JLayeredPane.DEFAULT_LAYER);
		
		JLabel lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
	//	lblNewLabel.setIcon(new ImageIcon(Search.class.getResource("/images/title.png")));
		
		textField = new JTextField();
		textField.setBounds(50, 99, 231, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u641C\u7D22");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(304, 99, 57, 33);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("\u63A8\u8350\u641C\u7D22");
		label.setForeground(Color.RED);
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(26, 148, 135, 35);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u6700\u65B0\u901A\u77E5");
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(66, 188, 77, 35);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u70ED\u95E8\u70B9\u51FB");
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(175, 188, 77, 35);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u5B9E\u65F6\u65B0\u95FB");
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(284, 188, 77, 35);
		contentPane.add(label_3);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				self.setVisible(false);
				MainActivity main = new MainActivity();
				main.setVisible(true);
			}
		});
		button.setBounds(10, 269, 93, 23);
		contentPane.add(button);
	}
}
