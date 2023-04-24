package com.earth.work;

import java.sql.SQLException;

public interface UserDao {

	User selectUser(String id);
	int deleteUser(String id);
	void deleteAll() throws SQLException;
	int updateUser(User user);
	int insertUser(User user);
	
}
