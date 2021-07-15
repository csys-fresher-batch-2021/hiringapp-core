package in.chainsys.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import in.chainsys.dao.AdminDAO;
import in.chainsys.excepiton.InvalidCredentialsExcepions;
import in.chainsys.model.Admin;
import in.chainsys.validator.FeildValidator;

public class LoginService {
	
	private LoginService() {
		//Default Constructor 
	}
	public static boolean adminLoginValidation(Long number ,String password) throws ClassNotFoundException, SQLException, InvalidCredentialsExcepions {
		AdminDAO adminDAO = new AdminDAO();
		List<Admin> adminList = adminDAO.getAllAdminDetails();
		boolean isValidAdmin = false;
		Map<Long ,String> adminCredentialTable = new HashMap<>();
		for(Admin admin: adminList) {
			adminCredentialTable.put(admin.getAdminNumber(),admin.getPassword());
		}
		boolean isValidId=FeildValidator.isUserIdEmptyAndNull(number)&&FeildValidator.isValidUserIdLength(number);
		boolean isValidFormat =FeildValidator.isValidPasswordFormat(password);
		if(isValidId && isValidFormat && adminCredentialTable.containsKey(number)&&password.equals(adminCredentialTable.get(number))){
			isValidAdmin=true;
		}else {
			throw new InvalidCredentialsExcepions("Invalid Input");
		}
		return isValidAdmin;
	}	
}
