package com.itleadpro.training;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private String message;

	@Override
	public void init() throws ServletException {
		message  = "Hello world! This is my servlet";
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();

		printWriter.println("<html>");
		printWriter.println("<head><title>Hello Servlet</title></head>");
		printWriter.println("<body><h1>" + message + "</h1></body>");
		printWriter.println("</html>");

		printWriter.close();



	}
}
