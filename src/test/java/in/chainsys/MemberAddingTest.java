package in.chainsys;

import java.time.LocalDate;

import in.chainsys.model.MemberTable;
import in.chainsys.service.MemberService;

public class MemberAddingTest {

	public static void main(String[] args) throws Throwable {
		LocalDate dob = LocalDate.now();
		int memberId = 1003;
		String memberName = "Raja";
		long mobileNo = 9090909090L;
		LocalDate date = dob;
		String Status = "Active";
		System.out.println(Status);
		MemberTable memberDetails = new MemberTable(memberId, memberName, mobileNo, date, Status);
		System.out.println(memberDetails);
		boolean isMemberAdded = MemberService.addMember(memberId, memberName, mobileNo, date, Status);
		System.out.println(isMemberAdded);

	}

}
