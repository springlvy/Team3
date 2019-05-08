package com.jnu.teamproject.interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jnu.teamproject.data.PrintFile;
import com.jnu.teamproject.data.Save;
import com.jnu.teamproject.data.SaveAs;

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
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
		
		JMenu OpenFile = new JMenu("   \u6253\u5F00 ");
		OpenFile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					String path = System.getProperty("user.dir");
		            java.awt.Desktop.getDesktop().open(new File(path));
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			}
		});
		OpenFile.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		OpenFile.setForeground(new Color(0, 0, 0));
		menuBar.add(OpenFile);
		
		JMenu menu_save = new JMenu(" \u4FDD\u5B58\u4E3A ");
		menu_save.setForeground(Color.BLACK);
		menu_save.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		menuBar.add(menu_save);
		
		JMenu SaveWord = new JMenu("word");
		
		SaveWord.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		menu_save.add(SaveWord);
		
		JMenu SavePDF = new JMenu("pdf");
		
		SavePDF.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		menu_save.add(SavePDF);
		
		JMenu mnNewMenu_saveAs = new JMenu(" \u53E6\u5B58\u4E3A ");
		mnNewMenu_saveAs.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		mnNewMenu_saveAs.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_saveAs.setBackground(SystemColor.inactiveCaption);
		mnNewMenu_saveAs.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_saveAs);
		
		JMenu SaveAsWord = new JMenu("word");
		
		SaveAsWord.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		mnNewMenu_saveAs.add(SaveAsWord);
		
		JMenu SaveAsPDF = new JMenu("pdf");
		
		SaveAsPDF.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		mnNewMenu_saveAs.add(SaveAsPDF);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u5E74");
		
		JLabel label = new JLabel("\u81EA");
		
		JComboBox FromYear = new JComboBox();
		FromYear.setEditable(true);
		FromYear.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021"}));
		FromYear.setSelectedIndex(1);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u8BF7\u5047\u539F\u56E0");
		label_1.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("\u8BF7\u8F93\u5165\u8BF7\u5047\u65F6\u95F4");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_2 = new JLabel("\u6708");
		
		JLabel label_3 = new JLabel("\u65E5");
		
		JLabel label_4 = new JLabel("\u81F3");
		
		JLabel label_5 = new JLabel("\u5E74");
		
		JComboBox FromMonth = new JComboBox();
		FromMonth.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		FromMonth.setSelectedIndex(3);
		FromMonth.setEditable(true);
		
		JComboBox FromDay = new JComboBox();
		FromDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "24", "25", "26", "27", "28", "29", "30"}));
		FromDay.setSelectedIndex(3);
		FromDay.setEditable(true);
		
		JComboBox ToYear = new JComboBox();
		ToYear.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021"}));
		ToYear.setSelectedIndex(1);
		ToYear.setEditable(true);
		
		JComboBox ToMonth = new JComboBox();
		ToMonth.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		ToMonth.setSelectedIndex(3);
		ToMonth.setEditable(true);
		
		JComboBox ToDay = new JComboBox();
		ToDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "24", "25", "26", "27", "28", "29", "30"}));
		ToDay.setSelectedIndex(4);
		ToDay.setEditable(true);
		
		JLabel label_6 = new JLabel("\u6708");
		
		JLabel label_7 = new JLabel("\u65E5");
		
		JButton Print = new JButton("\u6253\u5370");
		
		Print.setFont(new Font("宋体", Font.BOLD, 20));
		/*
		Print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Preview yulan = new Preview();
				yulan.setVisible(true);
			}
		});*/
		
		JEditorPane Reason = new JEditorPane();
		//保存为word点击事件
		SaveWord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String str[]=new String[7];
				str[0]=Reason.getText();
				str[1]=FromYear.getSelectedItem().toString();
				str[2]=FromMonth.getSelectedItem().toString();
				str[3]=FromDay.getSelectedItem().toString();
				str[4]=ToYear.getSelectedItem().toString();
				str[5]=ToMonth.getSelectedItem().toString();
				str[6]=ToDay.getSelectedItem().toString();
	            Save.saveWord(str);
	            menu_save.resetKeyboardActions();
			}
		});
		SavePDF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String str[]=new String[7];
				str[0]=Reason.getText();
				str[1]=FromYear.getSelectedItem().toString();
				str[2]=FromMonth.getSelectedItem().toString();
				str[3]=FromDay.getSelectedItem().toString();
				str[4]=ToYear.getSelectedItem().toString();
				str[5]=ToMonth.getSelectedItem().toString();
				str[6]=ToDay.getSelectedItem().toString();
	            Save.savePDF(str);
			}
		});
		Print.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str[]=new String[7];
				str[0]=Reason.getText();
				str[1]=FromYear.getSelectedItem().toString();
				str[2]=FromMonth.getSelectedItem().toString();
				str[3]=FromDay.getSelectedItem().toString();
				str[4]=ToYear.getSelectedItem().toString();
				str[5]=ToMonth.getSelectedItem().toString();
				str[6]=ToDay.getSelectedItem().toString();
	            Save.saveWord(str);
	            PrintFile.printFileAction();
			}
		});
		SaveAsWord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str[]=new String[7];
				str[0]=Reason.getText();
				str[1]=FromYear.getSelectedItem().toString();
				str[2]=FromMonth.getSelectedItem().toString();
				str[3]=FromDay.getSelectedItem().toString();
				str[4]=ToYear.getSelectedItem().toString();
				str[5]=ToMonth.getSelectedItem().toString();
				str[6]=ToDay.getSelectedItem().toString();
	            try {
					SaveAs.save_As_Word(str);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		SaveAsPDF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String str[]=new String[7];
				str[0]=Reason.getText();
				str[1]=FromYear.getSelectedItem().toString();
				str[2]=FromMonth.getSelectedItem().toString();
				str[3]=FromDay.getSelectedItem().toString();
				str[4]=ToYear.getSelectedItem().toString();
				str[5]=ToMonth.getSelectedItem().toString();
				str[6]=ToDay.getSelectedItem().toString();
	            try {
					SaveAs.save_As_PDF(str);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		JButton Return = new JButton("\u8FD4\u56DE");
		Return.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				self.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
			}
		});
		Return.setFont(new Font("宋体", Font.BOLD, 20));
		
		JButton Preview = new JButton("\u9884\u89C8");
		Preview.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Preview yulan = new Preview();
				yulan.setVisible(true);
			}
		});
		Preview.setFont(new Font("宋体", Font.BOLD, 18));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(Reason, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 545, Short.MAX_VALUE)
						.addComponent(label_1, Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(label, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(FromYear, 0, 91, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblNewLabel)
											.addGap(8))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(ToYear, 0, 91, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
									.addGap(8)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(FromMonth, 0, 70, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(ToMonth, 0, 70, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(FromDay, 0, 68, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(ToDay, 0, 68, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
							.addGap(125)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(Preview, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Print)
								.addComponent(Return, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(78))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Reason, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(53)
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label)
								.addComponent(FromYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel)
								.addComponent(FromMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2)
								.addComponent(FromDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_3))
							.addGap(38))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Preview)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Print)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_4)
								.addComponent(ToYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(ToMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(ToDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_6)
								.addComponent(label_7)
								.addComponent(label_5)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Return)))
					.addContainerGap())
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
}
