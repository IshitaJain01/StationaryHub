package com.inventory.dao;

import java.sql.SQLException;
import java.util.List;

import com.inventory.model.Orders;

public interface IOrdersDao<T>{
   boolean addOrder() throws Exception;
   List<T> getOrders() throws Exception, SQLException;
   List<T> getOrdersById(int id) throws Exception, SQLException;
}
