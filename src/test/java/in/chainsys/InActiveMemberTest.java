package in.chainsys;

import java.io.IOException;
import java.util.List;

import in.chainsys.dao.imp.MemberImpDAO;
import in.chainsys.exception.ServiceException;
import in.chainsys.model.MemberTable;

public class InActiveMemberTest {
	public InActiveMemberTest() {
		super();
	}

	/**
	 * displays InActiveMember details
	 * 
	 * @param list contain ActiveMember details
	 * @throws Exception
	 */

	public static void displayInActiveMember() throws Exception {
		List<MemberTable> inActiveMember = MemberImpDAO.getInActiveMemers();
		for (MemberTable inActiveMemberDetails : inActiveMember) {
			System.out.println(inActiveMemberDetails);

		}
	}

	public static void main(String[] args) throws ServiceException, IOException {

		// It displays all the InActive member details
		try {
			displayInActiveMember();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
