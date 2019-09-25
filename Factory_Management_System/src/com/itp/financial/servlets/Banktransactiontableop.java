package com.itp.financial.servlets;

import java.io.IOException;
import java.util.ArrayList;

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
 * Servlet implementation class Banktransactiontableop
 */
@WebServlet("/Banktransactiontableop")
public class Banktransactiontableop extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Banktransactiontableop() {
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
		if (request.getParameter("update") != null) {
	        //update button is clicked
	        //Do the update action or forward the request to the servlet to do update action 
			
			 
			 
			 
			 Transactioni prd1 = new Transactionimpl();
			 ArrayList<modeltransaction> prlist1 = prd1.searchById(request.getParameter("update"));
			 request.setAttribute("data",prd1.searchById(request.getParameter("update")));
			 
			 
			 for(int rec=0;rec<prlist1.size();rec++) {
				
				 modeltransaction pr = (modeltransaction)prlist1.get(rec); 
				 System.out.println(pr.getTransactionCode());
			
			 }
			
			 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Bankupdate.jsp");
			 dispatcher.forward(request, response);
			 

	    }
		else if (request.getParameter("Remove") != null) {
	          //delete button is clicked
	          //Do the delete action or forward the request to the servlet to do delete action
	    	
			Transactioni prdct = new Transactionimpl();
	    	 prdct.removeProduct(request.getParameter("Remove"));
	    	    	// System.out.println(request.getParameter("Remove"));
	    	
	    	 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/BankTransaction.jsp");
	 		dispatcher.forward(request, response);
	    }
		
	}

}
