package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	static Connection con;
	String url = "jdbc:oracle:thin:@172.16.3.10:1521:orcl";
	String user = "scott";
	String pass = "tiger";

	private DBConn() throws Exception{
		//1.드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2. Connection 연결객체 얻어오기
		con = DriverManager.getConnection(url, user, pass);
	}
	public static Connection getConnection() throws Exception {
		if(con==null) { //맨처음엔 null임 ! 
			new DBConn(); //맨처음에만 실행됨!!~~~  싱글톤패턴
		}
		return con;
	}
}
