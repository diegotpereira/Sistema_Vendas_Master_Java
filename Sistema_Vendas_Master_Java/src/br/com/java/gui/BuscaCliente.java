package br.com.java.gui;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

import br.com.java.dao.ClienteDAO;

import br.com.java.gui.LancamentoVenda;
import br.com.java.to.Cliente;

import br.com.java.gui.tm.ClienteTableModel;

public class BuscaCliente extends javax.swing.JDialog {
	
	JInternalFrame parent;
	
	public BuscaCliente(JInternalFrame parent) {
        super();
        this.parent = parent;
        initComponents();
        carregarGrade();
    }

	// inicialição de componentes
	private void initComponents() {
		// TODO Auto-generated method stub
		pnFiltro = new javax.swing.JPanel();
        lbFiltro = new javax.swing.JLabel();
        tfFiltro = new javax.swing.JTextField();
        spGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca cliente");

        pnFiltro.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbFiltro.setText("Filtro:");
        pnFiltro.add(lbFiltro);

        tfFiltro.setColumns(30);
        tfFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFiltroKeyReleased(evt);
            }
        });
        pnFiltro.add(tfFiltro);

        getContentPane().add(pnFiltro, java.awt.BorderLayout.PAGE_START);

        tbGrade.setAutoCreateRowSorter(true);
        tbGrade.setModel(new ClienteTableModel());
        tbGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeMouseClicked(evt);
            }
        });
        spGrade.setViewportView(tbGrade);

        getContentPane().add(spGrade, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(500, 350));
        setLocationRelativeTo(null);
	
	}

	protected void tfFiltroKeyReleased(java.awt.event.KeyEvent evt) {
		// TODO Auto-generated method stub
		TableRowSorter rs = (TableRowSorter) tbGrade.getRowSorter();
        rs.setRowFilter(RowFilter.regexFilter("(?i)" + tfFiltro.getText(), 0, 1));
		
	}

	protected void tbGradeMouseClicked(MouseEvent evt) {
		 // TODO Auto-generated method stub
		 if (evt.getClickCount() == 2) {
	            ClienteTableModel ctm = (ClienteTableModel) tbGrade.getModel();
	            int linhaSelecionada = tbGrade.getRowSorter().convertRowIndexToModel(tbGrade.getSelectedRow());
	            Cliente cliente = ctm.getRowValue(linhaSelecionada);
	
	            if (parent instanceof LancamentoVenda) {
	                LancamentoVenda lv = (LancamentoVenda) parent;
	                lv.setCliente(cliente);
	                dispose();
	            } else {
	                JOptionPane.showMessageDialog(this, "Campo de destino invÃ¡lido.", "Alerta", JOptionPane.WARNING_MESSAGE);
	            }
	
	        }
		
	}

	private void carregarGrade() {
		  // TODO Auto-generated method stub
		  try {
	            ClienteDAO clienteDAO = new ClienteDAO();
	            ClienteTableModel ctm = (ClienteTableModel) tbGrade.getModel();
	            ctm.setDados(clienteDAO.listarTodos());
	        } catch (Exception ex) {
	            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
	        }
		
	}
    // Declaração de variaveis
    private javax.swing.JLabel lbFiltro;
    private javax.swing.JPanel pnFiltro;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables

}
