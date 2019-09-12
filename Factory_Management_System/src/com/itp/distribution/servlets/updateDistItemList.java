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

import com.itp.distribution.model.DistItem;
import com.itp.distribution.services.IDistItem;
import com.itp.distribution.services.IDistItemImpl;

/**
 * Servlet implementation class updateDistItemList
 */
@WebServlet("/updateDistItemList")
public class updateDistItemList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public updateDistItemList() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub
		response.setContentType("text/html");

		DistItem distieml = new DistItem();

		java.util.Date date;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());

			distieml.setDistributedCode(request.getParameter("distributioncode"));
			distieml.setItemCode(request.getParameter("itemcode"));
			distieml.setShopId(request.getParameter("shopid"));
			distieml.setDistributedCount(Integer.parseInt(request.getParameter("distributioncount")));
			distieml.setReturnedCount(Integer.parseInt(request.getParameter("returncount")));
			distieml.setIncome(Integer.parseInt(request.getParameter("income")));
			distieml.setDate(sqlDate);
			System.out.println("hi");
			System.out.println(request.getParameter("distributioncode"));

			IDistItem idi1 = new IDistItemImpl();
			idi1.updateDistItem(distieml);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/addItemList.jsp");
		dispatcher.forward(request, response);

	}

}
