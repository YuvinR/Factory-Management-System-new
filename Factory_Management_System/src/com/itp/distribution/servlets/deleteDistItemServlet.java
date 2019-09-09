package com.itp.distribution.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.distribution.services.IDistItem;
import com.itp.distribution.services.IDistItemImpl;

/**
 * Servlet implementation class deleteDistShopServlet
 */
@WebServlet("/deleteDistItemServlet")
public class deleteDistItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteDistItemServlet() {
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
		if (request.getParameter("delete") != null) {
			
			IDistItem idistitem1 = new IDistItemImpl();
			idistitem1.removeFunc(request.getParameter("delete"));
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addItemList.jsp");
			dispatcher.forward(request, response);
		}
	}

}
