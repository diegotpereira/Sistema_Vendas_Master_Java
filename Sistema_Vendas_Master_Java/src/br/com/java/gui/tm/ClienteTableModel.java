package br.com.java.gui.tm;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.java.to.Cliente;

public class ClienteTableModel extends AbstractTableModel{
	
    private String colunas[] = {"Nome", "CPF"};
    private List<Cliente> dados;

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
	 Cliente cliente = dados.get(l);
        switch (c) {
            case 0:
                return cliente.getNome();
            case 1:
                return cliente.getCpf();
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

	    public void setDados(List<Cliente> dados) {
	        this.dados = dados;
	        fireTableDataChanged();
	    }

	    public Cliente getRowValue(int l) {
	        return dados.get(l);
	    }

}
