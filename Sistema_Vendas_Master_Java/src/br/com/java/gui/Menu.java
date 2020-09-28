package br.com.java.gui;

import br.com.java.gui.CadastroFornecedor;

import br.com.java.gui.LancamentoVenda;

import br.com.java.gui.LancamentoCompra;

import br.com.java.gui.Sobre;

import br.com.java.gui.CadastroCliente;

import br.com.java.gui.CadastroProduto;

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

		 // Componente toolBar
		 toolBar.setFloatable(false);
		 toolBar.add(btVenda);
		 toolBar.add(btCompra);
		 toolBar.add(btProduto);
		 toolBar.add(btCliente);
		 toolBar.add(btFornecedor);
		 toolBar.add(btSair);
		 getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);
		 
		 
		 // componente menuSistema
		 menuSistema.setText("Sistema");
		 menuSistema.add(miSobre);
		 menuSistema.add(miSair);
		 menuBar.add(menuSistema);
		 
		 

		
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
		 
		 
			// Componente miProduto
			miProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
			miProduto.setText("Cadastrar Produto");
			miProduto.addActionListener(new java.awt.event.ActionListener() {
			    public void actionPerformed(java.awt.event.ActionEvent evt) {
			        miProdutoActionPerformed(evt);
			    }
			});
	        menuCadastros.add(miProduto);
	        	
	        ///Adicionado evento miCliente
	        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/cliente.png"))); // NOI18N
	        btCliente.setText("Cliente");
	        btCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        btCliente.setFocusable(false);
	        btCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        btCliente.setMargin(new java.awt.Insets(2, 12, 2, 12));
	        btCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/cliente-foco.png"))); // NOI18N
	        btCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	        btCliente.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
	        });
	        
	        miCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
	        miCliente.setText("Cadastrar Cliente");
	        miCliente.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                miClienteActionPerformed(evt);
	            }
	        });
	        menuCadastros.add(miCliente);
	        
	        
	        //criação do componente btFornecedor
	        btFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/fornecedor.png"))); // NOI18N
	        btFornecedor.setText("Fornecedor");
	        btFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        btFornecedor.setFocusable(false);
	        btFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        btFornecedor.setMargin(new java.awt.Insets(2, 12, 2, 12));
	        btFornecedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/fornecedor-foco.png"))); // NOI18N
	        btFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	        btFornecedor.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                miFornecedorActionPerformed(evt);
	            }
	        });
	        miFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
	        miFornecedor.setText("Cadastrar Fornecedor");
	        miFornecedor.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                miFornecedorActionPerformed(evt);
	            }
	        });
	        
	        menuCadastros.add(miFornecedor);
	        
	        //Adicionado componente cadastro vendas 
	        btVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/venda.png"))); // NOI18N
	        btVenda.setText("Venda");
	        btVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        btVenda.setFocusable(false);
	        btVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        btVenda.setMargin(new java.awt.Insets(2, 12, 2, 12));
	        btVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/venda-foco.png"))); // NOI18N
	        btVenda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
	        btVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	        btVenda.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                miVendaActionPerformed(evt);
	            }
	        });
	        
	        miVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
	        miVenda.setText("Registrar Venda");
	        miVenda.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                miVendaActionPerformed(evt);
	            }
	        });
	        menuMovimentos.add(miVenda);
	        
	        
	        
	        //Adicionado componente menuMovimentos
	        menuMovimentos.setText("Movimentos");
	        menuMovimentos.add(miVenda);
	        menuMovimentos.add(miCompra);
	        menuBar.add(menuMovimentos);
	        
	        
	        
	        ///componente miCompra
	        btCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/compra.png"))); // NOI18N
	        btCompra.setText("Compra");
	        btCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        btCompra.setFocusable(false);
	        btCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        btCompra.setMargin(new java.awt.Insets(2, 12, 2, 12));
	        btCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/compra-foco.png"))); // NOI18N
	        btCompra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
	        btCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	        btCompra.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                miCompraActionPerformed(evt);
	            }
	        });
	        
	        miCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
	        miCompra.setText("Registrar Compra");
	        miCompra.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                miCompraActionPerformed(evt);
	            }
	        });
	        menuMovimentos.add(miCompra);
	        
	        
	        
	        /// Componente miSobre
	        miSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
	        miSobre.setText("Sobre");
	        miSobre.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                miSobreActionPerformed(evt);
	            }
	        });
	        menuSistema.add(miSobre);
	        
	        /// criação do componente miSair
	        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/sair.png"))); // NOI18N
	        btSair.setText("Sair");
	        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        btSair.setFocusable(false);
	        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	        btSair.setMargin(new java.awt.Insets(2, 12, 2, 12));
	        btSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/sair-foco.png"))); // NOI18N
	        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
	        btSair.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                miSairActionPerformed(evt);
	            }
	        });
	        toolBar.add(btSair);
	        
	        miSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
	        miSair.setText("Sair");
	        miSair.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                miSairActionPerformed(evt);
	            }
	        });
	        menuSistema.add(miSair);
		      
	      
        
	        
	       
	 }
	 
	// Evento Cadastro de produto
     private void miProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProdutoActionPerformed
         CadastroProduto c = new CadastroProduto();
         desktopPane.add(c);
         c.setVisible(true);
     }//GEN-LAST:event_miProdutoActionPerformed
     
     //Evento Cadastro Cliente 
     private void miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteActionPerformed
         CadastroCliente c = new CadastroCliente();
         desktopPane.add(c);
         c.setVisible(true);
     }//GEN-LAST:event_miClienteActionPerformed
     
     //Evento Cadastrar Fornecedor 
     private void miFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFornecedorActionPerformed
         CadastroFornecedor c = new CadastroFornecedor();
         desktopPane.add(c);
         c.setVisible(true);
     }//GEN-LAST:event_miFornecedorActionPerformed
     
     
     ///Adicionado o evento cadastro de vendas 
     private void miVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaActionPerformed
         LancamentoVenda v = new LancamentoVenda();
         desktopPane.add(v);
         v.setVisible(true);
     }//GEN-LAST:event_miVendaActionPerformed
     
     
     //Adicionando evento cadastro compras
     private void miCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCompraActionPerformed
         LancamentoCompra c = new LancamentoCompra();
         desktopPane.add(c);
         c.setVisible(true);
     }//GEN-LAST:event_miCompraActionPerformed
     
     
     ///evento miSobre
     private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
         Sobre s = new Sobre(this, true);
         s.setVisible(true);
     }//GEN-LAST:event_miSobreActionPerformed
     
     
     //Evento miSair
     private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
         System.exit(0);
     }//GEN-LAST:event_miSairActionPerformed
     
     
     
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
