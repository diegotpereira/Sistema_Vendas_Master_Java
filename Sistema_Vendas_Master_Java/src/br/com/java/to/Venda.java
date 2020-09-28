package br.com.java.to;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jdenner.to.Cliente;

import br.com.java.to.enums.Situacao;



public class Venda {
	
    private int codigo;
    private Cliente cliente;
    private Date dataVenda;
    private Double valorTotal;
    private Situacao situacao;
    private List<ItemVenda> itens;
    private List<ItemVenda> itensRemover;
    
    public Venda() {
        this.codigo = 0;
        this.cliente = new Cliente();
        this.dataVenda = new Date();
        this.valorTotal = 0.0;
        this.itens = new ArrayList<>();
        this.itensRemover = new ArrayList<>();
    }

    public Venda(int codigo) {
        this.codigo = codigo;
        this.cliente = new Cliente();
        this.dataVenda = new Date();
        this.valorTotal = 0.0;
        this.itens = new ArrayList<>();
        this.itensRemover = new ArrayList<>();

    }
    
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public List<ItemVenda> getItens() {
		return itens;
	}
	public void setItens(List<ItemVenda> itens) {
		this.itens = itens;
	}
	public List<ItemVenda> getItensRemover() {
		return itensRemover;
	}
	public void setItensRemover(List<ItemVenda> itensRemover) {
		this.itensRemover = itensRemover;
	}

}
