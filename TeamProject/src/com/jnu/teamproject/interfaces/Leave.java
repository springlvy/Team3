package com.jnu.teamproject.interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JEditorPane;

public class Leave extends JFrame {

	
	private JPanel contentPane;
	private JFrame self;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Leave qingjia = new Leave();
					qingjia.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Leave() {
		self=this;
		setTitle("\u8BF7\u5047\u6761");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 503);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 36));
		menuBar.setToolTipText("");
		menuBar.setMargin(new Insets(3, 3, 3, 3));
		menuBar.setForeground(Color.lightGray);
		menuBar.setBackground(UIManager.getColor("ColorChooser.background"));
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u4FDD\u5B58\u4E3A");
		menu.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		menuBar.add(menu);
		
		JMenu mnWord = new JMenu("word");
		mnWord.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		menu.add(mnWord);
		
		JMenu mnPdf = new JMenu("pdf");
		mnPdf.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		menu.add(mnPdf);
		
		JMenu mnNewMenu = new JMenu("\u53E6\u5B58\u4E3A");
		mnNewMenu.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setBackground(SystemColor.inactiveCaption);
		mnNewMenu.setForeground(UIManager.getColor("Button.foreground"));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("word");
		mnNewMenu_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		mnNewMenu.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("pdf");
		mnNewMenu_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		mnNewMenu.add(mnNewMenu_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u5E74");
		
		JLabel label = new JLabel("\u81EA");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021"}));
		comboBox.setSelectedIndex(1);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u8BF7\u5047\u539F\u56E0");
		label_1.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("\u8BF7\u8F93\u5165\u8BF7\u5047\u65F6\u95F4");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_2 = new JLabel("\u6708");
		
		JLabel label_3 = new JLabel("\u65E5");
		
		JLabel label_4 = new JLabel("\u81F3");
		
		JLabel label_5 = new JLabel("\u5E74");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setSelectedIndex(3);
		comboBox_1.setEditable(true);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "24", "25", "26", "27", "28", "29", "30"}));
		comboBox_2.setSelectedIndex(3);
		comboBox_2.setEditable(true);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021"}));
		comboBox_3.setSelectedIndex(1);
		comboBox_3.setEditable(true);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_4.setSelectedIndex(3);
		comboBox_4.setEditable(true);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "24", "25", "26", "27", "28", "29", "30"}));
		comboBox_5.setSelectedIndex(4);
		comboBox_5.setEditable(true);
		
		JLabel label_6 = new JLabel("\u6708");
		
		JLabel label_7 = new JLabel("\u65E5");
		
		JButton button = new JButton("\u9884\u89C8");
		button.setFont(new Font("宋体", Font.BOLD, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Preview yulan = new Preview();
				yulan.setVisible(true);
			}
		});
		
		JEditorPane editorPane = new JEditorPane();
		
		JButton btnNewButton = new JButton("\u8FD4\u56DE");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				self.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(editorPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 545, Short.MAX_VALUE)
						.addComponent(label_1, Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(label, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBox, 0, 91, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblNewLabel)
											.addGap(8))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_3, 0, 91, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
									.addGap(8)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(comboBox_1, 0, 70, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(comboBox_4, 0, 70, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(comboBox_2, 0, 68, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(comboBox_5, 0, 68, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
							.addGap(125)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(button)
								.addComponent(btnNewButton))))
					.addGap(78))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(editorPane, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGap(53)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3)
						.addComponent(button))
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_4)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_6)
								.addComponent(label_7)
								.addComponent(label_5))
							.addGap(17))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton)
							.addContainerGap())))
		);
		contentPane.setLayout(gl_contentPane);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
