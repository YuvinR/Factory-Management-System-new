package com.itp.emp.servlets;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.omg.CORBA.Request;

import com.itp.emp.model.Employee;
import com.itp.login.model.Login;
import com.itp.emp.services.EmployeeServiceImpl;
import com.itp.emp.services.IEmployeeServices;
import com.itp.login.services.ILoginServices;
import com.itp.login.services.LoginServicesImpl;
import com.itp.emp.services.SendMail;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@MultipartConfig
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddEmployeeServlet() {
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

		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		List<FileItem> formItem = null;

		Employee e = new Employee();
		Login l = new Login();

		String efname = null, elname = null, eusername = null, epassword = null, eeid = null, eemail = null;

//			List<FileItem> multiFiles = sf.parseRequest(request);

//		try {
////			
//			
//			for(FileItem f : multiFiles) {	
//			    String name = "D:\\Github\\ITP_Project\\Factory-Management-System\\Project_Front-End\\Bakthi-Herbal-Lanka\\WebContent\\WEB-INF\\files" + "\\" + f.getName();
//				f.write(new File(name));
////				employee.setImg(name);
////				login.setImg(name);
//				System.out.println(name);
//				break;
//			}
//			
//
//			
//		} catch (Exception e) {		
//			e.printStackTrace();
//		}
		try {
			formItem = sf.parseRequest(request);

		} catch (FileUploadException exception) {
			exception.printStackTrace();
		}

		for (FileItem item : formItem) {

			String textInput = item.getFieldName();
			System.out.println(textInput);
			if (textInput.equals("empID")) {
				System.out.println(item.getString());
				e.setEmployeeID(item.getString());
				l.setEmpID(item.getString());
				eeid = item.getString();

			} else if (textInput.equals("image")) {

				try {
					System.out.println("asasd");

					String name = "D:\\Github\\ITP_Project\\Factory-Management-System\\Project_Front-End\\Bakthi-Herbal-Lanka\\WebContent\\images\\imagefiles"
							+ "\\" + item.getName();
					item.write(new File(name));
					e.setImg(item.getName());
					l.setImg(item.getName());
					System.out.println(item.getName());

				}

				catch (Exception exception) {
					exception.printStackTrace();
				}
			} else if (textInput.equals("fname")) {
				e.setFname(item.getString());
				l.setFname(item.getString());
				efname = item.getString();
			} else if (textInput.equals("lname")) {
				e.setLname(item.getString());
				l.setLname(item.getString());
				elname = item.getString();
			} else if (textInput.equals("gender")) {
				e.setGender(item.getString());
			} else if (textInput.equals("email")) {
				e.setEmail(item.getString());
				eemail = item.getString();
			} else if (textInput.equals("contact")) {
				e.setContactNo(Integer.parseInt(item.getString()));
			} else if (textInput.equals("address")) {
				e.setAddress(item.getString());
			} else if (textInput.equals("unit")) {
				e.setUnit(item.getString());
			} else if (textInput.equals("designation")) {
				e.setDesignation(item.getString());
				l.setDesignation(item.getString());
			} else if (textInput.equals("username")) {
				l.setUsername(item.getString());
				eusername = item.getString();
			} else if (textInput.equals("createPwrd")) {
				l.setPassword(item.getString());
				epassword = item.getString();
			} else if (textInput.equals("confirmPwrd")) {

			}
		}

		IEmployeeServices iEmployeeServices = new EmployeeServiceImpl();
		iEmployeeServices.addEmployee(e);

		ILoginServices iLoginServices = new LoginServicesImpl();
		iLoginServices.addLogin(l);

		String compose = "Hello, " + efname + " " + elname + "\n " + "EID: \t" + eeid + "\nUsername: \t" + eusername
				+ "\nPassword: \t" + epassword;

		
		  SendMail mail = new SendMail(); 
		  mail.send("itpprojectmlb05@gmail.com", "itpmlb05", eemail , "Welcome!!!",compose);
		 
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/EmployeeList.jsp");
		dispatcher.forward(request, response);

	}

}
