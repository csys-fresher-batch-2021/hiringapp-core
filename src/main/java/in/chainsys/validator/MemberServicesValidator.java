package in.chainsys.validator;

import java.sql.SQLException;
import java.util.List;

import in.chainsys.dao.MemberDAO;
import in.chainsys.excepiton.MemberExistException;
import in.chainsys.model.Member;

public class MemberServicesValidator {
	private MemberServicesValidator() {
		// DefaultConstructor
	}

	/**
	 * This Method is Used to Check whether the member already exists
	 * 
	 * @param number
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * @throws MemberExistException
	 */

	public static boolean memberExistingCheck(long number) throws ClassNotFoundException, SQLException {
		boolean isExist = false;
		MemberDAO memberDAO = new MemberDAO();
		List<Member> memberList = memberDAO.displayallMember();
		for (Member member : memberList) {
			long memberNumber = member.getMemberNumber();
			System.out.println(memberNumber);
			if (memberNumber == number ) {
				isExist=false;
			}else {
				isExist =true;
			}
		}
		return isExist;
	}
}
