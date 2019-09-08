package com.itp.inv.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.inv.model.product;
import com.itp.inv.services.implProduct;
import com.itp.inv.services.productfunction;

/**
 * Servlet implementation class updateProduct
 */
@WebServlet("/updateProduct")
public class updateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateProduct() {
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
		
		product prd = new product();
		try {
			java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
			//prd.setDate(date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			
		
		prd.setPname(request.getParameter("pname"));
		prd.setPid(request.getParameter("pcode"));
		prd.setPstore(Integer.parseInt(request.getParameter("store")));
		prd.setDate(sqlDate);
		prd.setPrice(Double.parseDouble(request.getParameter("price")));
		
		System.out.println(request.getParameter("price"));
		
		productfunction pr1 = new implProduct();
		pr1.updateproduct(prd);
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/viewproduct.jsp");
		dispatcher.forward(request, response);

		
	}

	}


