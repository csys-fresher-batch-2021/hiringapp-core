package in.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.chainsys.model.Admin;
import in.chainsys.util.ConnectionUtil;

public class AdminDAO {
	private static final String DISPLAY_ALL_ADMIN_DETAILS = "SELECT * FROM adminlibrarytable";
	
	public List<Admin> getAllAdminDetails() throws ClassNotFoundException, SQLException{
		List<Admin> adminList = new ArrayList<>();
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = DISPLAY_ALL_ADMIN_DETAILS;
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String id1 = rs.getString("Admin_id");
				int id = Integer.parseInt(id1);
				String name = rs.getString("Admin_Name");
				String password = rs.getString("Admin_Password");
				String snumber = rs.getString("Admin_Number");
				long number =Long.parseLong(snumber);
				Admin admin = new Admin(id, name, password, number);
				adminList.add(admin);
			}
		} catch (ClassNotFoundException| SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(rs, pst, connection);
		}
		System.out.println(adminList);
		return adminList;
	}
}
