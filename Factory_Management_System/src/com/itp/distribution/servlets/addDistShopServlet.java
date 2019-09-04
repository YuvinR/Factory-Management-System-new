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
 * Servlet implementation class addDistShopServlet
 */
@WebServlet("/addDistShopServlet")
public class addDistShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addDistShopServlet() {
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
		
		DistShop distShop = new DistShop();
		
		distShop.setShopId(request.getParameter("shopid"));
		distShop.setShopName(request.getParameter("shopname"));
		distShop.setOwnerName(request.getParameter("ownername"));
		distShop.setContactNo(request.getParameter("contactno"));
		distShop.setEmail(request.getParameter("email"));
		distShop.setAddress(request.getParameter("address"));
		
		
		IDistShop idistshop1 = new IDistShopImpl();
		idistshop1.addShop(distShop);
		
		IDistShop idistshop2 = new IDistShopImpl();
		request.setAttribute("data", idistshop2.viewDistShops());
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addShopList.jsp");

		if (dispatcher != null) {
			dispatcher.forward(request, response);	
		}
		
	}	

}
