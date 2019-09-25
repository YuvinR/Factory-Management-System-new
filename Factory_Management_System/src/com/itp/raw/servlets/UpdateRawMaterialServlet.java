package com.itp.raw.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.sup.model.Supplier;
import com.itp.raw.model.rawMaterial;
import com.itp.raw.services.IRawMaterialServices;
import com.itp.sup.services.ISupplierServices;
import com.itp.raw.services.RawMaterialServiceImpl;
import com.itp.sup.services.SupplierServiceImpl;

/**
 * Servlet implementation class UpdateRawMaterialServlet
 */
@WebServlet("/UpdateRawMaterialServlet")
public class UpdateRawMaterialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateRawMaterialServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		System.out.println("hello");
		String rid = request.getParameter("rID");
		String rawName =request.getParameter("rName");
		String rDescription = request.getParameter("rawDes");
		System.out.println(rDescription);
		String storeID = request.getParameter("storeID");
		double unitPrice = (Double.parseDouble(request.getParameter("uPrice")));
		String status = request.getParameter("Status");
		
		rawMaterial material = new rawMaterial();
		
		material.setRawMaterialName(rawName);
		material.setRawMaterialDes(rDescription);
		material.setStoreID(storeID);
		material.setUnitPrice(unitPrice);
		material.setStatus(status);
		material.setRawMaterialID(rid);
		
		IRawMaterialServices iRawMaterialServices = new RawMaterialServiceImpl();
		iRawMaterialServices.updateRawMaterial(rid, material);
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/rawMaterialList.jsp");
		dispatcher.forward(request, response);
	}

}
