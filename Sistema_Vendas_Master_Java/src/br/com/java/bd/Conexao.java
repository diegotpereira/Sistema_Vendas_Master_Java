package br.com.java.bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public final String SERVIDOR = "localhost";
	public final String PORTA = "3306";
	public final String BD = "";
	public final String USUARIO = "";
	public final String SENHA = "";
	public final String URL = "";
	
	public Connection conexao;
	
	public Conexao() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
			conexao.setAutoCommit(false);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
