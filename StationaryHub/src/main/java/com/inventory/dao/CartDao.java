package com.inventory.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.inventory.model.Cart;
import com.inventory.util.DBConnection;

public class CartDao implements ICartDao<Cart> {

	@Override
	public List<Cart> GetAllCartItem(int UserId) throws ClassNotFoundException, SQLException {
		List<Cart> cartList = new ArrayList<>();
		Cart cartItem=null;
		final String query="select cart_item_id,cart_item_quantity,cart_item_unit_price,product_id,product_name from cart_item  join products  using (product_id) where user_id=?";
		
		Connection connection=DBConnection.getConnection();
		PreparedStatement preparestatement=connection.prepareStatement(query);
		preparestatement.setInt(1, UserId);
		final ResultSet resultset=preparestatement.executeQuery();
		while(resultset.next()) {
			cartItem=new  Cart();
			cartItem.setCartItemId(resultset.getInt("cart_item_id"));
			cartItem.setQuantity(resultset.getInt("cart_item_quantity"));
			cartItem.setTotalPrice(resultset.getInt("cart_item_unit_price"));
			cartItem.setProductId(resultset.getInt("product_id"));
			cartItem.setProductName(resultset.getString("product_name"));;
			cartItem.setUserId(UserId);
			cartList.add(cartItem);
		}
	connection.close();
	preparestatement.close();
	resultset.close();
		return cartList;
		
	}

	@Override
	public boolean IncrementQuantity(int CartItemID,int ProductId) throws ClassNotFoundException, SQLException {
		String UpdateQuery="update cart_item set cart_item_quantity=(select cart_item_quantity+1 from cart_item where cart_item_id=?),cart_item_unit_price=(select Product_price*(select cart_item_quantity+1 from cart_item where cart_item_id=?) from products where product_id=?) where cart_item_id=?";
		Connection connection=DBConnection.getConnection();
		PreparedStatement preparedstatement=connection.prepareStatement(UpdateQuery);
		preparedstatement.setInt(1, CartItemID);
		preparedstatement.setInt(2, CartItemID);
		preparedstatement.setInt(3, ProductId);
		preparedstatement.setInt(4, CartItemID);
		int isUpdated=preparedstatement.executeUpdate();
		if(isUpdated>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean DecrementQuantity(int CartItemID,int ProductId) throws ClassNotFoundException, SQLException {
		String UpdateQuery="update cart_item set cart_item_quantity=(select cart_item_quantity-1 from cart_item where cart_item_id=?),cart_item_unit_price=(select Product_price*(select cart_item_quantity-1 from cart_item where cart_item_id=?) from products where product_id=?) where cart_item_id=?";
		Connection connection =DBConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(UpdateQuery);
		preparedStatement.setInt(1, CartItemID);
		preparedStatement.setInt(2, CartItemID);
		preparedStatement.setInt(3, ProductId);
		preparedStatement.setInt(4, CartItemID);
		int isUPdated=preparedStatement.executeUpdate();
		if(isUPdated>0) {
			preparedStatement.close();
			connection.close();
			return true;
		}
		return false;
	}

	@Override
	public boolean RemoveCartItem(int Cartid,int UserId) throws ClassNotFoundException, SQLException {
		
		String RemoveQuery="delete from cart_item where cart_item_id=? and user_id=?";
		
		Connection connection=DBConnection.getConnection();
		PreparedStatement preparedstatement=connection.prepareStatement(RemoveQuery);
		preparedstatement.setInt(1, Cartid);
		preparedstatement.setInt(2, UserId);
		
		int isDeleted=preparedstatement.executeUpdate();
		if(isDeleted>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean createCartItem(int UserID, int prodctId) throws ClassNotFoundException, SQLException {
		Cart cart= GetSingleCartItem(UserID, prodctId);
		if(cart!=null) {
			return IncrementQuantity(cart.getCartItemId(), prodctId);
		}
		else {
			String InsertQuery="INSERT into cart_item (cart_item_unit_price,product_id,user_id)values((select product_price from products where product_id=?),?,?)";
			Connection connection=DBConnection.getConnection();
			String returnCols[] = { "CART_ITEM_ID" };
			PreparedStatement preparedstatement=connection.prepareStatement(InsertQuery,returnCols);
			preparedstatement.setInt(1, prodctId);
			preparedstatement.setInt(2, prodctId);
			preparedstatement.setInt(3, UserID);
			int isCreated=preparedstatement.executeUpdate();
			if(isCreated>0) {
//				ResultSet resultset=preparedstatement.getGeneratedKeys();
//				if(resultset.next()) {
//					int pk=resultset.getInt(1);
//					System.out.println(pk);
//				}
				connection.close();
				preparedstatement.close();
				return true;
			}
			return false;
		}
		
	}

	@Override
	public Cart GetSingleCartItem(int userID,int ProductID) throws ClassNotFoundException, SQLException {
		Cart cart=null;
		String cartItemQuery="select cart_item_id,cart_item_quantity,cart_item_unit_price,product_id,product_name,user_id from cart_item  join products  using (product_id) where user_id=? and product_id=?";
		Connection connection=DBConnection.getConnection();
		PreparedStatement preparedstatement=connection.prepareStatement(cartItemQuery);
		preparedstatement.setInt(1, userID);
		preparedstatement.setInt(2, ProductID);
		final ResultSet result=preparedstatement.executeQuery();
		if(result.next()) {
			cart=new Cart();
			cart.setCartItemId(result.getInt("cart_item_id"));
			cart.setProductId(result.getInt("product_id"));
			cart.setProductName(result.getString("product_name"));
			cart.setTotalPrice(result.getInt("cart_item_unit_price"));
			cart.setQuantity(result.getInt("cart_item_quantity"));
			cart.setUserId(result.getInt("user_id"));
			return cart;
		}
		return null;
	}

}
