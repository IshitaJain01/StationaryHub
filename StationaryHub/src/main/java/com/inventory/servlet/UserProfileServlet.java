package com.inventory.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.inventory.dao.UserDao;
import com.inventory.model.User;

/**
 * Servlet implementation class UserProfile
 */
@WebServlet("/User-Profile")
public class UserProfileServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    /**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserProfileServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()) {
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String email = request.getParameter("email");
			long phnumber = Long.decode(request.getParameter("phoneNo")).longValue();
			String address = request.getParameter("address");
			int id = Integer.parseInt(request.getParameter("id"));
			User user = new User();
			user.setUser_firstname(fname);
			user.setUser_lastname(lname);
			user.setUser_email(email);
			user.setUser_contact(phnumber);
			user.setUser_address(address);
			user.setUser_id(id);
			UserDao udao = new UserDao();
		    
			if (udao.updateUser(user)) {
				HttpSession httpSession = request.getSession();
				
				httpSession.setAttribute("profile_updated","Profile Updated Succesfully");
				request.getSession().removeAttribute("auth");
			    request.getSession().setAttribute("auth",user);
				response.sendRedirect("profile.jsp");
				
			} else {
				out.print("not updated");
			}
                 
		   } catch (Exception e) {
			   e.printStackTrace();
		   }

	}

}
