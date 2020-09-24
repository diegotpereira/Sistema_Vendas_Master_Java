package br.com.java;

import java.sql.SQLException;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import br.com.java.bd.Conexao;
import br.com.java.gui.Menu;

public class Principal {
	
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
		 //Conexao conexao = new Conexao();
		 //conexao.setVisible(true);
		 
		 //System.out.println("Conectado ao banco de dados");
		 lookAndFeel();
		 
		 Menu menu =  new Menu();
		 menu.setVisible(true);
		 
	        
	    }

	private static void lookAndFeel() {
		// TODO Auto-generated method stub
		 try {
	            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	            JFrame.setDefaultLookAndFeelDecorated(true);
	            JDialog.setDefaultLookAndFeelDecorated(true);
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
	            JOptionPane.showMessageDialog(null, e, "Erro", JOptionPane.ERROR_MESSAGE);
	        }
		
	}

}
