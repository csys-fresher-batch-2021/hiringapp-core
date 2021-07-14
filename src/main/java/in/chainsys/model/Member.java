package in.chainsys.model;

import java.time.LocalDate;

public class Member {
	private  int mmemberId;
	private  String memberName;
	private  long  memberNumber;
	private  LocalDate memberJoiningDate;
	private  String memberStatus;
	@Override
	public String toString() {
		return "Member [mmemberId=" + mmemberId + ", memberName=" + memberName + ", memberNumber=" + memberNumber
				+ ", memberJoiningDate=" + memberJoiningDate + ", memberStatus=" + memberStatus + "]";
	}
	public Member(int mmemberId, String memberName, long memberNumber, LocalDate memberJoiningDate,
			String memberStatus) {
		super();
		this.mmemberId = mmemberId;
		this.memberName = memberName;
		this.memberNumber = memberNumber;
		this.memberJoiningDate = memberJoiningDate;
		this.memberStatus = memberStatus;
	}
	public int getMmemberId() {
		return mmemberId;
	}
	public void setMmemberId(int mmemberId) {
		this.mmemberId = mmemberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public long getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(long memberNumber) {
		this.memberNumber = memberNumber;
	}
	public LocalDate getMemberJoiningDate() {
		return memberJoiningDate;
	}
	public void setMemberJoiningDate(LocalDate memberJoiningDate) {
		this.memberJoiningDate = memberJoiningDate;
	}
	public String getMemberStatus() {
		return memberStatus;
	}
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
	
}
