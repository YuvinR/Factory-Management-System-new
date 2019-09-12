package com.itp.inv.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.inv.model.product;
import com.itp.inv.services.implProduct;
import com.itp.inv.services.productfunction;

/**
 * Servlet implementation class tableOperation
 */
@WebServlet("/tableOperation")
public class tableOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tableOperation() {
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
			
			 
			 
			 
			 productfunction prd1 = new implProduct();
		ArrayList<product> prlist1 = prd1.searchById(request.getParameter("update"));
			 request.setAttribute("data",prd1.searchById(request.getParameter("update")));
			 
<<<<<<< HEAD
			 
		
=======
			
>>>>>>> f1ee8689741c1c9706945513faec5be65b8e354d
			 
			 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/updateform.jsp");
		 		dispatcher.forward(request, response);
			

	    } else if (request.getParameter("remove") != null) {
	          //delete button is clicked
	          //Do the delete action or forward the request to the servlet to do delete action
	    	
	    	productfunction prdct = new implProduct();
	    	 prdct.removeProduct(request.getParameter("remove"));
	    	
//	    	 System.out.println(request.getParameter("remove"));
	    	
	    	 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/viewproduct.jsp");
	 		dispatcher.forward(request, response);
	    }
		
	}
	
	

}
