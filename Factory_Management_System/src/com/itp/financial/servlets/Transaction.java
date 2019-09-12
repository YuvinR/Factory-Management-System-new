package com.itp.financial.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.financial.model.modeltransaction;
import com.itp.financial.services.Transactioni;
import com.itp.financial.services.Transactionimpl;

/**
 * Servlet implementation class Transaction
 */
@WebServlet("/Transaction")
public class Transaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transaction() {
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
		
		modeltransaction cs = new modeltransaction();
		try {
			java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("Date"));
			//prd.setDate(date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			
		cs.setTransactionCode(request.getParameter("TransactionCode"));
		cs.setAccountNo(Integer.parseInt(request.getParameter("AccountNo")));
		cs.setDescription(request.getParameter("Description"));
		cs.setType(request.getParameter("Type"));
		cs.setDate(sqlDate);
		cs.setAmount(Double.parseDouble(request.getParameter("Amount")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Transactioni sc = new Transactionimpl();
		sc.addTransaction(cs);
		
		
		Transactioni TransactionObj = new Transactionimpl();
		request.setAttribute("data",TransactionObj );
		
		
		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/BankTransaction.jsp");
		 if(dispatcher != null)
		 {
			 dispatcher.forward(request,response);
		 }
		
	}
}
