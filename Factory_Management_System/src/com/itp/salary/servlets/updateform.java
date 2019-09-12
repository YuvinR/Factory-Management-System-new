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

import com.itp.inv.model.product;
import com.itp.inv.services.implProduct;
import com.itp.inv.services.productfunction;
import com.itp.salary.model.Setting;
import com.itp.salary.services.IPay_Set;
import com.itp.salary.services.IPay_SetImpl;

/**
 * Servlet implementation class updateform
 */
@WebServlet("/updateform")
public class updateform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateform() {
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
		
		Setting prd = new Setting();
		try {
			
			
		
		prd.setPayment_Type(request.getParameter("Payment_Type"));
		prd.setValue(Integer.parseInt(request.getParameter("value")));
		
		
		IPay_Set prdct = new IPay_SetImpl();
		prdct.updatesal(prd);
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/SalSetting.jsp");
		dispatcher.forward(request, response);
		
		
	}
	}


