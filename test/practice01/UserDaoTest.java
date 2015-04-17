package practice01;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Random;

import org.junit.Test;

public class UserDaoTest {
	@Test
	public void get() throws ClassNotFoundException, SQLException {
		UserDao userDao = new DUserDao();
		String id = "1";
		User user = userDao.get(id);
		assertEquals("1", user.getId());
		assertEquals("허윤호", user.getName());
		assertEquals("1234", user.getPassword());
	}
	
	public void add() throws ClassNotFoundException, SQLException {
		User user = new User();
		String id = String.valueOf(new Random().nextInt());
		String name = "허윤호";
		String password = "1234";
		user.setId(id);
		user.setName(name);
		user.setPassword(password);
		UserDao userDao = new DUserDao();
		userDao.add(user);
		User addedUser = userDao.get(id);
		assertEquals(id, addedUser.getId());
		assertEquals(name, addedUser.getName());
		assertEquals("1234", addedUser.getPassword());
	}
	
}
