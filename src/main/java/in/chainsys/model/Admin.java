package in.chainsys.model;

public class Admin {
	private int adminId;
	private String adminName;
	private String password;
	private long adminNumber;
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", userPassword=" + password
				+ ", adminNumber=" + adminNumber + "]";
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getAdminNumber() {
		return adminNumber;
	}
	public void setAdminNumber(long adminNumber) {
		this.adminNumber = adminNumber;
	}
	public Admin(int adminId, String adminName, String password, long adminNumber) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.password = password;
		this.adminNumber = adminNumber;
	}
	
}
