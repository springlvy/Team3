package csp;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainActivity extends JFrame {
	private JFrame frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame1=new MainActivity();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainActivity() {
		frame=this;
		setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u4E3B\u8F6F\u4EF6\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u9648\u707F\u6770");
		lblNewLabel.setBounds(170, 40, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u667A\u80FD\u5DE5\u7A0B\u4E0E\u79D1\u5B66\u5B66\u9662");
		lblNewLabel_1.setBounds(170, 61, 123, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u6CE8\u9500");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Login window = new Login();
				window.frame.setVisible(true);
			}
		});
		lblNewLabel_2.setBounds(463, 36, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		JButton button = new JButton("\u641C  \u7D22");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Search search = new Search();
				search.setVisible(true);
			}
		});
		button.setBounds(463, 61, 77, 23);
		contentPane.add(button);
		
		JLabel lblNewLabel_3 = new JLabel("\u4E2A\u4EBA\u6559\u52A1\u5904");
		lblNewLabel_3.setBounds(54, 103, 70, 15);
		contentPane.add(lblNewLabel_3);
		
		JButton button_1 = new JButton("\u67E5\u8BE2\u6210\u7EE9");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Find findGrade=new Find();
				findGrade.frame.setVisible(true);
			}
		});
		button_1.setBounds(54, 128, 93, 23);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("\u67E5\u770B\u57F9\u517B\u65B9\u6848");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Watch watchFangAn=new Watch();
				watchFangAn.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(167, 128, 140, 23);
		contentPane.add(btnNewButton);
		
		JButton button_2 = new JButton("\u9009\u8BFE");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				List XuanKe = new List();
				XuanKe.frame.setVisible(true);
			}
		});
		button_2.setBounds(339, 128, 93, 23);
		contentPane.add(button_2);
		
		JLabel label = new JLabel("\u67E5\u770B\u901A\u77E5");
		label.setBounds(54, 171, 54, 15);
		contentPane.add(label);
		
		JButton button_3 = new JButton("\u5B66\u6821\u901A\u77E5");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Csp3 inform=new Csp3();
				inform.setVisible(true);
			}
		});
		button_3.setBounds(54, 196, 93, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("\u5B66\u9662\u901A\u77E5");
		button_4.setBounds(167, 196, 93, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("\u6559\u52A1\u5904\u901A\u77E5");
		button_5.setBounds(281, 196, 103, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("\u5C31\u4E1A\u901A\u77E5");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				jiuye JiuYe=new jiuye();
				JiuYe.setVisible(true);
			}
		});
		button_6.setBounds(406, 196, 93, 23);
		contentPane.add(button_6);
		
		JLabel label_1 = new JLabel("\u5B66\u751F\u751F\u6D3B");
		label_1.setBounds(54, 236, 54, 15);
		contentPane.add(label_1);
		
		JButton button_7 = new JButton("\u6C34\u8D39\u67E5\u8BE2");
		button_7.setBounds(54, 261, 93, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("\u7535\u8D39\u67E5\u8BE2");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				ElectricCostActivity waterPage=new ElectricCostActivity();
				waterPage.setVisible(true);
			}
		});
		button_8.setBounds(167, 261, 93, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("\u6821\u56ED\u5361\u4FE1\u606F\u67E5\u8BE2");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				XiaoYuanKaActivity xiaoyuanka=new XiaoYuanKaActivity();
				xiaoyuanka.setVisible(true);
			}
		});
		button_9.setBounds(281, 261, 151, 23);
		contentPane.add(button_9);
		
		JLabel label_2 = new JLabel("\u5B66\u751F\u8BBA\u575B");
		label_2.setBounds(54, 300, 54, 15);
		contentPane.add(label_2);
		
		JButton button_10 = new JButton("\u66A8\u5357\u5927\u5B66\u8BBA\u575B");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				ForumActivity activity=new ForumActivity();
				activity.setVisible(true);
			}
		});
		button_10.setBounds(54, 325, 128, 23);
		contentPane.add(button_10);
		
		JLabel label_3 = new JLabel("\u6587\u6863\u6A21\u7248");
		label_3.setBounds(54, 369, 54, 15);
		contentPane.add(label_3);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Info info = new Info();
				info.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("images/touxiang.jpg"));
		btnNewButton_1.setBounds(36, 31, 111, 44);
		contentPane.add(btnNewButton_1);
		
		JLabel label_4 = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		label_4.setBounds(123, 103, 488, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		label_5.setBounds(120, 171, 491, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		label_6.setBounds(118, 236, 493, 15);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		label_7.setBounds(118, 300, 493, 15);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		label_8.setBounds(118, 369, 493, 15);
		contentPane.add(label_8);
		
		JButton button_11 = new JButton("\u8BF7\u5047\u6761");
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Qingjia qingjia = new Qingjia();
				qingjia.setVisible(true);
			}
		});
		button_11.setBounds(54, 394, 93, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("\u9000\u8BFE\u7533\u8BF7\u8868");
		button_12.setBounds(170, 394, 111, 23);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("\u521B\u65B0\u9879\u76EE\u7533\u8BF7\u8868");
		button_13.setBounds(305, 394, 141, 23);
		contentPane.add(button_13);
	}
}
