package controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;
import database.DataBaseConnection;
import model.Cliente;


/**
 * Servlet implementation class ReadController
 */


@WebServlet("/ReadController")
public class ReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		
		try {
					
			Connection connection = DataBaseConnection.createConnection();
  		     ClienteDAO clienteDAO = new ClienteDAO(connection);	
		     List<Cliente> clientes = clienteDAO.listarCliente(); // chamando o array
		    
		     
		     req.setAttribute("clientes", clientes);// inseriu a lista dentro do atributo
		     RequestDispatcher rd = req.getRequestDispatcher("listarClientes.jsp");// manda o atributo para a reuisição
		     rd.forward(req, res);// e mostra qual a pagina será exibida a requisiçao
		     
		     
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}


	
}
