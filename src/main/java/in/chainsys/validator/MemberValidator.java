package in.chainsys.validator;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import in.chainsys.dao.imp.MemberImpDAO;
import in.chainsys.exception.MemberExistException;
import in.chainsys.exception.ServiceException;
import in.chainsys.model.MemberTable;

public class MemberValidator {
	private MemberValidator() {
		// Default Constructor
	}

	public static boolean isMemberExists(String name) throws MemberExistException {
		boolean isExist = false;
		System.out.println(name);
		List<MemberTable> memberList = MemberImpDAO.getAllMembers();
		for (MemberTable member : memberList) {
			if (name.equals(member.getMemberName())) {
				throw new MemberExistException(name + "Already Member Exist");
			} else {
				isExist = true;
			}
		}
		return isExist;
	}

	/**
	 * This method validates the movie name avoids special characters, numbers,null
	 * value,white space and length of the movie name must not exceed 30 characters.
	 * 
	 * @param memberName
	 * @return boolean value
	 * @throws Exception
	 */

	public static boolean isValidMemberName(String memberName, String message) throws ServiceException {

		if (memberName != null && !memberName.trim().equals("")) {
			return true;
		} else {
			throw new ServiceException(message);
		}
	}

	/**
	 * This method validates date whether it is not null.
	 * 
	 * @param date
	 * @return boolean value
	 */

	public static boolean isValidDate(String date) {
		boolean isValid = false;
		if (date != null && !date.equals("")) {
			isValid = true;

		}
		return isValid;

	}

	/**
	 * This method validates mobileNumber whether it is valid number or not
	 * 
	 * @param mobileno
	 */
	public static boolean isValid(long mobileno) {
		boolean isValid = false;
		String mobileNo = Long.toString(mobileno);
		if (mobileNo != null) {
			Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
			Matcher m = p.matcher(mobileNo);
			return (m.find() && m.group().equals(mobileNo));
		}
		return isValid;

	}

}
