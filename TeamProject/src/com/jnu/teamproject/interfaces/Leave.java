package com.jnu.teamproject.interfaces;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.Logger;

import com.jnu.teamproject.data.DaysOfTwo;
import com.jnu.teamproject.data.PreviewFile;
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
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JEditorPane;

public class Leave extends JFrame {
	static Logger logger = Logger.getLogger(Leave.class);
	
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
		setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u4E3B\u8F6F\u4EF6\u7CFB\u7EDF\u2014\u2014\u8BF7\u5047\u6761");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(140, 80, 1000, 800);
		//居中
		self.setLocationRelativeTo(self.getOwner());
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("宋体", Font.BOLD, 36));
		menuBar.setToolTipText("");
		menuBar.setMargin(new Insets(10, 10, 10, 10));
		menuBar.setForeground(Color.lightGray);
		menuBar.setBackground(UIManager.getColor("ColorChooser.background"));
		setJMenuBar(menuBar);
		
		JMenu openFile = new JMenu("   \u6253\u5F00 ");
		openFile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					logger.info("用户打开本地文件...");
					String path = System.getProperty("user.dir");
		            java.awt.Desktop.getDesktop().open(new File(path));
		        } catch (IOException e) {
		        	logger.error(e);
		        }
			}
		});
		
		openFile.setFont(new Font("宋体", Font.BOLD, 18));
		openFile.setForeground(new Color(0, 0, 0));
		menuBar.add(openFile);
		
		JMenu menu_save = new JMenu(" \u4FDD\u5B58\u4E3A ");
		menu_save.setForeground(Color.BLACK);
		menu_save.setFont(new Font("宋体", Font.BOLD, 18));
		menuBar.add(menu_save);
		
		JMenu saveWord = new JMenu("word");
		
		saveWord.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		menu_save.add(saveWord);
		
		JMenu savePDF = new JMenu("pdf");
		
		savePDF.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		menu_save.add(savePDF);
		
		JMenu mnNewMenu_saveAs = new JMenu(" \u53E6\u5B58\u4E3A ");
		mnNewMenu_saveAs.setFont(new Font("宋体", Font.BOLD, 18));
		mnNewMenu_saveAs.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_saveAs.setBackground(SystemColor.inactiveCaption);
		mnNewMenu_saveAs.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_saveAs);
		
		JMenu saveAsWord = new JMenu("word");
		
		saveAsWord.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		mnNewMenu_saveAs.add(saveAsWord);
		
		JMenu saveAsPDF = new JMenu("pdf");
		
		saveAsPDF.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		mnNewMenu_saveAs.add(saveAsPDF);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u5E74");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel.setBounds(227, 429, 49, 21);
		
		JLabel label = new JLabel("\u81EA");
		label.setFont(new Font("宋体", Font.BOLD, 18));
		label.setBounds(79, 429, 42, 21);
		
		JComboBox fromYear = new JComboBox();
		fromYear.setFont(new Font("宋体", Font.BOLD, 18));
		fromYear.setBounds(130, 425, 90, 30);
		fromYear.setEditable(true);
		fromYear.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021"}));
		fromYear.setSelectedIndex(1);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u8BF7\u5047\u539F\u56E0");
		label_1.setBounds(80, 77, 140, 24);
		label_1.setFont(new Font("宋体", Font.BOLD, 18));
		
		JLabel lblNewLabel_1 = new JLabel("\u8BF7\u8F93\u5165\u8BF7\u5047\u65F6\u95F4");
		lblNewLabel_1.setBounds(79, 343, 156, 33);
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 18));
		
		JLabel label_2 = new JLabel("\u6708");
		label_2.setFont(new Font("宋体", Font.BOLD, 18));
		label_2.setBounds(370, 429, 40, 21);
		
		JLabel label_3 = new JLabel("\u65E5");
		label_3.setFont(new Font("宋体", Font.BOLD, 18));
		label_3.setBounds(528, 429, 42, 21);
		
		JLabel label_4 = new JLabel("\u81F3");
		label_4.setFont(new Font("宋体", Font.BOLD, 18));
		label_4.setBounds(79, 527, 42, 21);
		
		JLabel label_5 = new JLabel("\u5E74");
		label_5.setFont(new Font("宋体", Font.BOLD, 18));
		label_5.setBounds(227, 526, 49, 21);
		
		JComboBox fromMonth = new JComboBox();
		fromMonth.setFont(new Font("宋体", Font.BOLD, 18));
		fromMonth.setBounds(272, 425, 90, 30);
		fromMonth.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		fromMonth.setSelectedIndex(3);
		fromMonth.setEditable(true);
		
		JComboBox fromDay = new JComboBox();
		fromDay.setFont(new Font("宋体", Font.BOLD, 18));
		fromDay.setBounds(415, 425, 90, 30);
		fromDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "24", "25", "26", "27", "28", "29", "30"}));
		fromDay.setSelectedIndex(3);
		fromDay.setEditable(true);
		
		JComboBox toYear = new JComboBox();
		toYear.setFont(new Font("宋体", Font.BOLD, 18));
		toYear.setBounds(130, 523, 90, 30);
		toYear.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021"}));
		toYear.setSelectedIndex(1);
		toYear.setEditable(true);
		
		JComboBox toMonth = new JComboBox();
		toMonth.setFont(new Font("宋体", Font.BOLD, 18));
		toMonth.setBounds(272, 523, 90, 30);
		toMonth.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		toMonth.setSelectedIndex(3);
		toMonth.setEditable(true);
		
		JComboBox toDay = new JComboBox();
		toDay.setFont(new Font("宋体", Font.BOLD, 18));
		toDay.setBounds(415, 524, 90, 27);
		toDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "24", "25", "26", "27", "28", "29", "30"}));
		toDay.setSelectedIndex(4);
		toDay.setEditable(true);
		
		JLabel label_6 = new JLabel("\u6708");
		label_6.setFont(new Font("宋体", Font.BOLD, 18));
		label_6.setBounds(370, 527, 40, 21);
		
		JLabel label_7 = new JLabel("\u65E5");
		label_7.setFont(new Font("宋体", Font.BOLD, 18));
		label_7.setBounds(528, 527, 42, 21);
		
		JButton print = new JButton("\u6253\u5370");
		print.setBounds(767, 472, 124, 33);
		
		print.setFont(new Font("宋体", Font.BOLD, 20));
		/*
		Print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Preview yulan = new Preview();
				yulan.setVisible(true);
			}
		});*/
		
		JEditorPane reason = new JEditorPane();
		reason.setFont(new Font("宋体", Font.BOLD, 18));
		reason.setBounds(79, 137, 812, 150);
		//保存为word点击事件
		saveWord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(reason.getText().length()==0) {
					JOptionPane.showMessageDialog(null,"请输入请假理由", "出错啦", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String str[]=new String[7];
					str[0]=reason.getText();
					str[1]=fromYear.getSelectedItem().toString();
					str[2]=fromMonth.getSelectedItem().toString();
					str[3]=fromDay.getSelectedItem().toString();
					str[4]=toYear.getSelectedItem().toString();
					str[5]=toMonth.getSelectedItem().toString();
					str[6]=toDay.getSelectedItem().toString();

					try {
						if(DaysOfTwo.daysOfTwo(str)<0) {
							JOptionPane.showMessageDialog(null,"输入时间有误", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else if(Integer.valueOf(str[2])>12||Integer.valueOf(str[5])>12) {
							JOptionPane.showMessageDialog(null,"输入的月份不能超过12", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else if(Integer.valueOf(str[3])>12||Integer.valueOf(str[6])>12) {
							JOptionPane.showMessageDialog(null,"输入的月份天数不能超过31", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else
						{
							Save.saveWord(str);
							JOptionPane.showMessageDialog(null,"保存成功", "word保存", JOptionPane.INFORMATION_MESSAGE);
						}
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
					logger.info("用户默认保存word...");
				}
				menu_save.resetKeyboardActions();
			}
		});
		savePDF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(reason.getText().length()==0) {
					JOptionPane.showMessageDialog(null,"请输入请假理由", "出错啦", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String str[]=new String[7];
					str[0]=reason.getText();
					str[1]=fromYear.getSelectedItem().toString();
					str[2]=fromMonth.getSelectedItem().toString();
					str[3]=fromDay.getSelectedItem().toString();
					str[4]=toYear.getSelectedItem().toString();
					str[5]=toMonth.getSelectedItem().toString();
					str[6]=toDay.getSelectedItem().toString();

					try {
						if(DaysOfTwo.daysOfTwo(str)<0) {
							JOptionPane.showMessageDialog(null,"输入时间有误", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else if(Integer.valueOf(str[2])>12||Integer.valueOf(str[5])>12) {
							JOptionPane.showMessageDialog(null,"输入的月份不能超过12", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else if(Integer.valueOf(str[3])>12||Integer.valueOf(str[6])>12) {
							JOptionPane.showMessageDialog(null,"输入的月份天数不能超过31", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else
						{
							Save.savePDF(str);
							JOptionPane.showMessageDialog(null,"保存成功", "pdf保存", JOptionPane.INFORMATION_MESSAGE);
						}
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						logger.error(e);
					}	
					logger.info("用户默认保存pdf...");
				}    
			}
		});
		print.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(reason.getText().length()==0) {
					JOptionPane.showMessageDialog(null,"请输入请假理由", "出错啦", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String str[]=new String[7];
					str[0]=reason.getText();
					str[1]=fromYear.getSelectedItem().toString();
					str[2]=fromMonth.getSelectedItem().toString();
					str[3]=fromDay.getSelectedItem().toString();
					str[4]=toYear.getSelectedItem().toString();
					str[5]=toMonth.getSelectedItem().toString();
					str[6]=toDay.getSelectedItem().toString();

					try {
						if(DaysOfTwo.daysOfTwo(str)<0) {
							JOptionPane.showMessageDialog(null,"输入时间有误", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else if(Integer.valueOf(str[2])>12||Integer.valueOf(str[5])>12) {
							JOptionPane.showMessageDialog(null,"输入的月份不能超过12", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else if(Integer.valueOf(str[3])>12||Integer.valueOf(str[6])>12) {
							JOptionPane.showMessageDialog(null,"输入的月份天数不能超过31", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else {
							Save.saveWord(str);
							PrintFile.printFileAction();
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
					logger.info("用户选择打印...");
				}
			}
		});
		saveAsWord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(reason.getText().length()==0) {
					JOptionPane.showMessageDialog(null,"请输入请假理由", "出错啦", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String str[]=new String[7];
					str[0]=reason.getText();
					str[1]=fromYear.getSelectedItem().toString();
					str[2]=fromMonth.getSelectedItem().toString();
					str[3]=fromDay.getSelectedItem().toString();
					str[4]=toYear.getSelectedItem().toString();
					str[5]=toMonth.getSelectedItem().toString();
					str[6]=toDay.getSelectedItem().toString();

					try {
						if(DaysOfTwo.daysOfTwo(str)<0) {
							JOptionPane.showMessageDialog(null,"输入时间有误", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else if(Integer.valueOf(str[2])>12||Integer.valueOf(str[5])>12) {
							JOptionPane.showMessageDialog(null,"输入的月份不能超过12", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else if(Integer.valueOf(str[3])>12||Integer.valueOf(str[6])>12) {
							JOptionPane.showMessageDialog(null,"输入的月份天数不能超过31", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else {
							 try {
									SaveAs.save_As_Word(str);
									JOptionPane.showMessageDialog(null,"保存成功", "word保存", JOptionPane.INFORMATION_MESSAGE);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						logger.error(e1);
					}	
					logger.info("用户另保存word...");
				}
			}
		});
		saveAsPDF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(reason.getText().length()==0) {
					JOptionPane.showMessageDialog(null,"请输入请假理由", "出错啦", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String str[]=new String[7];
					str[0]=reason.getText();
					str[1]=fromYear.getSelectedItem().toString();
					str[2]=fromMonth.getSelectedItem().toString();
					str[3]=fromDay.getSelectedItem().toString();
					str[4]=toYear.getSelectedItem().toString();
					str[5]=toMonth.getSelectedItem().toString();
					str[6]=toDay.getSelectedItem().toString();

					try {
						if(DaysOfTwo.daysOfTwo(str)<0) {
							JOptionPane.showMessageDialog(null,"输入时间有误", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else if(Integer.valueOf(str[2])>12||Integer.valueOf(str[5])>12) {
							JOptionPane.showMessageDialog(null,"输入的月份不能超过12", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else if(Integer.valueOf(str[3])>12||Integer.valueOf(str[6])>12) {
							JOptionPane.showMessageDialog(null,"输入的月份天数不能超过31", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else {
							try {
								SaveAs.save_As_PDF(str);
								JOptionPane.showMessageDialog(null,"保存成功", "pdf保存", JOptionPane.INFORMATION_MESSAGE);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								logger.error(e1);
							}
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						logger.error(e1);
					}	
					logger.info("用户另保存pdf...");
				}
			}
		});
		JButton returnTo = new JButton("\u8FD4\u56DE");
		returnTo.setBounds(767, 520, 124, 33);
		returnTo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				self.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
				logger.info("用户从填写请假条返回...");
			}
		});
		returnTo.setFont(new Font("宋体", Font.BOLD, 20));
		
		JButton preview = new JButton("\u9884\u89C8");
		preview.setBounds(767, 424, 124, 29);
		preview.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(reason.getText().length()==0) {
					JOptionPane.showMessageDialog(null,"请输入请假理由", "出错啦", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String str[]=new String[7];
					str[0]=reason.getText();
					str[1]=fromYear.getSelectedItem().toString();
					str[2]=fromMonth.getSelectedItem().toString();
					str[3]=fromDay.getSelectedItem().toString();
					str[4]=toYear.getSelectedItem().toString();
					str[5]=toMonth.getSelectedItem().toString();
					str[6]=toDay.getSelectedItem().toString();

					try {
						if(DaysOfTwo.daysOfTwo(str)<0) {
							JOptionPane.showMessageDialog(null,"输入时间有误", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else if(Integer.valueOf(str[2])>12||Integer.valueOf(str[5])>12) {
							JOptionPane.showMessageDialog(null,"输入的月份不能超过12", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else if(Integer.valueOf(str[3])>12||Integer.valueOf(str[6])>12) {
							JOptionPane.showMessageDialog(null,"输入的月份天数不能超过31", "出错啦", JOptionPane.ERROR_MESSAGE);
						}
						else 
							try {
								PreviewFile.previewFile(str);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								logger.error(e1);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						logger.error(e1);
					}	
					logger.info("用户点击预览...");
				}
				
			}
		});
		preview.setFont(new Font("宋体", Font.BOLD, 18));
		contentPane.setLayout(null);
		contentPane.add(reason);
		contentPane.add(label_1);
		contentPane.add(lblNewLabel_1);
		contentPane.add(label);
		contentPane.add(fromYear);
		contentPane.add(lblNewLabel);
		contentPane.add(label_4);
		contentPane.add(toYear);
		contentPane.add(label_5);
		contentPane.add(fromMonth);
		contentPane.add(label_2);
		contentPane.add(toMonth);
		contentPane.add(label_6);
		contentPane.add(fromDay);
		contentPane.add(label_3);
		contentPane.add(toDay);
		contentPane.add(label_7);
		contentPane.add(preview);
		contentPane.add(print);
		contentPane.add(returnTo);
	}
}
