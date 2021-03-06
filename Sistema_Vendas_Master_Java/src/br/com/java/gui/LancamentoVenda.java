package br.com.java.gui;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.java.dao.ProdutoDAO;
import br.com.java.gui.BuscaCliente;
import br.com.java.to.Cliente;

import br.com.java.gui.BuscaProduto;
import br.com.java.to.enums.Situacao;

import br.com.java.to.ItemVenda;
import br.com.java.to.Produto;

import br.com.java.gui.tm.ItemVendaTableModel;
import br.com.java.gui.tm.VendaTableModel;

import br.com.java.dao.VendaDAO;
import br.com.java.to.Venda;

public class LancamentoVenda extends javax.swing.JInternalFrame {
	
	private Venda venda = null;
    private VendaDAO vendaDAO = new VendaDAO();
    
    public LancamentoVenda() {
        initComponents();
        habilitarFormulario(false);
        carregarGrade();
    }

	private void initComponents() {
		// TODO Auto-generated method stub
		java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        pnBarraFerramentas = new javax.swing.JPanel();
        barraFerramentas = new javax.swing.JToolBar();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btFinalizar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        tpConteudo = new javax.swing.JTabbedPane();
        pnCabecalho = new javax.swing.JPanel();
        pnForm = new javax.swing.JPanel();
        lbCliente = new javax.swing.JLabel();
        lbValorTotal = new javax.swing.JLabel();
        lbDataVenda = new javax.swing.JLabel();
        ftfCliente = new javax.swing.JFormattedTextField();
        btCliente = new javax.swing.JButton();
        ftfValorTotal = new javax.swing.JFormattedTextField();
        ftfDataVenda = new javax.swing.JFormattedTextField();
        spGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();
        pnItens = new javax.swing.JPanel();
        pnFormItens = new javax.swing.JPanel();
        lbProduto = new javax.swing.JLabel();
        lbValorUnitario = new javax.swing.JLabel();
        lbQuantidade = new javax.swing.JLabel();
        ftfProduto = new javax.swing.JFormattedTextField();
        btProduto = new javax.swing.JButton();
        ftfValorUnitario = new javax.swing.JFormattedTextField();
        spQuantidade = new javax.swing.JSpinner();
        btAdicionarItem = new javax.swing.JButton();
        btRemoverItem = new javax.swing.JButton();
        spGradeItens = new javax.swing.JScrollPane();
        tbGradeItens = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("Vendas");

        pnBarraFerramentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 10));
        pnBarraFerramentas.setOpaque(false);
        pnBarraFerramentas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        barraFerramentas.setFloatable(false);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/novo.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.setFocusable(false);
        btNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNovo.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btNovo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/novo-foco.png"))); // NOI18N
        btNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btNovo);

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setFocusable(false);
        btSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btSalvar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/salvar-foco.png"))); // NOI18N
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        barraFerramentas.add(btSalvar);

        btFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/finalizar.png"))); // NOI18N
        btFinalizar.setText("Finalizar");
        btFinalizar.setFocusable(false);
        btFinalizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btFinalizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFinalizar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btFinalizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/finalizar-foco.png"))); // NOI18N
        btFinalizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });
        barraFerramentas.add(btFinalizar);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/excluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setFocusable(false);
        btExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/excluir-foco.png"))); // NOI18N
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        barraFerramentas.add(btExcluir);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setFocusable(false);
        btCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/cancelar-foco.png"))); // NOI18N
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        barraFerramentas.add(btCancelar);

        pnBarraFerramentas.add(barraFerramentas);

        getContentPane().add(pnBarraFerramentas, java.awt.BorderLayout.PAGE_START);

        pnCabecalho.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));
        pnCabecalho.setLayout(new java.awt.BorderLayout());

        pnForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0), javax.swing.BorderFactory.createTitledBorder(null, "Formulário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255)))); // NOI18N
        pnForm.setOpaque(false);
        pnForm.setLayout(new java.awt.GridBagLayout());

        lbCliente.setText("Cliente:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnForm.add(lbCliente, gridBagConstraints);

        lbValorTotal.setText("Valor Total:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnForm.add(lbValorTotal, gridBagConstraints);

        lbDataVenda.setText("Data Venda:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnForm.add(lbDataVenda, gridBagConstraints);

        ftfCliente.setEditable(false);
        ftfCliente.setColumns(25);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnForm.add(ftfCliente, gridBagConstraints);

        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/buscar.png"))); // NOI18N
        btCliente.setToolTipText("Localizar cliente");
        btCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCliente.setPreferredSize(new java.awt.Dimension(21, 21));
        btCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/buscar-foco.png"))); // NOI18N
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });
        pnForm.add(btCliente, new java.awt.GridBagConstraints());

        ftfValorTotal.setEditable(false);
        ftfValorTotal.setColumns(10);
        ftfValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        ftfValorTotal.setValue(new Double(0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnForm.add(ftfValorTotal, gridBagConstraints);

        ftfDataVenda.setEditable(false);
        ftfDataVenda.setColumns(10);
        ftfDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        ftfDataVenda.setValue(new Date());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnForm.add(ftfDataVenda, gridBagConstraints);

        pnCabecalho.add(pnForm, java.awt.BorderLayout.PAGE_START);

        tbGrade.setModel(new VendaTableModel());
        tbGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeMouseClicked(evt);
            }
        });
        spGrade.setViewportView(tbGrade);

        pnCabecalho.add(spGrade, java.awt.BorderLayout.CENTER);

        tpConteudo.addTab("Dados da venda", pnCabecalho);

        pnItens.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));
        pnItens.setLayout(new java.awt.BorderLayout());

        pnFormItens.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0), javax.swing.BorderFactory.createTitledBorder(null, "Formulário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255)))); // NOI18N
        pnFormItens.setOpaque(false);
        pnFormItens.setLayout(new java.awt.GridBagLayout());

        lbProduto.setText("Produto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnFormItens.add(lbProduto, gridBagConstraints);

        lbValorUnitario.setText("Valor Unitario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnFormItens.add(lbValorUnitario, gridBagConstraints);

        lbQuantidade.setText("Quantidade:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnFormItens.add(lbQuantidade, gridBagConstraints);

        ftfProduto.setEditable(false);
        ftfProduto.setColumns(25);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnFormItens.add(ftfProduto, gridBagConstraints);

        btProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/buscar.png"))); // NOI18N
        btProduto.setToolTipText("Localizar produto");
        btProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btProduto.setPreferredSize(new java.awt.Dimension(21, 21));
        btProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/buscar-foco.png"))); // NOI18N
        btProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnFormItens.add(btProduto, gridBagConstraints);

        ftfValorUnitario.setColumns(10);
        ftfValorUnitario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        ftfValorUnitario.setValue(new Double(0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnFormItens.add(ftfValorUnitario, gridBagConstraints);

        spQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000000, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnFormItens.add(spQuantidade, gridBagConstraints);

        btAdicionarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/novo.png"))); // NOI18N
        btAdicionarItem.setToolTipText("Adicionar item");
        btAdicionarItem.setPreferredSize(new java.awt.Dimension(35, 30));
        btAdicionarItem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/novo-foco.png"))); // NOI18N
        btAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarItemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        pnFormItens.add(btAdicionarItem, gridBagConstraints);

        btRemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/excluir.png"))); // NOI18N
        btRemoverItem.setToolTipText("Remover item");
        btRemoverItem.setPreferredSize(new java.awt.Dimension(35, 30));
        btRemoverItem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/java/gui/img/excluir-foco.png"))); // NOI18N
        btRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverItemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        pnFormItens.add(btRemoverItem, gridBagConstraints);

        pnItens.add(pnFormItens, java.awt.BorderLayout.PAGE_START);

        tbGradeItens.setModel(new ItemVendaTableModel());
        spGradeItens.setViewportView(tbGradeItens);

        pnItens.add(spGradeItens, java.awt.BorderLayout.CENTER);

        tpConteudo.addTab("Itens da venda", pnItens);

        getContentPane().add(tpConteudo, java.awt.BorderLayout.CENTER);

        setBounds(10, 10, 450, 500);
		
	}
	
	 public void setCliente(Cliente cliente) {
	        ftfCliente.setValue(cliente);
	    }

	    public void setProduto(Produto produto) {
	        ftfProduto.setValue(produto);
	        ftfValorUnitario.setValue(produto.getPrecoVenda());
	    }

	protected void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {
		  // TODO Auto-generated method stub
		  if (tbGradeItens.getSelectedRowCount() > 0) {
	            int linhaSelecionada = tbGradeItens.getSelectedRow();
	            ItemVendaTableModel ivtm = (ItemVendaTableModel) tbGradeItens.getModel();
	            ItemVenda iv = ivtm.getRowValue(linhaSelecionada);
	
	            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o item " + iv + "?", "Confirmação", JOptionPane.YES_NO_OPTION) == 0) {
	                venda.removeItem(iv);
	                ivtm.setDados(venda.getItens());
	            }
	        } else {
	            JOptionPane.showMessageDialog(this, "Selecione uma linha para remover.", "Alerta", JOptionPane.WARNING_MESSAGE);
	        }
		
	}

	protected void btAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {
		 // TODO Auto-generated method stub
	     if (validarFormularioItens()) {
	            ItemVenda iv = new ItemVenda();
	            iv.setProduto((Produto) ftfProduto.getValue());
	            iv.setVenda(venda);
	            iv.setQuantidade((int) spQuantidade.getValue());
	            iv.setValorUnitario((Double) ftfValorUnitario.getValue());
	
	            venda.addItem(iv);
	
	            ItemVendaTableModel ivtm = (ItemVendaTableModel) tbGradeItens.getModel();
	            ivtm.setDados(venda.getItens());
	
	            ftfValorTotal.setValue(venda.getValorTotal());
	
	            limpaFormularioItens();
	        }
		
	}
	
	 private boolean validarFormularioItens() {
	        if (ftfProduto.getValue() == null) {
	            JOptionPane.showMessageDialog(this, "Produto inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
	            ftfProduto.requestFocus();
	            return false;
	        }
	        return true;
	    }

	protected void btProdutoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
		BuscaProduto buscaProduto = new BuscaProduto(this);
        buscaProduto.setVisible(true);
		
	}

	protected void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {
		 // TODO Auto-generated method stub
		 if (evt.getClickCount() == 2) {
	            int linhaSelecionada = tbGrade.getSelectedRow();
	            VendaTableModel vtm = (VendaTableModel) tbGrade.getModel();
	            venda = vtm.getRowValue(linhaSelecionada);

	            if (venda.getSituacao() == Situacao.FINALIZADA) {
	                JOptionPane.showMessageDialog(this, "Venda finalizada não pode ser alterada.", "Alerta", JOptionPane.WARNING_MESSAGE);
	                return;
	            }
	            if (venda.getSituacao() == Situacao.CANCELADA) {
	                JOptionPane.showMessageDialog(this, "Venda cancelada não pode ser alterada.", "Alerta", JOptionPane.WARNING_MESSAGE);
	                return;
	            }

	            ftfCliente.setValue(venda.getCliente());
	            ftfDataVenda.setValue(venda.getDataVenda());
	            ftfValorTotal.setValue(venda.getValorTotal());

	            ItemVendaTableModel ivtm = (ItemVendaTableModel) tbGradeItens.getModel();
	            ivtm.setDados(venda.getItens());

	            habilitarFormulario(true);
	        }
	}

	protected void btClienteActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
	    BuscaCliente buscaCliente = new BuscaCliente(this);
        buscaCliente.setVisible(true);
	}

	protected void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
		habilitarFormulario(false);
		
	}

	protected void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {
	   // TODO Auto-generated method stub
	   int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente cancelar a venda " + venda + "?");
        if (opcao == 0) {
            try {
                vendaDAO.excluir(venda);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir a venda.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            habilitarFormulario(false);
            carregarGrade();
        }
		
	}

	protected void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
		int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente finalizar a venda?");
        if (opcao == 0) {
            ProdutoDAO produtoDAO = new ProdutoDAO();
            for (ItemVenda iv : venda.getItens()) {
                try {
                    if (iv.getQuantidade() > produtoDAO.recuperar(iv.getProduto().getCodigo()).getQuantidade()) {
                        JOptionPane.showMessageDialog(this, "Impossível finalizar.\nProduto " + iv.getProduto() + " em falta no estoque.", "Alerta", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao consultar o estoque.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            salvar(true);
        }
		
	}

	private void salvar(boolean finalizar) {
		// TODO Auto-generated method stub
		if (validarFormulario()) {
            venda.setCliente((Cliente) ftfCliente.getValue());
            venda.setDataVenda((Date) ftfDataVenda.getValue());
            if (finalizar) {
                venda.setSituacao(Situacao.FINALIZADA);
            } else {
                venda.setSituacao(Situacao.ABERTA);
            }

            if (venda.getCodigo() == 0) {
                try {
                    vendaDAO.inserir(venda);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao inserir a venda.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                try {
                    vendaDAO.alterar(venda);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao alterar a venda.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            habilitarFormulario(false);
            carregarGrade();
        }
		
	}

	private boolean validarFormulario() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
		salvar(false);
		
	}

	protected void btNovoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Auto-generated method stub
		venda = new Venda();
	    habilitarFormulario(true);
		
	}

	 private void habilitarFormulario(boolean ativo) {
	        btNovo.setEnabled(!ativo);
	        btSalvar.setEnabled(ativo);
	        btFinalizar.setEnabled(ativo);
	        btExcluir.setEnabled(ativo);
	        btCancelar.setEnabled(ativo);
	        ftfCliente.setEnabled(ativo);
	        btCliente.setEnabled(ativo);
	        ftfDataVenda.setEnabled(ativo);
	        ftfValorTotal.setEnabled(ativo);
	        ftfProduto.setEnabled(ativo);
	        btProduto.setEnabled(ativo);
	        spQuantidade.setEnabled(ativo);
	        ftfValorUnitario.setEnabled(ativo);
	        btAdicionarItem.setEnabled(ativo);
	        btRemoverItem.setEnabled(ativo);
	        tbGrade.setEnabled(!ativo);

	        if (!ativo) {
	            limpaFormulario();
	        }
	    }
	 private void limpaFormulario() {
	        venda = null;
	        ftfCliente.setValue(null);
	        ftfDataVenda.setValue(new Date());
	        ftfValorTotal.setValue(new Double(0));
	        ftfProduto.setValue(null);
	        spQuantidade.setValue(1);
	        ftfValorUnitario.setValue(new Double(0));
	        tbGradeItens.setModel(new ItemVendaTableModel());
	        limpaFormularioItens();
	    }
	  private void limpaFormularioItens() {
	        ftfProduto.setValue(null);
	        spQuantidade.setValue(1);
	        ftfValorUnitario.setValue(new Double(0));
	    }

	private void carregarGrade() {
		 // TODO Auto-generated method stub
		 VendaTableModel tm = (VendaTableModel) tbGrade.getModel();
	        try {
	            tm.setDados(vendaDAO.listarTodos());
	        } catch (Exception ex) {
	            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
	        }
		
	}
	
	 // Declara��o de Variaveis
    private javax.swing.JToolBar barraFerramentas;
    private javax.swing.JButton btAdicionarItem;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btRemoverItem;
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField ftfCliente;
    private javax.swing.JFormattedTextField ftfDataVenda;
    private javax.swing.JFormattedTextField ftfProduto;
    private javax.swing.JFormattedTextField ftfValorTotal;
    private javax.swing.JFormattedTextField ftfValorUnitario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbDataVenda;
    private javax.swing.JLabel lbProduto;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JLabel lbValorUnitario;
    private javax.swing.JPanel pnBarraFerramentas;
    private javax.swing.JPanel pnCabecalho;
    private javax.swing.JPanel pnForm;
    private javax.swing.JPanel pnFormItens;
    private javax.swing.JPanel pnItens;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JScrollPane spGradeItens;
    private javax.swing.JSpinner spQuantidade;
    private javax.swing.JTable tbGrade;
    private javax.swing.JTable tbGradeItens;
    private javax.swing.JTabbedPane tpConteudo;
    // End of variables declaration
}
