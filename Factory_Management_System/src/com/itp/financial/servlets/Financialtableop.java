package com.itp.financial.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.financial.model.modelcost;
import com.itp.financial.services.Costi;
import com.itp.financial.services.Costimpl;


/**
 * Servlet implementation class Financialtableop
 */
@WebServlet("/Financialtableop")
public class Financialtableop extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Financialtableop() {
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
			
			 
			 
			 
			 Costi prd1 = new Costimpl();
			 ArrayList<modelcost> prlist1 = prd1.searchById(request.getParameter("update"));
			 request.setAttribute("data",prd1.searchById(request.getParameter("update")));
			 
			 
			 for(int rec=0;rec<prlist1.size();rec++) {
				
				 modelcost pr = (modelcost)prlist1.get(rec); 
				 System.out.println(pr.getCostCode());
			
			 }
			
			 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Financialupdate.jsp");
			 dispatcher.forward(request, response);
			 

	    }
		else if (request.getParameter("Remove") != null) {
	          //delete button is clicked
	          //Do the delete action or forward the request to the servlet to do delete action
	    	
	    	Costi prdct = new Costimpl();
	    	 prdct.removeProduct(request.getParameter("Remove"));
	    	    	// System.out.println(request.getParameter("Remove"));
	    	
	    	 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Cost&Income.jsp");
	 		dispatcher.forward(request, response);
	    }
		
	}

}
