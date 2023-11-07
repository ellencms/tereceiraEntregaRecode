package controller;

import java.io.IOException;
import java.sql.Connection;
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
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
            int idCliente = Integer.parseInt(req.getParameter("idCliente"));
		
		
		try {
			Connection connection = DataBaseConnection.createConnection();
			ClienteDAO clienteDAO = new ClienteDAO (connection);
			
			Cliente cliente = clienteDAO.buscarCliente(idCliente);
			
			req.setAttribute("cliente", cliente);
			
			RequestDispatcher rd = req.getRequestDispatcher("atualizar.jsp");
			rd.forward(req, res);
			res.sendRedirect("ReadControle");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

			 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
			
		try {
			Cliente cliente = new Cliente();
			 cliente.setIdCliente(Integer.parseInt(req.getParameter("idCliente")));
			 cliente.setNome(req.getParameter("nome"));  
             cliente.setCpf(req.getParameter("cpf"));    
             cliente.setTelefone(req.getParameter("telefone"));    
             cliente.setEndereco(req.getParameter("endereco"));
             cliente.setEmail(req.getParameter("email"));   
			
             Connection connection = DataBaseConnection.createConnection();
 			  ClienteDAO clienteDAO = new ClienteDAO (connection);
 			
			
			clienteDAO.updateCliente(cliente);
			
			res.sendRedirect("ReadController");
		} catch (Exception e) {
			
		}
		
				
		
	}


		
	}


