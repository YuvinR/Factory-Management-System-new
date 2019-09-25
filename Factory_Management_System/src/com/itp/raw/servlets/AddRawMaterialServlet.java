package com.itp.raw.servlets;


import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.itp.raw.model.rawMaterial;
import com.itp.raw.services.IRawMaterialServices;
import com.itp.raw.services.RawMaterialServiceImpl;
import com.itp.sup.model.Supplier;


/**
 * Servlet implementation class AddRawMaterialServlet
 */
@WebServlet("/AddRawMaterialServlet")
public class AddRawMaterialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRawMaterialServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletFileUpload sfile = new ServletFileUpload(new DiskFileItemFactory());
		List<FileItem> formItem = null;
		
		rawMaterial rm = new rawMaterial();
		
		String rname = null, rid=null, rdes=null, rstoreid=null, ruprice=null, rstatus ;
		
		try {
			formItem = sfile.parseRequest(request);
			
		}catch(FileUploadException exception) {
			exception.printStackTrace();
		}
		
		for(FileItem item : formItem) {
			
			String textInput = item.getFieldName();
			
			if(textInput.equals("rID")) {
				 
				rm.setRawMaterialID(item.getString());
			
			}else if(textInput.equals("rImage")) {
				
				try {
					
					String name = "C:\\Users\\HP\\Desktop\\NewITP\\Factory-Management-System-new\\Factory_Management_System\\WebContent\\rMaterialImages\\" 
							+ "\\" + item.getName();
					
					item.write(new File(name));
					rm.setImage(item.getName());
							
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}else if (textInput.equals("rName")) {
				
				rm.setRawMaterialName(item.getString());
			
			}else if(textInput.equals("rawDes")) {
				
				rm.setRawMaterialDes(item.getString());
		
			}else if (textInput.equals("storeID")) {
				
				rm.setStoreID(item.getString());
			
			}else if (textInput.equals("unitPrice")) {
				
				rm.setUnitPrice(Double.parseDouble(item.getString()));
			
			}else if(textInput.equals("status")) {
				
				rm.setStatus(item.getString());
			}
			
		}
		
		IRawMaterialServices iRawMaterialServices = new RawMaterialServiceImpl();
		iRawMaterialServices.addRawMaterial(rm);
		/*
		 * response.setContentType("text/html");
		 * 
		 * rawMaterial rm = new rawMaterial();
		 * 
		 * rm.setRawMaterialName(request.getParameter("rName"));
		 * rm.setRawMaterialDes(request.getParameter("rawDes"));
		 * rm.setStoreID(request.getParameter("storeID"));
		 * rm.setUnitPrice(Double.parseDouble(request.getParameter("unitPrice")));
		 * rm.setStatus(request.getParameter("status"));
		 * 
		 * IRawMaterialServices iRawMaterialServices = new RawMaterialServiceImpl();
		 * iRawMaterialServices.addRawMaterial(rm);
		 * 
		 * request.setAttribute("rawMaterial", rm);
		 */
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/rawMaterialList.jsp");
		dispatcher.forward(request, response);
	}

}
