package csp;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSeparator;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class List {

	JFrame frame;
	private JTable table;
	private JTextField textField_9;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					List window = new List();
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
	public List() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u4E3B\u8F6F\u4EF6\u7CFB\u7EDF");
		frame.setBounds(100, 100, 900, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u8BFE\u7A0B\u7F16\u53F7", "\u8BFE\u7A0B\u540D", "\u5F00\u8BFE\u5BF9\u8C61", "\u4E0A\u8BFE\u65F6\u95F4", "\u4E0A\u8BFE\u5730\u70B9", "\u8003\u8BD5\u65F6\u95F4"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, ""},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(14, 121, 605, 160);
		frame.getContentPane().add(table);
	
		
		JLabel lblNewLabel_2 = new JLabel("\u6CE8\u9500");
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(14, 27, 70, 66);
		frame.getContentPane().add(textField_9);
		
		label = new JLabel("\u7528\u6237\u540D");
		label.setFont(new Font("宋体", Font.BOLD, 15));
		label.setBounds(98, 27, 72, 18);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("\u667A\u80FD\u79D1\u5B66\u4E0E\u5DE5\u7A0B\u5B66\u9662");
		label_1.setFont(new Font("宋体", Font.BOLD, 15));
		label_1.setBounds(98, 58, 160, 18);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("\u6CE8\u9500");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login window = new Login();
				window.frame.setVisible(true);
			}
		});
		label_2.setBounds(796, 27, 72, 18);
		frame.getContentPane().add(label_2);
		
		btnNewButton = new JButton("\u9009\u8BFE");
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(637, 263, 96, 18);
		frame.getContentPane().add(btnNewButton);
		
		button = new JButton("\u9009\u8BFE");
		button.setForeground(Color.BLUE);
		button.setBounds(637, 247, 96, 18);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("\u9009\u8BFE");
		button_1.setForeground(Color.BLUE);
		button_1.setBounds(637, 233, 96, 18);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("\u9009\u8BFE");
		button_2.setForeground(Color.BLUE);
		button_2.setBounds(637, 216, 96, 18);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("\u9009\u8BFE");
		button_3.setForeground(Color.BLUE);
		button_3.setBounds(637, 202, 96, 18);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("\u9009\u8BFE");
		button_4.setForeground(Color.BLUE);
		button_4.setBounds(637, 185, 96, 18);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("\u9009\u8BFE");
		button_5.setForeground(Color.BLUE);
		button_5.setBounds(637, 171, 96, 18);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("\u9009\u8BFE");
		button_6.setForeground(Color.BLUE);
		button_6.setBounds(637, 156, 96, 18);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("\u9009\u8BFE");
		button_7.setForeground(Color.BLUE);
		button_7.setBounds(637, 140, 96, 18);
		frame.getContentPane().add(button_7);
		
		JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				MainActivity main=new MainActivity();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(29, 499, 113, 27);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}

	public void setVisible(boolean b) {
		// TODO 自动生成的方法存根
		
	}
}
