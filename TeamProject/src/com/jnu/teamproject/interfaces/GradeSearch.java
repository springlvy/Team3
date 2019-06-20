package com.jnu.teamproject.interfaces;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.log4j.Logger;

import com.jnu.teamproject.data.Serialization;
import com.jnu.teamproject.data.UserInfo;

import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.SwingConstants;

public class GradeSearch {

	static Logger logger = Logger.getLogger(GradeSearch.class);
	JFrame frame;
	private JTable table;
	private UserInfo user;
	private int cur = 0;
	private int len = 0;
	private int pos[] = new int[8];
	private String head[]=null;
	private String[] grade=new String[100];
	private String[][] line=null;
	private Object [][]data=null;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeSearch window = new GradeSearch();
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
	public GradeSearch() throws IOException {
		user=new UserInfo();
		user=Serialization.read();
		
		String OfficeAccount = user.getOfficeAccount ();
        String OfficePassword = user.getOfficePassword();
        String Name = user.getName();
        String Institution = user.getInstitution();
        String Major = user.getMajor();
        
		File directory = new File(".");
		directory.getCanonicalPath();
		directory.getAbsolutePath();
		String exeFileName=directory.getCanonicalPath()+"\\libs\\jwc";
		//System.out.println("cmd:"+cmd);

		//执行exe文件
		final Process proc = Runtime.getRuntime().exec("cmd /c cd "+exeFileName+"&jwc.exe "+OfficeAccount+" "+OfficePassword+" "+Name+" "+Institution+" "+Major);

		//读取exe文件在exe控制台的输出结果
		BufferedReader stdout = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		
		for(int i=0;i<13;i++)
			stdout.readLine();//去除培养方案部分
		
		String s = null;
		int i = 0;
		int j = 0;
		boolean flag=true;
		while(flag) {
			pos[j++]=i;
			while((s=stdout.readLine())!=null) {
				if(s.charAt(0)=='=') {
					break;
				}	
				if(s.charAt(4)=='学'&&s.charAt(11)=='分') {
					flag=false;
					break;
				}
				grade[i++]=s;
			}
		}
		pos[j++]=i;
		len = j-2;
		for(int m=0;m<i;m++)
			System.out.println(grade[m]);
		System.out.println("mmmmmmmmmmmmmmmmmmm");
		System.out.println(len);
		for(int m=0;m<j;m++)
			System.out.println(pos[m]);
		line=new String[i][7];
		for(int in=0;in<i;in++) {
			line[in]=grade[in].split(" ");
			if(line[in][0].equals("08060244")) {
				line[in][1]=line[in][1]+line[in][2];
				System.out.println("windows编程："+line[in][1]);
				line[in][2]=line[in][3];
				line[in][3]=line[in][4];
				line[in][4]=line[in][5];
				line[in][5]=line[in][6];
				System.out.println(line[in][0]);
			}
		}	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(341, 192, -40, -12);
		frame.getContentPane().add(separator);
		frame.setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u4E3B\u8F6F\u4EF6\u7CFB\u7EDF\u2014\u2014\u6210\u7EE9\u67E5\u8BE2");
		frame.setBounds(140, 80, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗体居中显示
        frame.setLocationRelativeTo(frame.getOwner());
        
		
		
		JButton backButton = new JButton("\u8FD4\u56DE");
		backButton.setFont(new Font("宋体", Font.BOLD, 18));
		backButton.setBounds(408, 680, 113, 27);
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("从查询成绩界面返回主界面...");
				frame.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
			}
		});
		frame.getContentPane().add(backButton);
		table = new JTable();
		table.setFont(new Font("宋体", Font.BOLD, 18));
		table.setBounds(104, 261, 744, 25*(pos[cur+1]-pos[cur]+1));
		table.setRowHeight(25);
		head = new String[] {"New column", "New column", "New column", "New column", "New column", "New column"};
		DefaultTableModel defaultTableModel=new DefaultTableModel(queryData(),head){
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        table.setModel(defaultTableModel);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(4).setPreferredWidth(240);
		frame.getContentPane().add(table);
		frame.validate(); 
		frame.repaint();//刷新frame
		
		JButton nextPage = new JButton("\u4E0B\u4E00\u9875");
		nextPage.setFont(new Font("宋体", Font.BOLD, 18));
		
		nextPage.setBounds(604, 123, 123, 29);
		frame.getContentPane().add(nextPage);
		
		JButton lastPage = new JButton("\u4E0A\u4E00\u9875");
		lastPage.setFont(new Font("宋体", Font.BOLD, 18));
		lastPage.setBounds(202, 123, 123, 29);
		frame.getContentPane().add(lastPage);
		
		JLabel curPage = new JLabel("New label");
		curPage.setHorizontalAlignment(SwingConstants.CENTER);
		curPage.setFont(new Font("宋体", Font.BOLD, 18));
		curPage.setBounds(390, 127, 146, 21);
		curPage.setText("共 "+1+" / "+(len-1)+" 页");
		frame.getContentPane().add(curPage);
		
		lastPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户点击上一页查看成绩...");
				if(cur == 1||cur==0)
					cur= 0;
				else
					cur = cur-1;
				System.out.println("上一页："+cur);
				if(cur>=0) {
					curPage.setText("共 "+(cur+1)+" / "+(len-1)+" 页");
					frame.remove(table);
					table = new JTable();
					table.setFont(new Font("宋体", Font.BOLD, 18));
					table.setBounds(104, 261, 744, 25*(pos[cur+1]-pos[cur]+1));
					table.setRowHeight(25);
					head = new String[] {"New column", "New column", "New column", "New column", "New column", "New column"};
					DefaultTableModel defaultTableModel=new DefaultTableModel(queryData(),head){
			            /**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						public boolean isCellEditable(int row, int column)
			            {
			                return false;
			            }
			        };
			        table.setModel(defaultTableModel);
			        table.getColumnModel().getColumn(0).setPreferredWidth(100);
			        table.getColumnModel().getColumn(1).setPreferredWidth(200);
					table.getColumnModel().getColumn(4).setPreferredWidth(240);
					frame.getContentPane().add(table);
					frame.validate(); 
					frame.repaint();//刷新frame
				}
				if(cur<0)
					cur=0;
			}
		});
		nextPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				logger.info("用户点击下一页查看成绩...");
				if(cur<len) {
					if(cur==0)
						cur=1;
					curPage.setText("共 "+(cur+1)+" / "+(len-1)+" 页");
					frame.remove(table);
					table = new JTable();
					table.setFont(new Font("宋体", Font.BOLD, 18));
					table.setBounds(104, 261, 744, 25*(pos[cur+1]-pos[cur]+1));
					table.setRowHeight(25);
					head = new String[] {"New column", "New column", "New column", "New column", "New column", "New column"};
					DefaultTableModel defaultTableModel=new DefaultTableModel(queryData(),head){
			            /**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						public boolean isCellEditable(int row, int column)
			            {
			                return false;
			            }
			        };
			        table.setModel(defaultTableModel);
			        table.getColumnModel().getColumn(0).setPreferredWidth(100);
			        table.getColumnModel().getColumn(1).setPreferredWidth(200);
					table.getColumnModel().getColumn(4).setPreferredWidth(240);
					frame.getContentPane().add(table);
					frame.validate(); 
					frame.repaint();
					cur=cur+1;
				}
				if(cur+1==len) {
					cur=cur-1;
				}
			}
		});
	}
	public Object[][] queryData(){
		if(pos[cur+1]-pos[cur]==0)
			return data;
		System.out.println(cur);	
        data=new Object[pos[cur+1]-pos[cur]+1][head.length];
        data[0][0]="课程编号";
		data[0][1]="课程名称";
		data[0][2]="成绩";
		data[0][3]="分数";
		data[0][4]="学分";
		data[0][5]="学分绩点";
        System.out.println(pos[cur+1]-pos[cur]);
        for(int i=1;i<=pos[cur+1]-pos[cur];i++){
            for(int j=0;j<head.length;j++){
            	data[i][j]=line[i+pos[cur]-1][j];
            	System.out.print(line[i+pos[cur]-1][j]+" ");
            }
            System.out.println();
        }
        return data;
    }
}
