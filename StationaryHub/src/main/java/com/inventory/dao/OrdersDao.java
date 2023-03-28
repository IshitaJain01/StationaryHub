package com.inventory.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;

import com.inventory.model.Orders;
import com.inventory.util.DBConnection;

public class OrdersDao implements IOrdersDao<Orders> {
    List<Orders>ordersList=new ArrayList<>();
	@Override
	public boolean addOrder() throws Exception {
			Connection connection=DBConnection.getConnection();
			String query="exec ORDERS_INSERT_PRO(1,2,500)";
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.executeQuery();
	
		return false;
	}

	@Override
	public List<Orders> getOrders() throws Exception, SQLException {
		Connection connection;
			connection = DBConnection.getConnection();
			String query="select * from orders";
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
			 Orders order=new Orders(
					 resultSet.getInt("order_id"),
					 resultSet.getInt("user_id"),
					 resultSet.getInt("order_quantity"),
					 resultSet.getInt("orders_totalPrice"),
					 resultSet.getObject("orders_date",LocalDate.class),
					 resultSet.getString("orders_status")
			 );
			 ordersList.add(order);
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
		
	
	     
		   return ordersList;
}

	@Override
	public List<Orders> getOrdersById(int id) throws Exception, SQLException {
		Connection connection;
		Orders order=null;
			connection = DBConnection.getConnection();
			String query="select * from orders where orderid = ?";
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
			 order=new Orders(
					 resultSet.getInt("order_id"),
					 resultSet.getInt("user_id"),
					 resultSet.getInt("order_quantity"),
					 resultSet.getInt("orders_totalPrice"),
					 resultSet.getObject("orders_date",LocalDate.class),
					 resultSet.getString("orders_status")
			 );
			 ordersList.add(order);
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
			
		
		return ordersList;

	}

}
