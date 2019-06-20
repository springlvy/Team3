package com.jnu.teamproject.interfaces;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.Logger;

import com.jnu.teamproject.data.Serialization;
import com.jnu.teamproject.data.UserInfo;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.Font;

public class Main extends JFrame {
	private JFrame frame;
	private JPanel contentPane;
	static Logger logger = Logger.getLogger(Main.class);
	private UserInfo user;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame1=new Main();
					frame1.setVisible(true);
				} catch (Exception e) {
					logger.error(e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
        user=new UserInfo();
		user=Serialization.read();
		
		frame=this;
		setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u4E3B\u8F6F\u4EF6\u7CFB\u7EDF\u2014\u2014\u4E3B\u9875");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(140, 80, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        // 设置窗体居中显示
        frame.setLocationRelativeTo(frame.getOwner());
		
		JLabel nameText = new JLabel("");
		nameText.setFont(new Font("宋体", Font.BOLD, 18));
		nameText.setBounds(239, 99, 93, 37);
		nameText.setText(user.getName());
		contentPane.add(nameText);
		
		JLabel institutionText = new JLabel("");
		institutionText.setFont(new Font("宋体", Font.BOLD, 18));
		institutionText.setBounds(239, 151, 185, 35);
		institutionText.setText(user.getInstitution());
		contentPane.add(institutionText);
		
		JLabel logoutButton = new JLabel("\u6CE8\u9500");
		logoutButton.setFont(new Font("宋体", Font.BOLD, 18));
		logoutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户注销...");
				frame.setVisible(false);
				Login window = new Login();
				window.frame.setVisible(true);
			}
		});
		logoutButton.setBounds(754, 104, 81, 26);
		contentPane.add(logoutButton);
		
		JButton searchButton = new JButton("\u641C  \u7D22");
		searchButton.setFont(new Font("宋体", Font.BOLD, 18));
		searchButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户点击搜索...");
				frame.setVisible(false);
				//Search search = new Search();
				//search.setVisible(true);
				
		        final String url = "https://www.jnu.edu.cn/_web/search/doSearch.do?_p=YXM9ODUmdD0yNDUmZD03NTMmcD0xJm09TiY_&locale=zh_CN&request_locale=zh_CN";  
		        UIUtils.setPreferredLookAndFeel();  
		        NativeInterface.open();  
		  
		        SwingUtilities.invokeLater(new Runnable() {  
		            public void run() {  
		                JFrame frame = new JFrame();  
		                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		                //禁用close功能
		                //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);        
		                //不显示标题栏,最大化,最小化,退出按钮
		                frame.setUndecorated(false);                                        
		                frame.getContentPane().add(new Browser(url));   
		                frame.setLocationByPlatform(true);
		                frame.setBounds(140, 80, 1000, 800);
		                JButton backButton=new JButton("返回");
		                backButton.addMouseListener(new MouseAdapter() {
		        			@Override
		        			public void mouseClicked(MouseEvent e) {
		        				logger.info("用户从搜索返回主界面...");
		        				frame.setVisible(false);
		        				Main main=new Main();
		        				main.setVisible(true);
		        			}});
		                frame.getContentPane().add(backButton,BorderLayout.SOUTH);
		                // 设置窗体居中显示
		                frame.setLocationRelativeTo(frame.getOwner());
		                frame.setVisible(true);
		            }
		        });  
		        NativeInterface.runEventPump();
			}
		});
		searchButton.setBounds(665, 148, 170, 40);
		contentPane.add(searchButton);
		
		JButton gradeButton = new JButton("\u67E5\u8BE2\u6210\u7EE9");
		gradeButton.setFont(new Font("宋体", Font.BOLD, 18));
		gradeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户点击查看成绩...");
				GradeSearch findGrade=null;
				try {
					if(user.getName().length()!=0&&user.getInstitution().length()!=0&&user.getMajor().length()!=0)
					{
						System.out.println("name:"+user.getName());
						findGrade = new GradeSearch();
						System.out.println("jinle222");
					}
					else
						JOptionPane.showMessageDialog(null, "未绑定姓名或学院或专业，请先点击头像进行绑定");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					logger.error(e1);
				}
				
				if(findGrade!=null)
				{
					frame.setVisible(false);
					findGrade.frame.setVisible(true);
				}
			}
		});
		gradeButton.setBounds(77, 259, 170, 40);
		contentPane.add(gradeButton);
		
		JButton trainingProgramButton = new JButton("\u67E5\u770B\u57F9\u517B\u65B9\u6848");
		trainingProgramButton.setFont(new Font("宋体", Font.BOLD, 18));
		trainingProgramButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户点击查看培养方案...");
				TrainScheme watchFangAn=null;
				try {
					if(user.getName().length()!=0&&user.getInstitution().length()!=0&&user.getMajor().length()!=0)
					{
						watchFangAn = new TrainScheme();
					}
					else
						JOptionPane.showMessageDialog(null, "未绑定姓名或学院或专业，请先点击头像进行绑定");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					logger.error(e1);
				}
				if(watchFangAn!=null)
				{
					frame.setVisible(false);
					watchFangAn.frame.setVisible(true);
				}
			}
		});
		trainingProgramButton.setBounds(273, 259, 170, 40);
		contentPane.add(trainingProgramButton);
		
		JButton selectCourseButton = new JButton("\u9009\u8BFE");
		selectCourseButton.setFont(new Font("宋体", Font.BOLD, 18));
		selectCourseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户点击选课...");
				frame.setVisible(false);
				Course XuanKe = new Course();
				XuanKe.frame.setVisible(true);
			}
		});
		selectCourseButton.setBounds(472, 259, 170, 40);
		contentPane.add(selectCourseButton);
		
		JLabel watchNotice = new JLabel("\u67E5\u770B\u901A\u77E5");
		watchNotice.setFont(new Font("宋体", Font.BOLD, 18));
		watchNotice.setBounds(77, 314, 81, 28);
		contentPane.add(watchNotice);
		
		JButton schoolNoticeButton = new JButton("\u65B0\u95FB\u901A\u77E5");
		schoolNoticeButton.setFont(new Font("宋体", Font.BOLD, 18));
		schoolNoticeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户点击查询通知...");
				frame.setVisible(false);
				Notice notice = null;
				try {
					notice = new Notice();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				notice.setVisible(true);
			}
		});
		schoolNoticeButton.setBounds(77, 357, 170, 40);
		contentPane.add(schoolNoticeButton);
		
		JButton employmentNoticeButton = new JButton("\u5C31\u4E1A\u901A\u77E5");
		employmentNoticeButton.setFont(new Font("宋体", Font.BOLD, 18));
		employmentNoticeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户点击查看就业信息...");
				frame.setVisible(false);	
				final String url = "https://career.jnu.edu.cn/eweb/jygl/index.so";  
		        final String title = "就业信息网站";  
		        UIUtils.setPreferredLookAndFeel();  
		        NativeInterface.open();         
			
		        SwingUtilities.invokeLater(new Runnable() {  
		            public void run() {
		                JFrame frame = new JFrame(title);
		                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		                //禁用close功能
		                //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);        
		                //不显示标题栏,最大化,最小化,退出按钮
		                frame.setUndecorated(false);                                      
		                frame.getContentPane().add(new Browser(url));   
		                frame.setLocationByPlatform(true);
		                frame.setBounds(140, 80, 1000, 800);
		                JButton backButton=new JButton("返回");
		                backButton.addMouseListener(new MouseAdapter() {
		        			@Override
		        			public void mouseClicked(MouseEvent e) {
		        				logger.info("用户从就业信息返回主界面...");
		        				frame.setVisible(false);
		        				Main main=new Main();
		        				main.setVisible(true);
		        			}});
		                frame.getContentPane().add(backButton,BorderLayout.SOUTH);
		                // 设置窗体居中显示
		                frame.setLocationRelativeTo(frame.getOwner());
		                frame.setVisible(true);
		            }
		        });  
		        NativeInterface.runEventPump();  
			}
		
		});
		employmentNoticeButton.setBounds(273, 357, 170, 40);
		contentPane.add(employmentNoticeButton);
		
		JLabel studentLife = new JLabel("\u5B66\u751F\u751F\u6D3B");
		studentLife.setFont(new Font("宋体", Font.BOLD, 18));
		studentLife.setBounds(77, 412, 93, 30);
		contentPane.add(studentLife);
		
		JButton watchElectricityButton = new JButton("\u7535\u8D39\u67E5\u8BE2");
		watchElectricityButton.setFont(new Font("宋体", Font.BOLD, 18));
		watchElectricityButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户点击查看电费...");
				frame.setVisible(false);
				ElectricityCost waterPage=new ElectricityCost();
				waterPage.setVisible(true);
			}
		});
		watchElectricityButton.setBounds(77, 457, 170, 40);
		contentPane.add(watchElectricityButton);
		
		JButton watchSchoolCardButton = new JButton("\u6821\u56ED\u5361\u4FE1\u606F\u67E5\u8BE2");
		watchSchoolCardButton.setFont(new Font("宋体", Font.BOLD, 18));
		watchSchoolCardButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户点击查看校园卡...");
				frame.setVisible(false);
				SchoolCard xiaoyuanka=new SchoolCard();
				xiaoyuanka.setVisible(true);
			}
		});
		watchSchoolCardButton.setBounds(273, 457, 170, 40);
		contentPane.add(watchSchoolCardButton);
		
		JLabel studentForum = new JLabel("\u5B66\u751F\u8BBA\u575B");
		studentForum.setFont(new Font("宋体", Font.BOLD, 18));
		studentForum.setBounds(77, 518, 82, 26);
		contentPane.add(studentForum);
		
		JButton watchForumButton = new JButton("\u66A8\u5357\u5927\u5B66\u8BBA\u575B");
		watchForumButton.setFont(new Font("宋体", Font.BOLD, 18));
		watchForumButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户点击查看论坛...");
				frame.setVisible(false);
				//Forum activity=new Forum();
		        //activity.setVisible(true);
				
		        final String url = "http://bbs.jnlts.com/";  
		        UIUtils.setPreferredLookAndFeel();  
		        NativeInterface.open();  
		  
		        SwingUtilities.invokeLater(new Runnable() {  
		            public void run() {  
		                JFrame frame = new JFrame();  
		                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		                //禁用close功能
		                //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);        
		                //不显示标题栏,最大化,最小化,退出按钮
		                frame.setUndecorated(false);                                        
		                frame.getContentPane().add(new Browser(url));   
		                frame.setLocationByPlatform(true);
		                frame.setBounds(140, 80, 1000, 800);
		                JButton backButton=new JButton("返回");
		                backButton.addMouseListener(new MouseAdapter() {
		        			@Override
		        			public void mouseClicked(MouseEvent e) {
		        				logger.info("用户从论坛返回主界面...");
		        				frame.setVisible(false);
		        				Main main=new Main();
		        				main.setVisible(true);
		        			}});
		                frame.getContentPane().add(backButton,BorderLayout.SOUTH);
		                // 设置窗体居中显示
		                frame.setLocationRelativeTo(frame.getOwner());
		                frame.setVisible(true);
		            }
		        });  
		        NativeInterface.runEventPump();  
			}
		});
		
		watchForumButton.setBounds(77, 559, 170, 40);
		contentPane.add(watchForumButton);
		
		JLabel docTemplate = new JLabel("\u6587\u6863\u6A21\u7248");
		docTemplate.setFont(new Font("宋体", Font.BOLD, 18));
		docTemplate.setBounds(77, 624, 82, 21);
		contentPane.add(docTemplate);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户点击查看个人信息...");
				frame.setVisible(false);
				Information info = new Information();
				info.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("images/avtar.jpg"));
		btnNewButton_1.setBounds(77, 48, 124, 147);
		contentPane.add(btnNewButton_1);
		
		JButton leaveDocButton = new JButton("\u8BF7\u5047\u6761");
		leaveDocButton.setFont(new Font("宋体", Font.BOLD, 18));
		leaveDocButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Leave qingjia = new Leave();
				qingjia.setVisible(true);
			}
		});
		leaveDocButton.setBounds(77, 660, 170, 40);
		contentPane.add(leaveDocButton);
		
		JButton dormDocButton = new JButton("\u7559\u5BBF\u7533\u8BF7\u8868");
		dormDocButton.setFont(new Font("宋体", Font.BOLD, 18));
		dormDocButton.setBounds(273, 660, 170, 40);
		contentPane.add(dormDocButton);
		
		JLabel label = new JLabel("\u4E2A\u4EBA\u6559\u52A1\u5904");
		label.setFont(new Font("宋体", Font.BOLD, 18));
		label.setBounds(77, 210, 105, 29);
		contentPane.add(label);
	}
}
