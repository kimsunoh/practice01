package practice01;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class UserDaoTest {
	@Test
	public void get() throws ClassNotFoundException, SQLException {
		UserDao userDao = new UserDao();
		String id = "1";
		User user = userDao.get(id);
		assertEquals("1", user.getId());
		assertEquals("허윤호", user.getName());
		assertEquals("1234",user.getPassword());
	}
	
}
