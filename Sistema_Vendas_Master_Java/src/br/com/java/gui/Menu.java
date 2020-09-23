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
		 
		 btVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/venda.png"))); // NOI18N
		 btVenda.setText("Venda");
		 btVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	     btVenda.setFocusable(false);
	     btVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	     btVenda.setMargin(new java.awt.Insets(2, 12, 2, 12));
	     btVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/venda-foco.png"))); // NOI18N
	     btVenda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
	     btVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		
		      
	      
        
	        
		 toolBar.add(btVenda);
	 }
	 
	 private javax.swing.JToolBar toolBar;
	 private javax.swing.JButton btVenda;
	 

}
