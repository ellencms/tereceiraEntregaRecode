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
import model.Cliente;


@WebServlet("/CreateController")
public class CreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
   	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws 
	ServletException, IOException {
		
		Cliente cliente = new Cliente();
		
		cliente.setNome(req.getParameter("Nome"));
		cliente.setCpf(req.getParameter("Cpf"));
		cliente.setTelefone(req.getParameter("Telefone"));
		cliente.setEndereco(req.getParameter("Endereco"));
		cliente.setEmail(req.getParameter("Email"));
        try {
        	Connection connection = DataBaseConnection.createConnection();
    		ClienteDAO clienteDAO = new ClienteDAO(connection);
    		clienteDAO.createCliente(cliente);
    		res.sendRedirect("ReadController");

           } catch(Exception e) {
        	   
        	   e.printStackTrace();
        	   
        	   
           }


	}
		
		
	}


