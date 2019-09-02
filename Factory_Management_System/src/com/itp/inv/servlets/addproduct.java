package com.itp.inv.servlets;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.tag.el.fmt.ParseDateTag;

import com.itp.inv.model.*;

import com.itp.inv.services.*;


/**
 * Servlet implementation class addproduct
 */
@WebServlet("/addproduct")
public class addproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addproduct() {
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
		prd.setPstore(Integer.parseInt(request.getParameter("stid")));
		prd.setDate(sqlDate);
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		productfunction pr1 = new implProduct();
		pr1.addproduct(prd);
		
	}

}
