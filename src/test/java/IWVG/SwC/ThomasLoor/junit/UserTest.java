package IWVG.SwC.ThomasLoor.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

private User us;

	
	@Before
    public void before() {
        us = new User(1311655938, "Thomas","Loor");
    }
	
	@Test
	public void testUser() {
		 assertEquals(1311655938, us.getNumber());
		 assertEquals("Thomas", us.getName());
		 assertEquals("Loor", us.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertTrue(us.fullName().equals("Thomas Loor"));
	}

	@Test
	public void testInitials() {
		assertTrue(us.initials().equals("T."));
	}

	@Test
	public void testGetNumber() {
		assertEquals(1311655938, us.getNumber());
	}

	@Test
	public void testGetName() {
		assertEquals("Thomas", us.getName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Loor", us.getFamilyName());
	}
	
}
