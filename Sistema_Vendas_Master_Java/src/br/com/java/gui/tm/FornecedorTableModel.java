package br.com.java.gui.tm;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.java.to.Fornecedor;



public class FornecedorTableModel extends AbstractTableModel {
	
	private String colunas[] = {"Nome", "CNPJ"};
    private List<Fornecedor> dados;

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		 // TODO Auto-generated method stub
		 if(dados == null){
		        return 0;
		    }
		    return dados.size();
	}

	@Override
	public Object getValueAt(int l, int c) {
		 // TODO Auto-generated method stub
	     Fornecedor fornecedor = dados.get(l);
	        switch (c) {
	            case 0:
	                return fornecedor.getNome();
	            case 1:
	                return fornecedor.getCnpj();
	            default:
	                throw new IndexOutOfBoundsException("Coluna inexistente!");
	        }
	}
	 @Override
	    public String getColumnName(int c) {
	        return colunas[c];
	    }

	    @Override
	    public boolean isCellEditable(int l, int c) {
	        return false;
	    }

	    public void setDados(List<Fornecedor> dados) {
	        this.dados = dados;
	        fireTableDataChanged();
	    }

	    public Fornecedor getRowValue(int l) {
	        return dados.get(l);
	    }

}
