package com.itp.inv.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.inv.model.storeinf;
import com.itp.inv.services.storefunction;
import com.itp.inv.services.storeimpliment;

/**
 * Servlet implementation class addstore
 */
@WebServlet("/addstore")
public class addstore extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addstore() {
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
		
		storeinf stinfo = new storeinf();
		
		stinfo.setStoreName(request.getParameter("storeName"));
		stinfo.setPhoneNo(Integer.parseInt(request.getParameter("phoneno")));
		stinfo.setAdline1(request.getParameter("inputAddress"));
		stinfo.setAdline2(request.getParameter("inputAddress2"));
		stinfo.setStemail(request.getParameter("email"));
		stinfo.setCity(request.getParameter("inputCity"));
		stinfo.setProvince(request.getParameter("inputState"));
		stinfo.setZip(Integer.parseInt(request.getParameter("inputZip")));
		stinfo.setMaxitem(Integer.parseInt(request.getParameter("maxitem")));
		
		storefunction fn1 = new storeimpliment();
		fn1.addstore(stinfo);
		
	}

}
