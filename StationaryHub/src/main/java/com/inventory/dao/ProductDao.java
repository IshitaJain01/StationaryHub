package com.inventory.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.inventory.model.Product;
import com.inventory.util.DBConnection;

public class ProductDao implements IProductDao<Product>  {
	

	@Override
	public List<Product> findAll() throws SQLException, ClassNotFoundException{
		final List<Product> productList=new ArrayList<>();
		Connection connection=DBConnection.getConnection();
		final Statement s=connection.createStatement();
		final String select="select product_id,product_name,product_price,product_image,created_at,product_category from products";
		final ResultSet resultSet=s.executeQuery(select);
		while(resultSet.next())
		{
			
			Product p=new Product(resultSet.getInt("product_id"),resultSet.getString("product_name"),resultSet.getDouble("product_price"),resultSet.getString("product_image"),resultSet.getDate("created_at"));
			p.setProduct_category(resultSet.getString("product_category"));
			productList.add(p);
		
		}
		resultSet.close();
		s.close();
		connection.close();
		return productList;
	}

	@Override
	public List<Product> findAll(String p) throws ClassNotFoundException, SQLException {
		final List<Product> productList=new ArrayList<>();
		Connection connection=DBConnection.getConnection();
//		final Statement s=connection.createStatement();
	    final String select="select product_id,product_name,product_price,product_image,created_at from products where product_category=?";
	    final PreparedStatement preparestatement=connection.prepareStatement(select);
	    preparestatement.setString(1,p);
	    final ResultSet resultSet=preparestatement.executeQuery();
		while(resultSet.next())
		{
			Product p1=new Product(resultSet.getInt("product_id"),resultSet.getString("product_name"),resultSet.getDouble("product_price"),resultSet.getString("product_image"),resultSet.getDate("created_at"));
			productList.add(p1);
		}
		
		
		resultSet.close();
		preparestatement.close();
		connection.close();
		return productList;
	}

	@Override
	public Product findOneByProduct( String s) throws SQLException, ClassNotFoundException{
		Product product=null;
		final Connection connection=DBConnection.getConnection();
		final String select="select product_name,product_price,product_image from products  where  product_name=?";
		final PreparedStatement preparestatement=connection.prepareStatement(select);
		preparestatement.setString(1,s);
		
		final ResultSet resultSet=preparestatement.executeQuery();
		if(resultSet.next())
		{
			product=new Product(
					
					 resultSet.getString("product_name"),
					 resultSet.getDouble("product_price"),
					 resultSet.getString("product_image"));
		}
		
		return product;
		
	}
	
	

	@Override
	public boolean create(Product product) throws SQLException, ClassNotFoundException {
		
		final Connection connection=DBConnection.getConnection();
		final String insertUpdate=("insert into products(product_name,product_price,product_quantity,product_category,product_image)values(?,?,?,?,?)");
		final PreparedStatement preparedStatement=connection.prepareStatement(insertUpdate);
		
		preparedStatement.setString(1, product.getProduct_name());
		preparedStatement.setDouble(2, product.getProduct_price());
		preparedStatement.setInt(3, product.getProduct_quantity());
		preparedStatement.setString(4, product.getProduct_category());
		preparedStatement.setString(5, product.getImage());
		final int noOrRows=preparedStatement.executeUpdate();
		if(noOrRows>0) {
			return true;
		}
		preparedStatement.close();
		connection.close();
		return false;
	}

	@Override
	public boolean update(long id, Product product) throws SQLException, ClassNotFoundException {
		
		final Connection connection=DBConnection.getConnection();
		final String update="update products set product_price=?,product_quantity=? where product_id=?";
		final PreparedStatement preparedstatement=connection.prepareStatement(update);
		preparedstatement.setDouble(1,product.getProduct_price());
		preparedstatement.setInt(2,product.getProduct_quantity());
		preparedstatement.setInt(1,product.getProduct_id());
		if(preparedstatement.executeUpdate()>0)
		{
			return true;
		}
		preparedstatement.close();
		connection.close();
		return false;
	}

	@Override
	public boolean delete(long id) throws SQLException, ClassNotFoundException {
		final Connection connection=DBConnection.getConnection();
		final String delete="delete from products where product_id=?";
		final PreparedStatement preparestatement=connection.prepareStatement(delete);
		preparestatement.setLong(1,id);
		if(preparestatement.executeUpdate()>0)
		{
			return true;
		}
		preparestatement.close();
		connection.close();
		return false;
	}

	@Override
	public Product findOneByProductId(int id) throws SQLException, ClassNotFoundException {
		Product p1=null;
		final Connection connection =DBConnection.getConnection();
		final String select="select * from products where product_id=?";
		final PreparedStatement preparestatement=connection.prepareStatement(select);
		preparestatement.setInt(1,id);
		final ResultSet rs=preparestatement.executeQuery();
		if(rs.next())
		{
			     p1=new Product(
					rs.getInt("product_id"),
					rs.getString("product_name"),
					rs.getDouble("product_price"),
					rs.getInt("product_quantity"),
					rs.getString("product_category"),
					rs.getString("product_image"),
					rs.getDate("created_at"));
			
		}
		rs.close();
		preparestatement.close();
		connection.close();
		return p1;
	}

	@Override
	public List<Product> findLimitedProducts() throws SQLException, ClassNotFoundException {
		
		final List<Product> plist=new ArrayList<>();
		Connection conn=DBConnection.getConnection();
		Statement s=conn.createStatement();
		String select ="select product_id,product_name,product_price,product_image,created_at,product_category from products order by dbms_random.random fetch next 4 rows only";
		ResultSet resultSet=s.executeQuery(select);
		while(resultSet.next())
		{
			Product p=new Product(resultSet.getInt("product_id"),resultSet.getString("product_name"),resultSet.getDouble("product_price"),resultSet.getString("product_image"),resultSet.getDate("created_at"));
			plist.add(p);
		}
		
		return plist;
	}

	@Override
	public List<Product> findCategoryWiseProducts(String category) throws SQLException, ClassNotFoundException {
		Product p1=null;
		List<Product> productList=new ArrayList<>();
		Connection conn=DBConnection.getConnection();
		String select="select product_name,product_price,product_quantity,product_category,product_image from products where product_category=?";
		final PreparedStatement preparestatement=conn.prepareStatement(select);
		preparestatement.setString(1,category);
		final ResultSet rs=preparestatement.executeQuery();
		int i=1;
		while(rs.next())
		{
			
			p1=new Product(rs.getString("product_name"),
					rs.getDouble("product_price"),
					rs.getInt("product_quantity"),
					rs.getString("product_category"),
					rs.getString("product_image"));
			productList.add(p1);
		}
		rs.close();
		preparestatement.close();
		conn.close();
		return productList;
	}

}
	



