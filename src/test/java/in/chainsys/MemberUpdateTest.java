package in.chainsys;

import java.util.List;

import in.chainsys.dao.imp.MemberImpDAO;
import in.chainsys.model.MemberTable;
import in.chainsys.service.MemberService;

public class MemberUpdateTest {
	public static void main(String[] args) throws Exception {
		/**
		 * Update Active or Inactive status
		 */

		int memberId = 1002;
		String status = "INACTIVE";
		boolean isMemberUpdated = MemberService.updateMemberStatus(memberId, status);
		System.out.println(isMemberUpdated);
		List<MemberTable> obj = MemberImpDAO.getAllMembers();
		System.out.println(obj);
	}
}
