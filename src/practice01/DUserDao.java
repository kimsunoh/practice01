package practice01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DUserDao extends UserDao {

	@Override
	public Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connetction = DriverManager.getConnection(
				"jdbc:mysql://203.253.207.177/summer?characterEncoding=utf-8",
				"velo", "teambustago");
		return connetction;
	}

}
