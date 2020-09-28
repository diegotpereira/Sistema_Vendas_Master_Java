package br.com.java.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.java.bd.Conexao;

import br.com.java.dao.IDAO;
import br.com.java.to.Cliente;

public class ClienteDAO implements IDAO<Cliente> {

	@Override
	public void inserir(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub
		Conexao c = new Conexao();
        String sql = "INSERT INTO TBCLIENTE (NOME, CPF, DATANASCIMENTO) VALUES (?, ?, ?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getCpf());
        ps.setDate(3, new Date(cliente.getDataNascimento().getTime()));
        ps.execute();
        c.confirmar();
		
	}

	@Override
	public void alterar(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub
	    Conexao c = new Conexao();
        String sql = "UPDATE TBCLIENTE SET NOME=?, CPF=?, DATANASCIMENTO=? WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getCpf());
        ps.setDate(3, new Date(cliente.getDataNascimento().getTime()));
        ps.setInt(4, cliente.getCodigo());
        ps.execute();
        c.confirmar();
		
	}

	@Override
	public void excluir(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub
	    Conexao c = new Conexao();
        String sql = "DELETE FROM TBCLIENTE WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, cliente.getCodigo());
        ps.execute();
        c.confirmar();
		
	}

	@Override
	public ArrayList<Cliente> listarTodos() throws Exception {
		// TODO Auto-generated method stub
		Conexao c = new Conexao();
        String sql = "SELECT * FROM TBCLIENTE ORDER BY NOME";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList listaClientes = new ArrayList();
        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setCodigo(rs.getInt("CODIGO"));
            cliente.setNome(rs.getString("NOME"));
            cliente.setCpf(rs.getString("CPF"));
            cliente.setDataNascimento(rs.getDate("DATANASCIMENTO"));
            listaClientes.add(cliente);
        }

        return listaClientes;
	}

	@Override
	public Cliente recuperar(int codigo) throws Exception {
		// TODO Auto-generated method stub
		Conexao c = new Conexao();
        String sql = "SELECT * FROM TBCLIENTE WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();

        Cliente cliente = new Cliente();
        if (rs.next()) {
            cliente.setCodigo(rs.getInt("CODIGO"));
            cliente.setNome(rs.getString("NOME"));
            cliente.setCpf(rs.getString("CPF"));
            cliente.setDataNascimento(rs.getDate("DATANASCIMENTO"));
        }

        return cliente;
	}

}
