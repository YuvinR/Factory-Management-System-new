package com.itp.maintain.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.maintain.model.addmechine;
import com.itp.maintain.services.Iaddmachine;
import com.itp.maintain.services.IaddmachineImpl;


/**
 * Servlet implementation class addmechineList
 */
@WebServlet("/addmechineList")
public class addmechineList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addmechineList() {
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
		
		addmechine addmechineo = new addmechine();
		
		addmechineo.setMachine_Number(request.getParameter("machineID"));
		addmechineo.setMachine_Brand(request.getParameter("Machine_Brand"));
		addmechineo.setValue(Double.parseDouble(request.getParameter("Value")));
		addmechineo.setDate_of_buy(request.getParameter("Date_of_buy"));
		addmechineo.setDate_of_fixed(request.getParameter("Date_of_fixed"));
		
		IaddmachineImpl iaddmachine=new IaddmachineImpl();
		iaddmachine.addmechinemethod(addmechineo);
		
		
		IaddmachineImpl iaddmachine2 = new IaddmachineImpl();
		request.setAttribute("data", iaddmachine);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/viewmachines.jsp");
		if (dispatcher !=null) {
			dispatcher.forward(request, response);
			
		}
		
	}

}
