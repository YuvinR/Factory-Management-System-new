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

import com.itp.financial.model.modelcost;
import com.itp.financial.services.Costi;
import com.itp.financial.services.Costimpl;



/**
 * Servlet implementation class updatecost
 */
@WebServlet("/updatecost")
public class updatecost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatecost() {
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
		
		modelcost prd = new modelcost();
		try {
			java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
			//prd.setDate(date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			
		
		prd.setCostCode(Integer.parseInt(request.getParameter("CostCode")));
		prd.setDescription(request.getParameter("Description"));
		prd.setType(request.getParameter("Type"));
		prd.setDate(sqlDate);
		prd.setAmount(Double.parseDouble(request.getParameter("Amount")));
			
		System.out.println(request.getParameter("CostCode"));
		
		Costi pr1 = new Costimpl();
		pr1.updateproduct(prd);
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Cost&Income.jsp");
		dispatcher.forward(request, response);

		
	}

	}


