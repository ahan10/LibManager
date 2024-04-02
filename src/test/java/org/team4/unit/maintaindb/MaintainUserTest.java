package org.team4.unit.maintaindb;

import static org.junit.Assert.*;

import org.junit.*;
import org.team4.maintaindb.MaintainUser;
import org.team4.model.user.User;

public class MaintainUserTest {

	
	MaintainUser userMaintainer;
	
	@Before
	public void setUp() {
		userMaintainer = MaintainUser.getInstance();
	}
	
	@Test
	public void countUser() {
		assertEquals(16, userMaintainer.getAllUsers().size());
	}
	
	@Test
	public void findUserNotExist() {
		assertNull(userMaintainer.findUserByEmail("No Email"));
	}
	
	@Test
	public void findUser() {
		assertEquals(userMaintainer.getAllUsers().get(1), userMaintainer.findUserByEmail("user2@example.com"));
	}
	
	@Test
	public void addExistingUserEmail() {
		int userCount = userMaintainer.getAllUsers().size();
		userMaintainer.addUser(new User("2", null, null, "TEST"));
		assertEquals(userCount, userMaintainer.getAllUsers().size());
	}
	
	@Test
	public void addUser() {
		int userCount = userMaintainer.getAllUsers().size();
		userMaintainer.addUser(new User("6", null, null, "TEST"));
		assertEquals(userCount+1, userMaintainer.getAllUsers().size());
		userMaintainer.getAllUsers().remove(userCount);
	}
	
	@Test
	public void update() throws Exception {
		userMaintainer.update();
	}
}