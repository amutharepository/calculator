package demo2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
       		PrintWriter out=response.getWriter();
      int number1=Integer.parseInt(request.getParameter("n1"));
       		
       		
       int number2=Integer.parseInt(request.getParameter("n2"));
       		String str= request.getParameter("calc");
       		if(str.equals("add")) {
       		int addition=number1+number2;
       		out.print("addition "+addition);
       		}
       		else if(str.equals("sub")){
       		int subtraction=number1-number2;
       		out.print("subtraction"+subtraction);
       		}
       		else if(str.equals("mult")) {
       		int multiplication=number1*number2;
       		out.print("multi"+multiplication);}
       		else {
       		int division=number1/number2;
       		out.print("division"+division);
      
       	
       		}
       		
		}

}
