package in.chainsys;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import in.chainsys.exception.InvalidCredentialsExcepions;
import in.chainsys.service.LoginService;

public class LoginTest {

	@Test
	//correct password and id
	public void validAdmintest() throws ClassNotFoundException, SQLException, InvalidCredentialsExcepions {
		long number = 9566099999l;
		String password= "Password@123";
		boolean isValidAdmin = LoginService.adminLoginValidation(number,password);
		assertTrue(isValidAdmin);	
	}

}
