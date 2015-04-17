package practice01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDao {

	public User get(String id) throws ClassNotFoundException, SQLException {
		// 사용자는 어디에 저장되어 있는 거지?
		// DataBase를 사용해 보자 
		// 어떤 DataBase를 사용할까?
		// MySql을 사용해 보자
		Class.forName("com.mysql.jdbc.Driver");
		Connection connetction = DriverManager.getConnection("jdbc:mysql://localhost/jeju","jeju","jejupw");
		
		
		// Connect를 맺고
		// 쿼리를 만들어서 실행시키고
		// 결과 User에 맵핑하고
		// 자원을 해지한다.
		
		// TODO Auto-generated method stub
		return null;
	}

}
