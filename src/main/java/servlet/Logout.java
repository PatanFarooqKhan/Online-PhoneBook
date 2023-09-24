package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class Logout extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs= req.getSession();
		hs.invalidate();//BY USING "invalidate()" WE CLEAR or WE DESTROID HTTP SESSTION OBJECTS.....
		resp.sendRedirect("login.jsp");//BU USING "sendRedirect()" WE WILL GO ANOTHER SESSTION or WEB PAGE......
		
	}
}
