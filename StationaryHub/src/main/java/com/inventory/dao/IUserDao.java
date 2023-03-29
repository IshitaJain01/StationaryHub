package com.inventory.dao;

import java.sql.SQLException;
import java.util.List;

import com.inventory.model.User;

public interface IUserDao<T> {
	 
	  T userLogin( String email, String password) throws ClassNotFoundException, SQLException;
	  boolean userSignup(User user) throws ClassNotFoundException, SQLException;
	  User getUserById(int id) throws ClassNotFoundException, SQLException;
	    List<User> getAllUsers() throws ClassNotFoundException, SQLException;
	  
	    void updateUser(User user) throws ClassNotFoundException, SQLException;
	    void deleteUser(int id) throws ClassNotFoundException, SQLException;

}
