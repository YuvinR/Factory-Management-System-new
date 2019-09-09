package com.itp.salary.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.inv.services.implProduct;
import com.itp.inv.services.productfunction;
import com.itp.salary.services.IPay_Set;
import com.itp.salary.services.IPay_SetImpl;

/**
 * Servlet implementation class SalTableOpt
 */
@WebServlet("/SalTableOpt")
public class SalTableOpt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalTableOpt() {
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
		if (request.getParameter("delete") != null) {
			IPay_Set prdct = new IPay_SetImpl();
	    	 prdct.removefunc(request.getParameter("delete"));
	    	
//	    	 System.out.println(request.getParameter("remove"));
	    	
	    	 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/SalSetting.jsp");
	 		dispatcher.forward(request, response);
		}
	}

}
