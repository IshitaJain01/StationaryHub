package com.inventory.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.inventory.dao.UserDao;
import com.inventory.model.User;
import com.inventory.util.DBConnection;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/user-login")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()){
			String email = request.getParameter("username");
			String password = request.getParameter("password");
		
			UserDao udao = new UserDao();
			
			User user= udao.userLogin(email, password);
		
			
		   
			if(user!=null)
			{
				out.print("user login");
				request.getSession().setAttribute("auth", user);
				response.sendRedirect("Home.jsp");
			}else {
				out.print("user login failed");
			}
		}catch(ClassNotFoundException |SQLException e) {
		  e.printStackTrace();
		}
	}
	}

