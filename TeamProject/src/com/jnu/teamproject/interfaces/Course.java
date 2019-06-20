package com.jnu.teamproject.interfaces;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSeparator;
import javax.swing.table.DefaultTableModel;

import org.apache.log4j.Logger;

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
import java.awt.SystemColor;

public class Course {

	JFrame frame;
	static Logger logger = Logger.getLogger(Course.class);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Course window = new Course();
					window.frame.setVisible(true);
				} catch (Exception e) {
					logger.error(e);
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Course() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u4E3B\u8F6F\u4EF6\u7CFB\u7EDF\u2014\u2014\u9009\u8BFE");
		frame.setBounds(140, 80, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
        // 设置窗体居中显示
        frame.setLocationRelativeTo(frame.getOwner());
		
		JButton backButton = new JButton("\u8FD4\u56DE");
		backButton.setFont(new Font("宋体", Font.BOLD, 18));
		backButton.setBounds(374, 494, 113, 27);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
			}
		});
		frame.getContentPane().add(backButton);
		
		JLabel text = new JLabel("\u9009\u8BFE\u7CFB\u7EDF\u6682\u672A\u5F00\u653E\uFF01");
		text.setFont(new Font("宋体", Font.PLAIN, 34));
		text.setForeground(Color.RED);
		text.setBounds(272, 212, 322, 158);
		frame.getContentPane().add(text);
		
		
	}

	public void setVisible(boolean b) {
		// TODO 自动生成的方法存根
		
	}
}
