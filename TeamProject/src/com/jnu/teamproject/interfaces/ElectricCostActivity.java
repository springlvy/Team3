package com.jnu.teamproject.interfaces;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ElectricCostActivity extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame self;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElectricCostActivity frame = new ElectricCostActivity();
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
	public ElectricCostActivity() {
		self=this;
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
				self.setVisible(false);
				Login window = new Login();
				window.frame.setVisible(true);
			}
		});
		lblNewLabel_2.setBounds(463, 36, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		JButton button = new JButton("\u641C  \u7D22");
		button.setBounds(463, 61, 77, 23);
		contentPane.add(button);
		
		JLabel label_3 = new JLabel("\u5B66\u751F\u751F\u6D3B");
		label_3.setBounds(59, 103, 54, 15);
		contentPane.add(label_3);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("images/touxiang.jpg"));
		btnNewButton_1.setBounds(36, 31, 111, 44);
		contentPane.add(btnNewButton_1);
		
		JLabel label_4 = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		label_4.setBounds(123, 103, 488, 15);
		contentPane.add(label_4);
		
		JLabel label = new JLabel("\u5BBF\u820D\u53F7\uFF1A3313");
		label.setBounds(59, 128, 91, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5269\u4F59\u7528\u7535\u91CF\uFF1A156.31\u5EA6");
		label_1.setBounds(227, 128, 136, 15);
		contentPane.add(label_1);
		
		JButton button_1 = new JButton("\u91CD\u65B0\u7ED1\u5B9A");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangeRoomDialog dialog=new ChangeRoomDialog();
				dialog.setVisible(true);
			}
		});
		button_1.setBounds(447, 124, 93, 23);
		contentPane.add(button_1);
		
		JLabel label_2 = new JLabel("\u7528\u7535\u60C5\u51B5\uFF1A");
		label_2.setBounds(59, 153, 70, 15);
		contentPane.add(label_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u65E5\u671F", "\u7528\u7535\u91CF\uFF08\u5EA6\uFF09", "\u7528\u7535\u91D1\u989D\uFF08\u5143\uFF09", "\u8BFB\u6570", "\u6708\u6BD4\u4F8B\uFF08%\uFF09"},
				{"2019-04-03", "3.00", "1.89", "10916.84", "17.00"},
				{"2019-04-02", "2.63", "1.66", "10913.84", "14.90"},
				{"2019-04-01", "2.78", "1.75", "10911.21", "15.75"},
				{"2019-03-31", "3.24", "2.04", "10908.43", "18.36"},
				{"2019-03-30", "2.85", "1.80", "10905.19", "16.15"},
				{"2019-03-31", "3.15", "1.98", "10902.34", "17.85"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(59, 178, 507, 112);
		contentPane.add(table);
		
		JLabel label_5 = new JLabel("\u5F53\u524D\u8868\u4FE1\u606F\uFF1A");
		label_5.setBounds(59, 300, 88, 15);
		contentPane.add(label_5);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u8868\u53F7\uFF1A000001214337"},
				{"\u63CF\u8FF0\uFF1A3313"},
				{"\u5355\u4EF7\u7C7B\u578B\uFF1A\u5B66\u751F\u7528\u7535[0.63 \u5143]"},
				{"\u6700\u5927\u8D1F\u8377\uFF1A5 A"},
				{"\u62A5\u8B66\u4E0B\u9650\uFF1A20 \u5EA6"},
				{"\u900F\u652F\u4E0B\u9650\uFF1A159 \u5EA6"},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_1.setBounds(59, 325, 165, 98);
		contentPane.add(table_1);
		
		JLabel label_6 = new JLabel("\u5145\u503C\u60C5\u51B5\uFF1A");
		label_6.setBounds(282, 300, 70, 15);
		contentPane.add(label_6);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u65E5\u671F", "\u5185\u5BB9", "\u5145\u503C\u91D1\u989D\uFF08\u5143\uFF09", "\u5145\u503C\u91CF\uFF08\u5EA6\uFF09"},
				{"2019-03-21", "\u8D60\u9001", "25.20", "40.00"},
				{"2019-03-20", "\u81EA\u52A8", "100.00", "158.70"},
				{"2019-02-17", "\u81EA\u52A8", "30.00", "47.60"},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table_2.setBounds(266, 325, 300, 98);
		contentPane.add(table_2);
		
		JButton button_2 = new JButton("\u8FD4\u56DE");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				self.setVisible(false);
				MainActivity main=new MainActivity();
				main.setVisible(true);
			}
		});
		button_2.setBounds(57, 433, 93, 23);
		contentPane.add(button_2);

	}
}
