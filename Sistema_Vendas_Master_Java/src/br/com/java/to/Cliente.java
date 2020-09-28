package br.com.java.to;

import java.util.Date;

import com.jdenner.to.Cliente;

public class Cliente {
	
    private int codigo;
    private String nome;
    private String cpf;
    private Date dataNascimento;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@Override
	public String toString() {
		return getNome();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	  @Override
	    public boolean equals(Object o) {
	        if (o instanceof Cliente) {
	            Cliente c = (Cliente) o;
	            if (c.getCodigo() == this.getCodigo()) {
	                return true;
	            }
	        }
	        return false;
	    }
    
    

}
