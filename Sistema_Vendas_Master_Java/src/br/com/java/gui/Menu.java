package br.com.java.gui;

public class Menu extends javax.swing.JFrame{
	
	public Menu() {
		initComponents();
	}
	
	 private void initComponents() {
		    toolBar = new javax.swing.JToolBar();
		    btVenda = new javax.swing.JButton();
	        btCompra = new javax.swing.JButton();
	        btProduto = new javax.swing.JButton();
	        btCliente = new javax.swing.JButton();
	        btFornecedor = new javax.swing.JButton();
	        btSair = new javax.swing.JButton();
	        desktopPane = new javax.swing.JDesktopPane();
	        menuBar = new javax.swing.JMenuBar();
	        menuCadastros = new javax.swing.JMenu();
	        miProduto = new javax.swing.JMenuItem();
	        miCliente = new javax.swing.JMenuItem();
	        miFornecedor = new javax.swing.JMenuItem();
	        menuMovimentos = new javax.swing.JMenu();
	        miVenda = new javax.swing.JMenuItem();
	        miCompra = new javax.swing.JMenuItem();
	        menuSistema = new javax.swing.JMenu();
	        miSobre = new javax.swing.JMenuItem();
	        miSair = new javax.swing.JMenuItem();
	  
	       
		 
		 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	     setTitle("Sistema de Vendas");

		 
		 toolBar.setFloatable(false);
		 
//		 btVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/venda.png"))); // NOI18N
//		 btVenda.setText("Venda");
//		 btVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//	     btVenda.setFocusable(false);
//	     btVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
//	     btVenda.setMargin(new java.awt.Insets(2, 12, 2, 12));
//	     btVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/venda-foco.png"))); // NOI18N
//	     btVenda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
//	     btVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		
		 // componente MenuBar
		 menuBar.add(menuCadastros);
		 menuBar.add(menuMovimentos);
		 menuBar.add(menuSistema);
		 setJMenuBar(menuBar);
		 
		 
		 // Componente MenuCadastros
		 menuCadastros.setText("Cadastros");
		 menuCadastros.add(miProduto);
		 menuCadastros.add(miCliente);
		 menuCadastros.add(miFornecedor);
		 menuBar.add(menuCadastros);
		      
	      
        
	        
		 toolBar.add(btVenda);
	 }
	    // variaveis dos componentes
	    private javax.swing.JButton btCliente;
	    private javax.swing.JButton btCompra;
	    private javax.swing.JButton btFornecedor;
	    private javax.swing.JButton btProduto;
	    private javax.swing.JButton btSair;
	    private javax.swing.JButton btVenda;
	    private javax.swing.JDesktopPane desktopPane;
	    private javax.swing.JMenuBar menuBar;
	    private javax.swing.JMenu menuCadastros;
	    private javax.swing.JMenu menuMovimentos;
	    private javax.swing.JMenu menuSistema;
	    private javax.swing.JMenuItem miCliente;
	    private javax.swing.JMenuItem miCompra;
	    private javax.swing.JMenuItem miFornecedor;
	    private javax.swing.JMenuItem miProduto;
	    private javax.swing.JMenuItem miSair;
	    private javax.swing.JMenuItem miSobre;
	    private javax.swing.JMenuItem miVenda;
	    private javax.swing.JToolBar toolBar;
	 

}
