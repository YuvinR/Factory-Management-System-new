package com.itp.salary.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.salary.services.IAttendance;
import com.itp.salary.services.IAttendanceImpl;

import com.itp.salary.model.Attendance;

/**
 * Servlet implementation class AttendanceList
 */
@WebServlet("/AttendanceList")
public class AttendanceList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttendanceList() {
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
		Attendance attendance=new Attendance();
		
		
		try {
			java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
			java.sql.Date sqlDate=new java.sql.Date(date.getTime());
			
			Date time1 = new SimpleDateFormat("HH:mm").parse(request.getParameter("Arrival_time"));
			java.sql.Time sqltime1=new java.sql.Time(time1.getTime());
			
			Date time2=new SimpleDateFormat("HH:mm").parse(request.getParameter("Departure_time"));
			java.sql.Time sqltime2=new java.sql.Time(time2.getTime());
			
		//	java.sql.time sqltime2=new java.sql.Time(time.get)
			
			attendance.setEmp_Id(request.getParameter("Emp_Id"));
			attendance.setDate(sqlDate);
			attendance.setArrival_time(sqltime1);
			attendance.setDeparture_time(sqltime2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		IAttendance iAttendance=new IAttendanceImpl();
		iAttendance.addAttendance(attendance);
		
		IAttendance iAttendance2=new IAttendanceImpl();
		request.setAttribute("data", iAttendance2);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Attendance.jsp");
		if (dispatcher != null) {
			dispatcher.forward(request, response);
		}
		
	}

}
