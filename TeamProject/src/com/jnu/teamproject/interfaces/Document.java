package com.jnu.teamproject.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenu;

public class Document extends JFrame {
	
	public static Document docDemo = new Document();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//DocDemo frame = new DocDemo();
					docDemo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Document() {
		setTitle("\u6587\u6863\u6A21\u677F\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u8BF7\u5047\u6761");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Leave qingjia = new Leave();
				qingjia.setVisible(true);
			}
		});
		button.setBounds(202, 118, 195, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u9000\u8BFE\u7533\u8BF7\u8868");
		button_1.setBounds(202, 208, 195, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u521B\u65B0\u9879\u76EE\u7533\u8BF7\u8868");
		button_2.setBounds(202, 298, 195, 29);
		contentPane.add(button_2);
		
		JLabel label = new JLabel("\u6587\u6863\u6A21\u677F\u5217\u8868");
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 24));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(Color.WHITE);
		label.setEnabled(false);
		label.setBounds(202, 58, 195, 21);
		contentPane.add(label);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
