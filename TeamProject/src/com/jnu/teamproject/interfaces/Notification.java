package com.jnu.teamproject.interfaces;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Notification extends JFrame {
	private JFrame self;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notification frame = new Notification();
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
	public Notification() {
		self=this;
		setTitle("\u67E5\u770B\u901A\u77E5\u65B0\u95FB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel newstitlepanel = new JPanel();
		newstitlepanel.setBounds(0, 10, 613, 454);
		contentPane.add(newstitlepanel);
		newstitlepanel.setLayout(null);
		
		JPanel newspanel = new JPanel();
		newspanel.setBounds(0, 10, 613, 454);
		contentPane.add(newspanel);
		newspanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("images/notification.png"));
		lblNewLabel_1.setBounds(0, 0, 613, 444);
		newspanel.add(lblNewLabel_1);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				newspanel.setVisible(false);
				newstitlepanel.setVisible(true);
				
			}
		});
		button.setBounds(10, 421, 93, 23);
		newspanel.add(button);
		
		JLabel lblNewLabel = new JLabel("\u5173\u4E8E\u7EC4\u7EC7\u5F00\u5C552019\u5E74\u6821\u7EA7\u6559\u5B66\u6210\u679C\u5956\u8BC4\u9009\u66A8\u63A8\u8350\u7533\u62A5\u9AD8\u7B49\u6559\u80B2\u7701\u7EA7\u6559\u5B66\u6210\u679C\u5956\u7684\u901A\u77E5 ");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 13));
		lblNewLabel.setBounds(25, 127, 637, 15);
		newstitlepanel.add(lblNewLabel);
		
		JLabel label = new JLabel("\u6559\u52A1\u5904\u5173\u4E8E\u542F\u52A8\u672C\u79D1\u751F\u6BD5\u4E1A\u8BBE\u8BA1\uFF08\u8BBA\u6587\uFF09\u67E5\u91CD\u68C0\u6D4B\u7684\u901A\u77E5");
		label.setFont(new Font("宋体", Font.PLAIN, 13));
		label.setBounds(25, 149, 637, 15);
		newstitlepanel.add(label);
		
		JLabel label_1 = new JLabel("\u5173\u4E8E\u62A5\u90012018\uFF5E2019\u5B66\u5E74\u5EA6\u7B2C\u4E8C\u5B66\u671F\u88AB\u8BC4\u4F30\u6559\u5E08\u540D\u5355\u5E76\u5F00\u5C55\u8BFE\u5802\u6559\u5B66\u8D28\u91CF\u4E13\u5BB6\u3001\u9886\u5BFC\u8BC4\u4F30\u5DE5\u4F5C\u7684\u901A\u77E5 ");
		label_1.setFont(new Font("宋体", Font.PLAIN, 13));
		label_1.setBounds(25, 169, 637, 19);
		newstitlepanel.add(label_1);
		
		JLabel label_2 = new JLabel("\u66A8\u5357\u5927\u5B66\u5173\u4E8E\u516C\u5E032018\u5E74\u5EA6\u6559\u80B2\u6559\u5B66\u6210\u679C\u5956\u57F9\u80B2\u9879\u76EE\u7684\u901A\u77E5 ");
		label_2.setFont(new Font("宋体", Font.PLAIN, 13));
		label_2.setBounds(25, 194, 637, 15);
		newstitlepanel.add(label_2);
		
		JLabel label_3 = new JLabel("\u5173\u4E8E2019\u5E74\u4E0A\u534A\u5E74\u5168\u56FD\u5927\u5B66\u82F1\u8BED\u56DB\u3001\u516D\u7EA7\u8003\u8BD5\u62A5\u540D\u7684\u901A\u77E5 ");
		label_3.setFont(new Font("宋体", Font.PLAIN, 13));
		label_3.setBounds(25, 213, 637, 15);
		newstitlepanel.add(label_3);
		
		JLabel label_4 = new JLabel("\u5173\u4E8E\u901A\u8BC6\u6559\u80B2\u9009\u4FEE\u8BFE\u300A\u8272\u5F69\u611F\u89C9\u4E0E\u8272\u5F69\u8BBE\u8BA1\u300B\u6559\u5B66\u5B89\u6392\u7684\u901A\u77E5 ");
		label_4.setFont(new Font("宋体", Font.PLAIN, 13));
		label_4.setBounds(25, 233, 637, 15);
		newstitlepanel.add(label_4);
		
		JLabel label_5 = new JLabel("\u5173\u4E8E\u516C\u5E03\u66A8\u5357\u5927\u5B662018\u5E74\u5EA6\u6821\u7EA7\u6559\u5B66\u6539\u9769\u7814\u7A76\u9879\u76EE\u7ED3\u9898\u9A8C\u6536\u53CA\u4E2D\u671F\u68C0\u67E5\u7ED3\u679C\u7684\u901A\u77E5 ");
		label_5.setFont(new Font("宋体", Font.PLAIN, 13));
		label_5.setBounds(25, 255, 637, 15);
		newstitlepanel.add(label_5);
		
		JLabel label_6 = new JLabel("\u5173\u4E8E\u516C\u5E032018-2019\u5B66\u5E74\u7B2C\u4E00\u5B66\u671F\u672C\u79D1\u8BFE\u7A0B\u8BC4\u4F30\u7ED3\u679C\u7684\u901A\u77E5\uFF08\u4EE5\u6B64\u4E3A\u51C6\uFF09");
		label_6.setFont(new Font("宋体", Font.PLAIN, 13));
		label_6.setBounds(25, 274, 637, 15);
		newstitlepanel.add(label_6);
		
		JLabel label_7 = new JLabel("\u5173\u4E8E2018\u20142019\u5B66\u5E74\u7B2C\u4E8C\u5B66\u671F\u5168\u65E5\u5236\u672C\u79D1\u5B66\u751F\u6BD5\u4E1A\u53CA\u5B66\u4F4D\u5BA1\u6838\u5DE5\u4F5C\u7684\u901A\u77E5 ");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				newstitlepanel.setVisible(false);
				newspanel.setVisible(true);
				
				
			}
		});
		label_7.setFont(new Font("宋体", Font.PLAIN, 13));
		label_7.setBounds(25, 102, 637, 15);
		newstitlepanel.add(label_7);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u8FD1\u4E00\u4E2A\u6708", "\u8FD1\u4E24\u4E2A\u6708", "\u8FD1\u534A\u5E74", "\u8FD1\u4E00\u5E74"}));
		comboBox_1.setBounds(25, 53, 96, 39);
		newstitlepanel.add(comboBox_1);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				self.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
			}
		});
		button_1.setBounds(25, 421, 93, 23);
		newstitlepanel.add(button_1);
		
	}
}
