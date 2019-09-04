package com.itp.distribution.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.distribution.model.DistItem;
import com.itp.distribution.model.DistShop;
import com.itp.distribution.services.IDistItem;
import com.itp.distribution.services.IDistItemImpl;

/**
 * Servlet implementation class addDistItemServlet
 */
@WebServlet("/addDistItemServlet")
public class addDistItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addDistItemServlet() {
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
		
		DistItem distItem = new DistItem();
		
		distItem.setDistributedCode(request.getParameter("distributioncode"));
		distItem.setItemCode(request.getParameter("itemcode"));
		distItem.setShopId(request.getParameter("shopid"));
		distItem.setDistributedCount(Integer.parseInt(request.getParameter("distributioncount")));
		distItem.setReturnedCount(Integer.parseInt(request.getParameter("returncount")));
		distItem.setIncome(Integer.parseInt(request.getParameter("income")));
		distItem.setDate(request.getParameter("date"));
		
		IDistItem idistitem1 = new IDistItemImpl();
		idistitem1.addDistItem(distItem);
		
		IDistItem idistitem2 = new IDistItemImpl();
		request.setAttribute("data", idistitem2.viewDistItems());
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addItemList.jsp");
		
		if(dispatcher !=null) {
		dispatcher.forward(request, response);
		}
	}

}
