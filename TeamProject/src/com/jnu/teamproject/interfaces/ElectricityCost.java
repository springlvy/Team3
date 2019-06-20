package com.jnu.teamproject.interfaces;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.log4j.Logger;

import com.jnu.teamproject.data.GetPythonData;
import com.jnu.teamproject.data.Save;
import com.jnu.teamproject.data.Serialization;
import com.jnu.teamproject.data.UserInfo;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

//-Dfile.encoding=GB18030
public class ElectricityCost extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame self;
	private JPanel contentPane;
	private JTable useElecTable;
	private JLabel elecText;
	private String[] elecCost=new String[6];
	private String room;
	
	static Logger logger = Logger.getLogger(ElectricityCost.class);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElectricityCost frame = new ElectricityCost();
					frame.setVisible(true);
				} catch (Exception e) {
					logger.error(e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ElectricityCost() {
        UserInfo user=new UserInfo();
		user=Serialization.read();
		room=user.getDorm();
		
		self=this;
		setTitle("暨南大学自主软件系统——电费查询");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(140, 80, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        // 设置窗体居中显示
        this.setLocationRelativeTo(this.getOwner());
		
		JLabel roomText = new JLabel("\u5BBF\u820D\u53F7\uFF1A"+room);
		roomText.setFont(new Font("宋体", Font.BOLD, 18));
		roomText.setBounds(59, 89, 169, 32);
		contentPane.add(roomText);
		
		elecText = new JLabel("\u5269\u4F59\u7528\u7535\u91CF\uFF1A156.31\u5EA6");
		elecText.setFont(new Font("宋体", Font.BOLD, 18));
		elecText.setBounds(59, 156, 266, 32);
		contentPane.add(elecText);
		elecText.setText("剩余电量：（请点击查询）");
		
		JButton setRoomButton = new JButton("\u91CD\u65B0\u7ED1\u5B9A");
		setRoomButton.setFont(new Font("宋体", Font.BOLD, 18));
		setRoomButton.setBackground(UIManager.getColor("Button.background"));
		setRoomButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String new_Room=null;
				logger.info("用户绑定新宿舍号中...");
				new_Room=JOptionPane.showInputDialog("请输入新宿舍号：");
				if(new_Room!=null)
				{
					roomText.setText("宿舍号："+new_Room);
					room=new_Room;
					logger.info("用户绑定新宿舍号成功...");
				}
			}
		});
		setRoomButton.setBounds(423, 86, 129, 35);
		contentPane.add(setRoomButton);
		
		JLabel useElecText = new JLabel("\u7528\u7535\u60C5\u51B5\uFF1A");
		useElecText.setFont(new Font("宋体", Font.BOLD, 18));
		useElecText.setBounds(59, 223, 137, 38);
		contentPane.add(useElecText);
		
		useElecTable = new JTable();
		useElecTable.setRowHeight(25);
		useElecTable.setBorder(new LineBorder(new Color(0, 0, 0)));
		useElecTable.setFont(new Font("宋体", Font.BOLD, 18));
		useElecTable.setEnabled(false);
		useElecTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u65E5\u671F", "\u7528\u7535\u91CF\uFF08\u5EA6\uFF09", "\u7528\u7535\u91D1\u989D\uFF08\u5143\uFF09"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Date", "UseElecNum", "Cost"
			}
		));
		useElecTable.setBounds(155, 327, 667, 200);
		contentPane.add(useElecTable);
		
		JButton backButton = new JButton("\u8FD4\u56DE");
		backButton.setFont(new Font("宋体", Font.BOLD, 18));
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logger.info("用户从电费返回主界面...");
				self.setVisible(false);
				Main main=new Main();
				main.setVisible(true);
			}
		});
		backButton.setBounds(406, 627, 129, 35);
		contentPane.add(backButton);
		
		JButton GetElecButton = new JButton("\u67E5\u8BE2");
		GetElecButton.setFont(new Font("宋体", Font.BOLD, 18));
		GetElecButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("zzz:"+room);
					logger.info("用户点击查询电费...");
					if(room!=null&&room.length()==4)
						elecCost=GetPythonData.getElecCost(room);
					else
						JOptionPane.showMessageDialog(null, "未绑定宿舍号，请先绑定");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					logger.error(e1);
				}
				if(room!=null&&room.length()==4)
				{
					elecText.setText(elecCost[0]);
					String [] line_one=elecCost[1].split("   ");
					String [] line_two=elecCost[2].split("   ");
					String [] line_three=elecCost[3].split("   ");
					String [] line_four=elecCost[4].split("   ");
					String [] line_five=elecCost[5].split("   ");
					useElecTable.setModel(new DefaultTableModel(
							new Object[][] {
								{"\u65E5\u671F", "\u7528\u7535\u91CF\uFF08\u5EA6\uFF09", "\u7528\u7535\u91D1\u989D\uFF08\u5143\uFF09"},
								{line_one[0], line_one[1], line_one[2]},
								{line_two[0], line_two[1], line_two[2]},
								{line_three[0], line_three[1], line_three[2]},
								{line_four[0], line_four[1], line_four[2]},
								{line_five[0], line_five[1], line_five[2]},
								{null, null, null},
								{null, null, null},
								{null, null, null},
								{null, null, null},
								{null, null, null},
								{null, null, null},
								{null, null, null},
								{null, null, null},
								{null, null, null},
						},
						new String[] {
							"Date", "UseElecNum", "Cost"
						}
					));
				}
			}
		});
		GetElecButton.setBounds(423, 155, 129, 35);
		contentPane.add(GetElecButton);
	}
}
