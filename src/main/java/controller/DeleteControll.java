package controller;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;
import database.DataBaseConnection;


@WebServlet("/DeleteController")
public class DeleteControll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int idCliente = Integer.parseInt(req.getParameter("idCliente"));
		
		try {
			Connection connection = DataBaseConnection.createConnection();
			ClienteDAO clienteDAO = new ClienteDAO (connection);
			
			 clienteDAO.deleteCliente(idCliente);
			
			res.sendRedirect("ReadController");			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
