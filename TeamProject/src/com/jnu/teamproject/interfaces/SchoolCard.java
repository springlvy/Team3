package com.jnu.teamproject.interfaces;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.log4j.Logger;

import com.jnu.teamproject.data.GetPythonData;
import com.jnu.teamproject.data.Serialization;
import com.jnu.teamproject.data.UserInfo;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class SchoolCard extends JFrame {
	private JFrame self;
	private JPanel contentPane;
	private UserInfo user;
	static Logger logger = Logger.getLogger(SchoolCard.class);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchoolCard frame = new SchoolCard();
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
	public SchoolCard() {
        user=new UserInfo();
		user=Serialization.read();
		
		self=this;
		setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u4E3B\u8F6F\u4EF6\u7CFB\u7EDF\u2014\u2014\u7535\u8D39\u67E5\u8BE2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(140, 80, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        // 设置窗体居中显示
        this.setLocationRelativeTo(this.getOwner());
		
		JLabel remainMoneyText = new JLabel("余额：（请点击查询）");
		remainMoneyText.setForeground(new Color(0, 0, 0));
		remainMoneyText.setFont(new Font("宋体", Font.BOLD, 18));
		remainMoneyText.setBounds(360, 195, 217, 53);
		contentPane.add(remainMoneyText);
		
		JLabel cardStateText = new JLabel("\u8D26\u53F7\u72B6\u6001\uFF1A\u6B63\u5E38");
		cardStateText.setForeground(new Color(0, 0, 0));
		cardStateText.setFont(new Font("宋体", Font.BOLD, 18));
		cardStateText.setBounds(360, 278, 157, 39);
		contentPane.add(cardStateText);
		
		JButton getCardInfoButton = new JButton("\u67E5\u8BE2");
		getCardInfoButton.setFont(new Font("宋体", Font.BOLD, 18));
		getCardInfoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户点击查询校园卡余额...");
				String[] cardInfo=new String[2];
				try {
						cardInfo=GetPythonData.getSchoolCardInfo(user.getDigitJnuAccount(), user.getDigitJnuPassword());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					logger.error(e1);
				}
				if(cardInfo[0]!=null){remainMoneyText.setText(cardInfo[0]);}
				else 	JOptionPane.showMessageDialog(null, "数字暨大账号或密码错误，请重新绑定");
				if(cardInfo[1]!=null){cardStateText.setText(cardInfo[1]);}
			}
		});
		getCardInfoButton.setBounds(372, 346, 129, 35);
		contentPane.add(getCardInfoButton);
		
		
		JButton backButton = new JButton("\u8FD4\u56DE");
		backButton.setFont(new Font("宋体", Font.BOLD, 18));
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户从校园卡返回主界面...");
				self.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
			}
		});
		backButton.setBounds(372, 464, 129, 35);
		contentPane.add(backButton);
		
		
	}
}
