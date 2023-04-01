package com.inventory.dao;

import java.sql.Connection;
import java.sql.Connection.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.inventory.essentials.Hash;
import com.inventory.model.User;
import com.inventory.util.DBConnection;

public class UserDao implements IUserDao<User> {
	
	public UserDao()
	{
		
	}
	
	
    @Override
	public User userLogin(String email , String password) throws ClassNotFoundException, SQLException {
    	User user =null;
    	final Connection connection=DBConnection.getConnection();
    	final String query="Select * from users where user_email=? and user_password =? and user_status='Active'";
    	
    	final PreparedStatement pst = connection.prepareStatement(query);
    	pst.setString(1, email);
    	pst.setString(2, Hash.encrypt(password));
        final	ResultSet rs  = pst.executeQuery();
        
        if(rs.next())
        {  
        	user = new User();
        	user.setUser_id(rs.getInt("user_id"));
        	user.setUser_firstname(rs.getString("user_firstname"));
        	user.setUser_lastname(rs.getString("user_lastname"));
        	user.setUser_email(rs.getString("user_email"));
        	user.setUser_contact(rs.getLong("user_contact"));
        	user.setUser_address(rs.getString("user_address"));
        	
        	
        }
    	
		return user;
	}


	@Override
	public boolean userSignup(User user) throws ClassNotFoundException, SQLException {
		final Connection connection=DBConnection.getConnection();
		final String insertUpdate="insert into users (user_firstname , user_lastname, user_email ,user_contact, user_address,user_password)values(?,?,?,?,?,?)";
		final PreparedStatement preparedStatement=connection.prepareStatement(insertUpdate);
		preparedStatement.setString(1, user.getUser_firstname());
		preparedStatement.setString(2, user.getUser_lastname());
		preparedStatement.setString(3,user.getUser_email());
		preparedStatement.setLong(4,user.getUser_contact());
		preparedStatement.setString(5, user.getUser_address());
		preparedStatement.setString(6, Hash.encrypt(user.getUser_password()));
		final int noOrRows=preparedStatement.executeUpdate();
		if(noOrRows>0) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public User getUserById(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		User user =null;
    	final Connection connection=DBConnection.getConnection();
    	final String query ="Select * from users where user_id=?";
    	final PreparedStatement pst = connection.prepareStatement(query);
    	pst.setInt(1, id);

    	
        final	ResultSet rs  = pst.executeQuery();
      
        if(rs.next())
        {  
        	user = new User();
        	user.setUser_id(rs.getInt("user_id"));
        	user.setUser_firstname(rs.getString("user_firstname"));
        	user.setUser_lastname(rs.getString("user_lastname"));
        	user.setUser_email(rs.getString("user_email"));
        	user.setUser_contact(rs.getLong("user_contact"));
        	user.setUser_address(rs.getString("user_address"));
        	user.setUser_password(rs.getString("user_password"));
        }
    	System.out.println(user);
		return user;
		
	}


	@Override
	public List<User> getAllUsers() throws ClassNotFoundException, SQLException {
		List<User> users = new ArrayList<>();
		User user;
		final Connection connection=DBConnection.getConnection();
    	final String query ="Select * from users";
    	final PreparedStatement pst = connection.prepareStatement(query);
    	ResultSet rs= pst.executeQuery();
    	while(rs.next()) {
    		 user = new User();
    		user.setUser_firstname(rs.getString("user_firstname"));
         	user.setUser_lastname(rs.getString("user_lastname"));
         	user.setUser_email(rs.getString("user_email"));
         	user.setUser_contact(rs.getLong("user_contact"));
         	user.setUser_address(rs.getString("user_address"));
         	user.setUser_password(rs.getString("user_password"));
             
		     users.add(user);
    	}
    	
		return users;
	}


	@Override
	public boolean updateUser(User user) throws ClassNotFoundException, SQLException {
		final Connection connection=DBConnection.getConnection();
		final String insertUpdate="update users set user_firstname =? , user_lastname=?, user_email=? ,user_contact=?, user_address=? where user_id=?";
		final PreparedStatement preparedStatement=connection.prepareStatement(insertUpdate);
		preparedStatement.setString(1, user.getUser_firstname());
		preparedStatement.setString(2, user.getUser_lastname());
		preparedStatement.setString(3,user.getUser_email());
		preparedStatement.setLong(4,user.getUser_contact());
		preparedStatement.setString(5, user.getUser_address());
		preparedStatement.setInt(6,user.getUser_id());
		int row=preparedStatement.executeUpdate();
		 
         
		if(row>0) {
			return true;
		}else return false;
	}

	
	@Override
	public void deleteUser(int id) throws ClassNotFoundException, SQLException {
		final Connection connection=DBConnection.getConnection();
		final String query ="Delete from users where user_id=?";
    	final PreparedStatement pst = connection.prepareStatement(query);
    	pst.executeUpdate();
		
	}
	 public void updateStatus(int id, String Status) throws SQLException, ClassNotFoundException {
		 final Connection connection=DBConnection.getConnection();
		    String sql = "UPDATE users SET user_status = ? WHERE user_id = ?";
		    try (PreparedStatement statement = connection.prepareStatement(sql)) {
		      statement.setString(1, Status);
		      statement.setInt(2, id);
		      statement.executeUpdate();
		    }
		  }


}
