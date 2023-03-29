package com.inventory.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.inventory.model.OrderItems;
import com.inventory.util.DBConnection;

public class OrderItemsDao extends ProductDao implements IOrdersItem<OrderItems> {
    private  List<OrderItems>itemList=new ArrayList<>();
	
    @Override
	public List<OrderItems> findOrdersById(int id) throws ClassNotFoundException, SQLException {
	    Connection connection=DBConnection.getConnection();
	    String query ="select * from order_item where user_id=?";
	    PreparedStatement statement=connection.prepareStatement(query);
	    statement.setInt(1, id);
	    ResultSet resultSet=statement.executeQuery();
	    OrderItems orderitems=null;
	    
	    while(resultSet.next()) {
	    	orderitems=new OrderItems();
	    	orderitems.setUser_id(resultSet.getInt("user_ID"));
	    	orderitems.setOrderItem_id(resultSet.getInt("ORDER_ITEM_ID"));
	    	orderitems.setOrderitem_price(resultSet.getInt("ORDER_ITEM_UNIT_PRICE"));
	    	orderitems.setOrderitem_quantity(resultSet.getInt("ORDER_ITEM_QUANTITY"));
	        orderitems.setProduct_id(resultSet.getInt("product_ID"));
	        orderitems.setRating(resultSet.getInt("ORDER_ITEM_RATINGS"));
	        orderitems.setCreated_at(resultSet.getDate("created_at"));
	        orderitems.setStatus(resultSet.getString("status"));
	 	    itemList.add(orderitems);
	    }
	    
	    resultSet.close();
	    statement.close();
	    connection.close();
	    return itemList;
	}

	@Override
	public List<OrderItems>getAllOrders() throws ClassNotFoundException, SQLException {
		Connection connection=DBConnection.getConnection();
	    String query ="select * from order_item";
	    PreparedStatement statement=connection.prepareStatement(query);
	    ResultSet resultSet=statement.executeQuery();
	    OrderItems orderitems=null;
	    
	    while(resultSet.next()) {
	    	orderitems=new OrderItems();
	    	orderitems.setUser_id(resultSet.getInt("user_ID"));
	    	orderitems.setOrderItem_id(resultSet.getInt("ORDER_ITEM_ID"));
	    	orderitems.setOrderitem_price(resultSet.getInt("ORDER_ITEM_UNIT_PRICE"));
	    	orderitems.setOrderitem_quantity(resultSet.getInt("ORDER_ITEM_QUANTITY"));
	        orderitems.setProduct_id(resultSet.getInt("product_ID"));
	        orderitems.setRating(resultSet.getInt("ORDER_ITEM_RATINGS"));
	        orderitems.setCreated_at(resultSet.getDate("created_at"));
	        orderitems.setStatus(resultSet.getString("status"));
	 	    itemList.add(orderitems);
	    }
	    resultSet.close();
	    statement.close();
	    connection.close();
	    return itemList;
	}

	@Override
	public List<OrderItems>getOrdersByStatus(String status) throws Exception, SQLException {
		Connection connection=DBConnection.getConnection();
	    String query ="select * from order_item where status=?";
	    PreparedStatement statement=connection.prepareStatement(query);
	    statement.setString(1, status);
	    ResultSet resultSet=statement.executeQuery();
	    OrderItems orderitems=null;
	    
	    while(resultSet.next()) {
	    	orderitems=new OrderItems();
	    	orderitems.setUser_id(resultSet.getInt("user_ID"));
	    	orderitems.setOrderItem_id(resultSet.getInt("ORDER_ITEM_ID"));
	    	orderitems.setOrderitem_price(resultSet.getInt("ORDER_ITEM_UNIT_PRICE"));
	    	orderitems.setOrderitem_quantity(resultSet.getInt("ORDER_ITEM_QUANTITY"));
	        orderitems.setProduct_id(resultSet.getInt("product_ID"));
	        orderitems.setRating(resultSet.getInt("ORDER_ITEM_RATINGS"));
	        orderitems.setCreated_at(resultSet.getDate("created_at"));
	        orderitems.setStatus(resultSet.getString("status"));
	 	    itemList.add(orderitems);
	    }
	    resultSet.close();
	    statement.close();
	    connection.close();
	    return itemList;

	}

	@Override
	public int getTotalSum() throws Exception, SQLException  {
		Connection connection=DBConnection.getConnection();
	    String query ="select sum(order_item_quantity * order_item_unit_price) as summ from order_item";
	    PreparedStatement statement=connection.prepareStatement(query);
	    ResultSet resultSet=statement.executeQuery();
	    resultSet.next();
	    int a=resultSet.getInt(1);
	    System.out.println("Sum i got : "+ a);
	    return a;
	}

    

}
