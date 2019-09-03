package com.itp.distribution.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.distribution.model.DistVehicle;
import com.itp.distribution.services.IDistVehicle;
import com.itp.distribution.services.IDistVehicleImpl;

/**
 * Servlet implementation class addDistVehicleServlet
 */
@WebServlet("/addDistVehicleServlet")
public class addDistVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addDistVehicleServlet() {
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
		
		DistVehicle distvehicle = new DistVehicle();
		
		distvehicle.setVehicleNumber(request.getParameter("vehiclenumber"));
		distvehicle.setVehicleName(request.getParameter("vehiclename"));
		distvehicle.setArea(request.getParameter("area"));
		distvehicle.setDriverCode(request.getParameter("driverid"));
		distvehicle.setAssistantCode(request.getParameter("assistantid"));
		distvehicle.setDate(request.getParameter("date"));
		
		
		IDistVehicle idistvehicle1 = new IDistVehicleImpl();
		idistvehicle1.addVehicle(distvehicle);
		
		IDistVehicle idistvehicle2 = new IDistVehicleImpl();
		request.setAttribute("data", idistvehicle2.viewDistVehicles());
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addVehicleList.jsp");
		
		if (dispatcher != null) {
			dispatcher.forward(request, response);
		}
		
	}

}
