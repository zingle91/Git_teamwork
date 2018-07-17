package view;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

import view.RegListView.VideoTableModel;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RegisterSearch extends JPanel {
	private JTable table;
	JTable tableRecentList;
	VideoTableModel tbModelVideo;
	private JTextField textField;
	private JTextField txtList;


	//생성자 함수
	public RegisterSearch() {
	RegisterSearch();
	eventProc();
	connectDB();
	}
	
	public void RegisterSearch() {
		
		setLayout(new BorderLayout(0, 0));
		setSize(800,500);
		tbModelVideo = new VideoTableModel();
		

		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		txtList = new JTextField();
		txtList.setText("조회");
		panel.add(txtList);
		txtList.setColumns(3);

		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);

		JComboBox comboBox = new JComboBox();
		panel.add(comboBox);

		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		tableRecentList = new JTable(tbModelVideo);
		JScrollPane scrollPane = new JScrollPane(tableRecentList);
		panel_1.add(scrollPane);
	
	}


	private void connectDB() {

	}


	private void eventProc() {

	}


	/**
	 * Create the panel.
	 */

	//화면에 테이블 붙이는 메소드 
	class VideoTableModel extends AbstractTableModel { 

		ArrayList data = new ArrayList();
		String [] columnNames = {"수강시기","과목명","학점", "교수", "장소", "시간", "구분"};

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
