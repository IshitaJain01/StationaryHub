package com.inventory.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.inventory.essentials.Hash;
import com.inventory.util.DBConnection;

/**
 * Servlet implementation class NewpasswordServlet
 */
@WebServlet("/NewpasswordServlet")
public class NewpasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String newPassword = request.getParameter("password");
		String confPassword = request.getParameter("confPassword");
		
		if (newPassword != null && confPassword != null && newPassword.equals(confPassword)) {

			try {
				
				Connection con = DBConnection.getConnection();
				PreparedStatement pst = con.prepareStatement("update users set user_password=? where user_email = ?");
				pst.setString(1, newPassword);
				pst.setString(2, Hash.encrypt(request.getParameter("email")+""));
				

				int rowCount = pst.executeUpdate();
				if (rowCount > 0) {
					request.setAttribute("status", "resetSuccess");
					response.sendRedirect("login.jsp");
				} else {
					request.setAttribute("status", "resetFailed");
					 response.sendRedirect("newPassword.jsp");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		}
	}
	


