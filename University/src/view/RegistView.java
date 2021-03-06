package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

import model.StudentModel2;
import model.SubjectModel;
import vo.SubjectVO;


/*
 * 수강신청페이지
 */
public class RegistView extends JPanel {
	JPanel west,east,west_center,west_south, west_south1,west_south2,east_north,east_north1,east_north2,
	east_center,science,engineering,art,culture; 
	JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_4,lblNewLabel_3,lblNewLabel_2,lblNewLabel_6,lblNewLabel_7,lblNewLabel_8;
	JTextField tf0_0,tf0_1,tf0_2,tf1_0,tf1_1,tf1_2,tf2_0,tf2_1,tf2_2,tf3_0,tf3_1,tf3_2;
	JTabbedPane tabbedPane;

	JButton science_btn1,science_btn2,engineering_btn1,engineering_btn2,art_btn1,art_btn2,culture_btn1,culture_btn2,
	confirmBtn,scoreSearchBtn,logoutBtn,plusbtn,choice;

	JTable avaiSubTable,registTable;

	avaiSubModel avaiModel;
	registListModel registModel;

	SubjectModel dbSub;
	StudentModel2 dbStd;

	String sNum, subid;

	ArrayList tmp;

	public RegistView() {

	}
	public RegistView(String sNum1) {
		sNum=sNum1;
		setLayout(new GridLayout(1, 2, 0, 0)); //전체 1행2열(왼쪽,오른쪽영역)
		connectDB();

		west = new JPanel();
		add(west);
		west.setLayout(new BorderLayout(0, 0));

		west_center = new JPanel();
		west.add(west_center, BorderLayout.CENTER);

		registModel=new registListModel();
		registTable=new JTable(registModel);
		west_center.add(new JScrollPane(registTable));

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

		science = new JPanel();
		tabbedPane.addTab("자연과학대", null, science, null);
		science_btn1 = new JButton("물리학과");
		science.add(science_btn1);
		science_btn2 = new JButton("생명과학과");
		science.add(science_btn2);

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
		culture_btn1 = new JButton("국어국문학과");
		culture.add(culture_btn1);
		culture_btn2 = new JButton("영어영문학과");
		culture.add(culture_btn2);

		//신청가능과목
		east_center = new JPanel();
		east_center.setToolTipText("");
		east_center.setBorder(new TitledBorder(null, "\uC2E0\uCCAD\uAC00\uB2A5\uACFC\uBAA9", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		east.add(east_center, BorderLayout.CENTER);

		avaiModel=new avaiSubModel();
		east_center.setLayout(new BorderLayout(0, 0));
		avaiSubTable = new JTable(avaiModel);
		avaiSubTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		east_center.add(new JScrollPane(avaiSubTable));

		choice = new JButton("선택");
		east_center.add(choice, BorderLayout.SOUTH);

		eventProc();
	}

	private void connectDB() {
		try {
			dbSub=new SubjectModel();
			System.out.println("디비 연결 성공");
		}catch(Exception e){
			System.out.println("디비 연결 실패 : "+ e.getMessage());
		}	
	}
	public void eventProc() {
		ButtonEventHandler btnHandler = new ButtonEventHandler();
		// 이벤트 등록
		science_btn1.addActionListener(btnHandler);
		science_btn2.addActionListener(btnHandler);
		engineering_btn1.addActionListener(btnHandler);
		engineering_btn2.addActionListener(btnHandler);
		art_btn1.addActionListener(btnHandler);
		art_btn2.addActionListener(btnHandler);
		culture_btn1.addActionListener(btnHandler);
		culture_btn2.addActionListener(btnHandler);
		choice.addActionListener(btnHandler);
		avaiSubTable.addMouseListener(new MouseAdapter() {
			// tableVideo가 마우스 클릭 되었을 때 발생
			public void mouseClicked(MouseEvent e) {
				int row = avaiSubTable.getSelectedRow();
				int col = 0;
				subid = (String)avaiSubTable.getValueAt(row, col);

			}
		});
		registTable.addMouseListener(new MouseAdapter() {
			// tableVideo가 마우스 클릭 되었을 때 발생
			public void mouseClicked(MouseEvent e) {
				//				int row = .getSelectedRow();
				//				int col = 0;
				//				subid = (String)avaiSubTable.getValueAt(row, col);
				JOptionPane.showMessageDialog(null,"ㅇㄹㅇㄹ");
			}
		});
	}

	class ButtonEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			Object o = ev.getSource();
			SubjectVO dao=new SubjectVO();
			ArrayList list1=new ArrayList();

			if(o==science_btn1){  
				try {
					list1=dbSub.getSubData("물리학과");
					avaiModel.data=list1;
					avaiModel.fireTableDataChanged();
					//
					//					for(Object i:list1) {
					//						System.out.println(i);
					//						//	System.out.println(list1.get(1));
					//					}

				} catch (Exception e) {
					System.out.println("science_btn1 에러" + e.getMessage());
				}	
			}
			else if(o==science_btn2){ 
				try {
					list1=dbSub.getSubData("생명과학과");
					avaiModel.data=list1;
					avaiModel.fireTableDataChanged();
				} catch (Exception e) {
					System.out.println("science_btn2 에러" + e.getMessage());
				}
			}			
			else  if(o==engineering_btn1){ 
				try {
					list1=dbSub.getSubData("기계공학과");
					avaiModel.data=list1;
					avaiModel.fireTableDataChanged();
				} catch (Exception e) {
					System.out.println("engineering_btn1 에러" + e.getMessage());
				}
			}
			else if(o==engineering_btn2){  
				try {
					list1=dbSub.getSubData("컴퓨터공학과");
					avaiModel.data=list1;
					avaiModel.fireTableDataChanged();
				} catch (Exception e) {
					System.out.println("engineering_btn2 에러" + e.getMessage());
				}
			}
			else if(o==art_btn1){ 
				try {
					list1=dbSub.getSubData("동양햑과");
					avaiModel.data=list1;
					avaiModel.fireTableDataChanged();
				} catch (Exception e) {
					System.out.println("art_btn1 에러" + e.getMessage());
				}
			}
			else if(o==art_btn2){ 
				try {
					list1=dbSub.getSubData("디자인학과");
					avaiModel.data=list1;
					avaiModel.fireTableDataChanged();
				} catch (Exception e) {
					System.out.println("art_btn2 에러" + e.getMessage());
				}
			}else if(o==culture_btn1){  
				try {
					list1=dbSub.getSubData("국어국문학과");
					avaiModel.data=list1;
					avaiModel.fireTableDataChanged();
				} catch (Exception e) {
					System.out.println("culture_btn1 에러" + e.getMessage());
				} 
			}else if(o==culture_btn2) {
				try {
					list1=dbSub.getSubData("영어영문학과");
					avaiModel.data=list1;
					avaiModel.fireTableDataChanged();
				} catch (Exception e) {
					System.out.println("culture_btn2 에러" + e.getMessage());
				}
			}else if(o==choice) {
				try {
					System.out.println(sNum+ " "+ subid);
					dbSub.insertTempRegister(subid,sNum); //temp_register에 삽입
					System.out.println("search전");
					tmp=dbSub.searchBySubId(subid); //학수번호로 subject 디비에서 과목정보찾아오기
					System.out.println(tmp.size());
					System.out.println(tmp.get(0).toString());
					registModel.data=tmp;
					registModel.fireTableDataChanged();
					System.out.println("================end");
				} catch (Exception e) {
					System.out.println("choice버튼 에러" + e.getMessage());
					e.printStackTrace();
				}
			}
		}

	}

	//테이블 모델
	class avaiSubModel extends AbstractTableModel{

		String[] colName = {"학수번호","과목명","학점","교수","장소","시작시간","종료시간",
				"구분","정원","신청인원","학과","개설학기"};

		ArrayList data=new ArrayList();

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

		public String getColumnName(int col) {
			return colName[col];
		}
		public void setValueAt(Object aValue, int row, int col) {
			ArrayList temp = (ArrayList)data.get(row);
			temp.set(col, aValue);
			//fireTableCellUpdated(row, col);
		}


	}
	class registListModel extends AbstractTableModel{
		String[] colName = {"학수번호","과목명","학점","교수","장소","시작시간","종료시간",
				"구분","정원","신청인원","학과","개설학기"};
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

