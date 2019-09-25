package com.itp.financial.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.financial.model.modelincome;
import com.itp.financial.services.Incomei;
import com.itp.financial.services.Incomeimpl;

/**
 * Servlet implementation class Income
 */
@WebServlet("/Income")
public class Income extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Income() {
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
response.setContentType("text/html");
		
		modelincome cs = new modelincome();
		
		cs.setIncomeCode(Integer.parseInt(request.getParameter("IncomeCode")));
		cs.setDescription(request.getParameter("Description"));
		cs.setType(request.getParameter("Type"));
		cs.setDate(request.getParameter("Date"));
		cs.setAmount(request.getParameter("Amount"));
		
		Incomei sc = new Incomeimpl();
		sc.addIncome(cs);
		
		
		Incomei IncomeObj = new Incomeimpl();
		request.setAttribute("data",IncomeObj );
		
		
		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Cost&Income.jsp");
		 if(dispatcher != null)
		 {
			 dispatcher.forward(request,response);
		 }
			
	}
}