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

public class ForumActivity extends JFrame {
	private ForumActivity self;
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForumActivity frame = new ForumActivity();
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
	public ForumActivity() {
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
		
		JLabel label_3 = new JLabel("\u5B66\u751F\u8BBA\u575B");
		label_3.setBounds(59, 103, 54, 15);
		contentPane.add(label_3);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("images/touxiang.jpg"));
		btnNewButton_1.setBounds(36, 31, 111, 44);
		contentPane.add(btnNewButton_1);
		
		JLabel label_4 = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		label_4.setBounds(123, 103, 488, 15);
		contentPane.add(label_4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("images/forum.PNG"));
		btnNewButton.setBounds(36, 128, 554, 314);
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				self.setVisible(false);
				MainActivity main=new MainActivity();
				main.setVisible(true);
			}
		});
		button_1.setBounds(36, 445, 93, 23);
		contentPane.add(button_1);
		
		
	}
}
