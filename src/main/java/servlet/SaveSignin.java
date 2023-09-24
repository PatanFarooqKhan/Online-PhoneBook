package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.SigninDao;

@WebServlet("/savesignin")
public class SaveSignin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		long phone=Long.parseLong(req.getParameter("phone"));
		String email=req.getParameter("email");
		String password1=req.getParameter("pwd1");
		String password2=req.getParameter("pwd2");
		
		boolean res=password1.equals(password2);
		
		if(res)
		{
			boolean res2=SigninDao.saveSignin(name, phone, email, password2);
			if(res2)
			{
				PrintWriter pw= resp.getWriter();
				pw.write("<h1 style=color:yellow>ACCOUNT CREATED SUCCESS FULLY</h1>");
			 	RequestDispatcher rd= req.getRequestDispatcher("login.jsp");
			 	rd.include(req, resp);
				
			}else {
				PrintWriter pw= resp.getWriter();
				pw.write("<h1 style=color:red>ACCOUNT IS NOT CREATED...SOMTHING WENT WRONG!!! </h1>");
				pw.write("<h1 style=color:red>OR VALUSE ARE DUPLICATE IN DATABACE PLEASE TRY AGAIN!!!</h1>");
			 	RequestDispatcher rd= req.getRequestDispatcher("login.jsp");
			 	rd.include(req, resp);
			}
		}
		else {
			PrintWriter pw= resp.getWriter();
			pw.write("<h1 >password and cnf password is not matching</h1>");
		 	RequestDispatcher rd= req.getRequestDispatcher("signin.jsp");
		 	rd.include(req, resp);
		}
	}

}
