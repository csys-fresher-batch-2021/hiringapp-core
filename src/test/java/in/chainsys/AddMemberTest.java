package in.chainsys;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import in.chainsys.excepiton.FeildShouldNotBeEmptyExceptions;
import in.chainsys.excepiton.MemberExistException;
import in.chainsys.service.MembeService;

public class AddMemberTest {

	@Test
	public void addMemberTest() throws ClassNotFoundException, FeildShouldNotBeEmptyExceptions, SQLException, MemberExistException {
		long number =9080808080l;
		String name = "Sam Paul";
		boolean isMemberTest = MembeService.addMember(name ,number);
		assertTrue(isMemberTest);
	}

}
