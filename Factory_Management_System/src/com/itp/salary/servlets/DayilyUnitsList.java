package com.itp.salary.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.salary.services.IinsertunitsImpl;
import com.itp.salary.services.Iinsetunits;

import com.itp.salary.model.UnitInsert;

/**
 * Servlet implementation class DayilyUnitsList
 */
@WebServlet("/DayilyUnitsList")
public class DayilyUnitsList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DayilyUnitsList() {
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
		response.setContentType("text/html");
		UnitInsert unitinsert = new UnitInsert();
		
		java.util.Date date;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
			java.sql.Date sqlDate=new java.sql.Date(date.getTime());
			unitinsert.setEmp_Id(request.getParameter("Emp_Id"));
			unitinsert.setNumUnits(Integer.parseInt(request.getParameter("NumUnits")));
			unitinsert.setDate(sqlDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 Iinsetunits insertu=new IinsertunitsImpl();
		 insertu.insertUnits(unitinsert);
		 RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/DailySal.jsp");
		 dispatcher.forward(request, response);
		 
	}

}
