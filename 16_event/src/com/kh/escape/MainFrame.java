package com.kh.event.ex;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame(){
	
		//new MainPage(this);
		this.add(new StartPage(this));	//JFrame에 StartPage클래스 넣어서 실행
		
		this.setSize(1200,700);			//JFrame 사이즈
		this.setTitle("CanUEscape");	//JFrame 타이틀
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
