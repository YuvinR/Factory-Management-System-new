package com.itp.distribution.servlets;

import java.io.IOException;

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
 * Servlet implementation class updateDistShopList
 */
@WebServlet("/updateDistShopList")
public class updateDistShopList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateDistShopList() {
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
		
		DistShop distshop1 = new DistShop();
		

			
			distshop1.setShopId(request.getParameter("shopid"));
			distshop1.setShopName(request.getParameter("shopname"));
			distshop1.setOwnerName(request.getParameter("ownername"));
			distshop1.setContactNo(request.getParameter("contactno"));
			distshop1.setEmail(request.getParameter("email"));
			distshop1.setAddress(request.getParameter("address"));
			System.out.println("abc");
			System.out.println(request.getParameter("shopid"));
			
			IDistShop idi1 = new IDistShopImpl();
			idi1.updateDistShop(distshop1);
			
		
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addShopList.jsp");
		dispatcher.forward(request, response);
		
	}

}
