package com.jnu.teamproject.interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jnu.teamproject.getnotice.NoticeSerializeOperater;
import com.jnu.teamproject.getnotice.SchoolNotice;
import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Comparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Notice extends JFrame {

	private JFrame self;
	private JPanel contentPane;
	private JTextField jumpPage;
	private int cur = 1;
	private int startIndex=0;
	
	private JLabel title1;
	private JLabel date1;
	private JLabel source1; 
	private JLabel title2;
	private JLabel date2;
	private JLabel source2;
	private JLabel title3;
	private JLabel date3;
	private JLabel source3;
	private JLabel title4;
	private JLabel date4;
	private JLabel source4;
	private JLabel title5;
	private JLabel date5;
	private JLabel source5;
	private JLabel title6;
	private JLabel date6;
	private JLabel source6;
	private JLabel title7;
	private JLabel date7;
	private JLabel source7;
	private JLabel title8;
	private JLabel date8;
	private JLabel source8;
	private JLabel title9;
	private JLabel date9;
	private JLabel source9;
	private JLabel title10;
	private JLabel date10;
	private JLabel source10; 
	JLabel curPage;
	JLabel allPage;
	JComboBox comboBox;

	NoticeSerializeOperater<SchoolNotice> noticeoperater=new NoticeSerializeOperater<SchoolNotice>();//搴忓垪鍖栵紝鍙嶅簭鍒楀寲
	ArrayList<SchoolNotice> Desnotices;
	private JTextField searchContent;
	
	ArrayList<SchoolNotice> searchList;
	ArrayList<SchoolNotice> searchResult;
	 ArrayList<SchoolNotice> Desnotices1,Desnotices2,Desnotices3;
	
	
	/**
	 * Launch the application.
	 */
	 Comparator c = new Comparator<SchoolNotice>() {
			@Override
			 public int compare(SchoolNotice o1, SchoolNotice o2) {
				String t1,t2;
				t1 = o1.getTime();
				t2 = o2.getTime();
		        if(t1.compareTo(t2)>=0){
		            return -1;
		        }else{
		            return 1;
		        }

		    }
		};

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Notice frame = new Notice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 * @throws IOException 
	 */
	void setNotice(int flag) throws IOException, Exception{
		switch(flag) {
		case 0:
		      Desnotices=noticeoperater.load("./schoolnotice.dat");
		      break;
		case 1:
			  Desnotices=noticeoperater.load("./collegenotice.dat");
			  break;
		case 2:
			  Desnotices=noticeoperater.load("./jwc.dat");
			  break;
		case 3:
			Desnotices=searchResult;
			break;
		}
	}
	void setCollegeNotice(int flag) throws IOException, Exception{
		switch(flag) {
		case 0:
			 Desnotices1 = noticeoperater.load("./rw.dat");
			 Desnotices2 = noticeoperater.load("./fy.dat");
			 Desnotices3=noticeoperater.load("./gjs.dat");
		      Desnotices1.addAll(Desnotices2) ;
		      Desnotices1.addAll(Desnotices3) ;
		      Desnotices1.sort(c);
		      Desnotices = Desnotices1;
		     
		      break;
		case 1:
			 Desnotices1 = noticeoperater.load("./rw.dat");
			 Desnotices2 = noticeoperater.load("./fy.dat");
			 Desnotices1.addAll(Desnotices2) ;
		      Desnotices1.sort(c);
			 Desnotices = Desnotices1;
			  break;
		case 2:
			 Desnotices1 = noticeoperater.load("./rw.dat");
			 Desnotices2 = noticeoperater.load("./gjs.dat");
			 Desnotices1.addAll(Desnotices2) ;
		      Desnotices1.sort(c);
			  Desnotices=Desnotices1;
			  break;
		case 3:
			  Desnotices=noticeoperater.load("./rw.dat");
			  break;
		case 4:
			 Desnotices1 = noticeoperater.load("./fy.dat");
			 Desnotices2 = noticeoperater.load("./gjs.dat");
			 Desnotices1.addAll(Desnotices2) ;
		      Desnotices1.sort(c);
			 Desnotices = Desnotices1;
			  break;
		case 5:
			  Desnotices=noticeoperater.load("./fy.dat");
			  break;
		case 6:
			  Desnotices=noticeoperater.load("./gjs.dat");
			  break;
		case 7:
			 Desnotices1 = noticeoperater.load("./rw.dat");
			 Desnotices2 = noticeoperater.load("./fy.dat");
			 Desnotices3=noticeoperater.load("./gjs.dat");
		      Desnotices1.addAll(Desnotices2) ;
		      Desnotices1.addAll(Desnotices3) ;
		      Desnotices1.sort(c);
		      Desnotices = Desnotices1;
		      break;
		}
	}
	
	void getSearchList() throws IOException, Exception {
		searchList=noticeoperater.load("./schoolnotice.dat");
		searchList.addAll(noticeoperater.load("./jwc.dat"));
		searchList.addAll(noticeoperater.load("./rw.dat"));
		searchList.addAll(noticeoperater.load("./fy.dat"));
		searchList.addAll(noticeoperater.load("./gjs.dat"));
	}
	
	void showNotice(int cur1,int startIndex1) {
		this.cur = cur1;
		this.startIndex = startIndex1;
		 	title1.setText(Desnotices.get(startIndex).getTitle());
			title2.setText(Desnotices.get(startIndex+1).getTitle());
			title3.setText(Desnotices.get(startIndex+2).getTitle());
			title4.setText(Desnotices.get(startIndex+3).getTitle());
			title5.setText(Desnotices.get(startIndex+4).getTitle());
			title6.setText(Desnotices.get(startIndex+5).getTitle());
			title7.setText(Desnotices.get(startIndex+6).getTitle());
			title8.setText(Desnotices.get(startIndex+7).getTitle());
			title9.setText(Desnotices.get(startIndex+8).getTitle());
			title10.setText(Desnotices.get(startIndex+9).getTitle());
			date1.setText(Desnotices.get(startIndex).getTime());
			date2.setText(Desnotices.get(startIndex+1).getTime());
			date3.setText(Desnotices.get(startIndex+2).getTime());
			date4.setText(Desnotices.get(startIndex+3).getTime());
			date5.setText(Desnotices.get(startIndex+4).getTime());
			date6.setText(Desnotices.get(startIndex+5).getTime());
			date7.setText(Desnotices.get(startIndex+6).getTime());
			date8.setText(Desnotices.get(startIndex+7).getTime());
			date9.setText(Desnotices.get(startIndex+8).getTime());
			date10.setText(Desnotices.get(startIndex+9).getTime());
			source1.setText(Desnotices.get(startIndex).getSource());
			source2.setText(Desnotices.get(startIndex+1).getSource());
			source3.setText(Desnotices.get(startIndex+2).getSource());
			source4.setText(Desnotices.get(startIndex+3).getSource());
			source5.setText(Desnotices.get(startIndex+4).getSource());
			source6.setText(Desnotices.get(startIndex+5).getSource());
			source7.setText(Desnotices.get(startIndex+6).getSource());
			source8.setText(Desnotices.get(startIndex+7).getSource());
			source9.setText(Desnotices.get(startIndex+8).getSource());
			source10.setText(Desnotices.get(startIndex+9).getSource());
			curPage.setText(cur+"");
			allPage.setText(Desnotices.size()/10+"");
			
			
	}
	
	
	public Notice() throws Exception{
		self=this;
		//RWCollegeNoticeOperater rw=new RWCollegeNoticeOperator();//鐖彇
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(140, 80, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(this.getOwner());
		
		title1 = new JLabel("New label");
		title1.setFont(new Font("宋体", Font.PLAIN, 16));
		title1.setBounds(79, 163, 550, 20);
		contentPane.add(title1);
		
		date1 = new JLabel("New label");
		date1.setBounds(644, 162, 140, 20);
		contentPane.add(date1);
		
		source1 = new JLabel("New label");
		source1.setBounds(783, 162, 90, 20);
		contentPane.add(source1);
		
		title2 = new JLabel("New label");
		title2.setFont(new Font("宋体", Font.PLAIN, 16));
		title2.setBackground(Color.BLACK);
		title2.setBounds(79, 208, 550, 20);
		contentPane.add(title2);
		
		date2 = new JLabel("New label");
		date2.setBounds(644, 207, 140, 20);
		contentPane.add(date2);
		
		source2 = new JLabel("New label");
		source2.setBounds(783, 207, 90, 20);
		contentPane.add(source2);
		
		title3 = new JLabel("New label");
		title3.setFont(new Font("宋体", Font.PLAIN, 16));
		title3.setBounds(79, 253, 550, 20);
		contentPane.add(title3);
		
		date3 = new JLabel("New label");
		date3.setBounds(644, 252, 140, 20);
		contentPane.add(date3);
		
		source3 = new JLabel("New label");
		source3.setBounds(783, 252, 90, 20);
		contentPane.add(source3);
		
		title4 = new JLabel("New label");
		title4.setFont(new Font("宋体", Font.PLAIN, 16));
		title4.setBounds(79, 298, 550, 20);
		contentPane.add(title4);
		
		date4 = new JLabel("New label");
		date4.setBounds(644, 297, 140, 20);
		contentPane.add(date4);
		
		source4 = new JLabel("New label");
		source4.setBounds(783, 297, 90, 20);
		contentPane.add(source4);
		
		title5 = new JLabel("New label");
		title5.setFont(new Font("宋体", Font.PLAIN, 16));
		title5.setBounds(79, 343, 550, 20);
		contentPane.add(title5);
		
		date5 = new JLabel("New label");
		date5.setBounds(644, 342, 140, 20);
		contentPane.add(date5);
		
		source5 = new JLabel("New label");
		source5.setBounds(783, 342, 90, 20);
		contentPane.add(source5);
		
		
		JButton frontPage = new JButton("\u4E0A\u4E00\u9875");
		frontPage.setFont(new Font("宋体", Font.BOLD, 18));
		frontPage.setBounds(121, 644, 93, 23);
		contentPane.add(frontPage);
		
		JLabel label_15 = new JLabel("\u5F53\u524D");
		label_15.setFont(new Font("宋体", Font.BOLD, 18));
		label_15.setBounds(253, 648, 55, 15);
		contentPane.add(label_15);
		
		curPage = new JLabel("New label");
		curPage.setFont(new Font("宋体", Font.BOLD, 18));
		curPage.setBounds(308, 648, 25, 15);
		contentPane.add(curPage);
		
		JLabel label_17 = new JLabel("/\u5171");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("宋体", Font.BOLD, 18));
		label_17.setBounds(323, 648, 48, 15);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("\u9875");
		label_18.setFont(new Font("宋体", Font.BOLD, 18));
		label_18.setBounds(419, 648, 25, 15);
		contentPane.add(label_18);
		
		JButton nextPage = new JButton("\u4E0B\u4E00\u9875");
		nextPage.setFont(new Font("宋体", Font.BOLD, 18));
		nextPage.setBounds(459, 644, 93, 23);
		contentPane.add(nextPage);
		
		JLabel label_19 = new JLabel("\u9875");
		label_19.setFont(new Font("宋体", Font.BOLD, 18));
		label_19.setBounds(777, 644, 74, 19);
		contentPane.add(label_19);
		
		jumpPage = new JTextField();
		jumpPage.setColumns(10);
		jumpPage.setBounds(696, 645, 66, 21);
		contentPane.add(jumpPage);
		
		JButton jump = new JButton("\u8DF3\u8F6C\u81F3");
		jump.setFont(new Font("宋体", Font.BOLD, 18));
		jump.setBounds(588, 644, 93, 23);
		contentPane.add(jump);
		
		allPage = new JLabel(" ");
		allPage.setHorizontalAlignment(SwingConstants.CENTER);
		allPage.setFont(new Font("宋体", Font.BOLD, 18));
		allPage.setBounds(377, 648, 39, 15);
		contentPane.add(allPage);
		
		title6 = new JLabel("New label");
		title6.setFont(new Font("宋体", Font.PLAIN, 16));
		title6.setBounds(79, 388, 550, 20);
		contentPane.add(title6);
		
		title7 = new JLabel("New label");
		title7.setFont(new Font("宋体", Font.PLAIN, 16));
		title7.setBackground(Color.BLACK);
		title7.setBounds(79, 433, 550, 20);
		contentPane.add(title7);
		
		title8 = new JLabel("New label");
		title8.setFont(new Font("宋体", Font.PLAIN, 16));
		title8.setBounds(79, 479, 550, 20);
		contentPane.add(title8);
		
		title9 = new JLabel("New label");
		title9.setFont(new Font("宋体", Font.PLAIN, 16));
		title9.setBounds(79, 524, 550, 20);
		contentPane.add(title9);
		
		title10 = new JLabel("New label");
		title10.setFont(new Font("宋体", Font.PLAIN, 16));
		title10.setBounds(79, 569, 550, 20);
		contentPane.add(title10);
		
		date6 = new JLabel("New label");
		date6.setBounds(644, 387, 140, 20);
		contentPane.add(date6);
		
		date7 = new JLabel("New label");
		date7.setBounds(644, 432, 140, 20);
		contentPane.add(date7);
		
		date8 = new JLabel("New label");
		date8.setBounds(644, 478, 140, 20);
		contentPane.add(date8);
		
		date9 = new JLabel("New label");
		date9.setBounds(644, 523, 140, 20);
		contentPane.add(date9);
		
		date10 = new JLabel("New label");
		date10.setBounds(644, 568, 140, 20);
		contentPane.add(date10);
		
		source10 = new JLabel("New label");
		source10.setBounds(783, 568, 90, 20);
		contentPane.add(source10);
		
		source9 = new JLabel("New label");
		source9.setBounds(783, 523, 90, 20);
		contentPane.add(source9);
		
		source8 = new JLabel("New label");
		source8.setBounds(783, 478, 90, 20);
		contentPane.add(source8);
		
		source7 = new JLabel("New label");
		source7.setBounds(783, 432, 90, 20);
		contentPane.add(source7);
		
		source6 = new JLabel("New label");
		source6.setBounds(783, 387, 90, 20);
		contentPane.add(source6);
		
		JButton button_4 = new JButton("返回主页面");
		button_4.setFont(new Font("宋体", Font.BOLD, 18));
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				self.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
			}
		});
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_4.setBounds(404, 700, 148, 29);
		contentPane.add(button_4);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("宋体", Font.BOLD, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u5B66\u6821\u901A\u77E5", "\u5B66\u9662\u901A\u77E5", "\u6559\u52A1\u5904\u901A\u77E5"}));
		comboBox.setBounds(79, 62, 134, 27);
		contentPane.add(comboBox);
		
		searchContent = new JTextField();
		searchContent.setFont(new Font("宋体", Font.BOLD, 18));
		searchContent.setBounds(567, 62, 168, 27);
		contentPane.add(searchContent);
		searchContent.setColumns(10);
		
		JButton keywordSearch = new JButton("\u65B0\u95FB\u641C\u7D22");
		keywordSearch.setBounds(750, 61, 123, 29);
		contentPane.add(keywordSearch);
		
		JRadioButton rwButton = new JRadioButton("\u4EBA\u6587\u5B66\u9662");
		rwButton.setFont(new Font("宋体", Font.BOLD, 18));
		rwButton.setBounds(79, 101, 116, 23);
		contentPane.add(rwButton);
		
		JRadioButton gjsButton = new JRadioButton("\u7FFB\u8BD1\u5B66\u9662");
		gjsButton.setFont(new Font("宋体", Font.BOLD, 18));
		gjsButton.setBounds(197, 101, 123, 23);
		contentPane.add(gjsButton);
		
		JRadioButton fyButton = new JRadioButton("\u56FD\u9645\u5546\u5B66\u9662");
		fyButton.setFont(new Font("宋体", Font.BOLD, 18));
		fyButton.setBounds(337, 101, 127, 23);
		contentPane.add(fyButton);
		
		
		setNotice(0);
		showNotice(1,0);
		
		
		getSearchList();
		rwButton.setVisible(false);
		fyButton.setVisible(false);
		gjsButton.setVisible(false);
		searchResult = new ArrayList<>();
		keywordSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				searchResult.clear();
				System.out.println("搜索结果："+searchResult.size());
				String keyword = searchContent.getText().toString();
				System.out.println(keyword);
				if(keyword.length()==0)
					JOptionPane.showMessageDialog(null,"输入关键字不能为空", "", JOptionPane.ERROR_MESSAGE);
				else {				
					for(int i=0;i<searchList.size();i++) {
						if(searchList.get(i).getTitle().contains(keyword)||searchList.get(i).getSource().contains(keyword)
								||searchList.get(i).getTime().contains(keyword))
							searchResult.add(searchList.get(i));
					}
					if(searchResult.size()!=0) {
						for(int i=0;i<searchResult.size();i++)
							System.out.println(searchResult.get(i).getTitle()+" "+searchResult.get(i).getSource()+" "
						+searchResult.get(i).getSource());
						
					if((searchResult.size()%10)!=0)
						{
							int addItem=10-(searchResult.size()%10);
							for(int i=0;i<addItem;i++) {
								SchoolNotice item=new SchoolNotice();
								item.setContent("");
								item.setSource("");
								item.setTime("");
								item.setUrl("");
								item.setTitle("");
								searchResult.add(item);
							}
						}
				try {
						setNotice(3);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						showNotice(1,0);
					}
					System.out.println("搜索结果的大小："+searchResult.size());
				}
			}
		});
		
		frontPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(cur>1) {
					cur--;
					curPage.setText(cur+"");
					
				}
				if(startIndex>=10) {
					startIndex-=10;
					showNotice(cur,startIndex);
				}
				
				
			}
		});
		nextPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(cur<(Desnotices.size()/10)) {
					cur++;
					curPage.setText(cur+"");
					
				}
				if(startIndex<=(Desnotices.size()-20)) {
					startIndex+=10;
					showNotice(cur,startIndex);
	
				}
				
			}
		});
		
		jump.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cur =  Integer.valueOf(jumpPage.getText());
				jumpPage.setText("");
				showNotice(cur,cur-1);
				
			}
		});
		
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String item;
				item = e.getItem().toString();
				if(item == "学校通知") {
					try {
						rwButton.setVisible(false);
						fyButton.setVisible(false);
						gjsButton.setVisible(false);
						setNotice(0);
						showNotice(1,0);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				else if(item == "学院通知") {
					try {
						
						rwButton.setVisible(true);
						fyButton.setVisible(true);
						gjsButton.setVisible(true);
						setCollegeNotice(0);
						showNotice(1,0);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
				}
				else if(item == "教务处通知") {
					try {
						rwButton.setVisible(false);
						fyButton.setVisible(false);
						gjsButton.setVisible(false);
						setNotice(2);
						showNotice(1,0);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
				}
				
			}
		});
		
		title1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!title1.getText().isEmpty()) {
				UIUtils.setPreferredLookAndFeel();  
		        NativeInterface.open();         
			
		        SwingUtilities.invokeLater(new Runnable() {  
		            public void run() {
		                JFrame frame = new JFrame("通知");

		                frame.setUndecorated(false);                                      
		                frame.getContentPane().add(new Browser(Desnotices.get(startIndex).getUrl()));   
		                frame.setLocationByPlatform(true);
		                frame.setBounds(140, 80, 1000, 800);;
		                
		                frame.setLocationRelativeTo(frame.getOwner());
		                frame.setVisible(true);
		            }
		        });  
		        NativeInterface.runEventPump();  
			}
			}
		});
		title2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!title2.getText().isEmpty()) {
				UIUtils.setPreferredLookAndFeel();  
		        NativeInterface.open();         
			
		        SwingUtilities.invokeLater(new Runnable() {  
		            public void run() {
		                JFrame frame = new JFrame("通知");
		                frame.setUndecorated(false);                                      
		                frame.getContentPane().add(new Browser(Desnotices.get(startIndex+1).getUrl()));   
		                frame.setLocationByPlatform(true);
		                frame.setBounds(140, 80, 1000, 800);;
		                
		                frame.setLocationRelativeTo(frame.getOwner());
		                frame.setVisible(true);
		            }
		        });  
		        NativeInterface.runEventPump();  
			}
			}
		});
		title3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!title3.getText().isEmpty()) {
				UIUtils.setPreferredLookAndFeel();  
		        NativeInterface.open();         
			
		        SwingUtilities.invokeLater(new Runnable() {  
		            public void run() {
		                JFrame frame = new JFrame("通知");
		                frame.setUndecorated(false);                                      
		                frame.getContentPane().add(new Browser(Desnotices.get(startIndex+2).getUrl()));   
		                frame.setLocationByPlatform(true);
		                frame.setBounds(140, 80, 1000, 800);;
		                
		                frame.setLocationRelativeTo(frame.getOwner());
		                frame.setVisible(true);
		            }
		        });  
		        NativeInterface.runEventPump();  
			}
			}
		});
		title4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!title4.getText().isEmpty()) {
				UIUtils.setPreferredLookAndFeel();  
		        NativeInterface.open();         
			
		        SwingUtilities.invokeLater(new Runnable() {  
		            public void run() {
		                JFrame frame = new JFrame("通知");

		                frame.setUndecorated(false);                                      
		                frame.getContentPane().add(new Browser(Desnotices.get(startIndex+3).getUrl()));   
		                frame.setLocationByPlatform(true);
		                frame.setBounds(140, 80, 1000, 800);;
		                
		                frame.setLocationRelativeTo(frame.getOwner());
		                frame.setVisible(true);
		            }
		        });  
		        NativeInterface.runEventPump();  
			}
			}
		});
		title5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!title5.getText().isEmpty()) {
				UIUtils.setPreferredLookAndFeel();  
		        NativeInterface.open();         
			
		        SwingUtilities.invokeLater(new Runnable() {  
		            public void run() {
		                JFrame frame = new JFrame("通知");
		                frame.setUndecorated(false);                                      
		                frame.getContentPane().add(new Browser(Desnotices.get(startIndex+4).getUrl()));   
		                frame.setLocationByPlatform(true);
		                frame.setBounds(140, 80, 1000, 800);;
		                
		                frame.setLocationRelativeTo(frame.getOwner());
		                frame.setVisible(true);
		            }
		        });  
		        NativeInterface.runEventPump();  
			}
			}
		});
		title6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!title6.getText().isEmpty()) {
				UIUtils.setPreferredLookAndFeel();  
		        NativeInterface.open();         
			
		        SwingUtilities.invokeLater(new Runnable() {  
		            public void run() {
		                JFrame frame = new JFrame("通知");
		                frame.setUndecorated(false);                                      
		                frame.getContentPane().add(new Browser(Desnotices.get(startIndex+5).getUrl()));   
		                frame.setLocationByPlatform(true);
		                frame.setBounds(140, 80, 1000, 800);;
		                
		                frame.setLocationRelativeTo(frame.getOwner());
		                frame.setVisible(true);
		            }
		        });  
		        NativeInterface.runEventPump();  
			}
			}
		});
		title7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!title7.getText().isEmpty()) {
				UIUtils.setPreferredLookAndFeel();  
		        NativeInterface.open();         
			
		        SwingUtilities.invokeLater(new Runnable() {  
		            public void run() {
		                JFrame frame = new JFrame("通知");
		                frame.setUndecorated(false);                                      
		                frame.getContentPane().add(new Browser(Desnotices.get(startIndex+6).getUrl()));   
		                frame.setLocationByPlatform(true);
		                frame.setBounds(140, 80, 1000, 800);;
		                
		                frame.setLocationRelativeTo(frame.getOwner());
		                frame.setVisible(true);
		            }
		        });  
		        NativeInterface.runEventPump();  
			}
			}
		});
		title8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!title8.getText().isEmpty()) {
				UIUtils.setPreferredLookAndFeel();  
		        NativeInterface.open();         
			
		        SwingUtilities.invokeLater(new Runnable() {  
		            public void run() {
		                JFrame frame = new JFrame("通知");
		                frame.setUndecorated(false);                                      
		                frame.getContentPane().add(new Browser(Desnotices.get(startIndex+7).getUrl()));   
		                frame.setLocationByPlatform(true);
		                frame.setBounds(140, 80, 1000, 800);;
		                frame.setLocationRelativeTo(frame.getOwner());
		                frame.setVisible(true);
		            }
		        });  
		        NativeInterface.runEventPump();  
			}
			}
		});
		title9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!title9.getText().isEmpty()) {
				UIUtils.setPreferredLookAndFeel();  
		        NativeInterface.open();         
			
		        SwingUtilities.invokeLater(new Runnable() {  
		            public void run() {
		                JFrame frame = new JFrame("通知");
		                frame.setUndecorated(false);                                      
		                frame.getContentPane().add(new Browser(Desnotices.get(startIndex+8).getUrl()));   
		                frame.setLocationByPlatform(true);
		                frame.setBounds(140, 80, 1000, 800);;
		                
		                frame.setLocationRelativeTo(frame.getOwner());
		                frame.setVisible(true);
		            }
		        });  
		        NativeInterface.runEventPump();  
			}
			}
		});
		rwButton.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {   
    			if(rwButton.isSelected()) {
    				if(fyButton.isSelected()) {
    					if(gjsButton.isSelected()) {
    						try {
								setCollegeNotice(0);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    						
    					}else {
    						try {
								setCollegeNotice(1);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    					}
    				}else {
    					if(gjsButton.isSelected()) {
    						try {
								setCollegeNotice(2);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    						
    					}else {
    						try {
								setCollegeNotice(3);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    					}
    					
    				}
    			}else {
    				if(fyButton.isSelected()) {
    					if(gjsButton.isSelected()) {
    						try {
								setCollegeNotice(4);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    						
    					}else {
    						try {
								setCollegeNotice(5);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    					}
    				}else {
    					if(gjsButton.isSelected()) {
    						try {
								setCollegeNotice(6);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    						
    					}else {
    						try {
								setCollegeNotice(7);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    					}
    					
    				}
    				
    			}
    			showNotice(1,0);
    		}
    });
		gjsButton.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {   
    			if(rwButton.isSelected()) { 
    				if(fyButton.isSelected()) {
    					if(gjsButton.isSelected()) {
    						try {
								setCollegeNotice(0);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    						
    					}else {
    						try {
								setCollegeNotice(1);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    					}
    				}else {
    					if(gjsButton.isSelected()) {
    						try {
								setCollegeNotice(2);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    						
    					}else {
    						try {
								setCollegeNotice(3);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    					}
    					
    				}
    			}else {
    				if(fyButton.isSelected()) {
    					if(gjsButton.isSelected()) {
    						try {
								setCollegeNotice(4);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    						
    					}else {
    						try {
								setCollegeNotice(5);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    					}
    				}else {
    					if(gjsButton.isSelected()) {
    						try {
								setCollegeNotice(6);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    						
    					}else {
    						try {
								setCollegeNotice(7);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    					}
    					
    				}
    				
    			}
    			showNotice(1,0);
    		}
    });
		fyButton.addActionListener(new ActionListener() { 
    		@Override
    		public void actionPerformed(ActionEvent e) {   
    			if(rwButton.isSelected()) { 
    				if(fyButton.isSelected()) {
    					if(gjsButton.isSelected()) {
    						try {
								setCollegeNotice(0);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    						
    					}else {
    						try {
								setCollegeNotice(1);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    					}
    				}else {
    					if(gjsButton.isSelected()) {
    						try {
								setCollegeNotice(2);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    						
    					}else {
    						try {
								setCollegeNotice(3);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    					}
    					
    				}
    			}else {
    				if(fyButton.isSelected()) {
    					if(gjsButton.isSelected()) {
    						try {
								setCollegeNotice(4);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    						
    					}else {
    						try {
								setCollegeNotice(5);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    					}
    				}else {
    					if(gjsButton.isSelected()) {
    						try {
								setCollegeNotice(6);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    						
    					}else {
    						try {
								setCollegeNotice(7);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
    						showNotice(1,0);
    						
    					}
    					
    				}
    				
    			}
    			showNotice(1,0);
    		}
    		
    });
		title10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!title10.getText().isEmpty()) {
				UIUtils.setPreferredLookAndFeel();  
		        NativeInterface.open();         
			
		        SwingUtilities.invokeLater(new Runnable() {  
		            public void run() {
		                JFrame frame = new JFrame("通知");
		                frame.setUndecorated(false);                                      
		                frame.getContentPane().add(new Browser(Desnotices.get(startIndex+9).getUrl()));   
		                frame.setLocationByPlatform(true);
		                frame.setBounds(140, 80, 1000, 800);;
		          
		                frame.setLocationRelativeTo(frame.getOwner());
		                frame.setVisible(true);
		            }
		        });  
		        NativeInterface.runEventPump();  
			}
			}
		});
	}
}
