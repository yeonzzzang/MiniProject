package com.kh.event.ex;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame(){
	
		//new MainPage(this);
		this.add(new StartPage(this));	//JFrame�� StartPageŬ���� �־ ����
		
		this.setSize(1200,700);			//JFrame ������
		this.setTitle("CanUEscape");	//JFrame Ÿ��Ʋ
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
