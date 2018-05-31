package com.kh.escape;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainPage extends JPanel /*implements MouseListener*/{
	private MainFrame mf;
	private JScrollPane sp;
	private JPanel panel;
	ImageIcon i = new ImageIcon("images/1번방.jpg");
	Image im = i.getImage().getScaledInstance(1200, 700, 0);
	
	ImageIcon i1 = new ImageIcon("images/1힌트.jpg");
	Image im1 = i1.getImage().getScaledInstance(50, 50, 0);
	
	ImageIcon i2 = new ImageIcon("images/1문제.png");
	Image im2 = i2.getImage().getScaledInstance(500, 500, 0);
	
	
	public MainPage(MainFrame mf){
		LeftRight lr = new LeftRight(mf);
		this.mf = mf;
		this.setLayout(null);
		panel = this;
		
		JLabel label = new JLabel(new ImageIcon(im));
		label.setBounds(0, 0, 1200, 700);
		
		JLabel label1 = new JLabel(new ImageIcon(im1));
		label1.setBounds(930, 330, 50, 50);
		
		this.add(lr);
		this.add(label1);
		this.add(label);
		
		label.setOpaque(true);
		label1.setOpaque(true);
		
		this.setSize(1200,700);
		mf.add(this);
		
		SimpleDialog dd = new SimpleDialog();
		dd.Dialog1(mf);
		
		label1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dd.setVisible(true);
			}
		});
		
		/*JButton button = new JButton(new ImageIcon(im1));
		
		button.setSize(50,50);
		button.setLocation(930, 330);
		//button.setBounds(952, 364, 10, 10);
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setFocusPainted(false);
		button.setOpaque(true);
		this.add(button);*/
		
		/*sp = new JScrollPane(this);
		mf.setContentPane(sp);*/
	
		//mf.add(new LeftRight(mf));
		//new LeftRight(mf);
		//this.setBackground(Color.BLUE);
		
		//JLabel label = new JLabel(new ImageIcon(im));
		
		//JDialog sd = new SimpleDialog(mf, "Simple Dialog");
		
		/*JDialog sd = new JDialog();
		sd.add(mf,"simple Dialog");*/
		//sd.setBounds(200, 500, 500, 500);
		//JLabel label = new JLabel(new ImageIcon(im2));
		//sd.add(label);
		
		//this.add(label);	
		
		//mf.paint(g);
		//mf.add(label);
		
		/*button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dd.setVisible(true);
				
			}
		});*/
		
	}
	
	
	/*public void paint(Graphics g){
		//super.paint(g);
		g.drawImage(im, 0, 0,getWidth(),getHeight(),this);
		setOpaque(false);
		this.repaint();
		//setOpaque(true);
		
	}*/
		
}
