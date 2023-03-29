package com.inventory.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.inventory.dao.UserDao;
import com.inventory.model.User;

/**
 * Servlet implementation class UserSignup
 */
@WebServlet("/Sign-up")
public class UserSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()){
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String email = request.getParameter("email");
			long phnumber =Long.decode(request.getParameter("phnumber")).longValue();
			String address = request.getParameter("address");
            String password = request.getParameter("password");
			out.print(fname);
			User user=new User(fname, lname, email, phnumber, address, password);
			UserDao udao = new UserDao();
			boolean inserted= udao.userSignup(user);
			out.print(lname);
			out.print(inserted);
			
			if(inserted)
			{
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("message", "Signup Successfull");
				response.sendRedirect("index.jsp");
			}else {
				out.print("Not inserted");
			}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}


	

	
	
