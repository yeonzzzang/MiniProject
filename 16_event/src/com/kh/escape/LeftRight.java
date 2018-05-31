package com.kh.escape;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LeftRight extends JPanel{
	private MainFrame mf;
	private MainPage mp;
	private JPanel panel;
	
	ImageIcon i = new ImageIcon("images/left.png");
	Image im = i.getImage().getScaledInstance(100, 100, 0);
	
	ImageIcon i1 = new ImageIcon("images/right.png");
	Image im1 = i1.getImage().getScaledInstance(100, 100, 0);
	
	ImageIcon i2 = new ImageIcon("images/menu.png");
	Image im2 = i2.getImage().getScaledInstance(100, 50, 0);
	
	public LeftRight(MainFrame mf){
		this.mf = mf;
		//this.mp=mf2;
		this.setLayout(null);
		panel=this;
		
		SimpleDialog dd = new SimpleDialog();
		dd.Dialog2(mf);
		
		JLabel label = new JLabel(new ImageIcon(im));
		JLabel label1 = new JLabel(new ImageIcon(im1));
		JLabel label2 = new JLabel(new ImageIcon(im2));
		
		label.setBounds(30, 528, 100, 100);
		label1.setBounds(1050, 528, 100, 100);
		label2.setBounds(1050, 30, 100, 50);
		
		label.setOpaque(true);
		label1.setOpaque(true);
		label2.setOpaque(true);
		
		this.setBackground(new Color(255,0,0,0));
		
		this.add(label);
		this.add(label1);
		this.add(label2);
		
		this.setSize(1200,700);
		
		mf.add(this);
		
		label2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dd.setVisible(true);
			}
		});
		
		/*JButton button = new JButton(new ImageIcon(im));
		JButton button1 = new JButton(new ImageIcon(im1));
		JButton button2 = new JButton("Menue");
		
		button.setSize(100,100);
		button1.setSize(100,100);
		button2.setSize(100,50);
		
		button.setOpaque(true);
		button1.setOpaque(true);
		button2.setOpaque(true);
		
		button.setLocation(30, 528);
		button1.setLocation(1050, 528);
		button2.setLocation(1050,30);
		
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setFocusPainted(false);
		button1.setBorderPainted(false);
		button1.setContentAreaFilled(false);
		button1.setFocusPainted(false);
		
		this.add(button);
		this.add(button1);
		this.add(button2);*/
		
		//JDialog sd = new MenueDialog(mf, "Menue");
		
		
		/*button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dd.setVisible(true);
				
			}
		});*/
		
		
	}
	

}
