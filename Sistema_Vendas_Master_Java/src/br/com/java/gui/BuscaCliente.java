package br.com.java.gui;

import javax.swing.JInternalFrame;

public class BuscaCliente extends javax.swing.JDialog {
	
	JInternalFrame parent;
	
	public BuscaCliente(JInternalFrame parent) {
        super();
        this.parent = parent;
        initComponents();
        carregarGrade();
    }

}
