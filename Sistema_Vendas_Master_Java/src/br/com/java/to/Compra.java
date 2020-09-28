package br.com.java.to;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import br.com.java.to.enums.Situacao;



public class Compra {
	
	private int codigo;
    private Fornecedor fornecedor;
    private Date dataCompra;
    private Double valorTotal;
    private Situacao situacao;
    private List<ItemCompra> itens;
    private List<ItemCompra> itensRemover;
	public int getCodigo() {
		return codigo;
	}
	
	   public Compra() {
	        this.codigo = 0;
	        this.fornecedor = new Fornecedor();
	        this.dataCompra = new Date();
	        this.valorTotal = 0.0;
	        this.itens = new ArrayList<>();
	        this.itensRemover = new ArrayList<>();
	    }

	    public Compra(int codigo) {
	        this.codigo = codigo;
	        this.fornecedor = new Fornecedor();
	        this.dataCompra = new Date();
	        this.valorTotal = 0.0;
	        this.itens = new ArrayList<>();
	        this.itensRemover = new ArrayList<>();

	    }
	    public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public Fornecedor getFornecedor() {
			return fornecedor;
		}
		public void setFornecedor(Fornecedor fornecedor) {
			this.fornecedor = fornecedor;
		}
		public Date getDataCompra() {
			return dataCompra;
		}
		public void setDataCompra(Date dataCompra) {
			this.dataCompra = dataCompra;
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
		public List<ItemCompra> getItens() {
			return itens;
		}
		public void setItens(List<ItemCompra> itens) {
			this.itens = itens;
		}
		public List<ItemCompra> getItensRemover() {
			return itensRemover;
		}
		public void setItensRemover(List<ItemCompra> itensRemover) {
			this.itensRemover = itensRemover;
		}
}
