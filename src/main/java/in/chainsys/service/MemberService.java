package in.chainsys.service;

import java.time.LocalDate;

import in.chainsys.dao.imp.MemberImpDAO;
import in.chainsys.exception.DbException;
import in.chainsys.exception.MemberExistException;
import in.chainsys.exception.ServiceException;
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
	 * @throws MemberExistException
	 * @throws ServiceException
	 * @throws in.chainsys.exception.ValidationException
	 * @throws Exception
	 */

	public static boolean addMember(int memberId, String memberName, long mobileNumber, LocalDate memberJoiningDate,
			String status) throws DbException, ServiceException, MemberExistException {
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
			throw new DbException(MessageConstant.INVALIDMEMBERNAME);
		}
		return added;
	}

	/*
	 * This method is used to delete member
	 * 
	 * @param memberId
	 */
	public static boolean deleteMember(int memberId) throws DbException {
		int id = memberId;
		MemberImpDAO.deleteMember(id);
		return true;
	}

	
}