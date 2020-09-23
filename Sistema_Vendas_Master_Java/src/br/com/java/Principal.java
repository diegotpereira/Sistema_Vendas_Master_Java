package br.com.java;

import java.sql.SQLException;

import br.com.java.bd.Conexao;
import br.com.java.gui.Menu;

public class Principal {
	
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
		 //Conexao conexao = new Conexao();
		 //conexao.setVisible(true);
		 
		 //System.out.println("Conectado ao banco de dados");
		 
		 Menu menu =  new Menu();
		 menu.setVisible(true);
		 
	        
	    }

}
