package com.itp.distribution.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.distribution.model.DistItem;
import com.itp.distribution.model.DistVehicle;
import com.itp.distribution.services.IDistItem;
import com.itp.distribution.services.IDistItemImpl;
import com.itp.distribution.services.IDistVehicle;
import com.itp.distribution.services.IDistVehicleImpl;

/**
 * Servlet implementation class deleteDistVehicleServlet
 */
@WebServlet("/deleteDistVehicleServlet")
public class deleteDistVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteDistVehicleServlet() {
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
		if(request.getParameter("update") != null) {
			
			IDistVehicle idistvehiu = new IDistVehicleImpl();
			ArrayList<DistVehicle> idistvehi1 = idistvehiu.searchById(request.getParameter("update"));
			request.setAttribute("data", idistvehiu.searchById(request.getParameter("update")));
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/updateVehicleList.jsp");
			dispatcher.forward(request, response);
			
		}else if(request.getParameter("delete") != null) {
			IDistVehicle  idistvehicle1 = new IDistVehicleImpl();
			idistvehicle1.removeFunc(request.getParameter("delete"));
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addVehicleList.jsp");
			dispatcher.forward(request, response);
		}
	}

}
