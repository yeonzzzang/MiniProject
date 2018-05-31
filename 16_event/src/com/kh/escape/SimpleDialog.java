package com.kh.escape;

import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class SimpleDialog extends JDialog implements ActionListener {
	JPanel panel;
	JLabel label;
	JButton button;
	
	ImageIcon i2 = new ImageIcon("images/¹®Á¦1.png");
	Image im2 = i2.getImage().getScaledInstance(200, 200, 0);
	
	public SimpleDialog() {
		//super(mf,s,true);
		/*panel = new JPanel();
		panel.setLayout(null);
		
		
		label = new JLabel("ex");
		panel.add(label);
		button = new JButton("Enter");
		button.setSize(200,100);
		this.add(panel);
		//this.add(button);
		button.addActionListener(this);
		this.setSize(500,500);*/
	}
	
	public void Dialog1(JFrame mf){
		this.setTitle("ex");
		this.setLayout(null);
			
		label = new JLabel(new ImageIcon(im2));
		label.setSize(200,200);
		
		button = new JButton("Enter");
		button.setLocation(280, 200);
		button.setSize(80,50);
		
		SpinnerModel numberModel = new SpinnerNumberModel(1,0,45,1);
		JSpinner spinner2 = new JSpinner(numberModel);
		
		panel = new JPanel();
		panel.setSize(300,300);
		
		
		panel.add(label);
		panel.add(spinner2);
		
		this.add(panel,"West");
		this.add(button);
		button.addActionListener(this);
		this.setSize(400,400);
	}
	
	public void Dialog2(JFrame mf){
		JPanel panel;
		JButton button;
		JButton button1;
		
		this.setTitle("Menue");
		panel = new JPanel();
		
		button = new JButton("sound");
		button1 = new JButton("pluse");
		
		button.setSize(200,100);
		button1.setSize(200,100);
		
		button.setLocation(500, 300);
		button1.setLocation(500,400);
		
		panel.add(button);
		panel.add(button1);
		
		this.add(panel);
		this.setSize(300,300);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		
	}

}
