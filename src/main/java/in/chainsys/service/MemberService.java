package in.chainsys.service;

import java.time.LocalDate;

import in.chainsys.dao.imp.MemberImpDAO;
import in.chainsys.model.MemberTable;
import in.chainsys.util.MessageConstant;
import in.chainsys.validator.MemberValidator;

public class MemberService {

	/**
	 * This method is used to add the new member.It validates the name then add it
	 * by admin
	 * 
	 * @param memberIdNumber
	 * @param memberName
	 * @param mobileNumber
	 * @param memberJoiningDate
	 * @param status
	 * @throws in.chainsys.exception.ValidationException
	 * @throws Exception
	 */

	public static boolean addMember(int memberId, String memberName, long mobileNumber, LocalDate memberJoiningDate,
			String status) throws Exception {
		boolean added = false;
		int id = memberId;
		String name = memberName;
		long mobileno = mobileNumber;
		LocalDate date = memberJoiningDate;
		String status1 = status;

		if (MemberValidator.isValidMemberName(name, "Invalid Member") && MemberValidator.isValid(mobileno)
				&& MemberValidator.isMemberExists(name)) {
			MemberTable memberDetails = new MemberTable(id, name, mobileno, date, status1);
			MemberImpDAO.addMember(memberDetails);
			added = true;

		} else {
			throw new Exception(MessageConstant.INVALIDMEMBERNAME);
		}
		return added;
	}

	public static boolean deleteMember(int memberId) throws Exception {
		int id = memberId;
		MemberImpDAO.deleteMember(id);
		return true;
	}

	public static boolean updateMemberStatus(int memberId, String status) throws Exception {
		int id = memberId;
		String status1 = status;
		MemberImpDAO.updateMemberStatus(status1, id);
		return true;

	}

}