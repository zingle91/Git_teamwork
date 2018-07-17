package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;
import java.awt.FlowLayout;

public class Manager_Sbj extends JPanel {
	JButton b_register, b_update, b_delete,b_logout;
	TableModel tm;
	JScrollPane sp;
	MainView mv;
	ManagerView mv2;
	private JTable table_Sbj;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	/**
	 * Create the panel.
	 */

	// 화면 설계
	public void addLayout() {
		JPanel sbjPanel = new JPanel();
		JPanel panel_cen = new JPanel();
		tm = new TableModel();
		table_Sbj = new JTable();
		JPanel panel_manage = new JPanel();
		JPanel panel = new JPanel();
		JLabel lblNewLabel = new JLabel("학수번호");
		textField = new JTextField();
		JLabel lblNewLabel_1 = new JLabel("과목명");
		JLabel lblNewLabel_2 = new JLabel("학점");
		JLabel lblNewLabel_3 = new JLabel("학과");
		JLabel label = new JLabel("교수");
		textField_3 = new JTextField();
		textField_1 = new JTextField();
		textField_2 = new JTextField();
		JPanel panel_1 = new JPanel();
		textField_4 = new JTextField();
		JLabel label_1 = new JLabel("장소");
		textField_5 = new JTextField();
		JLabel label_2 = new JLabel("시작시간");
		textField_6 = new JTextField();
		JLabel label_3 = new JLabel("종료시간");
		JLabel label_4 = new JLabel("구분");
		JPanel panel_2 = new JPanel();
		setLayout(new GridLayout(0, 1, 0, 0));


		add(sbjPanel);
		sbjPanel.setLayout(new BorderLayout(0, 0));




		sbjPanel.add(panel_cen, BorderLayout.CENTER);
		panel_cen.setLayout(new GridLayout(2, 1, 0, 0));
		textField_7 = new JTextField();



		// table


		table_Sbj.setModel(tm);
		sp = new JScrollPane(table_Sbj);
		panel_cen.add(sp);




		panel_cen.add(panel_manage);
		panel_manage.setLayout(new GridLayout(3, 1, 0, 0));


		panel_manage.add(panel);
		panel.setLayout(new GridLayout(2, 4, 0, 0));


		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);


		panel.add(textField);
		textField.setColumns(10);


		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);


		panel.add(textField_1);
		textField_1.setColumns(10);


		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);


		panel.add(textField_2);
		textField_2.setColumns(10);


		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3);


		panel.add(textField_3);
		textField_3.setColumns(10);


		panel_manage.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 4, 0, 0));


		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label);


		textField_4.setColumns(10);
		panel_1.add(textField_4);


		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label_1);


		textField_5.setColumns(10);
		panel_1.add(textField_5);


		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label_2);


		textField_6.setColumns(10);
		panel_1.add(textField_6);


		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label_3);


		textField_7.setColumns(10);
		panel_1.add(textField_7);


		panel_manage.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 4, 0, 0));


		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_4);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		panel_2.add(textField_8);

		JLabel label_5 = new JLabel("정원");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_5);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel_2.add(textField_9);

		JLabel label_6 = new JLabel("개설학기");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_6);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		panel_2.add(textField_10);

		JPanel panel_south = new JPanel();
		sbjPanel.add(panel_south, BorderLayout.SOUTH);
		panel_south.setLayout(new GridLayout(0, 4, 0, 0));

		b_register = new JButton("등록");
		panel_south.add(b_register);

		b_update = new JButton("수정");
		panel_south.add(b_update);

		b_delete = new JButton("삭제");
		panel_south.add(b_delete);
		
		b_logout = new JButton("로그아웃");
		panel_south.add(b_logout);


	}

	public Manager_Sbj(MainView m, ManagerView m2) {
		// mv = MainView 주소, mv2 = ManagerView 주소
		mv = m;
		mv2 = m2;
		addLayout();
		eventProc();
	}
	public void eventProc() {
		EvtHdlr hdlr = new EvtHdlr();
		b_logout.addActionListener(hdlr);
		
	}
	
	// 로그아웃
	public void logout() {
		mv.setVisible(true);
		mv2.setVisible(false);
		
	}
	
	class EvtHdlr implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object btn = e.getSource();
			// 학번 입력하고 로그인 누름
			if(btn == b_logout) {
				logout();
			
			
			}
			
		}
		
	}

	class TableModel extends AbstractTableModel { 

		ArrayList data = new ArrayList();
		String [] columnNames = {"학수번호","과목명","학점","학과","교수","장소","시작시간","종료시간","구분","정원","개설학기"};

		//=============================================================
		// 1. 기본적인 TabelModel  만들기
		// 아래 세 함수는 TabelModel 인터페이스의 추상함수인데
		// AbstractTabelModel에서 구현되지 않았기에...
		// 반드시 사용자 구현 필수!!!!

		public int getColumnCount() { 
			return columnNames.length; 
		} 

		public int getRowCount() { 
			return data.size(); 
		} 

		public Object getValueAt(int row, int col) { 
			ArrayList temp = (ArrayList)data.get( row );
			return temp.get( col ); 
		}

		public String getColumnName(int col){
			return columnNames[col];
		}
	}

}
