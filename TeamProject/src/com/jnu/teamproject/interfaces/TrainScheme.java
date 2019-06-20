package com.jnu.teamproject.interfaces;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import org.apache.log4j.Logger;

import com.jnu.teamproject.data.GetPythonData;
import com.jnu.teamproject.data.Serialization;
import com.jnu.teamproject.data.UserInfo;

import java.awt.Color;

public class TrainScheme {

	JFrame frame;
	private JTable table;
	private String credit0;
	private String credit1;
	private String credit2;
	private String credit3;
	private String credit4;
	private String credit5;
	private String credit6;
	private String credit7;
	private String credit8;
	private String credit9;
	private String credit10;
	private String credit11;
	private String credit12;
	private UserInfo user;
	static Logger logger = Logger.getLogger(TrainScheme.class);
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrainScheme window = new TrainScheme();
					window.frame.setVisible(true);
				} catch (Exception e) {
					logger.error(e);
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public TrainScheme() throws IOException {
		user=new UserInfo();
		user=Serialization.read();
		
		String officeAccount = user.getOfficeAccount();
        String officePassword = user.getOfficePassword();
        String name = user.getName();
        String institution = user.getInstitution();
        String major = user.getMajor();
        
		File directory = new File(".");
		System.out.println(user.getOfficeAccount());
		System.out.println(user.getMajor());
		String exeFileName=directory.getCanonicalPath()+"\\libs\\jwc";
		//System.out.println("cmd:"+cmd);

		//执行exe文件
		final Process proc = Runtime.getRuntime().exec("cmd /c cd "+exeFileName+"&jwc.exe "+officeAccount+" "+officePassword+" "+name+" "+institution+" "+major);

		//读取exe文件在exe控制台的输出结果
		BufferedReader stdout = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		

		credit0 = stdout.readLine();//读取一行
		credit1  = stdout.readLine();
		credit2  = stdout.readLine();
		credit3  = stdout.readLine();
		credit4  = stdout.readLine();//读取一行
		credit5  = stdout.readLine();
		credit6  = stdout.readLine();
		credit7  = stdout.readLine();
		credit8  = stdout.readLine();//读取一行
		credit9  = stdout.readLine();
		credit10  = stdout.readLine();
		credit11  = stdout.readLine();
		credit12  = stdout.readLine();//读取一行
		
		
		
		System.out.println(credit0);
		System.out.println(credit1);
		System.out.println(credit2);
		System.out.println(credit3);
		System.out.println(credit4);
		System.out.println(credit5);
		System.out.println(credit6);
		System.out.println(credit7);
		System.out.println(credit8);
		System.out.println(credit9);
		System.out.println(credit10);
		System.out.println(credit11);
		System.out.println(credit12);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u4E3B\u8F6F\u4EF6\u7CFB\u7EDF\u2014\u2014\u57F9\u517B\u65B9\u6848");
		frame.setBounds(140, 80, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
        // 设置窗体居中显示
        frame.setLocationRelativeTo(frame.getOwner());
		
		JButton backButton = new JButton("\u8FD4\u56DE");
		backButton.setFont(new Font("宋体", Font.BOLD, 18));
		backButton.setBounds(442, 576, 113, 27);
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
			}
		});
		frame.getContentPane().add(backButton);
		
		String line_one [] = credit0.split("  ");
	    String line_two []  = credit1.split("  ");
		String line_three[] = credit2.split("  ");
		String line_four []  = credit3.split("  ");
		String line_five[]  = credit4.split("  ");
		String line_six[]= credit5.split("  ");
		String line_seven[] = credit6.split("  ");
		String line_eight[] = credit7.split("  ");
		String line_nine[] = credit8.split("  ");
		String line_ten[] = credit9.split("  ");
		String line_ele[] = credit10.split("  ");
		String line_twe[] = credit11.split("  ");
		String line_tri[] = credit12.split("  ");
		table = new JTable();
		table.setRowHeight(25);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setFont(new Font("宋体", Font.BOLD, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u5B66\u4E60\u6A21\u5757", "\u8981\u6C42", "\u5DF2\u4FEE", "\u8FD8\u5DEE"},
				{"\u603B\u5206", line_one[0], line_one[1], line_one[2]},
				{"\u5FC5\u4FEE", line_two[0], line_two[1], line_two[2]},
				{"\u827A\u672F\u7D20\u517B", line_three[0], line_three[1], line_three[2]},
				{"\u6587\u53F2\u54F2", line_four[0], line_four[1], line_four[2]},
				{"\u7ECF\u7BA1\u6CD5", line_five[0], line_five[1], line_five[2]},
				{"\u6570\u7406\u5DE5", "","",""},
				{"\u751F\u547D\u7C7B", "","",""},
				{"\u5176\u4ED6", line_eight[0], line_eight[1], line_eight[2]},
				{"\u901A\u8BC6\u5C0F\u8BA1", line_nine[0], line_nine[1], line_nine[2]},
				{"\u57FA\u7840\u6559\u80B2", line_ten[0], line_ten[1], line_ten[2]},
				{"\u4E13\u4E1A\u6559\u80B2", line_ele[0], line_ele[1], line_ele[2]},
				{"\u8DE8\u4E13\u4E1A\u8BFE\u7A0B", line_twe[0], line_twe[1], line_twe[2]},
				{"\u9009\u4FEE\u5408\u8BA1", line_tri[0], line_tri[1], line_tri[2]},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(210, 140, 576, 350);
		frame.getContentPane().add(table);
	}
}
