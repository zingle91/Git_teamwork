package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.SubjectVO;


public class SubjectModel {
	Connection con;

	public SubjectModel() throws Exception{
		con=DBConn.getConnection();
	}
	public ArrayList getSubData(String subject) throws Exception {


		String sql="select * from subject where major=? or major='교양' or major='영어' ";

		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, subject);

		ResultSet rs=st.executeQuery();
		ArrayList list1 = new ArrayList();

		SubjectVO vo=new SubjectVO();

		while(rs.next()) {
			
			ArrayList list = new ArrayList();
			list.add(rs.getString("SUBJECTID"));
			list.add(rs.getString("SUBJECT"));
			list.add(rs.getInt("GRADE"));
			list.add(rs.getString("PROFESSOR"));
			list.add(rs.getString("PLACE"));
			list.add(rs.getString("STARTTIME"));
			list.add(rs.getString("ENDTIME"));
			list.add(rs.getString("DIVISION"));
			list.add(rs.getInt("TOTAL"));
			list.add(rs.getInt("APPLYNUM"));
			list.add(rs.getString("MAJOR"));
			list.add(rs.getInt("OPENSEMESTER"));
			list1.add(list);		
		}	

		return list1;

	}
	public void insertTempRegister(String subid,String sNum) throws Exception {
		String sql="insert into temp_register(subjectid,studentid) " + 
				" values (?, ?) ";

		PreparedStatement st = con.prepareStatement(sql);
		//		for(int i=0;i<list1.size();i++) {
		//			ArrayList temp=(ArrayList)list1.get(i);
		//			st.setString(1, (String)temp.get(0));
		//			st.setString(2, sNum);
		//		}
		st.setString(1, subid);
		st.setString(2, sNum);

		st.executeUpdate();
	}

	public ArrayList searchBySubId(String subid) throws Exception {
		String sql=" select * from subject where subjectid=? ";
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, subid);
		ResultSet rs=st.executeQuery();
		ArrayList list=new ArrayList();
		if(rs.next()) {
			ArrayList tmp=new ArrayList();
			System.out.println("?"+rs.getString("SUBJECTID"));
			tmp.add(rs.getString("SUBJECTID"));
			tmp.add(rs.getString("SUBJECT"));
			tmp.add(rs.getInt("GRADE"));
			tmp.add(rs.getString("PROFESSOR"));
			tmp.add(rs.getString("PLACE"));
			tmp.add(rs.getString("STARTTIME"));
			tmp.add(rs.getString("ENDTIME"));
			tmp.add(rs.getString("DIVISION"));
			tmp.add(rs.getInt("TOTAL"));
			tmp.add(rs.getInt("APPLYNUM"));
			tmp.add(rs.getString("MAJOR"));
			tmp.add(rs.getInt("OPENSEMESTER"));	
			list.add(tmp);
		}	
		return list;	
	}

}
