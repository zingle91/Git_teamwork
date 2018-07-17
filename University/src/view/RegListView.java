package view;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

public class RegListView extends JPanel {

	//객체 생성
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	JTable tableRecentList;
	VideoTableModel tbModelVideo;
	

	//생성자 함수
	public RegListView() {
		RegListView();
		eventProc();
		connectDB();
	}

	private void connectDB() {

	}

	private void eventProc() {

	}

	/**
	 * Create the panel.
	 */
	//화면설계 메소드
	public void RegListView() {

		setLayout(new GridLayout(3, 1, 0, 0));
		setSize(800,500);
		
		tbModelVideo = new VideoTableModel();
		
		//-------------첫번째 패널--------------------

		JPanel stu_info = new JPanel();
		stu_info.setBorder(new TitledBorder(null, "\uD559\uC0DD\uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(stu_info);
		FlowLayout fl_stu_info = new FlowLayout(FlowLayout.CENTER, 5, 10);
		stu_info.setLayout(fl_stu_info);

		//1행 6열로
		JPanel panel_1 = new JPanel();
		stu_info.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 6, 0, 0));

		JLabel lblNewLabel = new JLabel("학번");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(textField);
		textField.setColumns(8);

		JLabel label = new JLabel("이름");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label);

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("학년");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);

		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		stu_info.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 4, 0, 0));

		JLabel label_1 = new JLabel("단과대");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_1);

		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("학과");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2);

		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(textField_4);
		textField_4.setColumns(10);

		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);

		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4);
		
		
		//--------두번째 패널--------------------------
		JPanel subject = new JPanel();
		subject.setBorder(new TitledBorder(null, "\uACFC\uBAA9", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(subject);
		subject.setLayout(new GridLayout(0, 1, 0, 0));
		tableRecentList = new JTable(tbModelVideo);
		
		JScrollPane scrollPane = new JScrollPane(tableRecentList);
		subject.add(scrollPane);
		//scrollPane.setRowHeight(3, 60);


		//--------세번째 패널--------------------------
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(2, 4, 0, 0));

		JPanel panel_5 = new JPanel();
		panel.add(panel_5);

		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);

		JPanel panel_7 = new JPanel();
		panel_6.add(panel_7);
		
		

		JButton btnNewButton = new JButton("확정");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		panel_7.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JPanel panel_8 = new JPanel();
		panel_5.add(panel_8);

		JButton btnNewButton_1 = new JButton("선택삭제");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		panel_8.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

	}//=======public RegListView()==========================

	//화면에 테이블 붙이는 메소드 
	class VideoTableModel extends AbstractTableModel { 

		ArrayList data = new ArrayList();
		String [] columnNames = {"과목명","학점","교수","장소", "시간", "구분"};

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
