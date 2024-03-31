package org.team4.unit.model.user;

import org.junit.Before;
import org.junit.Test;
import org.team4.model.user.*;

import static org.junit.Assert.*;

public class UserFactoryTest {
    UserFactory userFactory;

    @Before
    public void setup(){
        userFactory = new UserFactory();
    }

    @Test
    public void test_student_validated(){
        User u = userFactory.getUser("email@example.com", "password1", "John Doe", "STUDENT", true);
        assertEquals("email@example.com", u.getEmail());
        assertEquals("password1", u.getPassword());
        assertEquals("John Doe", u.getName());
        assertEquals("STUDENT", u.getType());
        assertTrue(u.isValidated());
        assertSame(u.getClass(), Student.class);
    }

    @Test
    public void test_student_not_validated(){
        User u = userFactory.getUser("email@example.com", "password1", "John Doe", "STUDENT", false);
        assertEquals("email@example.com", u.getEmail());
        assertEquals("password1", u.getPassword());
        assertEquals("John Doe", u.getName());
        assertEquals("STUDENT", u.getType());
        assertFalse(u.isValidated());
        assertSame(u.getClass(), Student.class);
    }

    @Test
    public void test_manager_validated(){
        User u = userFactory.getUser("email@example.com", "password1", "John Doe", "MANAGER", true);
        assertEquals("email@example.com", u.getEmail());
        assertEquals("password1", u.getPassword());
        assertEquals("John Doe", u.getName());
        assertEquals("MANAGER", u.getType());
        assertTrue(u.isValidated());
        assertSame(u.getClass(), Manager.class);
    }

    @Test
    public void test_manager_not_validated(){
        User u = userFactory.getUser("email@example.com", "password1", "John Doe", "MANAGER", false);
        assertEquals("email@example.com", u.getEmail());
        assertEquals("password1", u.getPassword());
        assertEquals("John Doe", u.getName());
        assertEquals("MANAGER", u.getType());
        assertFalse(u.isValidated());
        assertSame(u.getClass(), Manager.class);
    }

    @Test
    public void test_faculty_validated(){
        User u = userFactory.getUser("email@example.com", "password1", "John Doe", "FACULTY", true);
        assertEquals("email@example.com", u.getEmail());
        assertEquals("password1", u.getPassword());
        assertEquals("John Doe", u.getName());
        assertEquals("FACULTY", u.getType());
        assertTrue(u.isValidated());
        assertSame(u.getClass(), Faculty.class);
    }

    @Test
    public void test_faculty_not_validated(){
        User u = userFactory.getUser("email@example.com", "password1", "John Doe", "FACULTY", false);
        assertEquals("email@example.com", u.getEmail());
        assertEquals("password1", u.getPassword());
        assertEquals("John Doe", u.getName());
        assertEquals("FACULTY", u.getType());
        assertFalse(u.isValidated());
        assertSame(u.getClass(), Faculty.class);
    }

    @Test
    public void test_non_faculty_validated(){
        User u = userFactory.getUser("email@example.com", "password1", "John Doe", "NONFACULTY", true);
        assertEquals("email@example.com", u.getEmail());
        assertEquals("password1", u.getPassword());
        assertEquals("John Doe", u.getName());
        assertEquals("NONFACULTY", u.getType());
        assertTrue(u.isValidated());
        assertSame(u.getClass(), NonFaculty.class);
    }

    @Test
    public void test_non_faculty_not_validated(){
        User u = userFactory.getUser("email@example.com", "password1", "John Doe", "NONFACULTY", false);
        assertEquals("email@example.com", u.getEmail());
        assertEquals("password1", u.getPassword());
        assertEquals("John Doe", u.getName());
        assertEquals("NONFACULTY", u.getType());
        assertFalse(u.isValidated());
        assertSame(u.getClass(), NonFaculty.class);
    }

    @Test
    public void test_visitor_validated(){
        User u = userFactory.getUser("email@example.com", "password1", "John Doe", "VISITOR", true);
        assertEquals("email@example.com", u.getEmail());
        assertEquals("password1", u.getPassword());
        assertEquals("John Doe", u.getName());
        assertEquals("VISITOR", u.getType());
        assertTrue(u.isValidated());
        assertSame(u.getClass(), Visitor.class);
    }

    @Test
    public void test_invalid_type(){
        assertNull(userFactory.getUser("email@example.com", "password1", "Jane Doe", "INVALID", false));
    }

}