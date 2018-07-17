package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;

public class StdView extends JFrame {

	private JPanel mPane;
	MainView parent;

	

	/**
	 * Create the frame.
	 */
	public StdView(String sNum, MainView p) {
		// MainView 주소를 parent에 넘김
		parent = p;
		// 로그인 시 입력한 학번 : sNum
		// if 있는 학번 -> 아래 내용
		// if 없는 학번 -> exit
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		mPane = new JPanel();
		mPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mPane);
		mPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane tab_Std = new JTabbedPane(JTabbedPane.TOP);
		
		mPane.add(tab_Std);
		
		JPanel register = new JPanel();
		tab_Std.addTab("수강 신청", null, register, null);
		
		JPanel panel_1 = new JPanel();
		tab_Std.addTab("신청 내역", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tab_Std.addTab("수강내역조회", null, panel_2, null);
		setSize(1000,600);
	}

}
