package csp;

import static org.junit.Assert.*;

import org.junit.Test;
import csp.Login;

public class LoginTest {

	@Test
	public void test() {
		Login login=new Login();
		
		login.setUsername("2016052382");
		login.setPassword("123456");
		
		String username=login.getUsername();
		String password=login.getPassword();
		//System.out.println(password);
		assertTrue(username.equals("2016052382")&&password.equals("123456"));

	}

}
