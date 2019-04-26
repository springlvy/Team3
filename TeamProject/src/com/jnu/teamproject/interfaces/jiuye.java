package com.jnu.teamproject.interfaces;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class jiuye extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jiuye frame = new jiuye();
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
	public jiuye() {
		setTitle("\u66A8\u5357\u5927\u5B66\u81EA\u4E3B\u8F6F\u4EF6\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		JButton btnNewButton = new JButton("就业管理");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("https://career.jnu.edu.cn/eweb/jygl/jygl.so"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		btnNewButton.setBounds(10, 78, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("招聘服务");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("https://career.jnu.edu.cn/eweb/jygl/zpfw.so"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(119, 78, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("就业指导");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("http://jnu.njcedu.com/"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(226, 78, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("创业教育");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("https://cyxy.jnu.edu.cn/"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(342, 78, 97, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("下载中心");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("https://career.jnu.edu.cn/eweb/jygl/jygl.so?modcode=jygl_jyglxgxz&subsyscode=jygl&type=searchNews&newsType=xgxz"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(460, 78, 97, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("images/logo-index.jpg"));
		
		lblNewLabel.setBounds(10, 10, 532, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("images/a.jpg"));
		lblNewLabel_1.setBounds(0, 130, 624, 228);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("http://jnu.njcedu.com/"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("images/1.jpg"));
		lblNewLabel_2.setBounds(10, 388, 190, 41);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("https://career.jnu.edu.cn/eweb/jygl/jygl.so?modcode=jygl_jygldfzc&subsyscode=jygl&type=view&id=D2rphYyFpJVvUZqREgXADN"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("images/2.jpg"));
		lblNewLabel_3.setBounds(210, 388, 190, 41);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("https://career.jnu.edu.cn/eweb/jygl/jygl.so?modcode=jygl_jygldfzc&subsyscode=jygl&type=view&id=BP1Kz2fhAAcasfxpGbUgE"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon("images/3.jpg"));
		lblNewLabel_4.setBounds(421, 385, 181, 46);
		contentPane.add(lblNewLabel_4);
		
		
	
		
		
	}
}
