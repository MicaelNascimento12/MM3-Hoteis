/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.Acomodacao;
import UTIL.ConexaoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Micael Nascimento
 * Data Inicio: 22/05/2026
 * Mogi das Cruzes - SP
 */
public class AcomodacaoDAO {
    
    public void cadastrar(Acomodacao a) throws ClassNotFoundException, SQLException {
                
        Connection con = ConexaoBD.getConexao();
        
        PreparedStatement comando = con.prepareStatement(
        "insert into acomodacao (nome_propriedade, tipo_acomodacao, capacidade_hospedes, quantidade_quartos, preco_diaria, aceita_pets, possui_wifi, endereco_completo, media_avaliacao) values (?,?,?,?,?,?,?,?,?)"
        );
        
        comando.setString(1, a.getNomePropriedade());
        comando.setString(2, a.getTipoAcomodacao());
        comando.setInt(3, a.getCapacidadeHospedes());
        comando.setInt(4, a.getQuantidadeQuartos());
        comando.setDouble(5, a.getPrecoDiaria());
        comando.setBoolean(6, a.isAceitaPets());
        comando.setBoolean(7, a.isPossuiWifi());
        comando.setString(8, a.getEnderecoCompleto());
        comando.setDouble(9, a.getMediaAvaliacao());
        
        comando.execute();
        con.close();
        
    }
    
    public void atualizar (Acomodacao a) throws ClassNotFoundException, SQLException {
        
        Connection con = ConexaoBD.getConexao();
        
        PreparedStatement comando = con.prepareStatement(

        "update acomodacao set nome_propriedade = ?, tipo_acomodacao = ?, capacidade_hospedes = ?, quantidade_quartos = ?, preco_diaria = ?, "
                + "aceita_pets = ?, possui_wifi = ?, endereco_completo = ?, media_avaliacao = ? where id = ?" );
        
        comando.setString(1, a.getNomePropriedade());
        comando.setString(2, a.getTipoAcomodacao());
        comando.setInt(3, a.getCapacidadeHospedes());
        comando.setInt(4, a.getQuantidadeQuartos());
        comando.setDouble(5, a.getPrecoDiaria());
        comando.setBoolean(6, a.isAceitaPets());
        comando.setBoolean(7, a.isPossuiWifi());
        comando.setString(8, a.getEnderecoCompleto());
        comando.setDouble(9, a.getMediaAvaliacao());
        comando.setInt(10, a.getId());

    comando.execute();

    comando.close();

    con.close();
        
    }
    
    public void deletar (Acomodacao a) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoBD.getConexao();
        
        PreparedStatement comando = con.prepareStatement("delete from acomodacao where id = ?");
        
        comando.setInt(1, a.getId());
        comando.execute();
        comando.close();
        con.close();
        
    }
    
    public List<Acomodacao> consultarTodos() throws ClassNotFoundException, SQLException {
        
        Connection con = ConexaoBD.getConexao();
        
        PreparedStatement comando = con.prepareStatement("select * from acomodacao");
        
        ResultSet rs = comando.executeQuery();
        
        List<Acomodacao> listaAcomodacoes = new ArrayList<Acomodacao>();
        
        while (rs.next()) {
            
            Acomodacao a = new Acomodacao();
            
            a.setId(rs.getInt("id"));
            a.setNomePropriedade(rs.getString("nome_propriedade"));
            a.setTipoAcomodacao(rs.getString("tipo_acomodacao"));
            a.setCapacidadeHospedes(rs.getInt("capacidade_hospedes"));
            a.setQuantidadeQuartos(rs.getInt("quantidade_quartos"));
            a.setPrecoDiaria(rs.getDouble("preco_diaria"));
            a.setAceitaPets(rs.getBoolean("aceita_pets"));
            a.setPossuiWifi(rs.getBoolean("possui_wifi"));
            a.setEnderecoCompleto(rs.getString("endereco_completo"));
            a.setMediaAvaliacao(rs.getDouble("media_avaliacao"));
            
            listaAcomodacoes.add(a);

        }
        
        rs.close();
        comando.close();
        con.close();
        
        return listaAcomodacoes;
    }
    
    public Acomodacao consultarById (Acomodacao a) throws ClassNotFoundException, SQLException {
        
        Connection con = ConexaoBD.getConexao();
        
        PreparedStatement comando = con.prepareCall("select * from acomodacao where id = ?");
        
        comando.setInt(1, a.getId());
        
        ResultSet rs = comando.executeQuery();
        
        Acomodacao acomodacao = new Acomodacao();
        
        if (rs.next()) {
            
            acomodacao.setId(rs.getInt("id"));
            acomodacao.setNomePropriedade(rs.getString("nome_propriedade"));
            acomodacao.setTipoAcomodacao(rs.getString("tipo_acomodacao"));
            acomodacao.setCapacidadeHospedes(rs.getInt("capacidade_hospedes"));
            acomodacao.setQuantidadeQuartos(rs.getInt("quantidade_quartos"));
            acomodacao.setPrecoDiaria(rs.getDouble("preco_diaria"));
            acomodacao.setAceitaPets(rs.getBoolean("aceita_pets"));
            acomodacao.setPossuiWifi(rs.getBoolean("possui_wifi"));
            acomodacao.setEnderecoCompleto(rs.getString("endereco_completo"));
            acomodacao.setMediaAvaliacao(rs.getDouble("media_avaliacao"));

        }
        
        rs.close();
        comando.close();
        con.close();
        
        return acomodacao;
    }
    
    
    
}
