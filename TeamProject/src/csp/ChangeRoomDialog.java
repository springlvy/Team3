package csp;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChangeRoomDialog extends JFrame {
	private ChangeRoomDialog self;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeRoomDialog frame = new ChangeRoomDialog();
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
	public ChangeRoomDialog() {
		self=this;
		setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u52A9\u8F6F\u4EF6\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u65B0\u5BBF\u820D\u53F7\uFF1A");
		label.setBounds(186, 64, 78, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(167, 107, 90, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u7ED1\u5B9A");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				self.setVisible(false);
			}
		});
		button.setBounds(164, 162, 93, 23);
		contentPane.add(button);
	}

}
