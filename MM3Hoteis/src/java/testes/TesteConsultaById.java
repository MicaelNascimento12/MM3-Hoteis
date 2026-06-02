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
public class TesteConsultaById {
    
    public static void main(String[] args) {
        
        try {
            Acomodacao a = new Acomodacao();
            
            a.setId(1);
            
            AcomodacaoDAO dao = new AcomodacaoDAO();
            
            Acomodacao resultado = dao.consultarById(a);
            
            System.out.println("ID: " + resultado.getId());
            System.out.println("Nome: " + resultado.getNomePropriedade());
            System.out.println("Tipo: " + resultado.getTipoAcomodacao());
            System.out.println("Preço: " + resultado.getPrecoDiaria());
                    
        } catch (Exception e ) {
            System.out.println("Registro nao encontrado");
            e.printStackTrace();
        }         
    }
}
