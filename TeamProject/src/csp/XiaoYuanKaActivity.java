package csp;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class XiaoYuanKaActivity extends JFrame {
	private JFrame self;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XiaoYuanKaActivity frame = new XiaoYuanKaActivity();
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
	public XiaoYuanKaActivity() {
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
		
		JLabel label = new JLabel("\u4F59\u989D\uFF1A49.31\u5143");
		label.setBounds(59, 140, 88, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8D26\u53F7\u72B6\u6001\uFF1A\u6B63\u5E38");
		label_1.setBounds(59, 170, 100, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u4F7F\u7528\u60C5\u51B5\uFF1A");
		label_2.setBounds(59, 215, 71, 15);
		contentPane.add(label_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u65E5\u671F", "\u65F6\u95F4", "\u6D88\u8D39\u91D1\u989D\uFF08\u5143\uFF09"},
				{"2019-04-04", "9\uFF1A10", "6"},
				{"2019-04-03", "17\uFF1A13", "10"},
				{"2019-04-03", "12\uFF1A00", "8"},
				{"2019-04-03", "7\uFF1A40", "5"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.setBounds(59, 240, 254, 144);
		contentPane.add(table);
		
		JButton button_1 = new JButton("\u6302\u5931");
		button_1.setBounds(170, 166, 93, 23);
		contentPane.add(button_1);
		
		JLabel label_5 = new JLabel("\u5145\u503C\u60C5\u51B5\uFF1A");
		label_5.setBounds(331, 215, 71, 15);
		contentPane.add(label_5);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u65E5\u671F", "\u65F6\u95F4", "\u5145\u503C\u91D1\u989D\uFF08\u5143\uFF09"},
				{"2019-03-29", "16\uFF1A43", "100"},
				{"2019-03-15", "9\uFF1A35", "100"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table_1.setBounds(326, 240, 254, 144);
		contentPane.add(table_1);
		
		JButton button_2 = new JButton("\u8FD4\u56DE");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				self.setVisible(false);
				MainActivity main=new MainActivity();
				main.setVisible(true);
			}
		});
		button_2.setBounds(59, 414, 93, 23);
		contentPane.add(button_2);
		
		
	}
}
