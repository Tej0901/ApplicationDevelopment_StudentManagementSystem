package com.app.teja;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie cookie = new Cookie("uName", "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		out.println("<hr><center><b>you are Successfully Logged Out.....<hr>");
		out.println("<a href=\"homePage.html\">\n"
				+ "<button class=\"block\"><b> Home Page </b></button>\n"
				+ "</a>");
		out.close();

	}

}