package com.inventory.dao;

import java.sql.SQLException;
import java.util.List;

public interface ICartDao<T> {
	List<T> GetAllCartItem(int cartId) throws ClassNotFoundException, SQLException;
	T GetSingleCartItem(int userID,int ProductID) throws ClassNotFoundException, SQLException;
	boolean IncrementQuantity(int CartItemID,int ProductId) throws ClassNotFoundException, SQLException;
	boolean DecrementQuantity(int CartItemID,int ProductId) throws ClassNotFoundException, SQLException;
	boolean RemoveCartItem(int Cartid,int UserId) throws ClassNotFoundException, SQLException;
	boolean createCartItem(int UserID,int prodctId) throws ClassNotFoundException, SQLException;
	
}
