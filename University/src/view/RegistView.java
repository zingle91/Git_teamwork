package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import vo.SubjectVO;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;


/*
 * 수강신청페이지
 */
public class RegistView extends JPanel {
	JPanel west,east,west_center,west_south, west_south1,west_south2,east_north,east_north1,east_north2,
	east_center,society,engineering,art,culture; 
	JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_4,lblNewLabel_3,lblNewLabel_2,lblNewLabel_6,lblNewLabel_7,lblNewLabel_8;
	JTextField tf0_0,tf0_1,tf0_2,tf1_0,tf1_1,tf1_2,tf2_0,tf2_1,tf2_2,tf3_0,tf3_1,tf3_2;

	JTabbedPane tabbedPane;

	JButton society_btn1,society_btn2,engineering_btn1,engineering_btn2,art_btn1,art_btn2,culture_btn1,culture_btn2,
	confirmBtn,scoreSearchBtn,logoutBtn,plusbtn;

	JTable avaiSubTable;

	avaiSubModel avaiModel;
	registListModel registModel;

	public RegistView() {
		setLayout(new GridLayout(1, 2, 0, 0)); //전체 1행2열(왼쪽,오른쪽영역)

		west = new JPanel();
		add(west);
		west.setLayout(new BorderLayout(0, 0));

		west_center = new JPanel();
		west.add(west_center, BorderLayout.CENTER);

		registModel=new registListModel();

		west_south = new JPanel();
		west_south.setBorder(new TitledBorder(null, "\uC774\uC218\uD559\uC810", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		west.add(west_south, BorderLayout.SOUTH);
		west_south.setLayout(new GridLayout(2, 1, 0, 0));

		west_south1 = new JPanel();
		west_south.add(west_south1);
		west_south1.setLayout(new GridLayout(5, 4, 0, 0));

		lblNewLabel = new JLabel("구분");
		west_south1.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("전체");
		west_south1.add(lblNewLabel_1);

		lblNewLabel_4 = new JLabel("이수");
		west_south1.add(lblNewLabel_4);

		lblNewLabel_3 = new JLabel("남은학점");
		west_south1.add(lblNewLabel_3);

		lblNewLabel_6 = new JLabel("종합");
		west_south1.add(lblNewLabel_6);

		tf0_0 = new JTextField();
		west_south1.add(tf0_0);
		tf0_0.setColumns(10);

		tf0_1 = new JTextField();
		west_south1.add(tf0_1);
		tf0_1.setColumns(10);

		tf0_2 = new JTextField();
		west_south1.add(tf0_2);
		tf0_2.setColumns(10);

		lblNewLabel_2 = new JLabel("전공");
		west_south1.add(lblNewLabel_2);

		tf1_0 = new JTextField();
		west_south1.add(tf1_0);
		tf1_0.setColumns(10);

		tf1_1 = new JTextField();
		west_south1.add(tf1_1);
		tf1_1.setColumns(10);

		tf1_2 = new JTextField();
		west_south1.add(tf1_2);
		tf1_2.setColumns(10);

		lblNewLabel_7 = new JLabel("영어");
		west_south1.add(lblNewLabel_7);

		tf2_0 = new JTextField();
		west_south1.add(tf2_0);
		tf2_0.setColumns(10);

		tf2_1 = new JTextField();
		west_south1.add(tf2_1);
		tf2_1.setColumns(10);

		tf2_2 = new JTextField();
		west_south1.add(tf2_2);
		tf2_2.setColumns(10);

		lblNewLabel_8 = new JLabel("교양");
		west_south1.add(lblNewLabel_8);

		tf3_0 = new JTextField();
		west_south1.add(tf3_0);
		tf3_0.setColumns(10);

		tf3_1 = new JTextField();
		west_south1.add(tf3_1);
		tf3_1.setColumns(10);

		tf3_2 = new JTextField();
		west_south1.add(tf3_2);
		tf3_2.setColumns(10);

		west_south2 = new JPanel();
		west_south.add(west_south2);
		west_south2.setLayout(new GridLayout(0, 3, 0, 0));

		scoreSearchBtn = new JButton("학점조회");
		west_south2.add(scoreSearchBtn);

		confirmBtn = new JButton("수강신청");
		confirmBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		west_south2.add(confirmBtn);

		logoutBtn = new JButton("로그아웃");
		west_south2.add(logoutBtn);

		east = new JPanel();
		add(east);
		east.setLayout(new BorderLayout(0, 0));

		east_north = new JPanel();
		east.add(east_north, BorderLayout.NORTH);
		east_north.setLayout(new GridLayout(0, 1, 0, 0));

		//단과대,학과 선택
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		east_north.add(tabbedPane);

		society = new JPanel();
		tabbedPane.addTab("사회대", null, society, null);
		society_btn1 = new JButton("국어국문학과");
		society.add(society_btn1);
		society_btn2 = new JButton("영어영문학과");
		society.add(society_btn2);

		engineering = new JPanel();
		tabbedPane.addTab("공과대", null, engineering, null);
		engineering_btn1 = new JButton("기계공학과");
		engineering.add(engineering_btn1);
		engineering_btn2 = new JButton("컴퓨터공학과");
		engineering.add(engineering_btn2);

		art = new JPanel();
		tabbedPane.addTab("예술대", null, art, null);	
		art_btn1 = new JButton("디자인학과");
		art.add(art_btn1);
		art_btn2 = new JButton("동양화과");
		art.add(art_btn2);

		culture = new JPanel();
		tabbedPane.addTab("인문대", null, culture, null);
		culture_btn1 = new JButton("영어영문학과");
		culture.add(culture_btn1);
		culture_btn2 = new JButton("국어국문학과");
		culture.add(culture_btn2);

		//신청가능과목
		east_center = new JPanel();
		east_center.setToolTipText("");
		east_center.setBorder(new TitledBorder(null, "\uC2E0\uCCAD\uAC00\uB2A5\uACFC\uBAA9", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		east.add(east_center, BorderLayout.CENTER);

		avaiModel=new avaiSubModel();
		avaiSubTable = new JTable(avaiModel);
		east_center.add(new JScrollPane(avaiSubTable));

		eventProc();
	}
	public void eventProc() {
		ButtonEventHandler btnHandler = new ButtonEventHandler();
		// 이벤트 등록
		society_btn1.addActionListener(btnHandler);
		society_btn2.addActionListener(btnHandler);
		engineering_btn1.addActionListener(btnHandler);
		engineering_btn2.addActionListener(btnHandler);
		art_btn1.addActionListener(btnHandler);
		art_btn2.addActionListener(btnHandler);
		culture_btn1.addActionListener(btnHandler);
		culture_btn2.addActionListener(btnHandler);
	}

	class ButtonEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			Object o = ev.getSource();
			//	SubjectVO sub=new SubjectVO();

			if(o==society_btn1){  
				//avaiModel.data=data;
				avaiSubTable.setModel(avaiModel);
				avaiModel.fireTableDataChanged(); 
			}
			else if(o==society_btn2){ 
				//avaiModel.data=data;
				avaiSubTable.setModel(avaiModel);
				avaiModel.fireTableDataChanged(); 
			}			
			else  if(o==engineering_btn1){ 
				//avaiModel.data=data;
				avaiSubTable.setModel(avaiModel);
				avaiModel.fireTableDataChanged();
			}
			else if(o==engineering_btn2){  
				//avaiModel.data=data;
				avaiSubTable.setModel(avaiModel);
				avaiModel.fireTableDataChanged(); 
			}
			else if(o==engineering_btn2){
				//avaiModel.data=data;
				avaiSubTable.setModel(avaiModel);
				avaiModel.fireTableDataChanged(); 
			}
			else if(o==art_btn1){ 
				//avaiModel.data=data;
				avaiSubTable.setModel(avaiModel);
				avaiModel.fireTableDataChanged(); 
			}
			else if(o==art_btn2){ 
				//avaiModel.data=data;
				avaiSubTable.setModel(avaiModel);
				avaiModel.fireTableDataChanged(); 
			}else if(o==culture_btn1){  
				//avaiModel.data=data;
				avaiSubTable.setModel(avaiModel);
				avaiModel.fireTableDataChanged(); 
			}else if(o==culture_btn2) {
				//avaiModel.data=data;
				avaiSubTable.setModel(avaiModel);
				avaiModel.fireTableDataChanged(); 
			}
		}
	}

	//테이블 모델
	class avaiSubModel extends AbstractTableModel{
		String[] colName = {"학수번호","강좌명","강의시간","정원","교수명","학점","신청"};
		ArrayList data=new ArrayList(); //과목의 각 컬럼들 가져오기

		public int getColumnCount() {
			return colName.length;
		}
		public int getRowCount() {
			return data.size();
		}
		public Object getValueAt(int row, int col) {
			ArrayList temp=(ArrayList)data.get(row);
			return temp.get(col);
		}//End 필수오버라이딩

		//내가설정한 이름으로 속성이름 설정하기
		public String getColumnName(int col) {
			return colName[col];
		}
	}
	class registListModel extends AbstractTableModel{
		String[] colName = {"학수번호","강좌명","강의시간","정원","교수명","학점","신청"};
		ArrayList data=new ArrayList(); //과목의 각 컬럼들 가져오기

		public int getColumnCount() {
			return colName.length;
		}
		public int getRowCount() {
			return data.size();
		}
		public Object getValueAt(int row, int col) {
			ArrayList temp=(ArrayList)data.get(row);
			return temp.get(col);
		}//End 필수오버라이딩

		//내가설정한 이름으로 속성이름 설정하기
		public String getColumnName(int col) {
			return colName[col];
		}
	}

}
