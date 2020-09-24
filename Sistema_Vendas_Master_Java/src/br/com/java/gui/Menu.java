package br.com.java.gui;

import br.com.java.gui.CadastroFornecedor;

import br.com.java.gui.LancamentoVenda;

import br.com.java.gui.LancamentoCompra;

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
