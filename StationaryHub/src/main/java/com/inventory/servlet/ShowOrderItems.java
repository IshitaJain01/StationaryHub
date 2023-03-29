package com.inventory.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.OrderItemsDao;
import com.inventory.model.OrderItems;

/**
 * Servlet implementation class ShowOrderItems
 */
@WebServlet("/ShowOrderItems")
public class ShowOrderItems extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idstring = request.getParameter("id");
		int id = Integer.parseInt(idstring);

		OrderItemsDao orderitems = new OrderItemsDao();
		try {
			List<OrderItems> itemList = orderitems.findOrdersById(id);
			request.setAttribute("items", itemList);
			request.getRequestDispatcher("orders.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
