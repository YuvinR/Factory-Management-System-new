package com.itp.supplierPayment.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.sup.services.ISupplierServices;
import com.itp.sup.services.SupplierServiceImpl;
import com.itp.supplierPayment.services.ISupPaymentServices;
import com.itp.supplierPayment.services.supPaymentServiceImpl;

/**
 * Servlet implementation class DeleteSupPaymentServlet
 */
@WebServlet("/DeleteSupPaymentServlet")
public class DeleteSupPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteSupPaymentServlet() {
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
		
System.out.println("Delete servlet");
		
		String supPaymentID = request.getParameter("deleteText");
		System.out.println(supPaymentID);
		
		ISupPaymentServices iSupPaymentService = new supPaymentServiceImpl();
		iSupPaymentService.removeSupPayment(supPaymentID);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/SupplierPayment.jsp");
		dispatcher.forward(request, response);
	}

}
