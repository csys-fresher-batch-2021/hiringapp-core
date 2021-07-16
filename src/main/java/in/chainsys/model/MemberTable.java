package in.chainsys.model;

import java.sql.Date;
import java.time.LocalDate;

public class MemberTable {
	private int memberIdNumber;
	private String memberName;
	private long mobileNumber;
	private LocalDate memberJoiningDate;
	private String status;
	private Date date;

	public int getMemberIdNumber() {
		return memberIdNumber;
	}

	public String getMemberName() {
		return memberName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public LocalDate getMemberJoiningDate() {
		return memberJoiningDate;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "MemberTable [memberIdNumber=" + memberIdNumber + ", memberName=" + memberName + ", mobileNumber="
				+ mobileNumber + ", status=" + status + ", memberJoiningDate=" + date + "]";
	}

	public MemberTable(int memberIdNumber, String memberName, long mobileNumber, LocalDate date, String status) {
		super();
		this.memberIdNumber = memberIdNumber;
		this.memberName = memberName;
		this.mobileNumber = mobileNumber;
		this.memberJoiningDate = date;
		this.status = status;
	}

	public MemberTable(String memberName2, long mobileNumber2, Date date2, String status2) {
		super();
		this.memberName = memberName2;
		this.mobileNumber = mobileNumber2;
		this.date = date2;
		this.status = status2;
	}

	public MemberTable(String name, long mobileno, LocalDate date, String status1) {
		this.memberName = name;
		this.mobileNumber = mobileno;
		this.memberJoiningDate = date;
		this.status = status1;
	}

	public MemberTable(int memberId, String memberName2, long mobileNumber2, Date date, String status2) {
		super();
		this.memberIdNumber = memberId;
		this.memberName = memberName2;
		this.mobileNumber = mobileNumber2;
		this.date = date;
		this.status = status2;
	}

}
