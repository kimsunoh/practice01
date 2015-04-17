package practice01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

	/* (non-Javadoc)
	 * @see practice01.ConnectionMaker#getConnection()
	 */
	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connetction = DriverManager.getConnection(
				"jdbc:mysql://203.253.207.177/summer?characterEncoding=utf-8",
				"velo", "teambustago");
		return connetction;
	}
}
