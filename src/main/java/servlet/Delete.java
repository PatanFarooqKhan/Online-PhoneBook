package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DeleteDao;

@WebServlet("/delete")
public class Delete extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		boolean res=DeleteDao.deleteContact(id);
		
		if(res)
		{
			PrintWriter pw= resp.getWriter();
			pw.write("<h1 style=color:green>SUCCESSFULLY CONTACT DELETED</h1>");
			RequestDispatcher rd= req.getRequestDispatcher("view.jsp");
			rd.include(req, resp);
		}
		else {
			PrintWriter pw= resp.getWriter();
			pw.write("<h1 style=color:red>VALUES CON'T DELETE, SOMTHING WENT WRONG!!!</h1>");
			RequestDispatcher rd= req.getRequestDispatcher("view.jsp");
			rd.include(req, resp);
		}
	}
}
