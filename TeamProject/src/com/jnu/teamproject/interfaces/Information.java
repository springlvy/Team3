package com.jnu.teamproject.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.Logger;

import com.jnu.teamproject.data.Serialization;
import com.jnu.teamproject.data.UserInfo;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Information extends JFrame {
	static Logger logger = Logger.getLogger(Information.class);
	private JFrame self;
	private JPanel contentPane;
	private JTextField name;
	private JTextField sex;
	private JTextField number;
	private JTextField institution;
	private JTextField major;
	private JTextField dorm;
	private JTextField cardNumber;
	private JTextField cardPassword;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JTextField officeAccount;
	private JTextField digitJnuAccount;
	private JTextField forumAccount;
	private JTextField officePassWord;
	private JTextField digitJnuPassWord;
	private JTextField forumPassWord;
	private JButton updateInfo;
	private JSeparator separator;
	private UserInfo user;

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
					logger.error(e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Information() {
		self=this;
		setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u4E3B\u8F6F\u4EF6\u7CFB\u7EDF\u2014\u2014\u4E2A\u4EBA\u4FE1\u606F\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(140, 80, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//居中
		self.setLocationRelativeTo(self.getOwner());
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel.setBounds(177, 75, 64, 21);
		
		JLabel lblNewLabel_1 = new JLabel("\u6027\u522B");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_1.setBounds(177, 147, 64, 21);
		
		name = new JTextField();
		name.setFont(new Font("宋体", Font.BOLD, 18));
		name.setBounds(265, 72, 180, 27);
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setText("\u9648\u707F\u6770");
		name.setColumns(10);
		
		sex = new JTextField();
		sex.setFont(new Font("宋体", Font.BOLD, 18));
		sex.setBounds(265, 144, 180, 27);
		sex.setHorizontalAlignment(SwingConstants.CENTER);
		sex.setText("\u7537");
		sex.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u5B66\u53F7");
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_2.setBounds(177, 215, 64, 21);
		
		number = new JTextField();
		number.setFont(new Font("宋体", Font.BOLD, 18));
		number.setHorizontalAlignment(SwingConstants.CENTER);
		number.setBounds(265, 212, 180, 27);
		number.setText("2016052382");
		number.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u5B66\u9662");
		lblNewLabel_3.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_3.setBounds(501, 78, 90, 21);
		
		JLabel lblNewLabel_4 = new JLabel("\u4E13\u4E1A");
		lblNewLabel_4.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_4.setBounds(501, 147, 90, 21);
		
		JLabel lblNewLabel_5 = new JLabel("\u5BBF\u820D\u53F7");
		lblNewLabel_5.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_5.setBounds(501, 215, 90, 21);
		
		institution = new JTextField();
		institution.setFont(new Font("宋体", Font.BOLD, 18));
		institution.setHorizontalAlignment(SwingConstants.CENTER);
		institution.setBounds(637, 75, 180, 27);
		institution.setText("\u667A\u80FD\u79D1\u5B66\u4E0E\u5DE5\u7A0B\u5B66\u9662");
		institution.setColumns(10);
		
		major = new JTextField();
		major.setFont(new Font("宋体", Font.BOLD, 18));
		major.setBounds(637, 144, 180, 27);
		major.setHorizontalAlignment(SwingConstants.CENTER);
		major.setText("\u8F6F\u4EF6\u5DE5\u7A0B");
		major.setColumns(10);
		
		dorm = new JTextField();
		dorm.setFont(new Font("宋体", Font.BOLD, 18));
		dorm.setBounds(637, 212, 180, 27);
		dorm.setHorizontalAlignment(SwingConstants.CENTER);
		dorm.setText("3313");
		dorm.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u5361\u53F7");
		lblNewLabel_6.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_6.setBounds(177, 278, 64, 21);
		
		cardNumber = new JTextField();
		cardNumber.setFont(new Font("宋体", Font.BOLD, 18));
		cardNumber.setBounds(265, 275, 180, 27);
		cardNumber.setHorizontalAlignment(SwingConstants.CENTER);
		cardNumber.setText("252237");
		cardNumber.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("\u6821\u56ED\u5361\u5BC6\u7801");
		lblNewLabel_7.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_7.setBounds(501, 278, 121, 21);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(name);
		contentPane.add(lblNewLabel_1);
		contentPane.add(sex);
		contentPane.add(lblNewLabel_2);
		contentPane.add(number);
		contentPane.add(lblNewLabel_6);
		contentPane.add(cardNumber);
		contentPane.add(lblNewLabel_7);
		contentPane.add(lblNewLabel_5);
		contentPane.add(dorm);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_4);
		contentPane.add(major);
		contentPane.add(institution);
		
		cardPassword = new JTextField();
		cardPassword.setFont(new Font("宋体", Font.BOLD, 18));
		cardPassword.setHorizontalAlignment(SwingConstants.CENTER);
		cardPassword.setBounds(637, 275, 180, 27);
		contentPane.add(cardPassword);
		cardPassword.setColumns(10);
		
		label = new JLabel("\u5404\u7C7B\u7F51\u7AD9\u7684\u8D26\u53F7\u548C\u5BC6\u7801");
		label.setFont(new Font("宋体", Font.BOLD, 18));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(176, 400, 624, 21);
		contentPane.add(label);
		
		label_1 = new JLabel("\u6559\u52A1\u5904");
		label_1.setFont(new Font("宋体", Font.BOLD, 18));
		label_1.setBounds(160, 466, 81, 21);
		contentPane.add(label_1);
		
		lblNewLabel_8 = new JLabel("\u8D26\u53F7");
		lblNewLabel_8.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_8.setBounds(265, 469, 81, 21);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("\u6570\u5B57\u66A8\u5927");
		lblNewLabel_9.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_9.setBounds(160, 532, 96, 21);
		contentPane.add(lblNewLabel_9);
		
		label_2 = new JLabel("\u5B66\u6821\u8BBA\u575B");
		label_2.setFont(new Font("宋体", Font.BOLD, 18));
		label_2.setBounds(160, 599, 81, 21);
		contentPane.add(label_2);
		
		label_3 = new JLabel("\u8D26\u53F7");
		label_3.setFont(new Font("宋体", Font.BOLD, 18));
		label_3.setBounds(265, 532, 81, 21);
		contentPane.add(label_3);
		
		label_4 = new JLabel("\u8D26\u53F7");
		label_4.setFont(new Font("宋体", Font.BOLD, 18));
		label_4.setBounds(265, 599, 81, 21);
		contentPane.add(label_4);
		
		label_7 = new JLabel("\u5BC6\u7801");
		label_7.setFont(new Font("宋体", Font.BOLD, 18));
		label_7.setBounds(560, 466, 72, 21);
		contentPane.add(label_7);
		
		label_8 = new JLabel("\u5BC6\u7801");
		label_8.setFont(new Font("宋体", Font.BOLD, 18));
		label_8.setBounds(560, 532, 72, 21);
		contentPane.add(label_8);
		
		label_9 = new JLabel("\u5BC6\u7801");
		label_9.setFont(new Font("宋体", Font.BOLD, 18));
		label_9.setBounds(560, 599, 72, 21);
		contentPane.add(label_9);
		
		officeAccount = new JTextField();
		officeAccount.setFont(new Font("宋体", Font.BOLD, 18));
		officeAccount.setHorizontalAlignment(SwingConstants.CENTER);
		officeAccount.setBounds(336, 463, 180, 27);
		contentPane.add(officeAccount);
		officeAccount.setColumns(10);
		
		digitJnuAccount = new JTextField();
		digitJnuAccount.setFont(new Font("宋体", Font.BOLD, 18));
		digitJnuAccount.setHorizontalAlignment(SwingConstants.CENTER);
		digitJnuAccount.setColumns(10);
		digitJnuAccount.setBounds(336, 529, 180, 27);
		contentPane.add(digitJnuAccount);
		
		forumAccount = new JTextField();
		forumAccount.setFont(new Font("宋体", Font.BOLD, 18));
		forumAccount.setHorizontalAlignment(SwingConstants.CENTER);
		forumAccount.setColumns(10);
		forumAccount.setBounds(336, 596, 180, 27);
		contentPane.add(forumAccount);
		
		officePassWord = new JTextField();
		officePassWord.setFont(new Font("宋体", Font.BOLD, 18));
		officePassWord.setHorizontalAlignment(SwingConstants.CENTER);
		officePassWord.setBounds(637, 463, 180, 27);
		contentPane.add(officePassWord);
		officePassWord.setColumns(10);
		
		digitJnuPassWord = new JTextField();
		digitJnuPassWord.setFont(new Font("宋体", Font.BOLD, 18));
		digitJnuPassWord.setHorizontalAlignment(SwingConstants.CENTER);
		digitJnuPassWord.setColumns(10);
		digitJnuPassWord.setBounds(637, 529, 180, 27);
		contentPane.add(digitJnuPassWord);
		
		forumPassWord = new JTextField();
		forumPassWord.setFont(new Font("宋体", Font.BOLD, 18));
		forumPassWord.setHorizontalAlignment(SwingConstants.CENTER);
		forumPassWord.setColumns(10);
		forumPassWord.setBounds(637, 596, 180, 27);
		contentPane.add(forumPassWord);
		
		updateInfo = new JButton("\u66F4\u65B0\u4FE1\u606F");
		updateInfo.setFont(new Font("宋体", Font.BOLD, 18));
		
		user=new UserInfo();
		user=Serialization.read();
		
		name.setText(user.getName());
		sex.setText(user.getSex());
		number.setText(user.getNumber());
		institution.setText(user.getInstitution());
		major.setText(user.getMajor());
		dorm.setText(user.getDorm());
		cardNumber.setText(user.getCardNumber());
		cardPassword.setText(user.getCardPassword());
		officeAccount.setText(user.getOfficeAccount());
		officePassWord.setText(user.getOfficePassword());
		digitJnuAccount.setText(user.getDigitJnuAccount());
		digitJnuPassWord.setText(user.getDigitJnuPassword());
		forumAccount.setText(user.getForumAccount());
		forumPassWord.setText(user.getForumPassword());
		
		
		updateInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int res=JOptionPane.showConfirmDialog(null, "是否确认更新？", "更新", JOptionPane.YES_NO_OPTION); 
				if(res==JOptionPane.YES_OPTION){
					logger.info("用户确认更新信息...");
					user.setName(name.getText());
					user.setNumber(number.getText());
					user.setInstitution(institution.getText());
					user.setMajor(major.getText());
					user.setDorm(dorm.getText());
					user.setCardNumber(cardNumber.getText());
					user.setCardPassword(cardPassword.getText());
					user.setOfficeAccount(officeAccount.getText());
					user.setOfficePassword(officePassWord.getText());
					user.setDigitJnuAccount(digitJnuAccount.getText());
					user.setDigitJnuPassword(digitJnuPassWord.getText());
					user.setForumAccount(forumAccount.getText());
					user.setForumPassword(forumPassWord.getText());
					user.setOfficePassword(officePassWord.getText());
					user.setOfficePassword(officePassWord.getText());
					
					Serialization.write(user);
				}
				
				self.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
			}
		});
		
		updateInfo.setBounds(658, 673, 150, 29);
		contentPane.add(updateInfo);
		
		separator = new JSeparator();
		separator.setBounds(53, 353, 867, 9);
		contentPane.add(separator);
		
	}

}
