package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField tfStdnum;
	
	JButton login, admin;


	/**
	 * Create the frame.
	 */
	public MainView() {
		
		// 화면설계
		setResizable(false);
		setTitle("University");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "\uC0AC\uC6A9\uC790 \uC778\uC99D", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\uD559\uC0DD", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		
		
		// 학번 입력 textfield
		tfStdnum = new JTextField();
		panel.add(tfStdnum);
		tfStdnum.setColumns(10);
		
		// 입력된 학번을 가지고 로그인 하는 버튼
		login = new JButton("로그인");
		panel.add(login);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\uAD00\uB9AC\uC790", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1);
		
		admin = new JButton("관리자로 로그인");
		panel_1.add(admin);
		
		
		
		// 이벤트
		eventProc();
	}

	// Univ_Main 가리기
	public void semiclose() {
		setVisible(false);
	}
	
	// 학생 로그인 및 관리자 로그인 이벤트
	public void eventProc() {
		EvtHdlr hdlr = new EvtHdlr();
		login.addActionListener(hdlr);
		admin.addActionListener(hdlr);
	}
	
	// StdView 생성 메소드
	public void createStdView() {
		String sNum = null;
		sNum = tfStdnum.getText();
		// StdView 생성 시 학번, MainView 클래스 주소를 인자로 넘김
		StdView frame = new StdView(sNum,this);
		frame.setVisible(true);
		JOptionPane.showMessageDialog(null,"입력한 학번 : " + sNum);
	}
	
	public void createManagerView() {
		ManagerView frame = new ManagerView(this);
		frame.setVisible(true);
		JOptionPane.showMessageDialog(null,"관리 모드 진입");
	}
	
	class EvtHdlr implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object btn = e.getSource();
			// 학번 입력하고 로그인 누름
			if(btn == login) {
				semiclose();
				createStdView();
			
			
			}else if(btn == admin) {
				semiclose();
				createManagerView();
				
			}
			
		}
		
	}
	

}
