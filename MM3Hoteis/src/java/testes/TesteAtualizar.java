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
public class TesteAtualizar {
    
    public static void main(String[] args) {

        try {

            Acomodacao a = new Acomodacao();
            
            a.setId(1);
            a.setNomePropriedade("Casa Luxo Praia");
            a.setTipoAcomodacao("Casa");
            a.setCapacidadeHospedes(10);
            a.setQuantidadeQuartos(5);
            a.setPrecoDiaria(1500.00);
            a.setAceitaPets(true);
            a.setPossuiWifi(true);
            a.setEnderecoCompleto("Guarujá - SP");
            a.setMediaAvaliacao(5.0);

            AcomodacaoDAO dao = new AcomodacaoDAO();
            
            dao.atualizar(a);
            System.out.println("Propriedade atualizada com sucesso!");

        }   catch (Exception e) {
            System.out.println("Erro ao atualizar propriedade!");
            e.printStackTrace();
        }
    }
    
}

