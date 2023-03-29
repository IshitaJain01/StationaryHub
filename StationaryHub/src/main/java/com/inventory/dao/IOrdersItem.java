package com.inventory.dao;

import java.sql.SQLException;
import java.util.List;

public interface IOrdersItem<T> {
	List<T> findOrdersById(int id) throws ClassNotFoundException, SQLException;
	List<T> getAllOrders() throws ClassNotFoundException, SQLException;
    List<T> getOrdersByStatus(String status) throws Exception, SQLException;
    int getTotalSum()throws Exception, SQLException ;
}
