package practice01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class UserDao {

	public User get(String id) throws ClassNotFoundException, SQLException {
		// 사용자는 어디에 저장되어 있는 거지?
		// DataBase를 사용해 보자
		// 어떤 DataBase를 사용할까?
		// MySql을 사용해 보자

		// Connect를 맺고
		Connection connetction = getConnection();
		// 쿼리를 만들어서
		PreparedStatement preparedStatement = connetction
				.prepareStatement("select * from userinfo where id = ?");
		preparedStatement.setString(1, id);
		// 실행시키고
		ResultSet resultSet = preparedStatement.executeQuery();
		User user = new User();

		if (resultSet.next()) {
			user = new User();
			user.setId(resultSet.getString("id"));
			user.setName(resultSet.getString("name"));
			user.setPassword(resultSet.getString("password"));
		}

		// 결과 User에 맵핑하고

		// 자원을 해지한다.
		resultSet.close();
		preparedStatement.close();
		connetction.close();

		return user;
	}

	public void add(User user) throws ClassNotFoundException, SQLException {
		// 사용자는 어디에 저장되어 있는 거지?
		// DataBase를 사용해 보자
		// 어떤 DataBase를 사용할까?
		// MySql을 사용해 보자

		Connection connetction = getConnection();
		// 쿼리를 만들어서
		PreparedStatement preparedStatement = connetction
				.prepareStatement("insert into userinfo(id,name,password) value(?,?,?)");
		preparedStatement.setString(1, user.getId());
		preparedStatement.setString(2, user.getName());
		preparedStatement.setString(3, user.getPassword());

		// 실행시키고
		preparedStatement.executeUpdate();

		// 자원을 해지한다.
		preparedStatement.close();
		connetction.close();
	}

	public abstract Connection getConnection() throws ClassNotFoundException,SQLException;
}
