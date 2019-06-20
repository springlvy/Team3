package com.jnu.teamproject.interfaces;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.apache.log4j.Logger;

import com.jnu.teamproject.data.NetConnect;
import com.jnu.teamproject.data.Serialization;
import com.jnu.teamproject.data.UserInfo;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Login {
	static Logger logger = Logger.getLogger(Login.class);
	public JFrame frame;
	private JTextField numberField;
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
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//居中
		frame.setLocationRelativeTo(frame.getOwner());
		
		JLabel numberText = new JLabel("\u8D26\u53F7");
		numberText.setFont(new Font("宋体", Font.BOLD, 18));
		numberText.setBounds(140, 94, 54, 15);
		frame.getContentPane().add(numberText);
		
		JLabel passwordText = new JLabel("\u5BC6\u7801");
		passwordText.setFont(new Font("宋体", Font.BOLD, 18));
		passwordText.setBounds(140, 174, 54, 15);
		frame.getContentPane().add(passwordText);
		
		numberField = new JTextField();
		numberField.setBounds(245, 87, 170, 30);
		frame.getContentPane().add(numberField);
		numberField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("\u6559\u52A1\u5904\u5BC6\u7801");
		passwordField.setBounds(245, 167, 170, 30);
		frame.getContentPane().add(passwordField);
		
		JButton loginButton = new JButton("\u767B  \u5F55");
		loginButton.setFont(new Font("宋体", Font.BOLD, 18));

		NetConnect netConnect= new NetConnect();
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户点击登录...");
				if(numberField.getText().length()==0||passwordField.getPassword().length==0) {
					JOptionPane.showMessageDialog(null,"账号和密码不能为空", "出错啦", JOptionPane.ERROR_MESSAGE);
					
				}
				else if(!netConnect.isConnect()) {
					JOptionPane.showMessageDialog(null,"请链接暨南大学专用网络！", "出错啦", JOptionPane.ERROR_MESSAGE);
				}
				else {
					frame.setVisible(false);

					UserInfo user=Serialization.read();
					if(!numberField.getText().equals(user.getNumber()))
				   // frame.setVisible(false);
					{
						UserInfo newUser=new UserInfo();
						newUser.setNumber(numberField.getText());
						newUser.setOfficeAccount(numberField.getText());
						newUser.setOfficePassword(new String(passwordField.getPassword()));
						Serialization.write(newUser);
					}
				    Main f2 = new Main();
				    f2.setVisible(true);
				    
				    user=Serialization.read();
					if(user.getName().length()==0||user.getInstitution().length()==0||user.getMajor().length()==0)
						JOptionPane.showMessageDialog(null, "未绑定姓名或学院或专业，建议先点击头像进行绑定");
				}
			}
		});
		loginButton.setBounds(245, 240, 100, 30);
		frame.getContentPane().add(loginButton);
	}
}
