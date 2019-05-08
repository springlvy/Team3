package com.jnu.teamproject.interfaces;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u52A9\u8F6F\u4EF6\u7CFB\u7EDF\u2014\u2014\u7528\u6237\u767B\u5F55");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5B66\u53F7\uFF1A");
		lblNewLabel.setBounds(67, 85, 54, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_1.setBounds(67, 111, 54, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(115, 82, 172, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("\u6559\u52A1\u5904\u5BC6\u7801");
		passwordField.setBounds(115, 110, 172, 21);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("\u767B    \u5F55");

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
			    Main f2 = new Main();
			    f2.setVisible(true);
			   // frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(140, 175, 93, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
