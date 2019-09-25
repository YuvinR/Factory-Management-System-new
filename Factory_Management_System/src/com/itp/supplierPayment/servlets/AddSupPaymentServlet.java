package com.itp.supplierPayment.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.sup.model.Supplier;
import com.itp.sup.services.ISupplierServices;
import com.itp.sup.services.SupplierServiceImpl;
import com.itp.supplierPayment.model.supplierPayment;
import com.itp.supplierPayment.services.ISupPaymentServices;
import com.itp.supplierPayment.services.supPaymentServiceImpl;

/**
 * Servlet implementation class AddSupPaymentServlet
 */
@WebServlet("/AddSupPaymentServlet")
public class AddSupPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSupPaymentServlet() {
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
		
		response.setContentType("text/html");
		
		
		supplierPayment supPayment = new supplierPayment();
		
		supPayment.setSupplierID(request.getParameter("supID"));
		supPayment.setRawID(request.getParameter("rID"));
		supPayment.setRawName(request.getParameter("rName"));
		supPayment.setQty(Double.parseDouble(request.getParameter("qty")));
		supPayment.setUnitPrice(Double.parseDouble(request.getParameter("uPrice")));
		supPayment.setTotalPrice(Double.parseDouble(request.getParameter("total")));

		ISupPaymentServices iSuPaymentServices = new supPaymentServiceImpl();
		iSuPaymentServices.addSupPayment(supPayment);;
		
		request.setAttribute("supPayment", supPayment);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/SupplierPayment.jsp");
		dispatcher.forward(request, response);
		
	}
	
	

}
