package com.itp.maintain.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.maintain.model.addmechine;
import com.itp.sup.services.ISupplierServices;
import com.itp.maintain.services.IaddmachineImpl;
import com.itp.sup.services.SupplierServiceImpl;

/**
 * Servlet implementation class UpdateMachineServlet
 */
@WebServlet("/UpdateMachineServlet")
public class UpdateMachineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMachineServlet() {
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
		doGet(request, response);
	
		addmechine am = new addmechine();
		
		System.out.println("hello");
		String mid = request.getParameter("machineID");

		String brand =request.getParameter("Machine_Brand");
		String value = request.getParameter("Value");

		String gdate = request.getParameter("Date_of_buy");
		String fdate = request.getParameter("Date_of_fixed");
	
		
		am.setMachine_Number(mid);
		am.setMachine_Brand(brand);
		am.setValue(Double.parseDouble(value));
		am.setDate_of_buy(gdate);
		am.setDate_of_fixed(fdate);
		
		IaddmachineImpl addm = new IaddmachineImpl();
		addm.updateMachine(mid, am);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/viewmachines.jsp");
		dispatcher.forward(request, response);
	}

}
