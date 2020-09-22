package br.com.java.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public final String SERVIDOR = "localhost";
	public final String PORTA = "3306";
	public final String BD = "";
	public final String USUARIO = "";
	public final String SENHA = "";
	public final String URL = "";
	
	public Connection conexao;
	
	public Conexao() throws SQLException, ClassNotFoundException {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
			conexao.setAutoCommit(false);
			
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			// TODO: handle exception
			throw new ClassNotFoundException("O driver de conexão não foi adicionado ao projeto.\n" + e.getMessage());
		} catch (SQLException e) {
			// TODO: handle exception
			throw new SQLException("Problemas nos parâmetros de conexão.\n" + e.getMessage());
		}
		
	}
	
	public Connection getConexao() {
		
		return conexao;
	}
	
	public void Confirmar () throws SQLException {
		
		try {
			
			conexao.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new SQLException("Problemas na instrução SQL.\n" + e.getMessage());
		} finally {
			conexao.close();
			
		}
	}

}
