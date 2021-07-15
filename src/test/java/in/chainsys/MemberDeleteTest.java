package in.chainsys;

import java.util.List;

import in.chainsys.dao.imp.MemberImpDAO;
import in.chainsys.model.MemberTable;
import in.chainsys.service.MemberService;

public class MemberDeleteTest {
	public static void main(String[] args) throws Throwable {
		int memberId = 1003;
		boolean isMemberDeleted = MemberService.deleteMember(memberId);
		System.out.println(isMemberDeleted);
		List<MemberTable> obj = MemberImpDAO.getAllMembers();
		System.out.println(obj);

	}

}
