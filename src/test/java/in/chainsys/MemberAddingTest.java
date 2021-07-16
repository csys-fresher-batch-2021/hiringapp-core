package in.chainsys;

import java.time.LocalDate;

import in.chainsys.service.MemberService;

public class MemberAddingTest {
	/**
	 * Hardcode to add member
	 * 
	 * @param args
	 * @throws Throwable
	 */

	public static void main(String[] args) throws Throwable {
		LocalDate dob = LocalDate.now();
		int memberId = 1007;
		String memberName = "SIVARAM";
		long mobileNo = 9996663331L;
		LocalDate date = dob;
		String Status = "ACTIVE";
		boolean isMemberAdded = MemberService.addMember(memberId, memberName, mobileNo, date, Status);
		System.out.println(isMemberAdded);

	}

}
