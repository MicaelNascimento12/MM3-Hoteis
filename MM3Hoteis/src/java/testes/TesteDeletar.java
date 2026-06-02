/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import DAO.AcomodacaoDAO;
import DAO.AcomodacaoDAO;
import MODEL.Acomodacao;

/**
 *
 * @author alunocmc
 */
public class TesteDeletar {
    
    public static void main(String[] args) {
        
        try {
            Acomodacao a = new Acomodacao();
            
            a.setId(2);
            
            AcomodacaoDAO dao = new AcomodacaoDAO();
            
            dao.deletar(a);
            
            System.out.println("Deletado com sucesso");
            
        } catch (Exception e) {
            System.out.println("Erro ao deletar");
            e.printStackTrace();
        }
        
    }
    
}
