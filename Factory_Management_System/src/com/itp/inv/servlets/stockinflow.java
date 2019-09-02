package com.itp.inv.servlets;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.inv.model.product;
import com.itp.inv.model.stock;
import com.itp.inv.services.implProduct;
import com.itp.inv.services.productfunction;
import com.itp.inv.services.stockhandler;
import com.itp.inv.services.stockhandlerImpl;

/**
 * Servlet implementation class stockinflow
 */
@WebServlet("/stockinflow")
public class stockinflow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stockinflow() {
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
		stock stk = new stock();
		System.out.println("Hello");
		stk.setProcode(request.getParameter("pcode"));
		
		stk.setAmount(Integer.parseInt(request.getParameter("amount")));
		stk.setDate(request.getParameter("date"));
		

		
		stockhandler stk1 = new stockhandlerImpl();
		stk1.stockadd(stk);
		//stockhandler stk2 = new stockhandlerImpl();
		
		/*request.setAttribute("data",stk1.viewinflow());
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/viewinflow.jsp");
		if(dispatcher!=null)
		{
			dispatcher.forward(request,response);
		}*/
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/viewinflow.jsp");
		dispatcher.forward(request, response);
		
	}

}
