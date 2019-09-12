
package com.itp.distribution.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.distribution.model.DistShop;
import com.itp.distribution.services.IDistShop;
import com.itp.distribution.services.IDistShopImpl;

/**
 * Servlet implementation class deleteDistShopServlet
 */
@WebServlet("/deleteDistShopServlet")
public class deleteDistShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteDistShopServlet() {
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
			
			IDistShop idistshopu = new IDistShopImpl();
			ArrayList<DistShop> idistshoplist1 = idistshopu.searchById(request.getParameter("update"));
			request.setAttribute("data", idistshopu.searchById(request.getParameter("update")));
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/updateShopList.jsp");
			dispatcher.forward(request, response);
			
		}else if(request.getParameter("delete") != null) {
			IDistShop idistshop1 = new IDistShopImpl();
			idistshop1.removeFunc(request.getParameter("delete"));
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addShopList.jsp");
			dispatcher.forward(request, response);
		}
	}

}

