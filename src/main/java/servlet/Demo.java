package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SigninDao;
import dao.demo;

@WebServlet("/demo")
public class Demo extends HttpServlet {

	
	
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        String username = req.getParameter("username");
	        String password = req.getParameter("password");
	        boolean res2=demo.saveSignin(username,password);
			if(res2)
			{
				PrintWriter pw= resp.getWriter();
				pw.write("<h1>DATA SAVE SUCCESSFULLY</h1>");
			 	
				
			}else {
				PrintWriter pw= resp.getWriter();
				pw.write("<h1 style=color:red>SOMTHING WENT WRONG!!! </h1>");
				pw.write("<h1 style=color:red>OR VALUSE ARE DUPLICATE IN DATABACE PLEASE TRY AGAIN!!!</h1>");
			 
			}
	        
	        
	        // Perform user registration logic and save to the database using Hibernate
	    
	}
}
