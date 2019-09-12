package com.itp.distribution.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
 * Servlet implementation class updateDistVehicleServlet
 */
@WebServlet("/updateDistVehicleList")
public class updateDistVehicleList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateDistVehicleList() {
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
		
		DistVehicle distvehicle1 = new DistVehicle();
		
		java.util.Date date;
		
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			
			distvehicle1.setVehicleNumber(request.getParameter("vehiclenumber"));
			distvehicle1.setVehicleName(request.getParameter("vehiclename"));
			distvehicle1.setArea(request.getParameter("area"));
			distvehicle1.setDriverCode(request.getParameter("driverid"));
			distvehicle1.setAssistantCode(request.getParameter("assistantid"));
			distvehicle1.setDate(sqlDate);
			
			System.out.println("pqr");
			System.out.println(request.getParameter("vehiclenumber"));
			
			IDistVehicle idi1 = new IDistVehicleImpl();
			idi1.updateDistVehicle(distvehicle1);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addVehicleList.jsp");
		dispatcher.forward(request, response);

		
	}

}
