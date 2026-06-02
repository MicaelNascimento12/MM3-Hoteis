/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import DAO.AcomodacaoDAO;
import DAO.AcomodacaoDAO;
import MODEL.Acomodacao;

import java.util.List;

/**
 *
 * @author alunocmc
 */
public class TesteConsultarTodos {
    
    public static void main(String[] args) {
        
        try{
            Acomodacao a = new Acomodacao();
            
            a.setNomePropriedade("Casa Praia");
            a.setTipoAcomodacao("Casa");
            a.setCapacidadeHospedes(6);
            a.setQuantidadeQuartos(3);
            a.setPrecoDiaria(350);
            
            AcomodacaoDAO dao = new AcomodacaoDAO();
            dao.cadastrar(a);
            
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar propriedade");
        }
        
        
        
        try {
            AcomodacaoDAO dao = new AcomodacaoDAO();
            
            List<Acomodacao> lista = dao.consultarTodos();
            
            for (Acomodacao a : lista) {
                System.out.println("ID: "
                        + a.getId());

                System.out.println("Nome: "
                        + a.getNomePropriedade());

                System.out.println("Tipo: "
                        + a.getTipoAcomodacao());

                System.out.println("Preço: "
                        + a.getPrecoDiaria());

                System.out.println("-------------------");
            }
        } catch (Exception e ) {
            e.printStackTrace();
        }       
    }       
}
  

