package com.kh.escape;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPage extends JPanel {
	private MainFrame mf;
	private JPanel panel;
	
	ImageIcon i = new ImageIcon("images/intro.png");
	Image im = i.getImage().getScaledInstance(1200, 700, 0);
	
	ImageIcon i1 = new ImageIcon("images/start.png");
	Image im1 = i1.getImage().getScaledInstance(200, 100, 0);
	
	public StartPage(MainFrame mf){
		this.mf = mf;
		this.setLayout(null);
		
		panel = this;
		
		JLabel label = new JLabel(new ImageIcon(im));
		label.setBounds(0, 0, 1200, 700);
		
		JLabel start = new JLabel(new ImageIcon(im1));
		start.setBounds(180, 550, 200, 100);
		
		start.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel cp = new ChangePanel(mf, panel);	//changePanel객체생성
				MainPage gp = new MainPage(mf);					//mainpage 객체생성
				
				cp.replacePanel(gp);							//replacePanel메소드에 mainPage객체 전달 
			}
		});
		this.add(label);										//startpage 패널에 배경이미지 label add
		this.add(start);										//startpage 패널에 스타트버튼 label add
		
		this.setComponentZOrder(label, 1);
		this.setSize(1200,700);									//startpage 패널사이즈
		
		/*JButton button = new JButton("Start");
		button.setSize(50,50);
		button.setLocation(930, 330);
		
		this.add(button);*/
		
		/*button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MainPage(mf);
							
			}
		});*/
		
		mf.add(this);
			
	}
	
	/*public void paint(Graphics g){
		//super.paint(g);
		g.drawImage(im, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
	}*/
}
