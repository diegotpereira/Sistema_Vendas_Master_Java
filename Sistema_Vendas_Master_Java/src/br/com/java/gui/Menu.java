package br.com.java.gui;

public class Menu extends javax.swing.JFrame{
	
	public Menu() {
		initComponents();
	}
	
	 private void initComponents() {
		 toolBar = new javax.swing.JToolBar();
		 btVenda = new javax.swing.JButton();
		 
		 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	     setTitle("Sistema de Vendas");

		 
		 toolBar.setFloatable(false);
		 toolBar.add(btVenda);
	 }
	 
	 private javax.swing.JToolBar toolBar;
	 private javax.swing.JButton btVenda;
	 

}
