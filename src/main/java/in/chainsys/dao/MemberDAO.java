package in.chainsys.dao;

import in.chainsys.exception.DbException;
import in.chainsys.model.MemberTable;

public interface MemberDAO {

	/**
	 * This method save the member detail .
	 * 
	 * @param memberIdnumber
	 * @param memberName
	 * @param memberMobileNumber
	 * @param memberJoiningDate
	 * @param status
	 * @throws DBException
	 */

	static void addMember(MemberTable member) throws DbException {
	}

	/**
	 * This method delete the member detail .
	 * 
	 * @param memberIdnumber
	 * @throws DBException
	 */

	static void deleteMember(MemberTable memberId) throws DbException {
	}

}
