package com.itp.emp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.emp.services.EmployeeServiceImpl;
import com.itp.emp.services.IEmployeeServices;
import com.itp.login.services.ILoginServices;
import com.itp.login.services.LoginServicesImpl;

/**
 * Servlet implementation class DeleteEmployeeServlet
 */
@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		System.out.println("Delete servlet");
		
		String empID = request.getParameter("deleteText");
		System.out.println(empID);
		IEmployeeServices iEmployeeServices = new EmployeeServiceImpl();
		iEmployeeServices.removeEmployee(empID);
		
		ILoginServices iLoginServices = new LoginServicesImpl();
		iLoginServices.removeLogin(empID);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/EmployeeList.jsp");
		dispatcher.forward(request, response);
	}

}
