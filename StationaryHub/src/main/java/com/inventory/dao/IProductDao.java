package com.inventory.dao;

import java.sql.SQLException;
import java.util.List;

public interface IProductDao<T> {
	List <T> findAll() throws SQLException, ClassNotFoundException;
	List <T> findAll(String p) throws SQLException, ClassNotFoundException;
	T findOneByProduct(String s) throws SQLException, ClassNotFoundException;
	T findOneByProductId(int id) throws SQLException, ClassNotFoundException;
	boolean create(T t) throws SQLException, ClassNotFoundException;
	boolean update (long id,T t) throws SQLException, ClassNotFoundException;
	boolean delete (long id) throws SQLException, ClassNotFoundException;
	List<T> findLimitedProducts() throws SQLException,ClassNotFoundException;
	List<T> findCategoryWiseProducts(String category)throws SQLException,ClassNotFoundException;
	

}
