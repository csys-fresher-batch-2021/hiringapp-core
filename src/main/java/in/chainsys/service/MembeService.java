package in.chainsys.service;

import java.sql.SQLException;
import java.time.LocalDate;
import in.chainsys.dao.MemberDAO;
import in.chainsys.excepiton.FeildShouldNotBeEmptyExceptions;
import in.chainsys.excepiton.MemberExistException;
import in.chainsys.model.Member;
import in.chainsys.validator.FeildValidator;
import in.chainsys.validator.MemberServicesValidator;

public class MembeService {
	private MembeService() {
		// default Constructor
	}

	public static boolean addMember(String name, long number)
			throws FeildShouldNotBeEmptyExceptions, ClassNotFoundException, SQLException, MemberExistException {
		boolean isMemberAdded = false;
		MemberDAO memberDAO = new MemberDAO();
		String newMemberName = name;
		long newMemberNumber = number;
		int memberId = assignId();
		LocalDate joiningDate = LocalDate.now();
		String memberStatus = "Active";
		Member member = new Member(memberId, newMemberName, newMemberNumber, joiningDate, memberStatus);
		boolean isValidNumber = FeildValidator.isUserIdEmptyAndNull(number);
		boolean isValidName = FeildValidator.isFeildEmptyNotNull(name);
		boolean isExistMember = MemberServicesValidator.memberExistingCheck(number);
		if (isValidName && isValidNumber && isExistMember) {
			memberDAO.addMember(member);
			isMemberAdded = true;
		}
		return isMemberAdded;
	}

	public static int assignId() {
		int id = 0;
		MemberDAO memberDAO = new MemberDAO();
		int tableSize = memberDAO.tableSize() + 1;
		System.out.println(tableSize);
		id = tableSize + 3000;
		System.out.println(id);
		return id;
	}

}
