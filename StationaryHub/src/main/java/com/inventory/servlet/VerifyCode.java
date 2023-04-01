package com.inventory.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/VerifyCode")
public class VerifyCode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()){
			HttpSession session = request.getSession();
			 String ucode=(String) session.getAttribute("authcode");
			String code = request.getParameter("authcode");
			if(ucode.equals(code)) {
				out.print("verification done");
			}else {
				out.print("incorrect OTP");
			}
	}

	}
}
