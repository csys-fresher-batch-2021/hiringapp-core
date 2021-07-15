package in.chainsys;

import java.io.IOException;
import java.util.List;

import in.chainsys.dao.imp.MemberImpDAO;
import in.chainsys.exception.ServiceException;
import in.chainsys.model.MemberTable;

public class ActiveMemberTest {
	public ActiveMemberTest() {
		super();
	}

	/**
	 * displays ActiveMember details
	 * 
	 * @param list contain ActiveMember details
	 * @throws Exception
	 */

	public static void displayActiveMember() throws Exception {
		List<MemberTable> activeMember = MemberImpDAO.getActiveMemers();
		for (MemberTable activeMemberDetails : activeMember) {
			System.out.println(activeMemberDetails);
		}
	}

	public static void main(String[] args) throws ServiceException, IOException {

		// It displays all the Active member details
		try {
			displayActiveMember();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}