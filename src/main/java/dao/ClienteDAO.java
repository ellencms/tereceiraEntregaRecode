package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;


public class ClienteDAO {

	private static String sql;

	private final Connection connection;

	public ClienteDAO(Connection connection) {// criação do construtor
		this.connection = connection;
	}

	// Construção do CREATE

	
	
	public void createCliente(Cliente cliente) {

		sql = "INSERT INTO cliente (nome,cpf,telefone,endereco,email) VALUES (?,?,?,?,?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getTelefone());
			stmt.setString(4, cliente.getEndereco());
			stmt.setString(5, cliente.getEmail());

			stmt.executeUpdate();

			System.out.println(" Cadastro Realizado com Sucesso! " + " Cliente:"+ cliente.getNome() + "  CPF:" + cliente.getCpf());

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}
	
	// Listar Clientes
	
	public List<Cliente> listarCliente() {
	    String sql = "SELECT * FROM cliente";
	    List<Cliente> Cliente = new ArrayList<>();
	         ResultSet r = null;
	  		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                 
	  			 r = stmt.executeQuery();
	  			
	  			while(r.next()) {
	  				
		    	Cliente cliente = new Cliente();
		    	
		    	cliente.setIdCliente(r.getInt("idCliente"));
                cliente.setNome(r.getString("nome"));  
                cliente.setCpf(r.getString("cpf"));    
                cliente.setTelefone(r.getString("telefone"));    
                cliente.setEndereco(r.getString("endereco"));
                cliente.setEmail(r.getString("email"));    
                 
                Cliente.add(cliente);
    		 	        
	        }
	  			
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return Cliente;
	
	}
	
	// Buscar Clientes
	
	 public Cliente buscarCliente(int idCliente) {
	        Cliente cliente = null;
	        String sql = "SELECT * FROM cliente WHERE idCliente = ?";
	        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
	            stmt.setInt(1, idCliente);
	            ResultSet r = stmt.executeQuery();
	            if (r.next()) {
	                cliente = new Cliente();
	                cliente.setIdCliente(r.getInt("idCliente"));;
	                cliente.setNome(r.getString("nome"));  
	                cliente.setCpf(r.getString("cpf"));    
	                cliente.setTelefone(r.getString("telefone"));    
	                cliente.setEndereco(r.getString("endereco"));
	                cliente.setEmail(r.getString("email"));   
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return cliente;
	    }
	
	
	
	// Criação do UPDATE
	
	public void updateCliente(Cliente cliente) {
		
		sql= "UPDATE cliente SET nome = ?, cpf = ?,telefone = ?, endereco = ?, email = ? WHERE idCliente = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getTelefone());
			stmt.setString(4, cliente.getEndereco());
			stmt.setString(5, cliente.getEmail());
			stmt.setInt(6, cliente.getIdCliente());
			
			stmt.executeUpdate();
			System.out.println("Cliente Atualizado com Sucesso" + "Nome:" + cliente.getNome() + "\n  CPF:" + cliente.getCpf());

			
		} catch (SQLException e) {
			System.out.println("[LOG] Não foi Possivel Atualizar o Cliente. " + "Mensagem: " + e.getMessage());
			
		}
		
	}
	
	// criação do Delete
	
	public void deleteCliente(int idCliente) {
		sql= "DELETE FROM cliente WHERE idCliente = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql))  {
			stmt.setInt(1, idCliente);
			
			stmt.executeUpdate();
			System.out.println("Cliente Deletado com Sucesso");
			
		} catch (SQLException e) {
			System.out.println( "Não foi Possivel Deletar o Cliente." + "Mensagem:" + e.getMessage());

			
		}
		
			
		
		
	}
	
}
